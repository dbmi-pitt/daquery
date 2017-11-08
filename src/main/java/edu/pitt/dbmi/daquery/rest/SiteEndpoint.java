package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

import edu.pitt.dbmi.daquery.common.domain.NetworkInfo;
import edu.pitt.dbmi.daquery.common.domain.SiteInfo;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.dao.SiteDAO;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Site;


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
     * @return a JSON array containing all the sites
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    public Response getAllSites(@QueryParam("network_id") long network_id,
    							@DefaultValue("all") @QueryParam("type") String type) {
    	
    	try {

            logger.info("#### returning all sites");
            
            String[] types = {"outgoing", "incoming", "pending"};
            if(!Arrays.asList(types).contains(type)) {
            	return Response.status(BAD_REQUEST).build();
            }
            
            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            

            Network network = NetworkDAO.queryNetwork(String.valueOf(network_id));
            if(type.equals("outgoing"))
            	return(ResponseHelper.getJsonResponseGen(200, network.getOutgoingQuerySites()));
            else if(type.equals("incoming"))
            	return(ResponseHelper.getJsonResponseGen(200, network.getIncomingQuerySites()));
            else if(type.equals("pending")) {
                Map<String, String> idParam = new HashMap<String, String>();
                idParam.put("network-id", network.getNetworkId());
    			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
    			Response resp = DaqueryEndpoint.callCentralServer("pending-sites",  idParam);
    			
    			if(resp.getStatus() == 200) {
    				String json = resp.readEntity(String.class);
    				return(ResponseHelper.getBasicResponse(200, json));
    			} else {
    				return(resp);
    			}
            }
            else
            	return Response.status(BAD_REQUEST).build();
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
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
    @Path("/available")
    @Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAvailableSites(@QueryParam("network_id") long networkId) {
    	
    	try {

            logger.info("#### returning available sites for network id: " + networkId);
            
            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Map<String, String> idParam = new HashMap<String, String>();
			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
			Response resp = DaqueryEndpoint.callCentralServer("availableNetworks",  idParam);
			Network network = NetworkDAO.queryNetwork(String.valueOf(networkId));
			
			if(resp.getStatus() == 200)
			{
				String json = resp.readEntity(String.class);
				NetworkInfo[] ninfo = JSONHelper.gson.fromJson(json, NetworkInfo[].class);
				NetworkInfo network_info = null;
				for(NetworkInfo nin : ninfo) {
					if(nin.id.equals(network.getNetworkId()))
						network_info = nin;
				}
				
				SiteInfo si = null;
				for(SiteInfo sin : network_info.allowedSites) {
					if(sin.id.equals(AppProperties.getDBProperty("site.id")))
						si = sin;
				}
				
				network_info.allowedSites.remove(si);
				
				List<SiteInfo> rlist = new ArrayList<>();
				for(SiteInfo s : network_info.allowedSites)
					rlist.add(s);
				Map<String, List> rmap = new HashMap<>();
				rmap.put("full", rlist);
				List<SiteInfo> outgoings = new ArrayList<>();
				for(Site s : network.getOutgoingQuerySites()) {
					outgoings.add(new SiteInfo(s.getSiteId(), s.getName(), s.getUrl(), s.getAdmin_email()));
				}
				rmap.put("outgoing", outgoings);
				return(ResponseHelper.getJsonResponseGen(200, rmap));
			} else {
				return(resp);
			}
			
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
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
			Response resp = DaqueryEndpoint.callCentralServer("pending-sites",  idParam);
			
			if(resp.getStatus() == 200)
			{
				String json = resp.readEntity(String.class);
				return(ResponseHelper.getJsonResponseGen(200, json));
			} else {
				return(resp);
			}
			
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
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
    public Response retrieveNetworkByID(@PathParam("id") String id) {
    	try {

            logger.info("#### returning site by id=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Site site = SiteDAO.querySiteByID(id);
            
            if (site == null) {
                return Response.status(NOT_FOUND).build();
            }
            
            String json = site.toJson();

            return Response.ok(200).entity(json).build();
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
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
    public Response requrestConnectSite(@QueryParam("type") String type, LinkedHashMap<?, ?> newSite) {

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
	        	Site site_out = new Site((String)newSite.get("site"),
	        							 (String)newSite.get("name"),
						 				 (String)newSite.get("url"),
						 				 (String)newSite.get("admin_email"));
	        	site_out.setStatus(SiteStatus.PENDING.toString());
	        	
	        	Map<String, String> idParam = new HashMap<String, String>();
                idParam.put("network-id", network.getNetworkId());
                idParam.put("from-site-id", AppProperties.getDBProperty("site.id"));
                idParam.put("to-site-id", site_out.getSiteId());
 				Response resp = DaqueryEndpoint.callCentralServer("request-connection",  idParam);
 				
 				if(resp.getStatus() == 200) {
		        	network.getOutgoingQuerySites().add(site_out);
		        	
		        	s.getTransaction().begin();
	 		        s.update(network);       
	 		        s.getTransaction().commit();
	 		        
 					return Response.ok(201).build();
 				}
 				else
 					return Response.status(INTERNAL_SERVER_ERROR).entity("Dauqery Center Server return error").build();
	        } else {
	        	return Response.status(BAD_REQUEST).build();
	        }
    	} catch (Exception e) {
    		logger.info(e.getMessage());
    		e.printStackTrace();
    		return Response.status(INTERNAL_SERVER_ERROR).build();	        		

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
    	String networkId = object.get("network_id").toString();
    	String fromSiteId = object.get("from_site_id").toString();
    	Session s = null;
    	try {
    		// tell daquery central you approve this site
    		Map<String, String> idParam = new HashMap<String, String>();
            idParam.put("network-id", networkId);
            idParam.put("from-site-id", fromSiteId);
			idParam.put("to-site-id", AppProperties.getDBProperty("site.id"));
			Response resp = DaqueryEndpoint.callCentralServer("approve-connectrequest",  idParam);
			
			if(resp.getStatus() == 200) {
				s = HibernateConfiguration.openSession(); 
	        	Network network = NetworkDAO.queryNetwork(networkId);
	        	
	        	idParam = new HashMap<String, String>();
    			idParam.put("site-id", fromSiteId);
    			resp = DaqueryEndpoint.callCentralServer("sites",  idParam);
    			String json = resp.readEntity(String.class);
    			ObjectMapper mapper = new ObjectMapper();
    			Map<String, Object> map= new LinkedHashMap<>();
    			map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});
    			
    			    			
	        	Site site_in = new Site((String)map.get("id"),
	        							(String)map.get("siteName"),
						 				(String)map.get("siteURL"),
						 				(String)map.get("adminEmail"));
	        	site_in.setStatus(SiteStatus.CONNECTED.toString());
	        	Set<Site> ss = new HashSet<Site>();
	        	ss.add(site_in);
	        	network.setIncomingQuerySites(ss);
	        	s.getTransaction().begin();
		        s.update(network);
		        s.getTransaction().commit();
	        	
		       return Response.ok(201).build();
			} else {
				return(resp);
			}
    	} catch (Exception e) {
    		logger.info(e.getMessage());
    		e.printStackTrace();
    		return Response.status(INTERNAL_SERVER_ERROR).build();	        		

    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		
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
    	String networkId = object.get("network_id").toString();
    	String fromSiteId = object.get("from_site_id").toString();
    	Session s = null;
    	try {
    		// tell daquery central you deny this site
    		Map<String, String> idParam = new HashMap<String, String>();
            idParam.put("network-id", networkId);
            idParam.put("from-site-id", fromSiteId);
			idParam.put("to-site-id", AppProperties.getDBProperty("site.id"));
			Response resp = DaqueryEndpoint.callCentralServer("deny-connectrequest",  idParam);
			
			if(resp.getStatus() == 200) {
				s = HibernateConfiguration.openSession(); 
	        	Network network = NetworkDAO.queryNetwork(networkId);
	        	
	        	idParam = new HashMap<String, String>();
    			idParam.put("site-id", fromSiteId);
    			resp = DaqueryEndpoint.callCentralServer("sites",  idParam);
    			String json = resp.readEntity(String.class);
    			ObjectMapper mapper = new ObjectMapper();
    			Map<String, Object> map= new LinkedHashMap<>();
    			map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});
    			
    			    			
	        	Site site_in = new Site((String)map.get("id"),
	        							(String)map.get("siteName"),
						 				(String)map.get("siteURL"),
						 				(String)map.get("adminEmail"));
	        	site_in.setStatus(SiteStatus.DENIED.toString());
	        	Set<Site> ss = new HashSet<Site>();
	        	ss.add(site_in);
	        	network.setIncomingQuerySites(ss);
	        	s.getTransaction().begin();
		        s.update(network);
		        s.getTransaction().commit();
	        	
		       return Response.ok(201).build();
			} else {
				return(resp);
			}
    	} catch (Exception e) {
    		logger.info(e.getMessage());
    		e.printStackTrace();
    		return Response.status(INTERNAL_SERVER_ERROR).build();	        		

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
	        
    	} catch (Exception e) {
    		logger.info(e.getMessage());
    		e.printStackTrace();
    		return Response.status(INTERNAL_SERVER_ERROR).build();	        		

    	} finally {
    		if (s != null) {
    			s.close();
    		}
    		
    	}
    	
    }
}
