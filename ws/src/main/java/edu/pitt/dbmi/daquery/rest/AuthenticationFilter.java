package edu.pitt.dbmi.daquery.rest;

import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.Principal;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.message.internal.MediaTypes;
import org.glassfish.jersey.server.ContainerRequest;

import edu.pitt.dbmi.daquery.common.auth.TokenInvalidException;
import edu.pitt.dbmi.daquery.common.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.TokenManager;
import edu.pitt.dbmi.daquery.common.domain.TokenManager.KeyedJWT;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;


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

        //Reject any communication coming across anything other than HTTPS:
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

    	final Map<String,Object> claims = WSConnectionUtil.extractClaims(token);
    	final String siteId = (String)claims.get("iss");
    	final String userId = (String)claims.get("sub");
    	final String networkId = (String)claims.get("net");

        //String networkId = "";
        try {

        	//first, check if the request is going to another site 
        	Site mySite = SiteDAO.getLocalSite();
        	
        	//check if the token is a local user or remote token 
        	if(mySite.getSiteId().equalsIgnoreCase(siteId))
        	{   
        		TokenManager tm = TokenManager.getTokenManager();
	        	KeyedJWT kj = tm.getToken(token);
	        	Key tokenkey = kj.getTokenKey();
	        	//get the info from the token, but don't validate yet
	        	final JsonWebToken jwt = kj.getToken();
	        	//networkId = jwt.getNetworkId();

        		//validate a local user
	            if (!DaqueryUserDAO.isUserValid(jwt.getUserId()) && !DaqueryUserDAO.isUserPwdExpired(jwt.getUserId())) {
	        		String msg = "User account [" + jwt.getUserId() +"] is not valid.";
	        		logger.log(Level.SEVERE, msg);
	                throw new Exception(msg);
	            }
	            	            
	            //an exception will be thrown if the token isn't valid
	            jwt.validate();
        	}

            // Get the resource method which matches with the requested URL
            // Extract the roles declared by it
            Method resourceMethod = resourceInfo.getResourceMethod();

            //last check, can the user access this web service call?  
        	//this is determined by the roles listed in connection with the @Secured annotation 
            // Get the resource class which matches with the requested URL
            // Extract the roles declared by it
            Class<?> resourceClass = resourceInfo.getResourceClass();
            List<String> localRoles = extractLocalRoles(resourceClass);
            boolean userHasLocalRole = WSConnectionUtil.hasRole(localRoles, userId, networkId);

            List<String> remoteRoles = extractRemoteRoles(resourceMethod);
            
            String debugmsg = "  Found this user: [" + userId + "] trying to access this method: [" 
    				+ resourceMethod.toString() +"].  This method requires one of these local role(s): [" + localRoles.toString()  + "] or one of these remote role(s): [" + remoteRoles.toString() + "] ";
            System.out.println(debugmsg);
            
            boolean userRemoteHasRole = WSConnectionUtil.hasRole(remoteRoles, userId, networkId);
            if (!userRemoteHasRole && !userHasLocalRole) {
        		String msg = "You are not authorized to access this functionality in the website.";
        		logger.log(Level.SEVERE, msg + "  Found this user: [" + userId + "] trying to access this method: [" 
        				+ resourceMethod.toString() +"].  This method requires one of these local role(s): [" + localRoles.toString()  + "] or one of these remote role(s): [" + remoteRoles.toString() + "] ");
                throw new NotAuthorizedException(msg + "  " + "Authorization header must be provided");    		
            }
            
            
            
            final SecurityContext currentSecurityContext = requestContext.getSecurityContext();
            requestContext.setSecurityContext(new SecurityContext() {

                @Override
                public Principal getUserPrincipal() {

                    return new Principal() {

                        @Override
                        public String getName() {
                            return userId;
                        }
                        
                    };
                }

                @Override
                public boolean isUserInRole(String role) {
                	//this is part of the ContainerRequestFilter interface
                	//hardcode this since the role is checked elsewhere
                	return true;
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
        	try{requestContext.abortWith(ResponseHelper.expiredTokenResponse(userId, siteId, networkId));}
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
    private List<String> extractLocalRoles(AnnotatedElement annotatedElement) {
        if (annotatedElement == null) {
            return new ArrayList<String>();
        } else {
            Secured secured = annotatedElement.getAnnotation(Secured.class);
            if (secured == null) {
                return new ArrayList<String>();
            } else {
                String[] allowedRoles = secured.localRoles();
                return Arrays.asList(allowedRoles);
            }
        }
    }

    private List<String> extractRemoteRoles(AnnotatedElement annotatedElement) {
        if (annotatedElement == null) {
            return new ArrayList<String>();
        } else {
            Secured secured = annotatedElement.getAnnotation(Secured.class);
            if (secured == null) {
                return new ArrayList<String>();
            } else {
                String[] allowedRoles = secured.remoteRoles();
                return Arrays.asList(allowedRoles);
            }
        }
    }

}