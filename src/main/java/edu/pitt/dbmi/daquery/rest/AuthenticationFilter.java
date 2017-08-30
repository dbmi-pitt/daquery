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
import javax.ws.rs.Priorities;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.container.ResourceInfo;

import edu.pitt.dbmi.daquery.rest.AbstractEndpoint.ParameterItem;
import edu.pitt.dbmi.daquery.util.KeyGenerator;
import edu.pitt.dbmi.daquery.util.SimpleKeyGenerator;
import edu.pitt.dbmi.daquery.util.UserRoles;
import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import edu.pitt.dbmi.daquery.util.UserStatuses;
import edu.pitt.dbmi.daquery.util.UserRoles;
import edu.pitt.dbmi.daquery.domain.Site_User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;


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
    
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

    	//TODO: Reject any communication coming across anything other than HTTPS:
    	//here is the check:
    	/*if (requestContext.getUriInfo().getRequestUri().getScheme() != "https") {
            throw new NotAuthorizedException("You must access web services using https");    		
    	}*/
    	
        // Get the HTTP Authorization header from the request
        String authorizationHeader = 
            requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        // Check if the HTTP Authorization header is present and formatted correctly 
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            throw new NotAuthorizedException("Authorization header must be provided");
        }

        // Get the resource class which matches with the requested URL
        // Extract the roles declared by it
        Class<?> resourceClass = resourceInfo.getResourceClass();
        List<UserRoles> classRoles = extractRoles(resourceClass);

        // Get the resource method which matches with the requested URL
        // Extract the roles declared by it
        Method resourceMethod = resourceInfo.getResourceMethod();
        List<UserRoles> methodRoles = extractRoles(resourceMethod);

        // Extract the token from the HTTP Authorization header
        String token = authorizationHeader.substring("Bearer".length()).trim();

        try {

            // Validate the token
            final String tokenUsername = validateToken(token);
            if (!isUserValid(tokenUsername)) {
            	throw new Exception("User account is not valid");
            }
            
            
            /*got this approach from:
            * https://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey
            * Basically this code allows all the REST calls to inherit a common SecurityContext object.
            * This object contains the username for the current user.
            * To access this object, the REST class needs to declare this annotation 
            * at the top of the class:
            * 
            *     @Context
    		*     SecurityContext securityContext;
    		*     
    		*     To access the username in the REST call itself:
    		*     Principal principal = securityContext.getUserPrincipal();
    		*     String username = principal.getName();
            */
            final SecurityContext currentSecurityContext = requestContext.getSecurityContext();
            requestContext.setSecurityContext(new SecurityContext() {

                @Override
                public Principal getUserPrincipal() {

                    return new Principal() {

                        @Override
                        public String getName() {
                            return tokenUsername;
                        }
                        
                        /**
                         * Return a list of the role(s) for the current user
                         * @return List<String> of the role(s) for the current user
                         */
                        
                        //TODO: Use this.getUserPrincipal().getName() to 
                        //do a database query to find all the roles for the user
                        //always look up the roles in the database, don't rely on
                        //a list from the JWT.  The JWT could be spoofed to give the user 
                        //higher credentials
                        public List<String> getRoles() {
                        	//for now, retrun a hardcoded list
                        	//TODO: create some global enum type of roles,
                        	//need to coordinate this with Desheng
                        	List<String> retList = Arrays.asList("ADMIN", "USER");
                        	return retList;
                        }
                    };
                }

                @Override
                public boolean isUserInRole(String role) {
                	//TODO: definitely need to override this method
                	this.getUserPrincipal().getName();
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
    	KeyGenerator kg = new SimpleKeyGenerator();
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
     * Query the database to find the current user (represented by UUID).
     * Determine: a) if the user has a valid account and b) if the user's status is active
     * @param uuid- The user's UUID
     * @return- True is the UUID represents a valid AND active account,
     * return False otherwise
     * @throws PersistenceException if the database is incorrectly configured
     * Exception for any other issue
     */
    private boolean isUserValid(String uuid) throws Exception {
    	logger.info("checking if user: " + uuid + " is valid");
    	EntityManagerFactory emf = null;
    	EntityManager em = null;
    	try {
	        emf = Persistence.createEntityManagerFactory("jpa-example");
	        em = emf.createEntityManager();
	        Query query = em.createNamedQuery(Site_User.FIND_BY_UUID);
	        query.setParameter("uuid", uuid);
	        Site_User user = null;
	        user = (Site_User)query.getSingleResult();
	        return user.getUserStatus() == UserStatuses.ACTIVE;
	    
        } catch (PersistenceException pe) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(pe.getLocalizedMessage());
            throw pe;
        } catch (Exception e) {
    		logger.info(e.getLocalizedMessage());
        	throw e;
        }
    	finally {
    		if (em != null) {
    			em.close();
    		}
    		if (emf != null) {
    			emf.close();
    		}
    		
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
    private List<UserRoles> extractRoles(AnnotatedElement annotatedElement) {
        if (annotatedElement == null) {
            return new ArrayList<UserRoles>();
        } else {
            Secured secured = annotatedElement.getAnnotation(Secured.class);
            if (secured == null) {
                return new ArrayList<UserRoles>();
            } else {
                UserRoles[] allowedRoles = secured.value();
                return Arrays.asList(allowedRoles);
            }
        }
    }

    private void checkPermissions(List<UserRoles> allowedRoles, String uuid) throws Exception {
    	//TODO: run a database query to check this.
        // Check if the user contains one of the allowed roles
        // Throw an Exception if the user has not permission to execute the method
    }

}