package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
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
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.auth.TokenInvalidException;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.RemoteUser;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.PasswordUtils;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.RoleDAO;
import io.jsonwebtoken.ExpiredJwtException;


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
		ResponseHelper.getTokenResponse(200, null, user.getId(), null, null, extras);
		//String val = JSONHelper.toJSON(extras);
		//System.out.println(val);
		//System.out.println(user.toJson());
		
		
	}

    @Context
    private UriInfo uriInfo;

    @Context HttpHeaders httpHeaders;
    
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

    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving all the users.";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered retrieving all the users";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }

    // start of  diff here    
    /**
     * Retrieve remote users with specific characteristics related to their roles.  If a site_id is
     * specified and no role is specified, the query will return all users from the
     * remote site even if they have no specific associated local roles.
     * 
     * @param role OPTIONAL The role to query on.  Valid values are AGGREGATE_QUERIER or DATE_QUERIER.
     * @param siteId  REQUIRED The UUID of a site to constrain the query to.
     * @param networkId OPTIONAL The UUID of a network to constrain the query to.
     * 
     * @return A list of RemoteUser for users that match the criteria. 
     */
    @GET
    @Path("/remote")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findRemoteUsers(@DefaultValue("") @QueryParam("role") String role,
    		                  @DefaultValue("") @QueryParam("site-id") String siteId,
    		                  @DefaultValue("") @QueryParam("network-id") String networkId
    		                 )
    {
    	Session sess = null;
    	try
    	{
	    	boolean hasSite = ! StringHelper.isBlank(siteId);
	    	Site site = null;
	    	if(hasSite)
	    	{
	    		site = SiteDAO.getSitesByUUID(siteId).get(0);
	    		if(site == null)
	    			return(ResponseHelper.getErrorResponse(400, "Remote site not found", "A site was not found with id " + siteId + " while trying to find the users of this site.", null));
	    	}
	    	else
	    		return(ResponseHelper.getErrorResponse(400, "site-id is a required paramter.", null, null));
	    	
	    	boolean hasRole = ! StringHelper.isBlank(role);
	    	if(hasRole) return(ResponseHelper.getErrorResponse(400, "Query by role not yet supported.", null, null));
	    	
	    	boolean hasNetwork = ! StringHelper.isBlank(networkId);
	    	Network net = null;
	    	if(hasNetwork)
	    	{
	    		net = NetworkDAO.getNetworkById(networkId);
	    		if(net == null)
	    			return(ResponseHelper.getErrorResponse(400, "Network not found.", "A network was not found with id " + networkId + " while finding uses in site " + siteId, null));
	    	}

	    	
	    	sess = HibernateConfiguration.openSession();
	    	
	    	//get a list of networks that the specified site is connected to
	    	List<String> netIds = new ArrayList<String>();
	    	String sql = "select distinct network.network_id from site, incoming_query_sites, network " +
	    	             " where site.id = incoming_query_sites.site_id and network.id = incoming_query_sites.network_id  and upper(trim(site.site_id)) = '" + siteId.trim().toUpperCase() + "'";
	    	SQLQuery netQ = sess.createSQLQuery(sql);
	    	List<Object> nIds = netQ.list();
	    	for(Object nid : nIds)
	    		netIds.add( ((String) nid));
	    	
	    	if(netIds.size() == 0)
	    		return(ResponseHelper.getErrorResponse(400, "No connected networks found.", "While looking for users of site with id " + siteId + ", the site isn't connected to any networks.", null));
	    	
	    	if(hasNetwork && ! netIds.contains(networkId))
	    		return(ResponseHelper.getErrorResponse(400, "Site not in spcified network.", "The specified site " + siteId + " is not in the specified network " + networkId + " while looking for users of the site", null));

	    	if(hasNetwork)
	    	{
	    		netIds.clear();
	    		netIds.add(networkId);
	    	}
	    	
	    	//get all users from specified site
	    	Hashtable<String, UserInfo> allUsers = this.allUsersForSite(siteId, false);
	    	
	    	//get the role info and add it to user info
	    	String roleSql = "select remote_user_role.user_id, remote_user_role.site_id, remote_user_role.network_id, role.name from remote_user_role, role";
	    	roleSql = roleSql + " " + "where remote_user_role.site_id = '" + siteId + "' and remote_user_role.role_id  = role.id";
	    	if(hasNetwork)
	    	{
	    		roleSql = roleSql + " " + "and network_id = '" + networkId + "'";
	    	}
			SQLQuery q = sess.createSQLQuery(roleSql);
			List<Object []> vals = q.list();
			
			Hashtable<String, Hashtable<String, RemoteUser>> rolesBySiteAndNet = new Hashtable<String, Hashtable<String, RemoteUser>>();
			for(Object [] row : vals)
			{
				String uId = (String) row[0];
				String sId = (String) row[1];
				String nId = (String) row[2];
				String rl = (String) row[3];

				//fill a hashtable that has user role info by network and site
				String netSiteKey = sId.trim() + nId.trim();
				if(! rolesBySiteAndNet.containsKey(netSiteKey))
					rolesBySiteAndNet.put(netSiteKey, new Hashtable<String, RemoteUser>());
				if(! rolesBySiteAndNet.get(netSiteKey).containsKey(uId))
				{
					if(! allUsers.containsKey(uId))
						return(ResponseHelper.getErrorResponse(400, "User not a member of the specified site", "The user with id " + uId + " is not from site with id " + siteId, null));
					rolesBySiteAndNet.get(netSiteKey).put(uId, new RemoteUser(allUsers.get(uId)));
				}
				rolesBySiteAndNet.get(netSiteKey).get(uId).addRole(rl);
			}
	    	
			//organize all of the networks/sites/users into a tree that can be
			//returned via json
			List<ReturnNetwork> returnVals = new ArrayList<ReturnNetwork>();
			//for networks
			for(String netId : netIds)
			{
				ReturnNetwork rNet = new ReturnNetwork(netId);
				returnVals.add(rNet);

				ReturnSite rSite = new ReturnSite(siteId);
				rNet.sites.add(rSite);
				String nsKey = siteId.trim() + netId.trim();
				Hashtable<String, RemoteUser> sUsers;
				if(rolesBySiteAndNet.containsKey(nsKey))
					sUsers = rolesBySiteAndNet.get(nsKey);
				else
					sUsers = new Hashtable<String, RemoteUser>();
				
				//over all users of the site
				for(String uiKey : allUsers.keySet())
				{
					if(sUsers.containsKey(uiKey))
						rSite.remoteUsers.add(sUsers.get(uiKey));
					else
						rSite.remoteUsers.add(new RemoteUser(allUsers.get(uiKey)));
				}
			}
			
			return(ResponseHelper.getJsonResponseGen(200, returnVals));
    	}
    	catch(Throwable t)
    	{
    		String msg = "An unexpected error occured while finding remote users.";
    		logger.log(Level.SEVERE, msg, t);
    		return(ResponseHelper.getErrorResponse(500, msg + "  Check the server logs for more information.", null, t));
    	}
    	finally
    	{
    		if(sess != null) sess.close();
    	}
    }
    
    
    /**
     * Add a role for a remote (non-local) user.
     * 
     * @param userId  The user's UUID.
     * @param siteId The site UUID of the user's site.
     * @param netId The network UUID where the user will have permission.
     * @param role The role (as a string) for the user.  Valid values are AGGREGATE_QUERIER and DATA_QUERIER 
     * @return
     */
    @POST
    @Path("/remote-role")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addRemoteRole(@DefaultValue("") @FormParam("user-id") String userId,
    							  @DefaultValue("") @FormParam("site-id") String siteId,
    							  @DefaultValue("") @FormParam("network-id") String netId,
    							  @DefaultValue("") @FormParam("role") String role)
    {
    	try
    	{
    		if(StringHelper.isEmpty(userId)) return(ResponseHelper.getErrorResponse(400, "user-id is a required parameter", null, null));
	    	if(StringHelper.isEmpty(siteId)) return(ResponseHelper.getErrorResponse(400, "site-id is a required parameter", null, null));
	    	if(StringHelper.isEmpty(netId)) return(ResponseHelper.getErrorResponse(400, "network-id is a required parameter", null, null));
	    	if(StringHelper.isEmpty(role)) return(ResponseHelper.getErrorResponse(400, "role is a required parameter", null, null));
	    	
	    	String roleStr = role.toUpperCase().trim();
	    	if(! (roleStr.equals("AGGREGATE_QUERIER") || roleStr.equals("DATA_QUERIER")))
	    		return(ResponseHelper.getErrorResponse(400, "Invalid role specified", "Valid values for role are AGGREGATE_QUERIER and DATA_QUERIER, " + roleStr + " was provided.", null));

	    	Role r = RoleDAO.queryRoleByName(role);
	    	if(r == null) return(ResponseHelper.getErrorResponse(400, "Role not found", "The specified role, " + role + ", was not found..", null));
	    	RoleDAO.grantRemoteUserRole(r.getId(), userId, siteId, netId);
	    	return(ResponseHelper.getBasicResponse(200, "{}"));
    	}
    	catch(Throwable t)
    	{
    		String msg = "Unexpected error while adding a remote role";
    		logger.log(Level.SEVERE, msg, t);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for mor information.", null, t));
    	}
    	
    }
    
    /**
     * Revoke a role for a remote (non-local) user.
     * 
     * @param userId  The user's UUID.
     * @param siteId The site UUID of the user's site.
     * @param netId The network UUID where the user will have permission.
     * @param role The role (as a string) for the user.  Valid values are AGGREGATE_QUERIER and DATA_QUERIER 
     * @return
     */
    @DELETE
    @Path("/remote-role")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response revokeemoteRole(@DefaultValue("") @FormParam("user-id") String userId,
									@DefaultValue("") @FormParam("site-id") String siteId,
									@DefaultValue("") @FormParam("network-id") String netId,
									@DefaultValue("") @FormParam("role") String role)
    {
    	try
    	{
    		if(StringHelper.isEmpty(userId)) return(ResponseHelper.getErrorResponse(400, "user-id is a required parameter", null, null));
	    	if(StringHelper.isEmpty(siteId)) return(ResponseHelper.getErrorResponse(400, "site-id is a required parameter", null, null));
	    	if(StringHelper.isEmpty(netId)) return(ResponseHelper.getErrorResponse(400, "network-id is a required parameter", null, null));
	    	if(StringHelper.isEmpty(role)) return(ResponseHelper.getErrorResponse(400, "role is a required parameter", null, null));
	    	
	    	String roleStr = role.toUpperCase().trim();
	    	if(! (roleStr.equals("AGGREGATE_QUERIER") || roleStr.equals("DATA_QUERIER")))
	    		return(ResponseHelper.getErrorResponse(400, "Invalid role specified", "Valid values for role are AGGREGATE_QUERIER and DATA_QUERIER, " + roleStr + " was provided.", null));

	    	Role r = RoleDAO.queryRoleByName(role);
	    	if(r == null) return(ResponseHelper.getErrorResponse(400, "Role not found.", "Role " + role + " was not found when deleting from user " + userId  + ".", null));
	    	RoleDAO.deleteRemoteRoleByParams(r.getId(), userId, siteId, netId);
	    	return(ResponseHelper.getBasicResponse(200, "{}"));
    	}
    	catch(Throwable t)
    	{
    		String msg = "Unexpected error while adding a remote role";
    		logger.log(Level.SEVERE, msg, t);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for mor information.", null, t));
    	}
    	
    }
    
    @GET
    @Path("/user-info")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUserInfo()
    {
    	try
    	{
    		Site mySite = SiteDAO.getLocalSite();
    		Hashtable<String, UserInfo> allUsers = allUsersForSite(mySite.getSiteId(), true);
    		List<UserInfo> users = new ArrayList<UserInfo>();
    		for(String uId : allUsers.keySet())
    			users.add(allUsers.get(uId));
    		return(ResponseHelper.getJsonResponseGen(200, users));
    	}
    	catch(Throwable t)
    	{
    		String msg = "Unexpected error while getting all UserInfo for this site";
    		logger.log(Level.SEVERE, msg, t);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server local and site server logs.", null, t));
    	}
    }
    private Hashtable<String, UserInfo> allUsersForSite(String uuid, boolean forceLocal) throws Exception
    {
    	Site mySite = SiteDAO.getLocalSite();
    	Hashtable<String, UserInfo> rVal = new Hashtable<String, UserInfo>();
    	if(mySite.getSiteId().equals(uuid) || forceLocal)
    	{
    		List<DaqueryUser> users = DaqueryUserDAO.queryAllUsers();
    		for(DaqueryUser user : users)
    			rVal.put(user.getId(), new UserInfo(user));
    	}
    	else
    	{
    		Site site = SiteDAO.getSitesByUUID(uuid).get(0);
    		Response resp = WSConnectionUtil.getFromRemoteSite(site, "users/user-info", null, null);
    		String json = resp.readEntity(String.class);
    		ObjectMapper mapper = new ObjectMapper();
    		TypeReference<List<UserInfo>> typ = new TypeReference<List<UserInfo>>(){};
    		List<UserInfo> users = mapper.readValue(json, typ);
    		for(UserInfo user :users)
				rVal.put(user.getId(), user);
    		resp.close();
    	}
    	return(rVal);
    }
    
    private class ReturnNetwork extends DaqueryObject
    {
    	private static final long serialVersionUID = 29200238324532342l;
    	@Expose
    	String networkId;
    	@Expose
    	List<ReturnSite> sites = new ArrayList<ReturnSite>();
    	
    	ReturnNetwork(String id)
    	{
    		this.networkId = id;
    	}
    }
    
    private class ReturnSite extends DaqueryObject
    {
    	private static final long serialVersionUID = 8478373843239834l;
    	@Expose
    	String siteId;
    	@Expose
    	List<RemoteUser> remoteUsers = new ArrayList<RemoteUser>();
    	
    	ReturnSite(String id){this.siteId = id;}
    }
    
    /**
     * Get UserInfo for all users..
     */
    @GET
    @Path("/users-info")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsersInfo()
    {
    	try
    	{
    		List<DaqueryUser> users = DaqueryUserDAO.queryAllUsers();
    		List<UserInfo> uInfo = new ArrayList<UserInfo>();
    		for(DaqueryUser user : users)
    			uInfo.add(user.myInfo());
    		
    		return(ResponseHelper.getJsonResponseGen(200, uInfo));
    	}
    	catch(Throwable t)
    	{
    		String msg = "An error occured while retrieving all users.";
    		logger.log(Level.SEVERE, msg, t);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for more information.", null, t));
    	}
    }
    
    
    //end of diff here

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
                                     @QueryParam("password") String password,
                                     @DefaultValue("") String networkId) {

    	
    	String netId = (StringHelper.isEmpty(networkId))?null:networkId;
    	
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
    	Site mySite = null;
    	try {
    		
    		mySite = SiteDAO.getLocalSite();
    		if(mySite == null)
    		{
    			return(ResponseHelper.getErrorResponse(500, "Invalid local site information.", "Unable to find the local site.  Possibly the local application database is currupted or is in an invalid interim state.", null));
    		}
            
            // Authenticate the user using the credentials provided
            user = DaqueryUserDAO.authenticate(email, password);

            if(DaqueryUserDAO.expiredPassword(user.getId()))
                return(ResponseHelper.expiredPasswordResponse(user.getId(), mySite.getSiteId(), null));
            
            if (DaqueryUserDAO.accountDisabled(user.getId()))
                return(ResponseHelper.accountDisabledResponse(user.getId(), uriInfo));
            	
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByID(user.getId());
            Map<String, Object> extraObjs = new HashMap<String, Object>();
            extraObjs.put("user", currentUser);
            
            Response rVal = ResponseHelper.getTokenResponse(200, null, user.getId(), mySite.getSiteId(), netId, extraObjs);

            return rVal;

        } catch (ExpiredJwtException expired) {
        	logger.info("Expired token: " + expired.getLocalizedMessage());
            try {
            	String siteId = (mySite == null)?null:mySite.getSiteId();
            	return(ResponseHelper.expiredTokenResponse(user.getId(), siteId, netId));
            } catch(Throwable t) {
            	String msg = "Unexpected error while generating an expired token response.";
            	logger.log(Level.SEVERE, msg, t);
            	return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for more information.", null, t));
            }
        } catch (Exception e) {
    		String msg = "An unexpected error occured while authenticating your login.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(UNAUTHORIZED.getStatusCode(), msg + " Check the server logs for more information.", null, e));
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
	
	        DaqueryUser newUser = new DaqueryUser(login, password, true);
	        s.persist(newUser);
	
	        s.getTransaction().commit();
	
	       
	        logger.info("Done creating user: " + newUser.toString());
	        
	        return Response.created(uriInfo.getAbsolutePathBuilder().path(newUser.getId() + "").build()).build();
        } catch (Exception e) {
    		String msg = "An unexpected error occured while creating a new account for user [" + login + "].";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for more information.", null, e));
	    } finally {
	    	if (s != null) {
	    		s.close();
	    	}
	    	
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
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(DaqueryUser new_user) {

//    	if (login.isEmpty() || password.isEmpty()) 
//    		return Response.status(BAD_REQUEST).build();
//    	
//    	String loggermsg = "login=" + login + " password=" + password;
//        logger.info("Trying to create user with: " + loggermsg);
        
    	Session s = null;
    	try {
    		new_user.assignUUID();
    		if (new_user.getStatusEnum() == null) {
    			new_user.setStatusEnum(UserStatus.ACTIVE);
    		}
    		new_user.setRoles(new ArrayList<Role>());
    		
    		s = HibernateConfiguration.openSession();
	
	        s.getTransaction().begin();
	        s.persist(new_user);
	        s.getTransaction().commit();
	
	        logger.info("Done trying to create user: " + new_user.toString());
	        
	        return Response.created(uriInfo.getAbsolutePathBuilder().path(new_user.getId() + "").build()).entity(new_user).build();
        } catch (Exception e) {
    		String msg = "An unexpected error occured while creating a new user.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for more information.", null, e));
	    } finally {
	    	if (s != null) {
	    		s.close();
	    	}
	    	
	    }
    }
    
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
	        return Response.ok().entity(json).build();
    	} catch (Exception e) {
    		String msg = "An unexpected error occured while retrieving account information user [" + id + "].";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for more information.", null, e));
    	}
    }
    
    /**
     * 
     */
    @PUT
    @Secured
    @Path("/update-role/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUserRole(@PathParam("id") String id, LinkedHashMap<?, ?> u) {
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();

	        DaqueryUser user = DaqueryUserDAO.queryUserByID(id);
	        
	        DaqueryUser loggedInUser = DaqueryUserDAO.queryUserByID(username);

	        if (user == null)
	            return Response.status(NOT_FOUND).build();
	        
	        boolean hasAdminRole = DaqueryUserDAO.hasRole(loggedInUser.getId(), null, "admin");
	        if (!hasAdminRole) {
	        	return Response.status(UNAUTHORIZED).build();
	        }
	        
	        Map.Entry<String, Boolean> entry = (Entry<String, Boolean>) ((HashMap)u.get("roles")).entrySet().iterator().next();
	        
	        if(entry.getValue()) {
	        	if(!user.getRoles().contains(RoleDAO.queryRoleByName(entry.getKey())))
	        		user.getRoles().add(RoleDAO.queryRoleByName(entry.getKey()));
	        }
	        else {
	        	Role role = null;
	        	for(Role r : user.getRoles()) {
	        		if(r.getName().equals(entry.getKey())) {
	        			role = r;
	        			break;
	        		}
	        	}
	        	user.getRoles().remove(role);
	        }
	       
	        //persist changes
	        s.getTransaction().begin();
	
	        s.merge(user);
	        
	        s.getTransaction().commit();
 
	        return Response.ok(200).build();
    	} catch (Exception e) {
    		String msg = "An unexpected error occured while retrieving account information user [" + id + "].";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for more information.", null, e));

    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		
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
	        boolean hasAdminRole = DaqueryUserDAO.hasRole(loggedInUser.getId(), null, "admin");
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
	        
	        Site mySite = SiteDAO.getLocalSite();
	        //step 6: is the user's password expired?
	        if (DaqueryUserDAO.expiredPassword(user.getId())) {
	            return(ResponseHelper.expiredPasswordResponse(user.getId(), mySite.getSiteId(), null));	        		        	
	        }
	        
	        //if you passed all the checks then update the User
	        
	        
	        if(updatedUser.getRealName() != null)
	        	user.setRealName(updatedUser.getRealName());
	        if(updatedUser.getRoles() != null) {
	        	user.getRoles().clear();
	        	for(Role r : updatedUser.getRoles()) {
	        		user.getRoles().add(RoleDAO.queryRoleByName(r.getName()));
	        	}
	        	
	        }
	        if(updatedUser.getStatus() != null)
	        	user.setStatus(updatedUser.getStatus());
	        if(updatedUser.getEmail() != null)
	        	user.setEmail(updatedUser.getEmail());
	     
	        
	        //persist changes
	        s.getTransaction().begin();
	
	        s.merge(user);
	        
	        s.getTransaction().commit();

	        return Response.ok("{}").build();
	        
    	} catch (Exception e) {
    		String msg = "An unexpected error occured while updating account information  for user [" + id + "].";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for more information.", null, e));

    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		
    	}
    	
    }

    @GET
    @Path("/validateToken")
    @Produces(MediaType.APPLICATION_JSON)
    public Response validateToken()
    {
    	String securityToken = httpHeaders.getHeaderString("Authorization");
		try {
			JsonWebToken jwt = new JsonWebToken(securityToken);
		} catch (JsonParseException e) {
			return(ResponseHelper.getErrorResponse(400, "Invalid login token recieved.", "", e));
		} catch (IOException e) {
			return(ResponseHelper.getErrorResponse(400, "Invalid login token recieved.", "", e));
		} catch (TokenInvalidException e) {
			return(ResponseHelper.getErrorResponse(401, "Not Authorized", e.getMessage(), e));
		} catch (Throwable t) {
			return(ResponseHelper.getErrorResponse(500, "An unexpected error occured while checking user credentials at a remote site.", null, t));
		}
		return(ResponseHelper.getBasicResponse(200, "valid"));
    }
}
