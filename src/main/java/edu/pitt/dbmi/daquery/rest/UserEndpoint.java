package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

import java.security.Key;
import java.security.Principal;
import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;
import java.util.HashMap;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.KeyGenerator;

import edu.pitt.dbmi.daquery.common.util.PasswordUtils;
import edu.pitt.dbmi.daquery.dao.AbstractDAO;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.ParameterItem;
import edu.pitt.dbmi.daquery.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.domain.Role;
import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;


@Path("/users")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class UserEndpoint extends AbstractEndpoint {

	public static void main(String [] args) throws Exception
	{
		DaqueryUser user = new DaqueryUser();
		user.setEmail("me@email.com");
		user.setId("id123");
		user.setRealName("My Name");
		Map<String, Object> extras = new HashMap<String, Object>();
		//extras.put("token", "abcdefghijklm");
		extras.put("user", user);
		ResponseHelper.getTokenResponse(200, null, user.getId(), null, extras);
		//String val = JSONHelper.toJSON(extras);
		//System.out.println(val);
		//System.out.println(user.toJson());
		
		
	}

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
       
    
    /**
     * Return a list of all the users.
     * example URL: daquery-ws/ws/users/
     * @return a JSON object containing a list of all users
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    @GET
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAllUsers() {
    	try {

            logger.info("#### returning all users");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
                        
            List<DaqueryUser> user_list = DaqueryUserDAO.queryAllUsers();
            
            if (user_list == null) {
                return Response.status(NOT_FOUND).build();
            }
            if (user_list.isEmpty()) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(user_list);
            return Response.ok(200).entity(jsonString).build();

    	} catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
    
    /**
     * This method uses login information to authenticate a user.  It generates a new JWT
     * (JSON Web Token) if the user's information is valid.
     * example URL: daquery-ws/ws/users/login?uuid=d2dd12f4-6b2e-430a-90db-dfe0c1617a48&password=demouser
     * @param uuid- the uuid for the account.  This value must not be empty.
     * @param password- the password for the account.  This value must not be empty.
     * @return javax.ws.rs.core.Response containing a status of OK plus the JWT for a valid login/password combination
     * otherwise, return a BAD REQUEST if login and/or password is empty.  Return an UNAUTHORIZED for any other failure.
     */
    @GET
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response authenticateUser(@QueryParam("email") String email,
                                     @QueryParam("password") String password) {

    	if (email.isEmpty() || password.isEmpty()) 
    		return Response.status(BAD_REQUEST).build();
    	
    	//TODO: Reject any communication coming across anything other than HTTPS:
    	//here is the check:
    	if (!AppProperties.isDebugMode()) {
	    	if (uriInfo.getRequestUri().getScheme() != "https") {
	            throw new NotAuthorizedException("You must access web services using https");    		
	    	}
    	}
    	
    	DaqueryUser user = null;
    	try {
            logger.info("#### email : " + email);
            
            // Authenticate the user using the credentials provided
            user = DaqueryUserDAO.authenticate(email, password);

            if(DaqueryUserDAO.expiredPassword(user.getId()))
                return(ResponseHelper.expiredPasswordResponse(user.getId(), uriInfo));
            
            if (DaqueryUserDAO.accountDisabled(user.getId()))
                return(ResponseHelper.accountDisabledResponse(user.getId(), uriInfo));
            	
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByID(user.getId());
            Map<String, Object> extraObjs = new HashMap<String, Object>();
            extraObjs.put("user", currentUser);
            
            Response rVal = ResponseHelper.getTokenResponse(200, null, user.getId(), uriInfo, extraObjs);

            return rVal;

        } catch (ExpiredJwtException expired) {
        	logger.info("Expired token: " + expired.getLocalizedMessage());
            try {
            	return(ResponseHelper.expiredTokenResponse(user.getId(), uriInfo));
            } catch(Throwable t) {
            	String msg = "Unexpected error while generating an expired token response.";
            	logger.log(Level.SEVERE, msg, t);
            	return(ResponseHelper.getBasicResponse(500, msg + " Check the server logs for more information."));
            }
        } catch (Exception e) {
        	e.printStackTrace();
            return Response.status(UNAUTHORIZED).build();
        }
    }

    /**
     * Create a new user account with the given login and password combination.
     * example URL: daquery-ws/ws/users/newuser?login=sample4&password=demouser
     * @param login- a new user login
     * @param password- the password for the new account
     * @return either a javax.ws.rs.core.Response confirming the account creation
     * (a 201 response) or a SERVER ERROR if there was a problem. 
     */
    @POST
    //@Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newuser")
    public Response create(@QueryParam("login") String login,
                           @QueryParam("password") String password) {

    	if (login.isEmpty() || password.isEmpty()) 
    		return Response.status(BAD_REQUEST).build();
    	
    	String loggermsg = "login=" + login + " password=" + password;
        logger.info("Trying to create user with: " + loggermsg);
        
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
	
	        s.getTransaction().begin();
	
	        DaqueryUser newUser = new DaqueryUser(login, password);
	        s.persist(newUser);
	
	        s.getTransaction().commit();
	
	       
	        logger.info("Done trying to create user: " + newUser.toString());
	        
	        return Response.created(uriInfo.getAbsolutePathBuilder().path(newUser.getId() + "").build()).build();
        } catch (Exception e) {
	        return Response.serverError().build();
	    } finally {
	    	if (s != null) {
	    		s.close();
	    	}
	    	
	    }
    }

    /**
     * Create a new user admin account with the given login.
     * Example URL: daquery-ws/ws/users/firstadmin?login=adminuser&password=demouser
     * @param login- a new user login
     * @return either a javax.ws.rs.core.Response confirming the account creation
     * or a SERVER ERROR if there was a problem. 
     */
    
