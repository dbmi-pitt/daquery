package edu.pitt.dbmi.daquery.rest;

import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.dao.SiteDAO;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Site;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

import java.security.Principal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
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
     * example URL: daquery-ws/ws/sites?network_id=1
     * @return a JSON array containing all the sites
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    public Response getAllSites(@QueryParam("network_id") long network_id) {
    	
    	try {

            logger.info("#### returning all sites");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
                        
            List<Site> site_list = SiteDAO.querySiteByNetworkId(network_id);
            
            if (site_list == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(site_list);
            return Response.ok(200).entity(jsonString).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }

	
	/**
     * Get all sites by type
     * example url: daquery-ws/ws/sites/type/inbound
     * @param  type inbound, outbound or pending 
     * @return 200 OK			List of sites
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Path("/type/{type}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveSites(@QueryParam("type") String type) {
		try {
            List<Site> site_list = SiteDAO.querySitesByType(type);
            
            if (site_list == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(site_list);
            return Response.ok(200).entity(jsonString).build();
		} catch (Exception e) {
		    return Response.serverError().build();
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
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby");
		    EntityManager em = emf.createEntityManager();
		    
		    Site site = em.find(Site.class, Integer.parseInt(id));
		
		    em.close();
		   
		    logger.info("Done trying to get site: " + site.toString());
		    
		    
		    return Response.ok().entity(site).build();
		} catch (Exception e) {
		    return Response.serverError().build();
		}
    }

    /**
     * 
     * example url: daquery-ws/ws/sites?networkid=a3477419-657d-4ddd-8750-c014e2033937
     * @param networkid- The UUID for a network
     * @param newSite- A JSON Object representing the site information
     * @return 201 Created			Site
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Secured
    //@Consumes(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Response createSite(LinkedHashMap<?, ?> newSite) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

    	try {
    		String network_id = (String) newSite.get("network_id"); 		
	        Network currentNetwork = NetworkDAO.queryNetwork(network_id);
	        Site site = new Site((String)newSite.get("name"),
	        					 (String)newSite.get("url"),
	        					 (String)newSite.get("admin_email"),
	        					 (String)newSite.get("type"));
	        
            if (currentNetwork == null) {
                return Response.status(NOT_FOUND).build();
            }	        
	        site.setNetwork(currentNetwork);
	        //persist changes
	        emf = Persistence.createEntityManagerFactory("derby");
	        em = emf.createEntityManager();
	
	        em.getTransaction().begin();
	
	        em.persist(site);
	        
	        em.getTransaction().commit();

	        return Response.ok(201).entity(site).build();
	        
    	} catch (Exception e) {
    		logger.info(e.getMessage());
    		e.printStackTrace();
    		return Response.status(UNAUTHORIZED).build();	        		

    	} finally {
    		if (em != null) {
    			em.close();
    		}
    		
    	}
    	
    }
    
    
    @PUT
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateSite(Site updatedSite) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

    	try {
    		
	        Site site = SiteDAO.querySiteByID(updatedSite.getId());	
	        
	        //step 1: make sure this is a valid site
	        if (site == null)
	            return Response.status(NOT_FOUND).build();
	        	        	     
	        
	        //persist changes
	        emf = Persistence.createEntityManagerFactory("derby");
	        em = emf.createEntityManager();
	
	        em.getTransaction().begin();
	
	        em.merge(updatedSite);
	        
	        em.getTransaction().commit();

	        return Response.ok(201).entity(updatedSite).build();
	        
    	} catch (Exception e) {
    		logger.info(e.getMessage());
    		e.printStackTrace();
    		return Response.status(UNAUTHORIZED).build();	        		

    	} finally {
    		if (em != null) {
    			em.close();
    		}
    		
    	}
    	
    }

    
    
    

}
