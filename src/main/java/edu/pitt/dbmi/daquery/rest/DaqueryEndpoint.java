package edu.pitt.dbmi.daquery.rest;

import java.util.HashMap;
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
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.util.UserRoles;

@Path("/")
public class DaqueryEndpoint
{
	private final static Logger log = Logger.getLogger(DaqueryEndpoint.class.getName());

	public static void main (String [] args) throws Exception
	{
		AppProperties.setDevHomeDir("/usr/local/apache-tomcat-6.0.53");
		Map<String, String> idParam = new HashMap<String, String>();
		idParam.put("site-id", AppProperties.getDBProperty("site.id"));
		Response resp = callCentralServer("availableNetworks",  idParam);
		String json = resp.readEntity(String.class);
		Map<String, String> vals = JSONHelper.toMap(json);
		System.out.println(vals);
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
		else if(dbStatus == AppSetup.DBSTATUS_EMPTY)
			return(ResponseHelper.getBasicResponse(200, "N"));
		else
			return(ResponseHelper.getBasicResponse(500, "The application database is in an indeterminate state.  Check the application error logs for more information."));
	}
	
	
	/** Get a list of networks with associated sites that can be set
	 *  have not yet been set up for this site.
	 * @param id
	 * @return
	 */
	@Secured(UserRoles.ADMIN)
    @GET
    @Path("/available-networks/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response availableNetworks() {
    	
    	return(null);
    	
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
			if(dbStatus == AppSetup.DBSTATUS_EMPTY)
			{
				Response resp = callCentralServerAuth(siteName, siteKey);
		    	if(resp.getStatus() != 200)
		    		return(ResponseHelper.getBasicResponse(401, "Authentication Failed"));
		    	
				String jsonval = resp.readEntity(String.class);
				Map<String, String> jmap = JSONHelper.toMap(jsonval);
				String key = jmap.get("new-site-key");
				String siteId = jmap.get("site-id");		    	
		    	AppProperties.setDBProperty("central.site.key", key);
		    	AppProperties.setDBProperty("site.id", siteId);
		    	AppProperties.setDBProperty("site.name", siteName);
				if(AppSetup.initialize())
				{
					
					String adminPwd = AppSetup.getFirstUserPwd();
					HashMap<String, String> adminDetails = new HashMap<String, String>();
					adminDetails.put("username", "admin");
					adminDetails.put("password", adminPwd);
					return(ResponseHelper.getJsonResponseGen(200, adminDetails ));
				}
				else
					return(ResponseHelper.getBasicResponse(500, "An error occured while setting up the site. Check the application logs for more information."));
			}
			else
			{
				return(ResponseHelper.getBasicResponse(500, "This site has already been set up.  Check the application error logs for more information."));
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
		String siteKey = AppProperties.getDBProperty("central.site.id");
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
