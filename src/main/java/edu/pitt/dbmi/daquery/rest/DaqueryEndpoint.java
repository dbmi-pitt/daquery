package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

import java.io.File;
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

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.pitt.dbmi.daquery.common.dao.AbstractDAO;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.domain.inquiry.ResponseStatus;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.ResponseDAO;
import edu.pitt.dbmi.daquery.dao.RoleDAO;
import edu.pitt.dbmi.daquery.dao.SQLQueryDAO;
import edu.pitt.dbmi.daquery.queue.QueueManager;
import edu.pitt.dbmi.daquery.queue.ResponseTask;
import io.jsonwebtoken.ExpiredJwtException;

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
    
	
	/**
	 * Send and error message for testing purposes.
	 * 
	 * @param message A test error message.
	 * @param responseCode An HTML error response code in the range 400 <= x < 600
	 * @return
	 */
	@GET
	@Path("/error")
    @Produces(MediaType.APPLICATION_JSON)
	public Response sendError(@DefaultValue("") @QueryParam("messge") String message, @DefaultValue("") @QueryParam("response-code") String responseCode)
	{
		int respCode = 500;
		if(!StringHelper.isEmpty(responseCode))
		{
			try
			{
				respCode = Integer.parseInt(responseCode);
				if(respCode < 400 || respCode >= 600)
					return(ResponseHelper.getErrorResponse(400, "Response code must be in the range 400 <= x < 600", null, null));
			}
			catch(Exception e)
			{
				return(ResponseHelper.getErrorResponse(500, "Invalid response code " + responseCode, null, e));
			}
		}
		String msg = (StringHelper.isEmpty(message))?"This is some descriptive text about what the error is.":message;
		String longMsg = "This is a longer, more descriptive version of the other message.  It could be blank, so be carefull about output format. \n" + msg + "\n\n" + msg + "\n\n " + msg;
		try
		{
			throw new DaqueryException("Generated error");
		}
		catch(DaqueryException ex)
		{
			return(ResponseHelper.getErrorResponse(respCode, msg, longMsg, ex));
		}
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
			return(ResponseHelper.getErrorResponse(500, "The application database is in an indeterminate state.", "Check the application error logs for more information.  It is likely that you need to delete the database at tomcat/conf/daquery-db and start over.", null));
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
    		return(ResponseHelper.getErrorResponse(500, "An unexpected error occured.", "An unexpected error occured while obtaining a list of avaiilable networks and sites from the central server.  See the appication logs for more information.", t));
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
	            return(ResponseHelper.getErrorResponse(500, "This service must be accessed via https only.", "A call to " + uriInfo.getRequestUri().toString() + " was made.  This needs to be done via https.", null));    		
	    	}
	    	
	    	if(StringHelper.isEmpty(siteName) || StringHelper.isEmpty(adminEmail) || StringHelper.isEmpty(siteKey) || StringHelper.isEmpty(adminPwd))
	    	{
	    		String longMsg = "Parameters site-name, site-key, admin-email and admin-pwd are required.  Provided site-name: " + siteName + " admin-email: " + adminEmail + " site-key:" + siteKey + " admin-pwd:" + ((StringHelper.isEmpty(adminPwd))?"Not Provided":"Provided");
	    		return(ResponseHelper.getErrorResponse(400, "Not all parameters provided.", longMsg, null));
	    	}
	    	
	    	String homeDir = AppProperties.getHomeDirectory();
	    	if(StringHelper.isEmpty(homeDir))
	    	{
	    		logger.log(Level.SEVERE, "A configured database directory was not found.  This directory is the Tomcat conf directory which is found with the global environment variable CATALINA_HOME.");
	    		return(ResponseHelper.getErrorResponse(500, "Unable to find a configured database helper.", "A configured database was not found.  It is possible that the CATALINA_HOME environment variable needs to be set globaly.", null));
	    	}
	    	String confDir = AppProperties.getConfDirectory();
	    	File confDirF = new File(confDir);
	    	if(! confDirF.exists() || ! confDirF.canWrite())
	    	{
	    		logger.log(Level.SEVERE, "The database directory, " + confDir + "does not exist or is not writable.");
	    		return(ResponseHelper.getErrorResponse(500, "Unable to write to the configured database directory.", " The directory " + confDir + " may not be writable or does not exist.", null));
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
			    	return(ResponseHelper.getTokenResponse(200, null, currentUser.getId(), siteId, null, addtionalVal));
				}
				else
					return(ResponseHelper.getErrorResponse(500, "An error occured while initializing the application database.", "The error was unreported. Check the application logs for more information.", null));
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
					msg = "This site cannot be set up.  The database is in an unidentifiable state.  You may need to delete the database in tomcat/conf/daquery-db and start over.";
				}
				return(ResponseHelper.getErrorResponse(500, "The database could not be set up.", msg, null));
			}
		}
		catch(Throwable t)
		{
			logger.log(Level.SEVERE, "An unexpected error occured while setting up the site.", t);
			return(ResponseHelper.getErrorResponse(500, "An unexpected error occured while setting up the site.", "More information may be available in the application logs.", t));
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
				return(ResponseHelper.getErrorResponse(400, "A request site with a valid request site UUID is required.", null, null));

			if(request.getNetwork() == null || StringHelper.isBlank(request.getNetwork().getNetworkId()))
					return(ResponseHelper.getErrorResponse(400, "A request must specify a valid network with a network id.", null, null));
			
			if(request.getInquiry() == null ||
			   request.getInquiry().getDataType() == null)
					return(ResponseHelper.getErrorResponse(400, "A request must have a valid inquiry attached with an associated data type ", null, null));
			
			if(request.getRequestId() == null)
				request.setRequestId(UUID.randomUUID().toString());

			if(request.getInquiry().getInquiryId() == null)
				request.getInquiry().setInquiryId(UUID.randomUUID().toString());
			
			
			String requestSiteId = request.getRequestSite().getSiteId();
			Site mySite = SiteDAO.getLocalSite();
			
			Site requestSite = SiteDAO.getSiteByNameOrId(requestSiteId);
			if(requestSite == null)
			{
				return(ResponseHelper.getErrorResponse(403, "Requesting site is not authorized to query.", "The querying site with id " + requestSiteId + " is not configured to work with this site.", null));
			}
			request.setRequestSite(requestSite);

			Network net = NetworkDAO.getNetworkById(request.getNetwork().getNetworkId());
			if(net == null)
			{
				return(ResponseHelper.getErrorResponse(403, "The network is not authorized to query.", "The network with id " + request.getNetwork().getNetworkId() + " being queried within is not configured to work with this site.", null));
			}
			request.setNetwork(net);
			request.getInquiry().setNetwork(net);
			String securityToken = httpHeaders.getHeaderString("Authorization");
			JsonWebToken jwt = new JsonWebToken(securityToken);
			String requesterId = jwt.getUserId();
			
			boolean isLocalRequester = DaqueryUserDAO.isLocalUserId(requesterId);
			UserInfo uInfo = DaqueryUserDAO.getUserInfo(requesterId);
			
			//if the requester is not local 
			//make sure we have the users information stored locally
			if(! isLocalRequester)
			{
				if(uInfo == null)
				{
					if(request.getRequester() == null || StringHelper.isEmpty(request.getRequester().getId()) || StringHelper.isEmpty(request.getRequester().getEmail()) || StringHelper.isEmpty(request.getRequester().getRealName()))
					{
						return(ResponseHelper.getErrorResponse(400, "Requester user information is required.", "Requester user information with a minimum of user id, email and real name for user with id " + requesterId + ".  This is needed because this user's information isn't currently listed at this site.", null));
					}
					if(! request.getRequester().getId().equals(requesterId))
					{
						return(ResponseHelper.getErrorResponse(400, "The requester id does not match the authenticated user id.", "User with id " + requesterId + " sent the request, but a user with  id " + request.getId() + " was provided with the request as the requester.", null));
					}
					uInfo = new UserInfo();
					uInfo.setEmail(request.getRequester().getEmail());
					uInfo.setId(request.getRequester().getId());
					uInfo.setRealName(request.getRequester().getRealName());
				}
				
				Session sess = null;
				Transaction trans = null;
				try
				{
					sess = HibernateConfiguration.openSession();
					trans =  sess.beginTransaction();
					sess.saveOrUpdate(uInfo);
					trans.commit();
				}
				catch(Throwable t)
				{
					if(trans != null) trans.rollback();
					logger.log(Level.SEVERE, "Error saving UserInfo object with user id " + uInfo.getId(), t);
					return(ResponseHelper.getErrorResponse(500, "There was an error at the request site while trying to save some request information.", "An error occured while trying to save the requester UserInfo on the local site please contact the site admin.", t));
				}
				finally
				{
					if(sess != null) sess.close();
				}
			}
			else //if the requester is local make sure they are a valid user
			{
				if(uInfo == null)
				{
					return(ResponseHelper.getErrorResponse(400, "Requester does not have a local account.", "The requester local to this machine has no user information registered.", null));
				}
			}
			
			request.setRequester(uInfo);
			
			if(mySite.getSiteId().equals(requestSiteId))  //handle request locally 
			{	
				if(request.getInquiry() == null)
					return(ResponseHelper.getErrorResponse(400, "No inquiry provided.", "An Inquiry object is required and was not included with the request", null));
				
				if(! DaqueryUserDAO.hasRole(requesterId, net.getNetworkId(), "AGGREGATE_QUERIER"))
					return(ResponseHelper.getErrorResponse(403, "Requester does not have aggregate query role.", "User with id: " + requesterId + " is not allowed to run aggregate queries against site: " + AppProperties.getDBProperty("site.name"), null));
				
				if(DaqueryUserDAO.isLocalUserId(requesterId))
					request.setDirection("IN-OUT");
				else
					request.setDirection("IN");
				
				//TODO decide if this is an immediate response or if it needs to be reviewed
				// if it needs to be reviewed create a DaqueryResponse object, mark as pending
				//  and return- maybe send a message to someone??
				// else do the below..
				
				DaqueryResponse rVal = null;
				try
				{
					request.setId(null);
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
					
					return(ResponseHelper.getErrorResponse(500, "Error while executing a request.", "An unexpected error occured while executing the request with id:"  + request.getRequestId(), e, response));
				}
				
				if(rVal == null)
					return(ResponseHelper.getErrorResponse(500, "No response recieved for this request.", "A response was not recieved from the task queue for this request.  Please contact the site admin from where the response was sent to look at the server log files for potential issues.", null));
				else
				{
					return(ResponseHelper.getJsonResponseGen(200, wrapResponse(rVal)));
				}
			}
			else  //send to a remote site
			{
				request.setDirection("OUT");
				AbstractDAO.save(request);
				Response response = postJSONToRemoteSite(requestSite, "request", request.toJson(), securityToken);
				if(response.getStatus() == 200)
				{
					String json = response.readEntity(String.class);
					ObjectMapper mapper = new ObjectMapper();
					TypeReference<DaqueryResponse> type = new TypeReference<DaqueryResponse>(){};
					DaqueryResponse resp = mapper.readValue(json, type);
					resp.setRequest(request);
					resp.setId(null);
					ResponseDAO.saveOrUpdate(resp);
					return ResponseHelper.getBasicResponse(200, "");
				} else {
					String json = response.readEntity(String.class);
					ObjectMapper mapper = new ObjectMapper();
					TypeReference<ErrorInfo> type = new TypeReference<ErrorInfo>(){};
					ErrorInfo errorInfo = mapper.readValue(json, type);
					DaqueryResponse resp = errorInfo.getResponse();
					resp.setRequest(request);
					resp.setId(null);
					ResponseDAO.saveOrUpdate(resp);					
					return response;
				}
			}
		}
		catch(Throwable t)
		{
			String msg = "An unexpected error occured while trying process an InquiryRequest.";
			logger.log(Level.SEVERE, msg, t);
			return(ResponseHelper.getErrorResponse(500, "An unexpected error occurred", msg + "Check the server logs at site: " + AppProperties.getDBProperty("site.name") + " for further information.", t));
		}
	}
	
	private HashMap<String, Object> wrapResponse(DaqueryResponse response)
	{
		HashMap<String, Object> responseWrapper = new HashMap<String, Object>();
		responseWrapper.put("response", response);
		return(responseWrapper);
	}
	
    @GET
   // @Secured
    @Path("/response/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response response(@PathParam("id") String id)
    {
    	if(StringHelper.isBlank(id))
    		return(ResponseHelper.getErrorResponse(400, "A response id required.", "The response id should be provided as a path parameter in the request url : server/daquery/ws/response/{id}", null));
    	
    	if(!ResponseDAO.containsId(id))
    		return(ResponseHelper.getErrorResponse(404, "No response found.", "A response with id:" + id + " was not found.", null));
    	
    	DaqueryResponse rVal = null;
    	try
    	{
    		rVal = ResponseDAO.getResponseById(id);
        	if(rVal == null)
        		return(ResponseHelper.getErrorResponse(404, "Response not found.", "A Response with id " + id + " was not found.", null ));    		
    		Site mySite = SiteDAO.getLocalSite();
    		String requestSiteId = rVal.getRequest().getRequestSite().getSiteId();
    		if( !mySite.getSiteId().equals(requestSiteId))
    		{
    			Site remoteSite = SiteDAO.querySiteByID(requestSiteId);
    			Response httpResponse = getFromRemoteSite(remoteSite, "/response/" + id, null);
    			if(httpResponse.getStatus() == 200)
				{
					String json = httpResponse.readEntity(String.class);
					ObjectMapper mapper = new ObjectMapper();
					TypeReference<DaqueryResponse> type = new TypeReference<DaqueryResponse>(){};
					DaqueryResponse resp = mapper.readValue(json, type);
					rVal.setStatus(resp.getStatus());
					rVal.setValue(resp.getValue());
					ResponseDAO.saveOrUpdate(rVal);
				}
    			else
    			{
					String json = httpResponse.readEntity(String.class);
					ObjectMapper mapper = new ObjectMapper();
					TypeReference<ErrorInfo> type = new TypeReference<ErrorInfo>(){};
					ErrorInfo errorInfo = mapper.readValue(json, type);
					DaqueryResponse resp = errorInfo.getResponse();
					rVal.setStatus(resp.getStatus());
					rVal.setValue(resp.getValue());
					ResponseDAO.saveOrUpdate(rVal);    				
    			}
    			return httpResponse;
    		}
    		ResponseTask rTask = (ResponseTask) QueueManager.getNamedQueue(MAIN_QUEUE).getTask(rVal.getResponseId());
    		if(rVal.getStatusEnum().isQueuedOrRunning() && rTask == null)
    		{
    			rVal.setStatusEnum(ResponseStatus.STALLED);
    			ResponseDAO.saveOrUpdate(rVal);
    		}
    		return ResponseHelper.getJsonResponseGen(200, wrapResponse(rVal));
    	}
    	catch(Throwable t)
    	{
    		String msg = "An unhandled exception occured while retrieving a response with id: " + id;
    		logger.log(Level.SEVERE, msg, t);
    		return(ResponseHelper.getErrorResponse(500, "An unhandled exception occured.", msg + "Check the site server logs for more information.", t));
    	}
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
			return(ResponseHelper.getErrorResponse(500, msg + "Check the site server logs for more information.", null, t));
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
			return(ResponseHelper.getErrorResponse(500, msg + "Check the site server logs for more information.", null, t));
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
    public Response renewJWT(@HeaderParam(HttpHeaders.AUTHORIZATION) String jwt, @DefaultValue("") @QueryParam("networkId") String networkId) {

    	JsonWebToken token = null;
    	try {
    		token = new JsonWebToken(jwt);
    		
/*    		Principal principal = securityContext.getUserPrincipal();
            String uuid = principal.getName();
            user = DaqueryUserDAO.queryUserByID(uuid); */
            
    		 // Get the HTTP Authorization header from the request
    		logger.log(Level.INFO, "#### renew jwt : " + jwt);
            
    		String netId = (StringHelper.isEmpty(networkId))?token.getNetworkId():networkId;
    		
            Response rVal = ResponseHelper.getTokenResponse(200, null, token.getUserId()
            		, token.getSiteId(), netId, null);

            return rVal;

        } catch (ExpiredJwtException expired) {
        	logger.info("Expired token: " + expired.getLocalizedMessage());
            try {
            	return(ResponseHelper.expiredTokenResponse(token.getUserId(), token.getSiteId(), token.getNetworkId()));
            } catch(Throwable t) {
            	String msg = "Unexpected error while generating an expired token response.";
            	logger.log(Level.SEVERE, msg, t);
            	return(ResponseHelper.getErrorResponse(500, msg + " Check the server logs for more information.", null, t));
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
