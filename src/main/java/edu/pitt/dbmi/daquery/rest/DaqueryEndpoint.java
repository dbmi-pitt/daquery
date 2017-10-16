package edu.pitt.dbmi.daquery.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Context;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.domain.NetworkInfo;
import edu.pitt.dbmi.daquery.common.domain.SiteInfo;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Site;

@Path("/")
public class DaqueryEndpoint extends AbstractEndpoint
{
	private final static Logger log = Logger.getLogger(DaqueryEndpoint.class.getName());

	public static void main (String [] args) throws Exception
	{
		
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
/*		DaqueryEndpoint de = new DaqueryEndpoint();
		System.out.println(de.isSiteSetup());
		de.setupSite("bill-dev", "abc123"); */ 
		
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
					if(containsSite(nets, si.id))
						sitesToRemove.add(si);
				}
				for(SiteInfo sr : sitesToRemove)
				{
					nin.allowedSites.remove(sr);
				}
				sitesToRemove.clear();
			}
			
			
			System.out.println(ninfo);
		}
		else
			System.out.println("FAILIED");
	}
	
	private static boolean containsSite(List<Network> networks, String siteId)
	{
		for(Network net : networks)
		{
			for(Site site : net.getSites())
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
		return(ResponseHelper.getBasicResponse(200, "Hello Cruel World"));
	}
    
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
	
	
	/** Get a list of networks with associated sites from the central serverthat 
	 *  have not yet been set up for this site.
	 *  
	 * @return A list of NetworkInfo objects encoded as json
	 */
	@Secured("ADMIN")
    @GET
    @Path("/available-networks/")
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
						if(containsSite(nets, si.id))
							sitesToRemove.add(si);
					}
					for(SiteInfo sr : sitesToRemove)
					{
						nin.allowedSites.remove(sr);
					}
					sitesToRemove.clear();
				}
				return(ResponseHelper.getJsonResponseGen(200, ninfo));
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
	 * 
	 * @return On success a 200 http response with the site-id encoded in json.  On failure a 500 http response.
	 */
	@GET
	@Path("setupSite")
	public Response setupSite(@DefaultValue("") @QueryParam("site-name") String siteName, @DefaultValue("") @QueryParam("site-key") String siteKey)
	{
		try
		{
	    	if (! AppProperties.isDebugMode() && uriInfo.getRequestUri().getScheme() != "https") {
	            return(ResponseHelper.getBasicResponse(500, "This service must be accessed via https only"));    		
	    	}
	    	

	    	
			int dbStatus = AppSetup.getDBStatus();
			if(dbStatus == AppSetup.DBSTATUS_NONEXISTENT)
			{
				Response centralAuthResponse = callCentralServerAuth(siteName, siteKey);
		    	if(centralAuthResponse.getStatus() != 200)
		    		return(centralAuthResponse);
		    	
				if(AppSetup.initialize())
				{
					
					String adminPwd = AppSetup.getFirstUserPwd();
					HashMap<String, String> adminDetails = new HashMap<String, String>();
					adminDetails.put("username", "admin");
					adminDetails.put("password", adminPwd);
					
					//add the initial values from the central server
					String jsonval = centralAuthResponse.readEntity(String.class);
					Map<String, String> jmap = JSONHelper.toMap(jsonval);
					String key = jmap.get("new-site-key");
					String siteId = jmap.get("site-id");		    	
			    	AppProperties.setDBProperty("central.site.key", key);
			    	AppProperties.setDBProperty("site.id", siteId);
			    	AppProperties.setDBProperty("site.name", siteName);

					return(ResponseHelper.getJsonResponseGen(200, adminDetails ));
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
	
	private static Response callCentralServer(String serviceName, Map<String, String> additionalParameters) throws DaqueryException
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
