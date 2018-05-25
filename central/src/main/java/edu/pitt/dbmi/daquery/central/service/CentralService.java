package edu.pitt.dbmi.daquery.central.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.hibernate.Session;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.pitt.dbmi.daquery.central.ConnectionRequest;
import edu.pitt.dbmi.daquery.central.ConnectionRequestStatus;
import edu.pitt.dbmi.daquery.central.util.DBHelper;
import edu.pitt.dbmi.daquery.central.util.DaqueryCentralException;
import edu.pitt.dbmi.daquery.central.util.EmailHelper;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.EmailContents;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
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
    //	NetworkInfo[] address = gson.fromJson(jsonTxt, NetworkInfo[].class);
    //	System.out.println(address);
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
    
	@GET
	@Path("site-status")
	public Response checkSiteStatus(@QueryParam("from-site-id") String fromSiteId, @QueryParam("to-site-id") String toSiteId, @QueryParam("network-id") String networkId)
	{
		try
		{
			if(StringHelper.isEmpty(fromSiteId) || StringHelper.isEmpty(toSiteId) || StringHelper.isEmpty(networkId))
				return(ResponseHelper.getErrorResponse(400, "Error calling central server, invalid parameter list.", "from-site-id, to-site-id and network-id are required parameters", null));
	
			String status = DBHelper.getOutgoingSiteStatus(fromSiteId, toSiteId, networkId);
			
			if(!StringHelper.isEmpty(status))
				return(ResponseHelper.getBasicResponse(200, status));
			else
				return(ResponseHelper.getErrorResponse(404, "Site not found.", "The site status was not found for networkId: " + networkId +
						                                    " toSiteId:" + toSiteId + " fromSiteId:" + fromSiteId, null));
		}
		catch(Throwable t)
		{
			return(ResponseHelper.getErrorResponse(500, "Unexpected error on the central server.", "An unexpected error occured while checking contacting the central server to find site status for from-site:" + fromSiteId + " to-site:" + toSiteId + " network:" + networkId, t));
		}
	}
	/**
	 * Authenticate a site/key pair.  On success a jwt will be sent back.  If the site key
	 * is flagged as temporary a new key is generated and sent back along with the site id
	 * in addition to the site jwt.  The site parameter can be either the site name or the 
	 * site id.
	 * @param siteNameOrKey  The name or site id of the site.
	 * @param key The private key used to access information for the site.
	 * @return 200 with info specified above, 401 if authentication fails or 400/500 on error.
	 */
	@GET
	@Path("authenticateSite/")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)	
	public Response authenticateSite(@QueryParam("site") String siteNameOrKey, @QueryParam("key") String key)
	{
		try
		{
			if(StringHelper.isEmpty(siteNameOrKey) || StringHelper.isEmpty(key))
				return(ResponseHelper.getErrorResponse(400, "sitename and key parameters required", null, null));
			
			//TODO: check the sender ip/site name as an extra verification step
			if(! DBHelper.authenticateSite(siteNameOrKey, key))
				return(ResponseHelper.getErrorResponse(401, siteNameOrKey + " is not authorized to use this Daquery Central server.  Possibly a bad key or site name was provided.", null, null));
	
			Map<String, Object> additionalVals = null;

			Site site = SiteDAO.getSiteByNameOrIdCaseInsensitive(siteNameOrKey);
			if(site.isTempKey())
			{
				String newKey = DBHelper.getNewSiteKey(siteNameOrKey);

				if (newKey == null)
					throw new DaqueryCentralException(
							"An unknown error while trying to generate a new site key. Check the central server log files for more information.");
							
				additionalVals = new HashMap<String, Object>();
				additionalVals.put("new-site-key", newKey);
				additionalVals.put("site-id", site.getSiteId());
				additionalVals.put("site-url", site.getUrl());
			}
			return(ResponseHelper.getTokenResponse(200, null, siteNameOrKey, site.getSiteId(), null, additionalVals));	
		}
		catch(Throwable dce)
		{
			log.log(Level.SEVERE, "An unexpected error occured while authenticating a user.", dce);
			return(ResponseHelper.getErrorResponse(500, "An unexpected error occured while authenticating a site with the central server.", "Occured while authenticating site:" + siteNameOrKey, dce) );
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
			List<Network> networks = DBHelper.getAllowedNetworks(siteId);
			return ResponseHelper.getJsonResponseGen(200, networks);
		}
		catch(Throwable t)
		{
			String msg = "An error occurred while looking up allowed networks for site with id:" + siteId;
			log.log(Level.SEVERE, msg, t);
			return(ResponseHelper.getErrorResponse(500, "Error while retrieving available networks.",  msg + " Check the central server logs for more information.", t));
		}
	}
	
	/**
	 * Site request to connect to another site
	 * 
	 * @param network-id:
	 *            "fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823"
	 * @param from-site-id:
	 *            "20b23b5c-61ad-44eb-8eef-886adcced18e"
	 * @param to-site-id:
	 *            "0f2378ec-d9ce-489a-b338-c8f82e567f40"
	 * @return 200 with info specified above, 401 if authentication fails or 400/500
	 *         on error.
	 */
	@GET
	@Path("request-connection")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response requestConnection(@QueryParam("network-id") String networkId,
			@QueryParam("from-site-id") String fromSiteId,
			@QueryParam("to-site-id") String toSiteId,
			@QueryParam("requester-email") String requesterEmail) {
		try {
			// create connection request
			ConnectionRequest cr = DBHelper.getConnectionRequest(networkId, fromSiteId, toSiteId);
			if (cr != null)
				return (ResponseHelper.getBasicResponse(500, "This connection request already exists."));

			Site site = DBHelper.getSite(toSiteId);
			Site requestedToSite = DBHelper.getSite(fromSiteId);
			Network net = NetworkDAO.getNetworkById(networkId);
			// send email to toSite admin
			if (DBHelper.createConnectionRequest(networkId, fromSiteId, toSiteId, requesterEmail)) {
				List<String> toAddresses = new ArrayList<String>();
				toAddresses.add(site.getAdminEmail());
				EmailHelper eh = new EmailHelper();
				eh.sendMail("Daquery Connection Request", "Daquery site " + requestedToSite.getName() + 
						  " is requesting to connect to your site, " + site.getName() + 
						  ", to run queries on the network " + net.getName() +
						  ".  Please log into your site, go to Network and choose Edit Sites under the network " +
						  " to approve or deny the request.", toAddresses, null);
				
				// esi.adminEmail);
				// eh.sendMail("Daquery Connection Request", "A site is trying to connect you.", "del20@pitt.edu");
				return ResponseHelper.getJsonResponseGen(200, site);
			} else {
				return ResponseHelper.getErrorResponse(500, "Error while saving a connection request",  "An unexpected error occured while authenticating a site.  Check the central server logs for more information.", null);
			}
		} catch (Throwable t) {
			String msg = "An error occurred while creating a connection request with network_id:" + networkId
					+ " from_site_id:" + fromSiteId + " to_site_id:" + toSiteId;
			log.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, "An error occured while trying to create a connection request.", msg + " Check the central server logs for more information.", t));
		}
	}

	private EmailHelper emailHelper = new EmailHelper();
	
	@POST
	@Path("send-mail")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response sendEmail(EmailContents message)
	{
		
		if(message == null ||
				StringHelper.isEmpty(message.message) ||
				StringHelper.isEmpty(message.subject) ||
				message.toAddresses == null || 
				message.toAddresses.size() == 0)
			return ResponseHelper.getErrorResponse(400, "Invalid email message.", "Email message with a subject and one to address is required to send an email.", null);
			
		try
		{
			emailHelper.sendMail(message.subject, message.message, message.toAddresses, message.ccAddresses);
				
			return ResponseHelper.getBasicResponse(200, "Message sent.");
		}
		catch(Throwable t)
		{
			return ResponseHelper.getErrorResponse(500, "Unable to send email message.", null, t);
		}
	}	
	
	
