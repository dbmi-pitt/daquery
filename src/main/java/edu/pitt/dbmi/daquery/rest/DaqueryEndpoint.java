package edu.pitt.dbmi.daquery.rest;

import static edu.pitt.dbmi.daquery.rest.AbstractEndpoint.getFromRemoteSite;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

import java.io.File;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.common.dao.AbstractDAO;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.domain.inquiry.ResponseStatus;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.ResponseDAO;
import edu.pitt.dbmi.daquery.dao.RoleDAO;
import edu.pitt.dbmi.daquery.dao.SQLQueryDAO;
import edu.pitt.dbmi.daquery.queue.QueueManager;
import edu.pitt.dbmi.daquery.queue.ResponseTask;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;

@Path("/")
public class DaqueryEndpoint extends AbstractEndpoint
{
	private final static Logger logger = Logger.getLogger(DaqueryEndpoint.class.getName());

	private final static String MAIN_QUEUE = "main";
	
    @Context
    private UriInfo uriInfo;
    
    @Context
    SecurityContext securityContext;
	
	@Context HttpHeaders httpHeaders;
	
	public static void main (String [] args) throws Exception
	{
		Client client = ClientBuilder.newClient();
		
		Response rVal = client.target("http://localhost:8080/daquery-central/availableNetworks?site-id=20b23b5c-61ad-44eb-8eef-886adcced18e").request(MediaType.APPLICATION_JSON).get();
		System.out.println(rVal);
		//System.out.println(callCentralServerAuth("bill-dev", "abc123"));
/*		InquiryRequest iq = PopulateDevData.createFullOutgoingRequest();
		String json = iq.toJson();
		System.out.println(json); */
	}
	
	private static boolean containsSiteWhoIQuery(List<Network> networks, String siteId)
	{
		for(Network net : networks)
		{
			for(Site site : net.getOutgoingQuerySites())
			{
				if(siteId.equals(site.getId()))
				{
					return(true);
				}
			}
		}
		return(false);
	}
	
	@GET
	@Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
	public Response helloWorld()
	{
		//that's a little dark, mate.-- it's actually a flipped reference to a Pink Floyd song
		return(ResponseHelper.getBasicResponse(200, "Hello Cruel World"));
	}
    
	@POST
	@Path("/echopost")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response echoPost(Site data)
	{
		//I know you are, but what am I?
		return Response.ok(200).entity(data.toJson()).build();
	}
    
