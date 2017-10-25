package edu.pitt.dbmi.daquery.rest;

import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
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
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;

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

    @Context
    private UriInfo uriInfo;

    /*This take a little explaining.
     * The securityContext is created during the AuthenticationFilter.filter method.
     * This annotations allows the class to extract the username from the securityContext.
     * The username is extracted from the JWT passed to these methods.
     */
    @Context
    SecurityContext securityContext;

    
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        //Principal principal = securityContext.getUserPrincipal();
        String username = "";
        /*
        if (principal != null) 
        	username = principal.getName();
*/
        //TODO: Reject any communication coming across anything other than HTTPS:
    	//here is the check:
    	if (!AppProperties.isDebugMode()) {
    	
	    	if (requestContext.getUriInfo().getRequestUri().getScheme() != "https") {
	            throw new NotAuthorizedException("You must access web services using https");    		
	    	}
    	}
        // Get the HTTP Authorization header from the request
        String authorizationHeader = 
            requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        // Check if the HTTP Authorization header is present and formatted correctly 
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            throw new NotAuthorizedException("Authorization header must be provided");
        }
        
        //Check the user's status.  If their password is expired, 

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
        
        // Extract the token from the HTTP Authorization header
        String token = authorizationHeader.substring("Bearer".length()).trim();

        try {

            // Validate the token and extract the users UUID from the token
            final String tokenUsername = validateToken(token);
            if (!DaqueryUserDAO.isUserValid(tokenUsername)) {
            	throw new Exception("User account is not valid");
            }
            //just set this variable to throw an error
            username = tokenUsername;
            
            if (DaqueryUserDAO.expiredPassword(tokenUsername)) {
            	try {
            		requestContext.abortWith(ResponseHelper.expiredPasswordResponse(tokenUsername, uriInfo));
            	} catch (Exception e) {
            		//if there are any problems, just throw an UNAUTHORIZED error
            		Response.status(Response.Status.UNAUTHORIZED).build();
            	}
            }
            
            
            
            final SecurityContext currentSecurityContext = requestContext.getSecurityContext();
            requestContext.setSecurityContext(new SecurityContext() {

                @Override
                public Principal getUserPrincipal() {

                    return new Principal() {

                        @Override
                        public String getName() {
                            return tokenUsername;
                        }
                        
                    };
                }

                @Override
                public boolean isUserInRole(String role) {
                	try {
                		return DaqueryUserDAO.hasRole(tokenUsername, role);
                	} catch (Exception e) {
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
        } catch (ExpiredJwtException expired) {
        	logger.info("Expired token: " + expired.getLocalizedMessage());
        	try {
        		requestContext.abortWith(ResponseHelper.expiredTokenResponse(username, uriInfo));
        	} catch (Exception e) {
        		//if there are any problems, just throw an UNAUTHORIZED error
        		Response.status(Response.Status.UNAUTHORIZED).build();
        	}
        } catch (Exception e) {
            requestContext.abortWith(
                Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }

    /**
     * Validate a JWT token
     * @param JWT token
     * @return - the UUID extracted from the token
     * @throws ExpiredJwtException if the token is expired
     * ClaimJwtException if the validation of an JTW claim failed
     * MalformedJwtException if the JWT if malformed
     * SignatureException if either calculating a signature or verifying an existing signature of a JWT failed
     * UnsupportedJwtException if the JWT version is wrong or the JWT format is incorrect
     */
    private String validateToken(String token) throws Exception {
        // Check if it was issued by the server and if it's not expired
        // Throw an Exception if the token is invalid
    	logger.info("Trying to validate this token: " + token);
    	KeyGenerator kg = new KeyGenerator();
        Key key = kg.generateKey();
        try {
	        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
	        logger.info(claims.toString());
	        return claims.getSubject();
        } catch (ExpiredJwtException expired) {
        	logger.info("Expired token: " + expired.getLocalizedMessage());
        	//TODO: This needs to be reported back to the UI so it can handle it
        	throw expired;
	    } catch (ClaimJwtException claim) {
	    	logger.info("Claim error in JWT: " + claim.getLocalizedMessage());
	    	throw claim;
	    } catch (MalformedJwtException malformed) {
	    	logger.info("Malformed error in JWT: " + malformed.getLocalizedMessage());
	    	throw malformed;
	    } catch (SignatureException sig) {
	    	logger.info("Signature error in JWT: " + sig.getLocalizedMessage());
	    	throw sig;
	    } catch (UnsupportedJwtException unsupported) {
	    	logger.info("Unsupported error in JWT: " + unsupported.getLocalizedMessage());
	    	throw unsupported;
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