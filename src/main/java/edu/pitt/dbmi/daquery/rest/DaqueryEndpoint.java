package edu.pitt.dbmi.daquery.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.PropertiesHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.util.UserRoles;

@Path("/")
public class DaqueryEndpoint
{
	private final static Logger log = Logger.getLogger(DaqueryEndpoint.class.getName());
	
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
    @Path("/available-networks/{siteid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response availableNetworks(@PathParam("siteid") String id) {
    	
    	return(null);
    	
    }
	
	@GET
	@Path("setupSite")
	public Response setupSite(@DefaultValue("") @QueryParam("site-name") String siteName, @DefaultValue("") @QueryParam("site-key") String siteKey)
	{
		try
		{
	    	if (! PropertiesHelper.isDebugMode() && uriInfo.getRequestUri().getScheme() != "https") {
	            return(ResponseHelper.getBasicResponse(500, "This service must be accessed via https only"));    		
	    	}
	    	
	    	callCentralServer("authenticateSite", siteName, siteKey, null);
	    	
			int dbStatus = AppSetup.getDBStatus();
			if(dbStatus == AppSetup.DBSTATUS_EMPTY)
			{
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
	
	private Response callCentralServer(String serviceName, String siteName, String siteKey, Map<String, String> additionalParameters)
	{
		String url = PropertiesHelper.getCentralServerURL() + "/daquery-central/serviceName?site=" +siteName + "&key=" + siteKey;
		if(additionalParameters != null)
		{
			for(String key :additionalParameters.keySet())
			{
				url = url + "&" + key + "=" + additionalParameters.get(key);
			}
		}
		
		Client client = ClientBuilder.newClient();
		
		Response rVal = client.target(url).request(MediaType.APPLICATION_JSON).get();
		return(rVal);
	}
}