	/**
	 * Check if the site database is set up or not.
	 * 
	 * @return A 200 response with a Y or N depending on whether the database is set up (Y) or not (N).
	 *         returns a 500 response if the database state can't be determined.
	 */
	@GET
	@Path("/is-site-setup")
    @Produces(MediaType.TEXT_PLAIN)
	public Response isSiteSetup()
	{
		int dbStatus = AppSetup.getDBStatus();
		if(dbStatus == AppSetup.DBSTATUS_ALL_GOOD)
			return(ResponseHelper.getBasicResponse(200, "Y"));
		else if(dbStatus == AppSetup.DBSTATUS_NONEXISTENT || dbStatus == AppSetup.DBSTATUS_EMPTY)
			return(ResponseHelper.getBasicResponse(200, "N"));
		else
			return(ResponseHelper.getBasicResponse(500, "The application database is in an indeterminate state.  Check the application error logs for more information."));
	}
	
	
	/** Get a list of networks with associated sites from the central server that 
	 *  have not yet been set up for this site to query from.
	 *  
	 *  @param only-non-connected-networks - An optional parameter to exclude any
	 *                                       networks (and associated sites, whether
	 *                                       connected or not) that are already connected.
	 *                                       Valid values are "true" or "yes".  Any other
	 *                                       value or the absence of this parameter will 
	 *                                       trigger returning all networks.
	 *  
	 * @return A list of NetworkInfo objects encoded as json
	 */
    @Secured("ADMIN")
    @GET
    @Path("/available-networks-to-query/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response availableNetworks(@DefaultValue("false") @PathParam("only-non-connected-networks") String nonConnectedNetsOnly) {
    	boolean nonConnNetsOnly = false;
    	List<String> connectedNetworkIds = new ArrayList<String>();
    	try
    	{
    		String c = nonConnectedNetsOnly.trim().toUpperCase();
    		if(c.equals("YES") || c.equals("TRUE")) nonConnNetsOnly = true;
    		
			Map<String, String> idParam = new HashMap<String, String>();
			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
			Response resp = callCentralServer("availableNetworks",  idParam);
			if(resp.getStatus() == 200)
			{
				if(nonConnNetsOnly)
				{
					List<Network> nets = NetworkDAO.queryAllNetworks();
					for(Network net : nets)
						connectedNetworkIds.add(net.getNetworkId());
				}
				String json = resp.readEntity(String.class);
				Network[] ninfo = JSONHelper.gson.fromJson(json, Network[].class);
				DaqueryEndpoint de = new DaqueryEndpoint();
				List<Network> nets = NetworkDAO.queryAllNetworks();
				List<Site> sitesToRemove = new ArrayList<Site>();
				for(Network nin : ninfo)
				{
					if(! connectedNetworkIds.contains(nin.getNetworkId()))
					{
						for(Site si : nin.getOutgoingQuerySites())
						{
							if(containsSiteWhoIQuery(nets, si.getSiteId()))
								sitesToRemove.add(si);
						}
						for(Site sr : sitesToRemove)
						{
							nin.getOutgoingQuerySites().remove(sr);
						}
						sitesToRemove.clear();
					}
				}
				List<Network> rlist = new ArrayList<Network>();
				for(Network n : ninfo)
				{
					if(! connectedNetworkIds.contains(n.getNetworkId()))
						rlist.add(n);
				}
				return(ResponseHelper.getJsonResponseGen(200, rlist));
			}
			else
				return(resp);
    	}
    	catch(Throwable t)
    	{
    		logger.log(Level.SEVERE, "An unexpeced error occured while obtaining a list of available networks and sites from the central server.", t);
    		return(ResponseHelper.getBasicResponse(500, "An unexpected error occured while obtaining a list of avaiilable networks and sites from the central server.  See the appication logs for more information."));
    	}
    	
    }
	
	
	/**
	 * Set up the application database for a local site and registers the site with the central server.
	 * Requires a site name and key to authenticate against the DaqueryCentral server.  
	 * 
	 * @param siteName DaqueryCentral registered site name.
	 * @param siteKey DaqueryCentral key that matches
	 * @param adminEmail email address for initial admin account
	 * @param adminPwd password for initial admin account
	 * 
	 * @return On success a 200 http response with the site-id encoded in json.  On failure a 500 http response.
	 */
	@GET
	@Path("setupSite")
	public Response setupSite(@DefaultValue("") @QueryParam("site-name") String siteName,
			@DefaultValue("") @QueryParam("site-key") String siteKey,
			@DefaultValue("") @QueryParam("admin-email") String adminEmail,
			@DefaultValue("") @QueryParam("admin-pwd") String adminPwd,
			@DefaultValue("") @QueryParam("admin-real-name") String adminRealName
			)
	{
		try
		{
	    	if (! AppProperties.isDebugMode() && uriInfo.getRequestUri().getScheme() != "https") {
	            return(ResponseHelper.getBasicResponse(500, "This service must be accessed via https only"));    		
	    	}
	    	
	    	if(StringHelper.isEmpty(siteName) || StringHelper.isEmpty(adminEmail) || StringHelper.isEmpty(siteKey) || StringHelper.isEmpty(adminPwd))
	    	{
	    		return(ResponseHelper.getBasicResponse(400, "Parameters site-name, site-key, admin-email and admin-pwd are required."));
	    	}
	    	
	    	String homeDir = AppProperties.getHomeDirectory();
	    	if(StringHelper.isEmpty(homeDir))
	    	{
	    		logger.log(Level.SEVERE, "A configured database directory was not found.  This directory is the Tomcat conf directory which is found with the global environment variable CATALINA_HOME.");
	    		return(ResponseHelper.getBasicResponse(500, "Unable to find a configured database helper.  It is possible that the CATALINA_HOME environment variable needs to be set globaly."));
	    	}
	    	String confDir = AppProperties.getConfDirectory();
	    	File confDirF = new File(confDir);
	    	if(! confDirF.exists() || ! confDirF.canWrite())
	    	{
	    		logger.log(Level.SEVERE, "The database directory, " + confDir + "does not exist or is not writable.");
	    		return(ResponseHelper.getBasicResponse(500, "Unable to write to the configured database directory: " + confDir));
	    	}
	    	
			int dbStatus = AppSetup.getDBStatus();
			if(dbStatus == AppSetup.DBSTATUS_NONEXISTENT)
			{
				Response centralAuthResponse = callCentralServerAuth(siteName, siteKey);
		    	if(centralAuthResponse.getStatus() != 200)
		    		return(centralAuthResponse);

		    	//add the initial values from the central server
				String jsonval = centralAuthResponse.readEntity(String.class);
				Map<String, String> jmap = JSONHelper.toMap(jsonval);
		    	if(AppSetup.initialSetup(jmap.get("site-id"), siteName, jmap.get("site-url"), adminEmail, adminPwd, adminRealName))
				{	
		    		
					String key = jmap.get("new-site-key");
					String siteId = jmap.get("site-id");		    	
			    	AppProperties.setDBProperty("central.site.key", key);
			    	AppProperties.setDBProperty("site.id", siteId);
			    	AppProperties.setDBProperty("site.name", siteName);
			    	
			    	DaqueryUser currentUser = DaqueryUserDAO.getAdminUser();
			    	Map<String, Object> addtionalVal = new HashMap<String, Object>();
			    	addtionalVal.put("user", currentUser);
			    	return(ResponseHelper.getTokenResponse(200, null, currentUser.getId(), siteId, addtionalVal));
				}
				else
					return(ResponseHelper.getBasicResponse(500, "An error occured while initializing the application database. Check the application logs for more information."));
			}
			else
			{
				String msg;
				if(dbStatus == AppSetup.DBSTATUS_EMPTY)
				{
					msg = "The application database was created, but is now empty.  Try deleting and setting up again.  The database is at: " + AppProperties.getDBDir();
				}
				else if(dbStatus == AppSetup.DBSTATUS_ALL_GOOD)
				{
				    msg = "This site has already been set up.";	
				}
				else if(dbStatus == AppSetup.DBSTATUS_NEWER_VERSION || dbStatus == AppSetup.DBSTATUS_OLD_VERSION)
				{
					msg = "This site already exists and is a different version.  The application database is located at: " + AppProperties.getDBDir();
				}
				else
				{
					msg = "This site cannot be set up.  The database is in an unidentifiable state.";
				}
				return(ResponseHelper.getBasicResponse(500, msg));
			}
		}
		catch(Throwable t)
		{
			logger.log(Level.SEVERE, "An unexpected error occured while setting up the site.", t);
			return(ResponseHelper.getBasicResponse(500, "An unexpected error occured while setting up the site.  Check the application logs for more information."));
		}
	}
	
	
	@POST
	@Path("request")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response request(DaqueryRequest request) throws DaqueryException
	{
		try
		{
			if(request == null || request.getRequestSite() == null || request.getRequestSite().getSiteId() == null)
				return(ResponseHelper.getBasicResponse(400, "A request site with a valid request site UUID is required."));

			if(request.getNetwork() == null || StringHelper.isBlank(request.getNetwork().getNetworkId()))
					return(ResponseHelper.getBasicResponse(400, "A request must specify a valid network with a network id"));
			
			if(request.getInquiry() == null ||
			   request.getInquiry().getDataType() == null)
					return(ResponseHelper.getBasicResponse(400, "A request must have a valid inquiry attached with associated data type and network id"));
			
			if(request.getRequestId() == null)
				request.setRequestId(UUID.randomUUID().toString());

			if(request.getInquiry().getInquiryId() == null)
				request.getInquiry().setInquiryId(UUID.randomUUID().toString());
			
			
			String requestSiteId = request.getRequestSite().getSiteId();
			Site mySite = SiteDAO.getLocalSite();
			
			Site requestSite = SiteDAO.getSiteByNameOrId(requestSiteId);
			request.setRequestSite(requestSite);
			
			Network net = NetworkDAO.getNetworkById(request.getNetwork().getNetworkId());
			request.setNetwork(net);
			request.getInquiry().setNetwork(net);
			String securityToken = httpHeaders.getHeaderString("Authorization");
			Jws<Claims> claims = ResponseHelper.parseToken(securityToken);
			//System.out.println("ISSUER: " + claims.getBody().getIssuer());
			String userOrId = claims.getBody().getSubject();			
			
			if(mySite.getSiteId().equals(requestSiteId))  //handle request locally 
			{	
				request.setDirection("OUT");
	
				String requesterId = request.getRequester().getId();
				if(request.getInquiry() == null)
					return(ResponseHelper.getBasicResponse(400, "No inquiry provided."));
				
//				if(requester == null)
//					return(ResponseHelper.getBasicResponse(400, "The requester with user id " + requesterId + " was not found."));

				if(! DaqueryUserDAO.hasRole(userOrId, net.getNetworkId(), "AGGREGATE_QUERIER"))
					return(ResponseHelper.getBasicResponse(403, "User with id: " + requesterId + " is not allowed to run aggregate queries against site: " + AppProperties.getDBProperty("site.name")));
				
				
				//TODO decide if this is an immediate response or if it needs to be reviewed
				// if it needs to be reviewed create a DaqueryResponse object, mark as pending
				//  and return- maybe send a message to someone??
				// else do the below..
				
				DaqueryResponse rVal = null;
				try
				{
					ResponseTask task = new ResponseTask(request, DaqueryUserDAO.getSysUser(), net.getDataModel());
					QueueManager.getNamedQueue(MAIN_QUEUE).addTask(task);
					rVal = task.getResponse();
					rVal.setRequest(request);
					ResponseDAO.saveOrUpdate(rVal);
				}
				catch(Throwable e)
				{
					logger.log(Level.SEVERE, "Error while executing request with id: " + request.getRequestId(), e);
					DaqueryResponse response = new DaqueryResponse(true);
					response.setStatusEnum(ResponseStatus.ERROR);
					response.setErrorMessage(e.getMessage());
					String trace = StringHelper.stackToString(e);
					response.setStackTrace(trace);
					response.setReplyTimestamp(new Date());
					response.setRequest(request);
					ResponseDAO.saveOrUpdate(response);
					ResponseHelper.getJsonResponseGen(500, response);
				}
				
				if(rVal == null)
					return(ResponseHelper.getBasicResponse(500, "No result returned from aggregate query."));
				else
				{
					return(ResponseHelper.getJsonResponseGen(200, rVal));
				}
			}
			else  //send to a remote site
			{
				AbstractDAO.save(request);
				return postJSONToRemoteSite(requestSite, "request", request.toJson(), securityToken);
			}
		}
		catch(Throwable t)
		{
			String msg = "An unexpected error occured while trying process an InquiryRequest.";
			logger.log(Level.SEVERE, msg, t);
			return(ResponseHelper.getBasicResponse(500, msg + "Check the server logs at site: " + AppProperties.getDBProperty("site.name") + " for further information."));
		}
	}
	
