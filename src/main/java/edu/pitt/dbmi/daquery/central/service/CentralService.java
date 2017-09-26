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

import edu.pitt.dbmi.daquery.common.domain.NetworkInfo;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.pitt.daquery.central.util.DBHelper;
import edu.pitt.dbmi.pitt.daquery.central.util.DaqueryCentralException;

@Path("/")
public class CentralService {
	
	private static Logger log = Logger.getLogger(CentralService.class.getName());
	
    @Context
    private UriInfo uriInfo;
	
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
	@Path("authenticatSite/")
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
		}
		catch(DaqueryCentralException dce)
		{			
			return(ResponseHelper.getBasicResponse(500, dce.getMessage()));
		}
		
		return(ResponseHelper.getTokenResponse(200, null, site, uriInfo, additionalVals));	
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
			return ResponseHelper.getJsonResponse(200, null, networks);
		}
		catch(Throwable t)
		{
			String msg = "An error occurred while looking up allowed networks for site with id:" + siteId;
			log.log(Level.SEVERE, msg, t);
			ResponseHelper.getBasicResponse(500, msg + " Check the central server logs for more information.");
		}
	}
}
