package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.domain.Network;


@Path("/")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class NetworkEndpoint extends AbstractEndpoint {

	private final static Logger logger = Logger.getLogger(NetworkEndpoint.class.getName());
	
	/**
     * Get all joined networks
     * example url: daquery/ws/networks
     * @return 200 OK			List of networks
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/networks")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNetworks() {
		try {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby");
		    EntityManager em = emf.createEntityManager();
				
			@SuppressWarnings("rawtypes")
			List networks = em.createNamedQuery("Network.findAll").getResultList();
		
		    em.close();
		   
		    logger.info("Done trying to get all networks");
		    
		    //TODO: build some JSON into the response.  Return the new UUID
		    
		    return Response.ok().entity(networks).build();
		} catch (Exception e) {
		    return Response.serverError().build();
		}
    }
    
    /**
     * Get specific network by Id
     * example url: daquery/ws/network/1
     * @return 200 OK			List of networks
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/networks/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNetworkByID(@PathParam("id") String id) {
    	try {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby");
		    EntityManager em = emf.createEntityManager();
		    
		    Network network = em.find(Network.class, Integer.parseInt(id));
		
		    em.close();
		   
		    logger.info("Done trying to get network: " + network.toString());
		    
		    //TODO: build some JSON into the response.  Return the new UUID
		    
		    return Response.ok().entity(network).build();
		} catch (Exception e) {
		    return Response.serverError().build();
		}
    }
}