    @GET
    @Secured
    @Path("/response/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response response(@PathParam("id") String id)
    {
    	if(StringHelper.isBlank(id))
    		return(ResponseHelper.getBasicResponse(400, "Response id required."));
    	
    	if(!ResponseDAO.containsId(id))
    		return(ResponseHelper.getBasicResponse(404, "A response with id:" + id + " was not found."));
    	
    	DaqueryResponse rVal = null;
    	try
    	{
    		rVal = ResponseDAO.getResponseById(id);
        	if(rVal == null)
        		return(ResponseHelper.getBasicResponse(404, "Response not found." ));    		
    		Site mySite = SiteDAO.getLocalSite();
    		String requestSiteId = rVal.getRequest().getRequestSite().getSiteId();
    		if( !mySite.getSiteId().equals(requestSiteId))
    		{
    			Site remoteSite = SiteDAO.querySiteByID(requestSiteId);
    			return(getFromRemoteSite(remoteSite, "/response/" + id, null));    			
    		}
    		ResponseTask rTask = (ResponseTask) QueueManager.getNamedQueue(MAIN_QUEUE).getTask(rVal.getResponseId());
    		if(rVal.getStatusEnum().isQueuedOrRunning() && rTask == null)
    		{
    			rVal.setStatusEnum(ResponseStatus.STALLED);
    			ResponseDAO.saveOrUpdate(rVal);
    		}
    	}
    	catch(Throwable t)
    	{
    		String msg = "An unhandled exception occured while retrieving a response with id: " + id;
    		logger.log(Level.SEVERE, msg, t);
    		return(ResponseHelper.getBasicResponse(500, msg + "Check the site server logs for more information."));
    	}
        	
        return Response.ok(200).entity(rVal.toJson()).build();    	
    }
    
    /**
     * Save an SQL query
     * @return On success a 201 http response with the sql query encoded in json.  On failure a 500 http response.
     * example: /sqlquery
     */
    @POST
    @Secured
    @Path("/sqlquery")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveSQLQuery(SQLQuery query) {
    	SQLQueryDAO sqlqueryDAO = new SQLQueryDAO();
    	try {
			sqlqueryDAO.openCurrentSessionwithTransaction();
			sqlqueryDAO.save(query);
			sqlqueryDAO.closeCurrentSessionwithTransaction();
    	} catch (Throwable t) {
			String msg = "An unhandled exception occured while saving sql query";
    		logger.log(Level.SEVERE, msg, t);
			return(ResponseHelper.getBasicResponse(500, msg + "Check the site server logs for more information."));
		} finally {
			if(sqlqueryDAO.getCurrentSession() != null)
				sqlqueryDAO.closeCurrentSession();
		}
    	return Response.ok(201).entity(query.toJson()).build();   
    }
    
    /**
     * Get local roles
     * @return the list of roles except admin
     */
    @GET
    @Secured
    @Path("/local-roles")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response localRoles() {
    	try {
    		return ResponseHelper.getJsonResponseGen(200, RoleDAO.queryAllRoles()); //Response.ok(200).entity(RoleDAO.queryAllRoles().toJson()).build(); 
    	} catch (Throwable t) {
    		String msg = "An unhandled exception occured while getting roles";
    		logger.log(Level.SEVERE, msg, t);
			return(ResponseHelper.getBasicResponse(500, msg + "Check the site server logs for more information."));
    	}
    }
	
	public static Response callCentralServer(String serviceName, Map<String, String> additionalParameters) throws DaqueryException
	{
		String siteId = AppProperties.getDBProperty("site.id");
		String siteKey = AppProperties.getDBProperty("central.site.key");
		Response auth = callCentralServerAuth(siteId, siteKey);
		if(auth.getStatus() != 200)
			return(auth);
		//TODO grab the token from the auth response and send it along with the call
		String url = AppProperties.getCentralServerURL() + "/daquery-central/" +  serviceName;
		if(additionalParameters != null)
		{
			String paramDivider = "?";
			if(url.contains("?"))
				paramDivider = "&";			
			boolean firstParam = true;
			for(String key :additionalParameters.keySet())
			{
				url = url + paramDivider + key + "=" + additionalParameters.get(key);
				if(firstParam)
				{
					paramDivider = "&";
					firstParam = false;
				}
			}
		}
		
		Client client = ClientBuilder.newClient();
		
		Response rVal = client.target(url).request(MediaType.APPLICATION_JSON).get();
		return(rVal);
		
	}
	
	/**
     * renew JWT.
     * (JSON Web Token) if the user's information is valid.
     * example URL: daquery-ws/ws/renew-jwt
     * @return 200 with jwt
     * otherwise, return a BAD REQUEST.  Return an UNAUTHORIZED for any other failure.
     */
    @GET
    @Secured
    @Path("/renew-jwt")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response renewJWT(@HeaderParam(HttpHeaders.AUTHORIZATION) String jwt) {

    	DaqueryUser user = null;
    	Site mySite = null;
    	try {
    		mySite = SiteDAO.getLocalSite();
    		
    		Principal principal = securityContext.getUserPrincipal();
            String uuid = principal.getName();
            user = DaqueryUserDAO.queryUserByID(uuid);
            
    		 // Get the HTTP Authorization header from the request
    		logger.log(Level.INFO, "#### renew jwt : " + jwt);
            
            Response rVal = ResponseHelper.getTokenResponse(200, null, user.getId(), mySite.getSiteId(), null);

            return rVal;

        } catch (ExpiredJwtException expired) {
        	logger.info("Expired token: " + expired.getLocalizedMessage());
            try {
            	String siteId = (mySite == null)?null:mySite.getSiteId();
            	return(ResponseHelper.expiredTokenResponse(user.getId(), siteId));
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

	
	private static Response callCentralServerAuth(String siteName, String siteKey) throws DaqueryException
	{
		Map<String, String> params = new HashMap<String, String>();
		params.put("site", siteName);
		params.put("key", siteKey);
		Client client = ClientBuilder.newClient();
		String url = AppProperties.getCentralServerURL() + "/daquery-central/authenticateSite?site=" +siteName + "&key=" + siteKey;
		Response rVal = client.target(url).request(MediaType.APPLICATION_JSON).get();
		return(rVal);
	}	
}
