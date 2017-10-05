package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.domain.Network;


@Path("/networks")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class NetworkEndpoint extends AbstractEndpoint {

    @Context
    private UriInfo uriInfo;
    
    /*This take a little explaining.
     * The securityContext is created during the AuthenticationFilter.filter method.
     * This annotations allows the class to extract the username from the securityContext.
     * The username is extracted from the JWT passed to these methods.
     */
    @Context
    SecurityContext securityContext;

	
	private final static Logger logger = Logger.getLogger(NetworkEndpoint.class.getName());
	
	/**
     * Get all joined networks
     * example url: daquery-ws/ws/networks
     * @return 200 OK			List of networks
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNetworks() {
    	
    	try {

            logger.info("#### returning all networks");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
                        
            List<Network> networks = queryAllNetworks();
            
            if (networks == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(networks);
            return Response.ok(200).entity(jsonString).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
    
    /**
     * Get specific network by UUID
     * example url: daquery-ws/ws/networks/a3477419-657d-4ddd-8750-c014e2033937
     * @return 200 OK			Network information for one network
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Path("/{uuid}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNetworkByID(@PathParam("uuid") String uuid) {
    	try {

            logger.info("#### returning network by uuid=" + uuid);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = queryNetwork(uuid);
            
            if (network == null) {
                return Response.status(NOT_FOUND).build();
            }
            
            String json = network.toJson();

            return Response.ok(200).entity(json).build();
    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * Create a new network
     * @param newNetwork- a JSON object representing a new network that does not exist in the database
     * example url: daquery-ws/ws/networks/
     * @return 201 Created
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createNetwork(Network newNetwork) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

    	try {
    		
	        Network network = new Network(newNetwork.getName());
	        //create a new UUID if necessary
	        if (newNetwork.getNetwork_Id() == null) {
	        	network.setNetwork_Id(UUID.randomUUID().toString());
	        } else {
	        	network.setNetwork_Id(newNetwork.getNetwork_Id());
	        }
	        
	        //persist changes
	        emf = Persistence.createEntityManagerFactory("derby");
	        em = emf.createEntityManager();
	
	        em.getTransaction().begin();
	
	        em.persist(network);
	        
	        em.getTransaction().commit();

	        return Response.ok(201).entity(network).build();
	        
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
    
    // ======================================
    // =          PRIVATE METHODS           =
    // ======================================
    
    
    private Network queryNetwork(String uuid) throws Exception {
    	logger.info("searching for #### single Network uuid= " +uuid);
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piId = new ParameterItem("uuid", uuid);
    		pList.add(piId);
    		Network network = executeQueryReturnSingle(Network.FIND_BY_UUID, pList, logger);
	        return network;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    private List<Network> queryAllNetworks() throws Exception {
    	try { 		
    	    List<Network> networks = executeQueryReturnList(Network.FIND_ALL, null, logger);
	        return networks;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }


}
