package edu.pitt.dbmi.daquery.rest;

import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import edu.pitt.dbmi.daquery.common.util.KeyGenerator;
import edu.pitt.dbmi.daquery.common.auth.TokenInvalidException;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;

import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;


/**
 * This class comes from this thread: https://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey
 * This class is used by other REST endpoint classes annotating methods with the @Secured
 * annotation.  The class will authenticate all JWTs for the REST endpoints.
 * The Role permissions piece is described in the same stackoverflow thread. 
 * @author cborromeo
 *
 */

@Secured
@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationFilter implements ContainerRequestFilter {

    private final static Logger logger = Logger.getLogger(AuthenticationFilter.class.getName());

    @Context
    private ResourceInfo resourceInfo;


    /*This take a little explaining.
     * The securityContext is created during the AuthenticationFilter.filter method.
     * This annotations allows the class to extract the username from the securityContext.
     * The username is extracted from the JWT passed to these methods.
     */
    @Context
    SecurityContext securityContext;

    
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        //TODO: Reject any communication coming across anything other than HTTPS:
    	//here is the check:
    	if (!AppProperties.isDebugMode()) {
    	
	    	if (requestContext.getUriInfo().getRequestUri().getScheme() != "https") {
	    		String msg = "This site is secured.  You must access web this service: " + requestContext.getUriInfo().getRequestUri() +" using https.";
	    		logger.log(Level.SEVERE, msg);
	            throw new NotAuthorizedException(msg);    		
	    	}
    	}
        // Get the HTTP Authorization header from the request
        String authorizationHeader = 
            requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        // Check if the HTTP Authorization header is present and formatted correctly 
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
    		String msg = "The website does not recognize your authorization.";
    		logger.log(Level.SEVERE, msg + "  Found this authorizationHeader: [" + authorizationHeader + "]");
            throw new NotAuthorizedException(msg + "  " + "Authorization header must be provided");    		
        }
        

        // Extract the token from the HTTP Authorization header
        String token = authorizationHeader.substring("Bearer".length()).trim();

        JsonWebToken jwtReporting = null;
        try {

        	//get the info from the token, but don't validate yet
        	final JsonWebToken jwt = new JsonWebToken(token, false);
        	jwtReporting = new JsonWebToken();
        	jwtReporting.setUserId(jwt.getUserId());
        	jwtReporting.setSiteId(jwt.getSiteId());
        	jwtReporting.setNetworkId(jwt.getNetworkId());
        	
        	Site mySite = SiteDAO.getLocalSite();
        	//check if the user is a local user or remote user 
        	if(StringHelper.equalIgnoreCase(mySite.getSiteId(), jwt.getSiteId()))
        	{
        		//validate a local user
	            if (!DaqueryUserDAO.isUserValid(jwt.getUserId())) {
	        		String msg = "User account [" + jwt.getUserId() +"] is not valid.";
	        		logger.log(Level.SEVERE, msg);
	                throw new Exception(msg);
	            }
	            
	            if (DaqueryUserDAO.expiredPassword(jwt.getUserId())) {
	            	try {
	            		requestContext.abortWith(ResponseHelper.expiredPasswordResponse(jwt.getUserId(), jwt.getSiteId(), jwt.getNetworkId()));
	            	} catch (Exception e) {
	            		String msg = "An unexpected error occured while responding to an expired authorization token for user [" +jwt.getUserId() + "]";
	            		logger.log(Level.SEVERE, msg, e);	            		
	            		requestContext.abortWith(ResponseHelper.getErrorResponse(500, msg, "Your user token was expired.  Please login again to get a new token.", e));
	            		Response.status(Response.Status.UNAUTHORIZED).build();
	            	}
	            }
	            
	            //an exception will be thrown if the token isn't valid
	            jwt.validate();
        	}
        	else
        	{
        		//validate a remote user via a web service call
        		Site site = SiteDAO.querySiteByID(jwt.getSiteId());
        		
        		Response resp = WSConnectionUtil.getFromRemoteSite(site, "users/validateToken", null, jwt.getToken());
        		if(resp.getStatus() != 200)
        		{
        			requestContext.abortWith(resp);
        		}
        	}
        	//last check, can the user access this web service call?  
        	//this is determined by the roles listed in connection with the @Secured annotation 
            // Get the resource class which matches with the requested URL
            // Extract the roles declared by it
            Class<?> resourceClass = resourceInfo.getResourceClass();
            List<String> classRoles = extractRoles(resourceClass);

            // Get the resource method which matches with the requested URL
            // Extract the roles declared by it
            Method resourceMethod = resourceInfo.getResourceMethod();
            List<String> methodRoles = extractRoles(resourceMethod);
            
            List<String> roleSuperset = new ArrayList<String>();
            roleSuperset.addAll(classRoles);
            roleSuperset.addAll(methodRoles);
            
            boolean userHasRole = false;
            //if there are no roles specified, then just set userHasRole to true and move along
            if (roleSuperset.isEmpty()) {
            	userHasRole = true;
            }
            else {
            	for (String role : roleSuperset) {
            		//if the user is in one of the roles, set userHasRole to true and return
            		if (DaqueryUserDAO.hasRole(jwt.getUserId(), jwt.getNetworkId(), role) == true) {
            			userHasRole = true;
            			break;
            		}
            			
            	}
            }
            if (!userHasRole) {
        		String msg = "You are not authorized to access this functionality in the website.";
        		logger.log(Level.SEVERE, msg + "  Found this user: [" + jwt.getUserId() + "] trying to access this method: [" 
        				+ resourceMethod.toString() +"].  This method requires one of these role(s): [" + roleSuperset.toString()  + "] ");
                throw new NotAuthorizedException(msg + "  " + "Authorization header must be provided");    		
            }
            
            
            
            final SecurityContext currentSecurityContext = requestContext.getSecurityContext();
            requestContext.setSecurityContext(new SecurityContext() {

                @Override
                public Principal getUserPrincipal() {

                    return new Principal() {

                        @Override
                        public String getName() {
                            return jwt.getUserId();
                        }
                        
                    };
                }

                @Override
                public boolean isUserInRole(String role) {
                	try {
                		return DaqueryUserDAO.hasRole(jwt.getUserId(), jwt.getNetworkId(), role);
                	} catch (Exception e) {
	            		String msg = "An error occured while determining if user [" +jwt.getUserId() + "] in network [" + jwt.getNetworkId() + "] has role [" + role + "]";
	            		logger.log(Level.SEVERE, msg, e);	            		
                		return false;
                	}
                }

                @Override
                public boolean isSecure() {
                    return currentSecurityContext.isSecure();
                }

                @Override
                public String getAuthenticationScheme() {
                    return "Bearer";
                }
            });
        }
        catch(TokenInvalidException tie)
        {
    		String msg = "Encountered a TokenInvalidException.";
    		logger.log(Level.SEVERE, msg, tie);	            		
        	try{requestContext.abortWith(ResponseHelper.expiredTokenResponse(jwtReporting.getUserId(), jwtReporting.getSiteId(), jwtReporting.getNetworkId()));}
        	catch(Throwable t)
        	{
        		String msg2 = "Encountered an error handling a TokenInvalidException.";
        		logger.log(Level.SEVERE, msg2, t);	            		
        		requestContext.abortWith(ResponseHelper.getErrorResponse(500, "An unexpected error occured while responding to an expired authorization token.", "Your user token was expired.  Please login again to get a new token.", t));
        	}
        } catch (Throwable e) {
    		String msg = "An unexpected error occured while checking your login token.";
    		logger.log(Level.SEVERE, msg, e);	            		
            requestContext.abortWith(ResponseHelper.getErrorResponse(500, msg, "There was an issue with your authentication token.  Please login again to get a new token.", e));
        }

    }


    /**
     * Extract the roles granting permission to an annotated web service call.
     * For example, if a method is annotated like this:
     * @Secured({UserRoles.ADMIN, UserRoles.AGGREGATE, UserRoles.VIEWER})
     * This method would return a List of: (UserRoles.ADMIN, UserRoles.AGGREGATE, UserRoles.VIEWER)
     * @param annotatedElement an annotated web service call
     * @return a List of the valid UserRoles for the web service call or 
     * an empty list if no UserRoles are assigned to the web service call 
     */
    private List<String> extractRoles(AnnotatedElement annotatedElement) {
        if (annotatedElement == null) {
            return new ArrayList<String>();
        } else {
            Secured secured = annotatedElement.getAnnotation(Secured.class);
            if (secured == null) {
                return new ArrayList<String>();
            } else {
                String[] allowedRoles = secured.value();
                return Arrays.asList(allowedRoles);
            }
        }
    }

}