package edu.pitt.dbmi.daquery.rest;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.common.domain.NetworkInfo;
import edu.pitt.dbmi.daquery.common.domain.SiteInfo;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.inquiry.InquiryRequest;
import edu.pitt.dbmi.daquery.domain.inquiry.InquiryResponse;
import edu.pitt.dbmi.daquery.domain.inquiry.ResponseStatus;

@Path("/")
public class DaqueryEndpoint extends AbstractEndpoint
{
	private final static Logger log = Logger.getLogger(DaqueryEndpoint.class.getName());

	public static void main (String [] args) throws Exception
	{
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
	
    @Context
    private UriInfo uriInfo;
    
	@GET
	@Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
	public Response helloWorld()
	{
		//that's a little dark, mate.-- it's actually a flipped reference to a Pink Floyd song
		return(ResponseHelper.getBasicResponse(200, "Hello Cruel World"));
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
	 * @return A list of NetworkInfo objects encoded as json
	 */
    @Secured("ADMIN")
    @GET
    @Path("/available-networks-to-query/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response availableNetworks() {
    	try
    	{
			Map<String, String> idParam = new HashMap<String, String>();
			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
			Response resp = callCentralServer("availableNetworks",  idParam);
			if(resp.getStatus() == 200)
			{
				String json = resp.readEntity(String.class);
				NetworkInfo[] ninfo = JSONHelper.gson.fromJson(json, NetworkInfo[].class);
				DaqueryEndpoint de = new DaqueryEndpoint();
				List<Network> nets = NetworkDAO.queryAllNetworks();
				List<SiteInfo> sitesToRemove = new ArrayList<SiteInfo>();
				for(NetworkInfo nin : ninfo)
				{
					for(SiteInfo si : nin.allowedSites)
					{
						if(containsSiteWhoIQuery(nets, si.id))
							sitesToRemove.add(si);
					}
					for(SiteInfo sr : sitesToRemove)
					{
						nin.allowedSites.remove(sr);
					}
					sitesToRemove.clear();
				}
				List<NetworkInfo> rlist = new ArrayList<NetworkInfo>();
				for(NetworkInfo n : ninfo)
					rlist.add(n);
				return(ResponseHelper.getJsonResponseGen(200, rlist));
			}
			else
				return(resp);
    	}
    	catch(Throwable t)
    	{
    		log.log(Level.SEVERE, "An unexpeced error occured while obtaining a list of available networks and sites from the central server.", t);
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
	    		log.log(Level.SEVERE, "A configured database directory was not found.  This directory is the Tomcat conf directory which is found with the global environment variable CATALINA_HOME.");
	    		return(ResponseHelper.getBasicResponse(500, "Unable to find a configured database helper.  It is possible that the CATALINA_HOME environment variable needs to be set globaly."));
	    	}
	    	String confDir = AppProperties.getConfDirectory();
	    	File confDirF = new File(confDir);
	    	if(! confDirF.exists() || ! confDirF.canWrite())
	    	{
	    		log.log(Level.SEVERE, "The database directory, " + confDir + "does not exist or is not writable.");
	    		return(ResponseHelper.getBasicResponse(500, "Unable to write to the configured database directory: " + confDir));
	    	}
	    	
			int dbStatus = AppSetup.getDBStatus();
			if(dbStatus == AppSetup.DBSTATUS_NONEXISTENT)
			{
				Response centralAuthResponse = callCentralServerAuth(siteName, siteKey);
		    	if(centralAuthResponse.getStatus() != 200)
		    		return(centralAuthResponse);

		    	if(AppSetup.initialSetup(adminEmail, adminPwd, adminRealName))
				{	
					//add the initial values from the central server
					String jsonval = centralAuthResponse.readEntity(String.class);
					Map<String, String> jmap = JSONHelper.toMap(jsonval);
					String key = jmap.get("new-site-key");
					String siteId = jmap.get("site-id");		    	
			    	AppProperties.setDBProperty("central.site.key", key);
			    	AppProperties.setDBProperty("site.id", siteId);
			    	AppProperties.setDBProperty("site.name", siteName);
			    	
			    	DaqueryUser currentUser = DaqueryUserDAO.getAdminUser();
			    	Map<String, Object> addtionalVal = new HashMap<String, Object>();
			    	addtionalVal.put("user", currentUser);
			    	return(ResponseHelper.getTokenResponse(200, null, currentUser.getId(), uriInfo, addtionalVal));
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
			log.log(Level.SEVERE, "An unexpected error occured while setting up the site.", t);
			return(ResponseHelper.getBasicResponse(500, "An unexpected error occured while setting up the site.  Check the application logs for more information."));
		}
	}
	
	@POST
	@Path("aggregate-inquiry-request")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public static Response aggregateInquiry(InquiryRequest request) throws DaqueryException
	{
		try
		{
			if(request == null || request.getRequester() == null || StringHelper.isEmpty(request.getRequester().getId()))
				return(ResponseHelper.getBasicResponse(400, "An Inquery request with a valid requster user object is required."));

			if(request.getInquiry() == null)
				return(ResponseHelper.getBasicResponse(400, "No query provided."));
			
			String userId = request.getRequester().getId();
			DaqueryUser requester = DaqueryUserDAO.queryUserByID(userId);
			if(requester == null)
				return(ResponseHelper.getBasicResponse(400, "The requester with user id " + userId + " was not found."));
			
			if(! DaqueryUserDAO.hasRole(userId, "AGGREGATE_QUERYIER"))
				return(ResponseHelper.getBasicResponse(403, "User with id: " + userId + " is not allowed to run aggregate queries against site: " + AppProperties.getDBProperty("site.name")));

			InquiryResponse response = new InquiryResponse();
			//TODO add "SYSTEM" responder as UserInfo object and UUID field??
			Long rVal = null;
			try
			{
				rVal = request.getInquiry().runAggregate();
			}
			catch(DaqueryException e)
			{
				response.setStatusEnum(ResponseStatus.ERROR);
				response.setErrorMessage(e.getMessage());
				response.setReplyTimestamp(new Date());
				ResponseHelper.getJsonResponseGen(500, response);
			}
			
			if(rVal == null)
				return(ResponseHelper.getBasicResponse(500, "No result returned from aggregate query."));
			else
			{
				Map<String, String> aggVal = new HashMap<String, String>();
				aggVal.put("value", rVal.toString());
				return(ResponseHelper.getJsonResponseGen(200, aggVal));
			}
				
		}
		catch(Throwable t)
		{
			String msg = "An unexpected error occured while trying process an InquiryRequest.";
			log.log(Level.SEVERE, msg, t);
			return(ResponseHelper.getBasicResponse(500, msg + "Check the server logs at site: " + AppProperties.getDBProperty("site.name") + " for further information."));
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
