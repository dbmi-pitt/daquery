package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.ConnectionDirection;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteConnection;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.KeystoreAlias;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;


@Path("/sites")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class SiteEndpoint extends AbstractEndpoint {

	private final static Logger logger = Logger.getLogger(SiteEndpoint.class.getName());

    @Context
    private UriInfo uriInfo;

    /*This take a little explaining.
     * The securityContext is created during the AuthenticationFilter.filter method.
     * This annotations allows the class to extract the username from the securityContext.
     * The username is extracted from the JWT passed to these methods.
     */
    @Context
    SecurityContext securityContext;
	
	
    @GET
    @Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the sites found in the database.
     * example URL: daquery-ws/ws/sites?network_id=1&type=out
     * @param network_id network's primary key
     * @param type 
     * @param status
     * @return a JSON array containing all the sites
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    public Response getAllSites(@QueryParam("network_id") long network_id,
    							@DefaultValue("all") @QueryParam("type") String type,
    							@DefaultValue("") @QueryParam("status") String status) {
    	Response pendResp = null;
    	try {

            logger.info("#### returning all sites for network [" + network_id + "] with type = [" + type + "] and status = " + status + "]");
            
            String[] types = {"outgoing", "incoming", "pending"};
            if(!Arrays.asList(types).contains(type)) {
            	return Response.status(BAD_REQUEST).build();
            }
            
            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            

            Network network = NetworkDAO.queryNetwork(String.valueOf(network_id));
            if(type.equals("outgoing")) {
            	return(ResponseHelper.getJsonResponseGen(200, SiteDAO.queryConnectedOutgoingSitesByNetworkId(network.getId())));
            }
            else if(type.equals("incoming"))
            	return(ResponseHelper.getJsonResponseGen(200, SiteDAO.queryConnectedIncomingSitesByNetworkId(network.getId())));
            else if(type.equals("pending")) {
                Map<String, String> idParam = new HashMap<String, String>();
                idParam.put("network-id", network.getNetworkId());
    			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
    			pendResp = WSConnectionUtil.centralServerGet("pending-sites",  idParam);
    			
    			if(pendResp.getStatus() == 200) {
    				String json = pendResp.readEntity(String.class);
    				return(ResponseHelper.getBasicResponse(200, json));
    			} else {
    				Response rVal = ResponseHelper.wrapServerResponse(pendResp, "Central Server"); 
    				return(rVal);
    			}
            }
            else
            	return ResponseHelper.getErrorResponse(400, "Invalid site type " + type + " received.", "", null);
    	}
    	catch(DaqueryErrorException de)
    	{
    		if(de != null && de.getErrorInfo() != null)
    		{
    			logger.log(Level.SEVERE, de.getErrorInfo().getDisplayMessage(), de);
    			return(ResponseHelper.getErrorResponse(500, de.getErrorInfo().getDisplayMessage(), de.getErrorInfo().getLongMessage(), de.getCause()));
    		}
    		else
    		{
    			logger.log(Level.SEVERE, de.getMessage(), de);
    			return(ResponseHelper.getErrorResponse(500, "An unhandled error occured while retrieving all site information.", null, de));
    		}
    	}
    	catch (HibernateException he) {
    		String msg = "Could not access the database when returning all sites for network [" + network_id + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered returning all sites for network [" + network_id + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    	finally
    	{
    		if(pendResp != null) pendResp.close();
    	}
    }

    /**
     * This method returns all the sites found in the database.
     * example URL: daquery-ws/ws/sites/available?network_id=1
     * @param network_id network's primary key
     * @param type 
     * @return a JSON array containing all the sites
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    //all sites that aren't already connected?
	@GET
    @Path("/available")
    @Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAvailableSites(@QueryParam("network_id") long networkId) {
    	
		Response netResp = null;
    	try {

            logger.info("#### returning available sites for network id: " + networkId);
            
            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Map<String, String> idParam = new HashMap<String, String>();
			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
			netResp = WSConnectionUtil.centralServerGet("availableNetworks",  idParam);
			
			
			if(netResp.getStatus() == 200)
			{
				Network network = NetworkDAO.queryNetwork(String.valueOf(networkId));
				if(network == null)
				{
					return ResponseHelper.getErrorResponse(400, "Network not found.", "Network with id " + networkId + " was not found.", null);
				}

				String json = netResp.readEntity(String.class);
				Network[] networksFromCentral = JSONHelper.gson.fromJson(json, Network[].class);
				Network netFromCent = null;
				for(Network testNet : networksFromCentral) {
					if(testNet.getNetworkId().equals(network.getNetworkId()))
						netFromCent = testNet;
				}

				//remove local site?
				SiteConnection lclSiteConn = netFromCent.findOutgoingSite(AppProperties.getDBProperty("site.id"));
				if(lclSiteConn != null)
					netFromCent.removeOutgoingConnection(lclSiteConn.getSite());
				
				List<Site> rlist = new ArrayList<>();
				for(SiteConnection sConn : netFromCent.getSiteConnections())
				{
					if(SiteConnection.isOutgoing(sConn) && sConn.getSite() != null)
						rlist.add(sConn.getSite());
				}
				
				Map<String, List> rmap = new HashMap<>();
				rmap.put("full", rlist);
				List<Site> outgoings = new ArrayList<>();
				for(SiteConnection sc : network.getSiteConnections())
				{
					if(SiteConnection.isOutgoing(sc) && sc.getSite() != null)
						outgoings.add(sc.getSite());
				}

				rmap.put("outgoing", outgoings);
				return(ResponseHelper.getJsonResponseGen(200, rmap));
			} else {
				Response rVal = ResponseHelper.wrapServerResponse(netResp, "Central Server");
				return(rVal);
			}
			
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when returning all sites for network [" + networkId + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered returning all sites for network [" + networkId + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    	finally
    	{
    		if(netResp != null) netResp.close();
    	}
    }
	
	/**
     * This method returns all the sites found in the database.
     * example URL: daquery-ws/ws/sites/available?network_id=1
     * @param network_id network's primary key
     * @param type 
     * @return a JSON array containing all the sites
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
	@GET
    @Path("/pending")
    @Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPendingSites(@QueryParam("network_id") long networkId) {
    	
    	try {

            logger.info("#### returning pending sites for network id: " + networkId);
            
            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.queryNetwork(String.valueOf(networkId));
            
            Map<String, String> idParam = new HashMap<String, String>();
            idParam.put("network-id", network.getNetworkId());
			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
			Response resp = WSConnectionUtil.centralServerGet("pending-sites",  idParam);
			
			if(resp.getStatus() == 200)
			{
				String json = resp.readEntity(String.class);
				return(ResponseHelper.getJsonResponseGen(200, json));
			} else {
				return(ResponseHelper.wrapServerResponse(resp, "Central Server"));
			}
			
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when returning pending sites for network [" + networkId + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Throwable e) {
    		String msg = "An unexpected error was encountered returning pending sites for a network";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information regarding networkId " + networkId + ".  The problem could have originated at your site server or on the central server.", e));
        }
    }

    //TODO: Do we need a call that retrieves a site by UUID?
    /**
     * Get specific site by Id
     * example url: daquery-ws/ws/site/1
     * @return 200 OK			Site
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveSiteByID(@PathParam("id") String id) {
    	try {

            logger.info("#### returning site by id=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Site site = SiteDAO.getSiteByUUID(id);
            
            if (site == null) {
                return Response.status(NOT_FOUND).build();
            }
            
            String json = site.toJson();

            return Response.ok(200).entity(json).build();
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving site [" + id + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Throwable e) {
    		String msg = "An unexpected error was encountered retrieving site  [" + id + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }

    /**
     * 
     * example url: daquery-ws/ws/sites?type=outgoing
     * @param type- incoming or outgoing sites.
     * @param newSite- A JSON Object representing the site information
     * @return 201 Created			Site
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response requestConnectSite(@QueryParam("type") String type, LinkedHashMap<?, ?> newSite) {

    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
	        if(type.equals("outgoing")) {
	        	// create site entity
	        	// call central server for requesting site connection
	        	// get response from central server
	        	// respond to UI
	        	String networkId = (String) newSite.get("network_id");	
		        Network network = NetworkDAO.queryNetwork(networkId);

		        
		        String siteUUID = (String) newSite.get("site");
		        
		        Site site = SiteDAO.getSiteByUUID(siteUUID);
		        if(site == null)
		        	site = new Site(siteUUID,
	        							 (String)newSite.get("name"),
						 				 (String)newSite.get("url"),
						 				 (String)newSite.get("admin_email"));
	        	
	        	//site.setKeystoreAlias((String)newSite.get("alias"));
	        	String keystorepath = WSConnectionUtil.getKeystorePath();
	        	site.setKeystorePath(keystorepath);
		        
	        	Map<String, String> idParam = new HashMap<String, String>();
                idParam.put("network-id", network.getNetworkId());
                idParam.put("from-site-id", AppProperties.getDBProperty("site.id"));
                idParam.put("to-site-id", site.getSiteId());
 				Response resp = WSConnectionUtil.centralServerGet("request-connection",  idParam);
 				
 				if(resp.getStatus() == 200 || resp.getStatus() == 201) {
 					SiteConnection sConn = network.findOutgoingSite(site.getSiteId());
 					if(sConn == null)
 						sConn = new SiteConnection(site, network, SiteStatus.PENDING, ConnectionDirection.OUTGOING);
 					else
 						sConn.setStatusValue(SiteStatus.PENDING);
 					
		        	
		        	s.getTransaction().begin();
		        	s.saveOrUpdate(sConn);
	 		        //s.saveOrUpdate(network);    
	 		        s.getTransaction().commit();
	 		        
 					return Response.ok(201).build();
 				}
 				else
 					return ResponseHelper.wrapServerResponse(resp, site.getName());
	        } else {	        	
	        	return ResponseHelper.getErrorResponse(BAD_REQUEST.getStatusCode(), "Can only request connections with outgoing sites.", "Invalid type parameter [" + type + "] found in URL" , null);
	        }
        } catch (Throwable e) {
    		String msg = "An unexpected error was encountered while creating a site based on information from the central server.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		
    	}
    }
    
//    /**
//     * 
//     * example url: daquery-ws/ws/sites/receive-connection-request
//     * @param type- incoming or outgoing sites.
//     * @param newSite- A JSON Object representing the site information
//     * @return 201 Created			Site
//     * @throws 400 Bad Request	error message
//     * @throws 401 Unauthorized	
//     */
//    @POST
//    @Path("/receive-connection-request")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response requrestConnectSite(LinkedHashMap<?, ?> newSite) {
//
//    	Session s = null;
//    	try {
//    		s = HibernateConfiguration.openSession();
//        	String networkId = (String) newSite.get("network_id"); 
//        	Network network = NetworkDAO.queryNetwork(networkId);
//        	Site site_in = new Site((String)newSite.get("id"),
//        							(String)newSite.get("name"),
//					 				(String)newSite.get("url"),
//					 				(String)newSite.get("admin_email"));
//        	site_in.setStatus(SiteStatus.PENDING.toString());
//        	Set<Site> ss = new HashSet<Site>();
//        	ss.add(site_in);
//        	network.setIncomingQuerySites(ss);
//        	
//        	s.getTransaction().begin();
//     		
//	        s.save(network);
//	        
//	        s.getTransaction().commit();
//        	
//	       return Response.ok(201).build();
//    	} catch (Exception e) {
//    		logger.info(e.getMessage());
//    		e.printStackTrace();
//    		return Response.status(INTERNAL_SERVER_ERROR).build();	        		
//
//    	} finally {
//    		if (s != null) {
//    			s.close();
//    		}
//    		
//    	}
//    }
    
    /**
     * 
     * example url: daquery-ws/ws/sites/approve-connectrequest
     * @param network-id   network id
     * @param from-site-id site id which 
     * @param newSite- A JSON Object representing the site information
     * @return 200 OK			
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Path("/approve-connectrequest")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response approveConnectRequest(LinkedHashMap<?, ?> object) {
    	Session s = null;
    	String networkId = null;
    	String fromSiteId = null;
    	Response acResp = null;
    	Response sitesResponse = null;
    	try
    	{
	    	if(object == null)
	    		return(ResponseHelper.getErrorResponse(400, "network_id and from_site_id are required parameters.", null, null));
	    	Object netObj = object.get("network_id");
	    	if(netObj == null || StringHelper.isBlank(netObj.toString()))
	    		return(ResponseHelper.getErrorResponse(400, "network_id is a required parameter.", null, null));
	    	Object fromSiteObj = object.get("from_site_id");
	    	if(fromSiteObj == null || StringHelper.isBlank(fromSiteObj.toString()))
	    		return(ResponseHelper.getErrorResponse(400, "from_site_id is a required parameter.", null, null));
	    		
	    	networkId = netObj.toString();
	    	fromSiteId = fromSiteObj.toString();

    		// tell daquery central you approve this site
    		Map<String, String> idParam = new HashMap<String, String>();
            idParam.put("network-id", networkId);
            idParam.put("from-site-id", fromSiteId);
			idParam.put("to-site-id", AppProperties.getDBProperty("site.id"));
			acResp = WSConnectionUtil.centralServerGet("approve-connectrequest",  idParam);
			
			if(acResp.getStatus() == 200) {
				s = HibernateConfiguration.openSession(); 
	        	Network network = NetworkDAO.queryNetwork(networkId);
	        	
	        	idParam = new HashMap<String, String>();
    			idParam.put("site-id", fromSiteId);
    			sitesResponse = WSConnectionUtil.centralServerGet("sites",  idParam);
    			String json = sitesResponse.readEntity(String.class);
    			ObjectMapper mapper = new ObjectMapper();
    			Map<String, Object> map= new LinkedHashMap<>();
    			map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});
    			
    			    			
    			String siteUUID = (String) map.get("siteId");
    			Site site_in = SiteDAO.getSiteByUUID(siteUUID);
    			if(site_in == null)
    			{
    				site_in = new Site(siteUUID,
	        							(String)map.get("name"),
						 				(String)map.get("url"),
						 				(String)map.get("adminEmail"));
    			}
	        	
	        	SiteConnection sConn = network.findIncomingSite(site_in.getSiteId());
	        	if(sConn == null)
	        		sConn = new SiteConnection(site_in, network, SiteStatus.CONNECTED, ConnectionDirection.INCOMING);
	        	else
	        		sConn.setStatusValue(SiteStatus.CONNECTED);
	        	
	        	s.getTransaction().begin();
		        //s.merge(network);
	        	s.saveOrUpdate(sConn);
	        	//s.saveOrUpdate(network);
		        s.getTransaction().commit();
		        return Response.ok(201).build();
			} else {
				Response rVal = ResponseHelper.wrapServerResponse(acResp, "Central Server");
				return(rVal);
			}
        } catch (Throwable e) {
    		String msg = "An unexpected error was encountered attempting to approve a connection request from network [" + networkId + "] and site ["+ fromSiteId + "].";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		if(acResp != null) acResp.close();
    		if(sitesResponse != null) sitesResponse.close();
    		
    	}
    }
    
    /**
     * 
     * example url: daquery-ws/ws/sites/deny-connectrequest
     * @param network-id   network id
     * @param from-site-id site id which 
     * @param newSite- A JSON Object representing the site information
     * @return 200 OK			
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Path("/deny-connectrequest")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response denyConnectRequest(LinkedHashMap<?, ?> object) {
    	String networkId = null;
    	String fromSiteId = null;
	    Session s = null;
	    Response denyResp = null;
	    Response sitesResp = null;
    	try
    	{
	    	if(object == null)
	    		return(ResponseHelper.getErrorResponse(400, "network_id and from_site_id are required parameters.", null, null));
	    	Object netObj = object.get("network_id");
	    	if(netObj == null || StringHelper.isBlank(netObj.toString()))
	    		return(ResponseHelper.getErrorResponse(400, "network_id is a required parameter.", null, null));
	    	Object fromSiteObj = object.get("from_site_id");
	    	if(fromSiteObj == null || StringHelper.isBlank(fromSiteObj.toString()))
	    		return(ResponseHelper.getErrorResponse(400, "from_site_id is a required parameter.", null, null));
	
	    	networkId = object.get("network_id").toString();
	    	fromSiteId = object.get("from_site_id").toString();

    		// tell daquery central you deny this site
    		Map<String, String> idParam = new HashMap<String, String>();
            idParam.put("network-id", networkId);
            idParam.put("from-site-id", fromSiteId);
			idParam.put("to-site-id", AppProperties.getDBProperty("site.id"));
			denyResp = WSConnectionUtil.centralServerGet("deny-connectrequest",  idParam);
			
			if(denyResp.getStatus() == 200) {
				s = HibernateConfiguration.openSession(); 
	        	Network network = NetworkDAO.queryNetwork(networkId);
	        	
	        	idParam = new HashMap<String, String>();
    			idParam.put("site-id", fromSiteId);
    			sitesResp = WSConnectionUtil.centralServerGet("sites",  idParam);
    			String json = sitesResp.readEntity(String.class);
    			ObjectMapper mapper = new ObjectMapper();
    			Map<String, Object> map= new LinkedHashMap<>();
    			map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});
    			
    			String siteUUID = (String) map.get("siteId");	
	        	Site site_in = SiteDAO.getSiteByUUID(siteUUID); 
	        	if(site_in == null)
	        	{
		        	site_in = new Site(siteUUID,
		        							(String)map.get("siteName"),
							 				(String)map.get("siteURL"),
							 				(String)map.get("adminEmail"));
	        	}
	        	
	        	SiteConnection sConn = network.findIncomingSite(siteUUID);
	        	if(sConn == null)
	        		sConn = new SiteConnection(site_in, network, SiteStatus.DENIED, ConnectionDirection.INCOMING);
	        	else
	        		sConn.setStatusValue(SiteStatus.DENIED);
	        	
	        	s.getTransaction().begin();
	        	s.saveOrUpdate(sConn);
		        //s.saveOrUpdate(network);
		        s.getTransaction().commit();
		       return Response.ok(201).build();
			} else {
				Response rVal = ResponseHelper.wrapServerResponse(denyResp, "Central Server");
				return(rVal);
			}
    	} catch (Throwable e) {
    		String msg = "An unexpected error was encountered attempting to deny a connection request from network [" + networkId + "] and site ["+ fromSiteId + "].";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));

    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		if(denyResp != null) denyResp.close();
    		if(sitesResp != null) sitesResp.close();
    	}
    }
    
    /**
     * example url: daquery/ws/sites/setalias/7bc55294-2300-4ca9-8c16-281fc7674be5?alias=130.4.4.4
     * Set the keystore alias for a given site.  The keystore alias is required for secured communications 
     * between sites.  This method also sets the keystore path from the local file system.
     * @param id - The id for the site whose alias should be set.  The site id can be either the site's database
     * primary key (an integer) or the site's UUID.
     * @param alias- The keystore alias for the site.
     * @return 200 OK			
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    //@Secured
    @Path("/setalias/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response setAlias(@PathParam("id") String id, @QueryParam("alias") String alias) {

    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		
	        Site site = SiteDAO.querySiteByID(id);	
	        
	        //step 1: make sure this is a valid site
	        if (site == null)
	            return Response.status(NOT_FOUND).build();
	        
	        //step 2: make sure the alias is set
	        //TODO: should we check if this is a valid URL?
	        if (alias == null || alias.length() == 0) {
	    		return Response.status(BAD_REQUEST).build();	        			        	
	        }
	        
	        //step 3: set the alias
	        site.setKeystoreAlias(alias);
	        
	        //step 4: set the local keystore path
	        String keystorepath = WSConnectionUtil.getKeystorePath();
	        site.setKeystorePath(keystorepath);
	        return updateSite(site);
	        	        
    	} catch (Throwable e) {
    		String msg = "An unexpected error was encountered attempting to update site [" + id + "] using alias ["+ alias + "].";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));

    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		
    	}
    	
    }

    
    @PUT
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateSite(Site updatedSite) {

    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		
	        Site site = SiteDAO.querySiteByID(updatedSite.getSiteId());	
	        
	        //step 1: make sure this is a valid site
	        if (site == null)
	            return Response.status(NOT_FOUND).build();
	        	        	     
	        
	        //persist changes
	
	        s.getTransaction().begin();
	
	        s.merge(updatedSite);
	        
	        s.getTransaction().commit();

	        return Response.ok(201).entity(updatedSite).build();
	        
    	} catch (Throwable e) {
    		String msg = "An unexpected error was encountered attempting to update the site.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));

    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		
    	}
    	
    }

    /**
     * This returns a list of all the aliases stored in the local site's keystore
     * file.  Use this list to determine if a secured connection can be made from
     * the local site to another site.  If the other site's alias is in the list, then
     * a secured connection can be made.  If not, you need to work with the system
     * administrator to add the alias to the keystore first. 
     * @return a JSON array of site aliases from the local site's keystore:
     * {"aliases":[{"aliasName":"127.5.5.5"}, {"aliasName":"127.5.2.2"}, {"aliasName":"127.5.1.1"}]}
     */
    @GET
    @Path("/getKeystoreAliases")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getKeystoreAliasList() {
    	String json = "[]";
    	HashMap<String, List<KeystoreAlias>> retMap = new HashMap<String, List<KeystoreAlias>>();
    	//KeystoreAliasList retList = new KeystoreAliasList();
    	try {
    		List<KeystoreAlias>retList = WSConnectionUtil.getAliasList();
    		retMap.put("aliases", retList);
    		json = JSONHelper.toJSON(retMap);
    	} catch (Throwable e) {
    		String msg = "An unexpected error was encountered attempting to access the keystore aliases.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.  THe admin should ensure the keystore file exists and its path is correclty set in the shrine.conf file.", e));
    	}
        return Response.ok(200).entity(json).build();
    }
}
