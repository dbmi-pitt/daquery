package edu.pitt.dbmi.daquery.rest;

import java.io.IOException;
import java.security.Key;
import java.security.Principal;
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

import edu.pitt.dbmi.daquery.util.KeyGenerator;
import edu.pitt.dbmi.daquery.util.SimpleKeyGenerator;
import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import edu.pitt.dbmi.daquery.domain.Inbound_Query;

/**
 * This class comes from this thread: https://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey
 * This class is used by other REST endpoint classes annotating methods with the @Secured
 * annotation.  The class will authenticate all JWTs for the REST endpoints.
 * @author cborromeo
 *
 */

@Secured
@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationFilter implements ContainerRequestFilter {

    private final static Logger logger = Logger.getLogger(AuthenticationFilter.class.getName());

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        // Get the HTTP Authorization header from the request
        String authorizationHeader = 
            requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        // Check if the HTTP Authorization header is present and formatted correctly 
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            throw new NotAuthorizedException("Authorization header must be provided");
        }

        // Extract the token from the HTTP Authorization header
        String token = authorizationHeader.substring("Bearer".length()).trim();

        try {

            // Validate the token
            final String tokenUsername = validateToken(token);
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
     * @param token
     * @return - the username extracted from the token
     * @throws Exception
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

}