/*    @POST
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/firstadmin")
    public Response createFirstAdmin(@Context HttpHeaders httpheaders, @QueryParam("login") String login,
    		@QueryParam("password") String password) {

        Principal principal = securityContext.getUserPrincipal();
        String username = principal.getName();
        EntityManagerFactory emf = null;
        EntityManager em = null;
        
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
        
	        emf = Persistence.createEntityManagerFactory("derby");
	        em = emf.createEntityManager();
	
	        em.getTransaction().begin();
	
	        DaqueryUser newUser = new DaqueryUser(login, password);
	        em.persist(newUser);
	        
	        //TODO: Assign this user to the Admin group
	
	        em.getTransaction().commit();
	
	        logger.info("Done trying to create admin user: " + newUser.toString());
	        
	        //TODO: build some JSON into the response.  Return the new UUID
	        
	        return Response.created(uriInfo.getAbsolutePathBuilder().path(newUser.getId() + "").build()).build();
        } catch (ExpiredJwtException expired) {
        	logger.info("Expired token: " + expired.getLocalizedMessage());
        	//TODO: This needs to be reported back to the UI so it can handle it
            try{
            	return(ResponseHelper.expiredTokenResponse(login, uriInfo));
            } catch(Throwable t) {
            	String msg = "Unexpected error while generating an expired token response.";
            	logger.log(Level.SEVERE, msg, t);
            	return(ResponseHelper.getBasicResponse(500, msg + " Check the server logs for more information."));
            }
        } catch (Exception e) {
	        return Response.serverError().build();
	    } finally {
	    	if (em != null) {
	    		em.close();
	    	}
	    }
    } */
    
    /**
     * Get a JSON string representing a user given the user's UUID
     * example url: daquery-ws/ws/users/507f5c77-265c-4fc2-bed7-986bf3182786
     * @param id- the user's UUID
     * @return 200 OK			A JSON object representing the user
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response findById(@PathParam("id") String id) {
    	try {
	        DaqueryUser user = DaqueryUserDAO.queryUserByID(id);	
	        if (user == null)
	            return Response.status(NOT_FOUND).build();
	        String json = user.toJson();	
	        return Response.ok(200).entity(json).build();
    	} catch (Exception e) {
	        return Response.serverError().build();    		
    	}
    }
    
    /**
     * This method will allow the user to be updated.
     * @param updatedUser- a JSON object representing the updated user
     * example url: daquery-ws/ws/users
     * @return 200 OK
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized
     * @throws 404 Not found	
     */
    @PUT
    @Secured
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("id") String id, DaqueryUser updatedUser) {

    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();

	        DaqueryUser user = DaqueryUserDAO.queryUserByID(id);
	        
	        DaqueryUser loggedInUser = DaqueryUserDAO.queryUserByID(username);

	        //step 1: make sure this is a valid user id
	        if (user == null)
	            return Response.status(NOT_FOUND).build();
	        
	        //step 2: prevent unauthorized users from updating this account
	        //the update can continue only if the current user is either:
	        //1.  has an admin role
	        // -OR-
	        //2.  is the same person represented by the updatedUser
	        boolean hasAdminRole = DaqueryUserDAO.hasRole(loggedInUser.getId(), "admin");
	        boolean isMatchingUser = loggedInUser.getId().equalsIgnoreCase(user.getId());

	        //if the current user does not match, return a 401
	        if ((hasAdminRole || isMatchingUser) == false) {
	        	return Response.status(UNAUTHORIZED).build();
	        }

	        //step 3: check if account is disabled
	        //Do NOT allow a disabled user account to be updated if
	        //the user is trying to update their own disabled account
	        if (DaqueryUserDAO.accountDisabled(user.getId()) && isMatchingUser) {
	            return(ResponseHelper.accountDisabledResponse(user.getId(), uriInfo));	        	
	        }
	        
	        //step 4: check if this is an user initiated password change
	        if (updatedUser.getOldPassword() != null && updatedUser.getNewPassword() != null) {
	        	try {
	        		if(user.getPassword().equals(PasswordUtils.digestPassword(updatedUser.getOldPassword()))) {
		        		//everything is ok, so change the password
		        		user.setPassword(updatedUser.getNewPassword());
	        		} else {
	        			logger.info("Invalid password");
	            		throw new SecurityException("Invalid password");
	        		}
	        	} catch (SecurityException se) {
		    		return Response.status(UNAUTHORIZED).build();	        		
	        	}
	        //step 5: check if this is an admin initiated password change	        
	        } else if (hasAdminRole && updatedUser.getNewPassword() != null) {
	        	user.setPassword(updatedUser.getNewPassword());
	        }
	        
	        //step 6: is the user's password expired?
	        if (DaqueryUserDAO.expiredPassword(user.getId())) {
	            return(ResponseHelper.expiredPasswordResponse(user.getId(), uriInfo));	        		        	
	        }
	        
	        //if you passed all the checks then update the User
	        
	        
	        if(updatedUser.getRealName() != null)
	        	user.setRealName(updatedUser.getRealName());
	        if(updatedUser.getRoles() != null)
	        	user.setRoles(updatedUser.getRoles());
	        if(updatedUser.getStatus() != null)
	        	user.setStatus(updatedUser.getStatus());
	        if(updatedUser.getEmail() != null)
	        	user.setEmail(updatedUser.getEmail());
	     
	        
	        //persist changes
	        s.getTransaction().begin();
	
	        s.merge(user);
	        
	        s.getTransaction().commit();

	        return Response.ok(200).build();
	        
    	} catch (Exception e) {
    		logger.info(e.getMessage());
    		e.printStackTrace();
    		return Response.status(UNAUTHORIZED).build();	        		

    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		
    	}
    	
    }

/*
 * Remove the DELETE methods until we discuss how to "delete" something in
 * this project
    @DELETE
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response remove(@PathParam("id") String id) {
        //em.remove(em.getReference(User.class, id));
        return Response.noContent().build();
    }
  */  
    // ======================================
    // =          PRIVATE METHODS           =
    // ======================================
    
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
    	KeyGenerator kg = new KeyGenerator();
        Key key = kg.generateKey();
        try {
	        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
	        logger.info(claims.toString());
	        
	        //TODO: add code to validate the token
	        //      this will make a call to the Central server to authenticate
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
