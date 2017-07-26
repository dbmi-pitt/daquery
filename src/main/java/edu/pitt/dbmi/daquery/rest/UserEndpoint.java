package edu.pitt.dbmi.daquery.rest;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import edu.pitt.dbmi.daquery.domain.Site_User;
import edu.pitt.dbmi.daquery.util.KeyGenerator;
import edu.pitt.dbmi.daquery.util.SimpleKeyGenerator;
import edu.pitt.dbmi.daquery.util.PasswordUtils;
//import edu.pitt.dbmi.daquery.persistence.HibernateUtil;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
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

//import edu.pitt.dbmi.daquery.persistence.PersistenceManager;
import org.hibernate.*;
import edu.pitt.dbmi.daquery.domain.Site_User;

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

    // assumes the current class is called MyLogger
    private final static Logger logger = Logger.getLogger(UserEndpoint.class.getName());
        
    // ======================================
    // =          Business methods          =
    // ======================================

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


	    /*if (!login.equalsIgnoreCase("demo") ||
            		!password.equalsIgnoreCase("demouser")) {
            	throw new Exception("invalid username/password");
            }*/

	    // Issue a token for the user
	    String token = issueToken(username);

	    // Return the token on the response
	    return Response.ok().header(AUTHORIZATION, "Bearer " + token).build();

	} catch (Exception e) {
	    return Response.status(UNAUTHORIZED).build();
	}
    }    

    
    @GET
    @Path("/login")
    public Response authenticateUser(@QueryParam("login") String login,
                                     @QueryParam("password") String password) {

        try {

            logger.info("#### login/password : " + login + "/" + password);

            // Authenticate the user using the credentials provided
            authenticate(login, password);
            
            
            /*if (!login.equalsIgnoreCase("demo") ||
            		!password.equalsIgnoreCase("demouser")) {
            	throw new Exception("invalid username/password");
            }*/

            // Issue a token for the user
            String token = issueToken(login);

            // Return the token on the response
            return Response.ok().header(AUTHORIZATION, "Bearer " + token).build();

        } catch (Exception e) {
            return Response.status(UNAUTHORIZED).build();
        }
    }

    private void authenticate(String login, String password) throws Exception {
    	logger.info("searching for #### login/password : " + login + "/" + password);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT u FROM Site_User u WHERE u.login = :login AND u.password = :password");
        query.setParameter("login", login);
        query.setParameter("password", PasswordUtils.digestPassword(password));
        Site_User user = (Site_User)query.getSingleResult();

        if (user == null)
            throw new SecurityException("Invalid user/password");
            
    }

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

    @POST
    @Path("/newuser")
    public Response create(@QueryParam("login") String login,
                           @QueryParam("password") String password) {

    	String loggermsg = "login=" + login + " password=" + password;
        logger.info("Trying to create user with: " + loggermsg);
        //EntityManager em = PersistenceManager.INSTANCE.getEntityManager();\
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Site_User newUser = new Site_User(login, password);
        em.persist(newUser);

        em.getTransaction().commit();

        em.close();
       
        logger.info("Done trying to create user: " + newUser.toString());
        
        return Response.created(uriInfo.getAbsolutePathBuilder().path(newUser.getId() + "").build()).build();
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