/*	@GET
	@Path("send-mail")
	//@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
	public Response sendEmail()
	{
		EmailContents message = new EmailContents();
		message.subject = "tester";
		message.message = "hello<br //><br //>&nbsp;&nbsp;&nbsp;&nbsp;<b>hola</b> eh?";
		message.toAddresses.add("shirey@pitt.edu");
*/		
/*		if(message == null ||
				StringHelper.isEmpty(message.message) ||
				StringHelper.isEmpty(message.subject) ||
				message.toAddresses == null || 
				message.toAddresses.size() == 0)
			return ResponseHelper.getErrorResponse(400, "Invalid email message.", "Email message with a subject and one to address is required to send an email.", null);
			*/
/*		try
		{
			emailHelper.sendMail(message.subject, message.message, message.toAddresses.get(0));
			return ResponseHelper.getBasicResponse(200, "Message sent.");
		}
		catch(Throwable t)
		{
			return ResponseHelper.getErrorResponse(500, "Unable to send email message.", null, t);
		}
	} */
	
	/**
	 * Get sites pending for you response
	 * 
	 * @param network-id:
	 *            "fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823"
	 * @param site-id:
	 *            "0f2378ec-d9ce-489a-b338-c8f82e567f40"
	 * @return 200 with info specified above, 401 if authentication fails or 400/500
	 *         on error.
	 */
	@GET
	@Path("pending-sites")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPendingSites(@QueryParam("network-id") String networkId, @QueryParam("site-id") String siteId) {
		try {
			// get pending sites
			List<Site> sites = DBHelper.getPendingSites(networkId, siteId, ConnectionRequestStatus.PENDING);
			return ResponseHelper.getJsonResponseGen(200, sites);
		} catch (Throwable t) {
			String msg = "An error occurred while getting pending site with site_id:" + siteId;
			log.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, "An error occured while attempting to retrieve pending sites.", msg + " Check the central server logs for more information.", t));
		}
	}
	
	/**
	 * Get site
	 * 
	 * @param site-id:
	 *            "0f2378ec-d9ce-489a-b338-c8f82e567f40"
	 * @return 200 with info specified above, 401 if authentication fails or 400/500
	 *         on error.
	 */
	@GET
	@Path("sites")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSite(@QueryParam("site-id") String siteId) {
		try {
			// get pending sites
			Site site = DBHelper.getSite(siteId);
			return ResponseHelper.getJsonResponseGen(200, site);
		} catch (Throwable t) {
			String msg = "An error occurred while getting pending site with site_id:" + siteId;
			log.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, "An error occured while trying to retrieve a site definition.", msg + " Check the central server logs for more information.", t));
		}
	}
	
	/**
	 * Approve connection request
	 * 
	 * @param network-id:
	 *            "fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823"
	 * @param site-id:
	 *            "0f2378ec-d9ce-489a-b338-c8f82e567f40"
	 * @return 200 with info specified above, 401 if authentication fails or 400/500
	 *         on error.
	 */
	@GET
	@Path("approve-connectrequest")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response approveConnectRequest(@QueryParam("network-id") String networkId, @QueryParam("from-site-id") String fromSiteId, @QueryParam("to-site-id") String toSiteId) {
		try {
			// get pending sites
			if(DBHelper.updateConnectionRequest(networkId, fromSiteId, toSiteId, "APPROVED"))
				return ResponseHelper.getBasicResponse(200, "");
			else
				return ResponseHelper.getErrorResponse(500, "An error occured while registering a site connection request approval.", 
						"An unexpected error occured while approving connect request.  Check the central server logs for more information.", null);
		} catch (Throwable t) {
			String msg = "An error occurred while approving connect request network_id:" + networkId + " from_site_id:" + fromSiteId + " to_site_id:" + toSiteId;
			log.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, "An error occured while registering a site connection request approval.",  msg + " Check the central server logs for more information.", t));
		}
	}
	
	/**
	 * Deny connection request
	 * 
	 * @param network-id:
	 *            "fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823"
	 * @param site-id:
	 *            "0f2378ec-d9ce-489a-b338-c8f82e567f40"
	 * @return 200 with info specified above, 401 if authentication fails or 400/500
	 *         on error.
	 */
	@GET
	@Path("deny-connectrequest")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response denyConnectRequest(@QueryParam("network-id") String networkId, @QueryParam("from-site-id") String fromSiteId, @QueryParam("to-site-id") String toSiteId) {
		try {
			// get pending sites
			if(DBHelper.updateConnectionRequest(networkId, fromSiteId, toSiteId, "DENIED"))
				return ResponseHelper.getBasicResponse(200, "");
			else
				return ResponseHelper.getErrorResponse(500, "An error occured while registering a site connection request denial",
						"An unexpected error occured while marking a connection request as denied. Check the central server logs for more information.", null);
		} catch (Throwable t) {
			String msg = "An error occurred while approving connect request network_id:" + networkId + " from_site_id:" + fromSiteId + " to_site_id:" + toSiteId;
			log.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, "An error occured while registering a site request denial.", msg + " Check the central server logs for more information.", t));
		}
	}
	
	/**
	 * Get a DataModel attached to a network with a specified id.
	 * 
	 * @param netId The network UUID.
	 * @return 200 with a data model, 404 if the network or model is not found.
	 */
	@GET
	@Path("data-model")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkSiteStatus(@DefaultValue("") @QueryParam("network-id") String netId)
	{
		Session sess = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			
			if(StringHelper.isEmpty(netId))
				return(ResponseHelper.getErrorResponse(400, "Network id is a required parameter", null, null));
			
			Network net = NetworkDAO.getNetworkById(netId);
			if(net == null)
				return(ResponseHelper.getErrorResponse(404, "Network not found.", "Network with id " + netId + " was not found.", null));
			
			if(net.getDataModel() == null)
				return(ResponseHelper.getErrorResponse(404, "Data model not found.", "The network with id " + netId + " does not have a data model associated with it.", null));
			
			//we need to remove the DataAttribute Set from the DataModel before we 
			//return it as JSON.  We also need to remove the DataSource info
			DataModel dmTemp = net.getDataModel();
			dmTemp.setAttributes(new HashSet<DataAttribute>());
			dmTemp.setDataSources(new HashSet<DataSource>());
			return(ResponseHelper.getJsonResponseGen(200, dmTemp));			
		}
		catch(Throwable t)
		{
			return(ResponseHelper.getErrorResponse(500, "An unexpected error occured while on the central server while retrieving a data model", "Error while retrieving data model from network with id " + netId, t));
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
}
