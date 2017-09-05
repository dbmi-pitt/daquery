package edu.pitt.dbmi.daquery.rest;

import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import edu.pitt.dbmi.daquery.domain.Inbound_Query;
import edu.pitt.dbmi.daquery.domain.Site_User;
import edu.pitt.dbmi.daquery.util.KeyGenerator;
import edu.pitt.dbmi.daquery.util.SimpleKeyGenerator;
import edu.pitt.dbmi.daquery.util.PasswordUtils;
//import edu.pitt.dbmi.daquery.persistence.HibernateUtil;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import javax.persistence.Query;
import org.hibernate.Session;

import java.security.Key;
import java.security.Principal;
import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import static javax.ws.rs.core.HttpHeaders.AUTHORIZATION;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

import org.glassfish.jersey.internal.util.Base64;
//import edu.pitt.dbmi.daquery.persistence.PersistenceManager;
import org.hibernate.*;
import edu.pitt.dbmi.daquery.domain.Site_User;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@Path("/users")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class UserEndpoint extends AbstractEndpoint {

    // ======================================
    // =          Injection Points          =
    // ======================================

    @Context
    private UriInfo uriInfo;

    /*This take a little explaining.
     * The securityContext is created during the AuthenticationFilter.filter method.
     * This annotations allows the class to extract the username from the securityContext.
     * The username is extracted from the JWT passed to these methods.
     */
    @Context
    SecurityContext securityContext;
    
    
    private final static Logger logger = Logger.getLogger(UserEndpoint.class.getName());
        
    // ======================================
    // =          Business methods          =
    // ======================================

    /**
     * Return a list of all the users.
     * example URL: daquery/ws/users/
     * @return a JSON object containing a list of all users
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    

    @GET
    @Secured
    public Response findAllUsers() {
    	try {

            logger.info("#### returning all users");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
                        
            List<Inbound_Query> queries = queryAllUsers();
            
            if (queries == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(queries);
            return Response.ok(200).entity(jsonString).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
    
    /**
     * This method uses login information to authenticate a user.  It generates a new JWT
     * (JSON Web Token) if the user's information is valid.
     * example URL: daquery/ws/users/login?uuid=d2dd12f4-6b2e-430a-90db-dfe0c1617a48&password=demouser
     * @param uuid- the uuid for the account.  This value must not be empty.
     * @param password- the password for the account.  This value must not be empty.
     * @return javax.ws.rs.core.Response containing a status of OK plus the JWT for a valid login/password combination
     * otherwise, return a BAD REQUEST if login and/or password is empty.  Return an UNAUTHORIZED for any other failure.
     */
    @GET
    @Path("/login")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response authenticateUser(@QueryParam("uuid") String uuid,
                                     @QueryParam("password") String password) {

    	if (uuid.isEmpty() || password.isEmpty()) 
    		return Response.status(BAD_REQUEST).build();
    	
    	try {

            logger.info("#### uuid/password : " + uuid + "/" + password);

            // Authenticate the user using the credentials provided
            authenticate(uuid, password);
            
            // Issue a token for the user
            String token = issueToken(uuid);

            // Return the token to the response
            JsonBuilderFactory jFactory = Json.createBuilderFactory(null);
            JsonObject jsonData = jFactory.createObjectBuilder()
            		.add("token", token)
            		.build();

            //String json = "{\"token\" : \"" + token + "\"}";
            return Response.ok(200).entity(jsonData.toString()).build();

        } catch (Exception e) {
            return Response.status(UNAUTHORIZED).build();
        }
    }

    /**
     * Create a new user account with the given login and password combination.
     * example URL: daquery/ws/users/newuser?login=sample4&password=demouser
     * @param login- a new user login
     * @param password- the password for the new account
     * @return either a javax.ws.rs.core.Response confirming the account creation
     * (a 201 response) or a SERVER ERROR if there was a problem. 
     */
    @POST
    @Secured
    @Path("/newuser")
    public Response create(@QueryParam("login") String login,
                           @QueryParam("password") String password) {

    	if (login.isEmpty() || password.isEmpty()) 
    		return Response.status(BAD_REQUEST).build();
    	
    	String loggermsg = "login=" + login + " password=" + password;
        logger.info("Trying to create user with: " + loggermsg);
        
        try {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
	        EntityManager em = emf.createEntityManager();
	
	        em.getTransaction().begin();
	
	        Site_User newUser = new Site_User(login, password);
	        em.persist(newUser);
	
	        em.getTransaction().commit();
	
	        em.close();
	       
	        logger.info("Done trying to create user: " + newUser.toString());
	        
	        //TODO: build some JSON into the response.  Return the new UUID
	        
	        return Response.created(uriInfo.getAbsolutePathBuilder().path(newUser.getId() + "").build()).build();
        } catch (Exception e) {
	        return Response.serverError().build();
	    }
    }

    /**
     * Create a new user admin account with the given login.
     * Example URL: daquery/ws/users/firstadmin?login=adminuser&password=demouser
     * @param login- a new user login
     * @return either a javax.ws.rs.core.Response confirming the account creation
     * or a SERVER ERROR if there was a problem. 
     */
    
    @POST
    @Path("/firstadmin")
    public Response createFirstAdmin(@Context HttpHeaders httpheaders, @QueryParam("login") String login,
    		@QueryParam("password") String password) {

        try {
        	//extract the token sent by the central server
            // Get the HTTP Authorization header from the request
            String authorizationHeader = 
                httpheaders.getHeaderString(HttpHeaders.AUTHORIZATION);

            // Check if the HTTP Authorization header is present and formatted correctly 
            if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
                throw new NotAuthorizedException("Authorization header must be provided");
            }

            // Extract the token from the HTTP Authorization header
            String token = authorizationHeader.substring("Bearer".length()).trim();
        	
	    	if (login.isEmpty() || password.isEmpty() || !validateAdminToken(token)) 
	    		return Response.status(BAD_REQUEST).build();
	    	
	    	
	    	//TODO: see if we can combine the validateAdminToken with isValidAdminRequest
	    	if (!isValidAdminRequest(token)) {
	    		return Response.status(BAD_REQUEST).build();	    		
	    	}
	    	
	    	String loggermsg = "login=" + login + " password=" + password;
	        logger.info("Trying to create ADMIN user with: " + loggermsg);
        
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
	        EntityManager em = emf.createEntityManager();
	
	        em.getTransaction().begin();
	
	        Site_User newUser = new Site_User(login, password);
	        em.persist(newUser);
	        
	        //TODO: Assign this user to the Admin group
	
	        em.getTransaction().commit();
	
	        em.close();
	       
	        logger.info("Done trying to create admin user: " + newUser.toString());
	        
	        //TODO: build some JSON into the response.  Return the new UUID
	        
	        return Response.created(uriInfo.getAbsolutePathBuilder().path(newUser.getId() + "").build()).build();
        } catch (Exception e) {
	        return Response.serverError().build();
	    }
    }
    
    /**
     * Get a JSON string representing a user given the user's UUID
     * @param uuid- the user's UUID
     * @return
     */
    @GET
    //@Secured
    @Path("/{uuid}")
    public Response findById(@PathParam("uuid") String uuid) {
    	try {
			List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piUser = new ParameterItem("uuid", uuid);
			pList.add(piUser);
	        Site_User user = executeQueryReturnSingle(Site_User.FIND_BY_UUID, pList, logger);	
	        if (user == null)
	            return Response.status(NOT_FOUND).build();
	        String json = user.toJson();	
	        return Response.ok(200).entity(json).build();
    	} catch (Exception e) {
	        return Response.serverError().build();    		
    	}
    }


    @DELETE
    @Secured
    @Path("/{id}")
    public Response remove(@PathParam("id") String id) {
        //em.remove(em.getReference(User.class, id));
        return Response.noContent().build();
    }
    
    // ======================================
    // =          PRIVATE METHODS           =
    // ======================================

    /**
     * Return a list of all the Site_Users for the current site.
     * @return- a List of all the query users
     * @throws Exception- throw any errors encountered back to the calling method
     */
    private List<Inbound_Query> queryAllUsers() throws Exception {
    	try { 		
    	    List<Inbound_Query> queries = executeQueryReturnList(Site_User.FIND_ALL, null, logger);
	        return queries;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
    
    /**
     */
    
    /**
     * This method detects if the request for an admin account was sent from the
     * central server.
     * @param token the token sent from the central server.  This token
     * is sent back to the central server for validation.
     * @return true if the central server can validate the request, return false otherwise
     * @throws Exception pass any exception back to the calling method
     */
    private boolean isValidAdminRequest(String token) throws Exception {
    	//TODO: open a webservice call to the central server
    	//to validate this token.  This call should return a JSON Object like:
    	//{'valid':'true'}
    	return true;
    }
    
    /**
     * Create a temporary password
     * @return a plaintext String password
     * @throws Exception
     */
    private String createTemporaryPassword() throws Exception {
    	String retPassword = "";
    	retPassword = "temporary";
    	return retPassword;
    }
    
    /**
     * A back-end call that uses the uuid/password combination to find the user's
     * account in the database.  Throws an error if the account cannot be verified.
     * @param uuid- the uuid for the account.  This value must not be empty.
     * @param password- the plaintext password for the account.  This value must not be empty.
     * @throws SecurityException on authentication failure
     */
    private void authenticate(String uuid, String password) throws Exception {
    	logger.info("searching for #### uuid/password : " + uuid + "/" + password);
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piUser = new ParameterItem("uuid", uuid);
    		pList.add(piUser);
    		ParameterItem piPassword = new ParameterItem("password", PasswordUtils.digestPassword(password));
    		pList.add(piPassword);
	        Site_User user = executeQueryReturnSingle(Site_User.FIND_BY_UUID_PASSWORD, pList, logger);
	        if (user == null)
	        {
	    		logger.info("Invalid user/password.  Tried to login using: " + uuid + " / " + password);
	            throw new SecurityException("Invalid user/password");
	        }
	    
    	} catch (NoResultException e) {
    		logger.info("Invalid user/password");
    		throw new SecurityException("Invalid user/password");
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    /**
     * Create a JWT based on a user's uuid.  The JWT is set to expire in 15 minutes.
     * @param uuid- a user's uuid
     * @return a String representing the JWT for the user set to expire in 15 minutes.
     */
    private String issueToken(String uuid) {
    	KeyGenerator kg = new SimpleKeyGenerator();
        Key key = kg.generateKey();
        Calendar date = Calendar.getInstance();
        long t=date.getTimeInMillis();
        //add fifteen minutes to current time to create
        //a token that expires in 15 minutes (15 * 60 milliseconds)
        Date fifteenMinuteExpiry = new Date(t + (15 * 60000));
        String jwtToken = Jwts.builder()
                .setSubject(uuid)
                .setIssuer(uriInfo.getAbsolutePath().toString())
                .setIssuedAt(new Date())
                .setExpiration(fifteenMinuteExpiry)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
        logger.info("#### generating token for a key : " + jwtToken + " - " + key);
        return jwtToken;

    }
    
    /**
     * Validate a JWT token used to create the initial admin account for a site
     * @param JWT token with sitename and sitekey in the payload
     * @return - the UUID extracted from the token
     * @throws ExpiredJwtException if the token is expired
     * ClaimJwtException if the validation of an JTW claim failed
     * MalformedJwtException if the JWT if malformed
     * SignatureException if either calculating a signature or verifying an existing signature of a JWT failed
     * UnsupportedJwtException if the JWT version is wrong or the JWT format is incorrect
     */
    private boolean validateAdminToken(String token) throws Exception {
        // Check if it was issued by the server and if it's not expired
        // Throw an Exception if the token is invalid
    	logger.info("Trying to validate this admin token: " + token);
    	KeyGenerator kg = new SimpleKeyGenerator();
        Key key = kg.generateKey();
        try {
	        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
	        logger.info(claims.toString());
	        
	        //TODO: add code to validate the token
	        
	        return true;
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
