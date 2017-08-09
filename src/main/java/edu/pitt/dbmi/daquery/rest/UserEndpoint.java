package edu.pitt.dbmi.daquery.rest;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import javax.persistence.Query;
import org.hibernate.Session;

import java.security.Key;
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
public class UserEndpoint {

    // ======================================
    // =          Injection Points          =
    // ======================================

    @Context
    private UriInfo uriInfo;

    private final static Logger logger = Logger.getLogger(UserEndpoint.class.getName());
        
    // ======================================
    // =          Business methods          =
    // ======================================

    /**
     * This method is used to authenticate user. If username and password are match in the database
     * It would return a JSON web token (jwt), that UI can make API call with.  
     * @param login username
     * @param password password
     * @return javax.ws.rs.core.Response This returns with jwt in the header.
     */
    @GET
    @Path("/auth")
    @Consumes(MediaType.TEXT_PLAIN)
    public Response auth(@HeaderParam("Authorization") String authString) {

		try {
	
		    if(!authString.toUpperCase().startsWith("BASIC"))
			return Response.status(UNAUTHORIZED).build();
	
		    String encoded = authString.substring(5);
		    encoded = encoded.trim();
		    String userAndPass = Base64.decodeAsString(encoded);
		    int colonPos = userAndPass.indexOf(':');
		    if(colonPos <= 0)
			return Response.status(UNAUTHORIZED).build();
		    String username = userAndPass.substring(0, colonPos);
		    String password = userAndPass.substring(colonPos + 1);
		    // Authenticate the user using the credentials provided
		    authenticate(username, password);
		
		    // Issue a token for the user
		    String token = issueToken(username);
	
		    // Return the token on the response
		    return Response.ok().header(AUTHORIZATION, "Bearer " + token).build();
	
		} catch (Exception e) {
		    return Response.status(UNAUTHORIZED).build();
		}
	
    }    

    /**
     * This method uses login information to authenticate a user.  It generates a new JWT
     * (JSON Web Token) if the user's information is valid.
     * @param login- the username for the account.  This value must not be empty.
     * @param password- the password for the account.  This value must not be empty.
     * @return javax.ws.rs.core.Response containing a status of OK plus the JWT for a valid login/password combination
     * otherwise, return a BAD REQUEST if login and/or password is empty.  Return an UNAUTHORIZED for any other failure.
     */
    @GET
    @Path("/login")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response authenticateUser(@QueryParam("login") String login,
                                     @QueryParam("password") String password) {

    	if (login.isEmpty() || password.isEmpty()) 
    		return Response.status(BAD_REQUEST).build();
    	
    	try {

            logger.info("#### login/password : " + login + "/" + password);

            // Authenticate the user using the credentials provided
            authenticate(login, password);
            
            // Issue a token for the user
            String token = issueToken(login);

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
     * A back-end call that uses the login/password combination to find the user's
     * account in the database.  Throws an error if the account cannot be verified.
     * @param login- the username for the account.  This value must not be empty.
     * @param password- the password for the account.  This value must not be empty.
     * @throws SecurityException on authentication failure
     */
    private void authenticate(String login, String password) throws Exception {
    	logger.info("searching for #### login/password : " + login + "/" + password);
    	try {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
	        EntityManager em = emf.createEntityManager();
	        Query query = em.createNamedQuery(Site_User.FIND_BY_LOGIN_PASSWORD);
	        query.setParameter("login", login);
	        query.setParameter("password", PasswordUtils.digestPassword(password));
	        Site_User user = (Site_User)query.getSingleResult();
	
	        if (user == null)
	        {
	    		logger.info("Invalid user/password");
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
     * Create a JWT based on a user's login.  The JWT is set to expire in 15 minutes.
     * @param login- a user's username
     * @return a String representing the JWT for the user set to expire in 15 minutes.
     */
    private String issueToken(String login) {
    	KeyGenerator kg = new SimpleKeyGenerator();
        Key key = kg.generateKey();
        Calendar date = Calendar.getInstance();
        long t=date.getTimeInMillis();
        //add fifteen minutes to current time to create
        //a token that expires in 15 minutes (15 * 60 milliseconds)
        Date fifteenMinuteExpiry = new Date(t + (15 * 60000));
        String jwtToken = Jwts.builder()
                .setSubject(login)
                .setIssuer(uriInfo.getAbsolutePath().toString())
                .setIssuedAt(new Date())
                .setExpiration(fifteenMinuteExpiry)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
        logger.info("#### generating token for a key : " + jwtToken + " - " + key);
        return jwtToken;

    }

    /**
     * Create a new user account with the given login and password combination.
     * @param login- a new user login
     * @param password- the password for the new account
     * @return either a javax.ws.rs.core.Response confirming the account creation
     * or a SERVER ERROR if there was a problem. 
     */
    @POST
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
	        
	        return Response.created(uriInfo.getAbsolutePathBuilder().path(newUser.getId() + "").build()).build();
        } catch (Exception e) {
	        return Response.serverError().build();
	    }
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") String id) {
        Site_User user = null;//em.find(User.class, id);

        if (user == null)
            return Response.status(NOT_FOUND).build();

        return Response.ok(user).build();
    }

    @GET
    public Response findAllUsers() {
/*    	Session session = HibernateUtil.getSessionFactory().openSession();
    	Query query = session.createQuery("SELECT u FROM SITE_USER u ORDER BY u.lastName DESC");
        //TypedQuery<User> query = null;//em.createNamedQuery(User.FIND_ALL, User.class);
        List<User> allUsers = query.list();

        if (allUsers == null)
            return Response.status(NOT_FOUND).build();

        return Response.ok(allUsers).build();
        
*/      return null;
    	}

    @DELETE
    @Path("/{id}")
    public Response remove(@PathParam("id") String id) {
        //em.remove(em.getReference(User.class, id));
        return Response.noContent().build();
    }

    // ======================================
    // =          Private methods           =
    // ======================================
/* Don't need for Java 1.7
    private Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
    */
}
