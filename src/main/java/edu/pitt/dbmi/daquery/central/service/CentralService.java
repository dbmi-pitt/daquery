package edu.pitt.dbmi.daquery.central.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.pitt.dbmi.daquery.central.util.DBHelper;
import edu.pitt.dbmi.daquery.central.util.DaqueryCentralException;
import edu.pitt.dbmi.daquery.common.domain.NetworkInfo;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

@Path("/")
public class CentralService{
	
	private static Logger log = Logger.getLogger(CentralService.class.getName());
	
    @Context
    private UriInfo uriInfo;
	
    public static void main(String [] args) throws Exception
    {
    	AppProperties.setDevHomeDir("/Users/bill/daquery-data");
    	Gson gson = new GsonBuilder().create();
    	String jsonTxt = "[{\"id\":\"9dc38074-a153-4183-a36f-2b64cf75c13c\",\"name\":\"devCandB\",\"allowedSites\":[{\"id\":\"0f2378ec-d9ce-489a-b338-c8f82e567f40\",\"siteName\":\"chuck-dev\",\"siteURL\":\"http://borromeo-lp.dbmi.pitt.edu:8080/\"},{\"id\":\"20b23b5c-61ad-44eb-8eef-886adcced18e\",\"siteName\":\"bill-dev\",\"siteURL\":\"http://shirey-dt-032.dbmi.pitt.edu:8080/\"}]}, {\"id\":\"afff8323-176c-4cb0-9d2c-cccc03fff101\",\"name\":\"devDandB\",\"allowedSites\":[{\"id\":\"bcfdd450-3dd8-4ced-9599-c65de7c9f115\",\"siteName\":\"desheng-dev\",\"siteURL\":\"http://del20-dt.univ.pitt.edu:8080/\"},{\"id\":\"20b23b5c-61ad-44eb-8eef-886adcced18e\",\"siteName\":\"bill-dev\",\"siteURL\":\"http://shirey-dt-032.dbmi.pitt.edu:8080/\"}]}, {\"id\":\"fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823\",\"name\":\"devALL\",\"allowedSites\":[{\"id\":\"bcfdd450-3dd8-4ced-9599-c65de7c9f115\",\"siteName\":\"desheng-dev\",\"siteURL\":\"http://del20-dt.univ.pitt.edu:8080/\"},{\"id\":\"0f2378ec-d9ce-489a-b338-c8f82e567f40\",\"siteName\":\"chuck-dev\",\"siteURL\":\"http://borromeo-lp.dbmi.pitt.edu:8080/\"},{\"id\":\"20b23b5c-61ad-44eb-8eef-886adcced18e\",\"siteName\":\"bill-dev\",\"siteURL\":\"http://shirey-dt-032.dbmi.pitt.edu:8080/\"}]}]";    			
    	NetworkInfo[] address = gson.fromJson(jsonTxt, NetworkInfo[].class);
    	System.out.println(address);
/*    	System.out.println("1");
    	List<NetworkInfo> networks = DBHelper.getAllowedNetworks("20b23b5c-61ad-44eb-8eef-886adcced18e");
    	System.out.println("2");
   	System.out.println(JSONHelper.toJSON(networks)); */
    }
    
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloWorld()
    {
    	return(ResponseHelper.getBasicResponse(200, "Hello Cruel Central World"));
    }
	/**
	 * Authenticate a site/key pair.  On success a jwt will be sent back.  If the site key
	 * is flagged as temporary a new key is generated and sent back along with the site id
	 * in addition to the site jwt.  The site parameter can be either the site name or the 
	 * site id.
	 * @param site  The name or site id of the site.
	 * @param key The private key used to access information for the site.
	 * @return 200 with info specified above, 401 if authentication fails or 400/500 on error.
	 */
	@GET
	@Path("authenticateSite/")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)	
	public Response authenticateSite(@QueryParam("site") String site, @QueryParam("key") String key)
	{
		if(StringHelper.isEmpty(site) || StringHelper.isEmpty(key))
			return(ResponseHelper.getBasicResponse(400, "sitename and key parameters required"));
		
		//TODO: check the sender ip/site name as an extra verification step
		if(! DBHelper.authenticateSite(site, key))
			return(ResponseHelper.getBasicResponse(401, site + " is not authorized to use this server.  Possibly a bad key or site name was provided."));

		Map<String, Object> additionalVals = null;
		
		try
		{
			if(DBHelper.isSiteKeyTemp(site))
			{
				String newKey = DBHelper.getNewSiteKey(site);
				if(newKey == null)
					throw new DaqueryCentralException("An unknown error while trying to generate a new site key. Check the central server log files for more information.");
				additionalVals = new HashMap<String, Object>();
				additionalVals.put("new-site-key", newKey);
				additionalVals.put("site-id", DBHelper.getSiteId(site));
			}
			return(ResponseHelper.getTokenResponse(200, null, site, uriInfo, additionalVals));	
		}
		catch(Throwable dce)
		{			
			return(ResponseHelper.getBasicResponse(500, dce.getMessage()));
		}
	}
	
	@GET
	@Path("availableNetworks/")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)	
	public Response availableNetworks(@QueryParam("site-id") String siteId)
	{
		try
		{
			List<NetworkInfo> networks = DBHelper.getAllowedNetworks(siteId);
			return ResponseHelper.getJsonResponseGen(200, networks);
		}
		catch(Throwable t)
		{
			String msg = "An error occurred while looking up allowed networks for site with id:" + siteId;
			log.log(Level.SEVERE, msg, t);
			return(ResponseHelper.getBasicResponse(500, msg + " Check the central server logs for more information."));
		}
	}
}
