package edu.pitt.dbmi.daquery.central.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.common.util.AuthHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.pitt.daquery.central.util.DBHelper;
import edu.pitt.dbmi.pitt.daquery.central.util.DaqueryCentralException;

@Path("/")
public class CentralService {
	
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
	public Response authenticateSite(@QueryParam("site") String sitename, @QueryParam("key") String key)
	{
		if(StringHelper.isEmpty(sitename) || StringHelper.isEmpty(key))
			return(AuthHelper.getBasicResponse(400, "sitename and key parameters required"));
		
		//TODO: check the sender ip/site name as an extra verification step
		if(! DBHelper.authenticateSite(sitename, key))
			return(AuthHelper.getBasicResponse(401, sitename + " is not authorized to use this server.  Possibly a bad key or site name was provided."));

		Map<String, String> additionalVals = null;
		
		try
		{
			if(DBHelper.isSiteKeyTemp(sitename))
			{
				String newKey = DBHelper.getNewSiteKey(sitename);
				if(newKey == null)
					throw new DaqueryCentralException("An unknown error while trying to generate a new site key. Check the central server log files for more information.");
				additionalVals = new HashMap<String, String>();
				additionalVals.put("new-site-key", newKey);
				additionalVals.put("site-id", DBHelper.getSiteId(sitename));
			}
		}
		catch(DaqueryCentralException dce)
		{			
			return(AuthHelper.getBasicResponse(500, dce.getMessage()));
		}
		
		return(AuthHelper.getTokenResponse(200, null, sitename, uriInfo, additionalVals));
			
	}
}
