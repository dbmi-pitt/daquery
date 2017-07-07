package edu.pitt.dbmi.daquery.rest;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import edu.pitt.dbmi.daquery.domain.User;
import edu.pitt.dbmi.daquery.util.KeyGenerator;
import edu.pitt.dbmi.daquery.util.SimpleKeyGenerator;
import edu.pitt.dbmi.daquery.util.PasswordUtils;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.security.Key;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import static javax.ws.rs.core.HttpHeaders.AUTHORIZATION;
import static javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

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

    @POST
    @Path("/login")
    @Consumes(APPLICATION_FORM_URLENCODED)
    public Response authenticateUser(@FormParam("login") String login,
                                     @FormParam("password") String password) {

        try {

            logger.info("#### login/password : " + login + "/" + password);

            // Authenticate the user using the credentials provided
            //authenticate(login, password);
            
            
            if (!login.equalsIgnoreCase("demo") ||
            		!password.equalsIgnoreCase("demouser")) {
            	throw new Exception("invalid username/password");
            }

            // Issue a token for the user
            String token = issueToken(login);

            // Return the token on the response
            return Response.ok().header(AUTHORIZATION, "Bearer " + token).build();

        } catch (Exception e) {
            return Response.status(UNAUTHORIZED).build();
        }
    }

    private void authenticate(String login, String password) throws Exception {
        TypedQuery<User> query = null;//em.createNamedQuery(User.FIND_BY_LOGIN_PASSWORD, User.class);
        query.setParameter("login", login);
        query.setParameter("password", PasswordUtils.digestPassword(password));
        User user = query.getSingleResult();

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
    public Response create(User user) {
        //em.persist(user);
        return Response.created(uriInfo.getAbsolutePathBuilder().path(user.getId()).build()).build();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") String id) {
        User user = null;//em.find(User.class, id);

        if (user == null)
            return Response.status(NOT_FOUND).build();

        return Response.ok(user).build();
    }

    @GET
    public Response findAllUsers() {
        TypedQuery<User> query = null;//em.createNamedQuery(User.FIND_ALL, User.class);
        List<User> allUsers = query.getResultList();

        if (allUsers == null)
            return Response.status(NOT_FOUND).build();

        return Response.ok(allUsers).build();
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
