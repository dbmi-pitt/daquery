package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.rest.AbstractEndpoint.ParameterItem;


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
    @Consumes(MediaType.TEXT_PLAIN)
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
     * Get specific network by Id
     * example url: daquery-ws/ws/network/1
     * @return 200 OK			List of networks
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNetworkByID(@PathParam("id") String id) {
    	try {

            logger.info("#### returning network by id=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = queryNetwork(id);
            
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

    // ======================================
    // =          PRIVATE METHODS           =
    // ======================================
    
    
    private Network queryNetwork(String id) throws Exception {
    	logger.info("searching for #### single Inbound_Query id= " +id);
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piId = new ParameterItem("id", id);
    		pList.add(piId);
    		Network network = executeQueryReturnSingle(Network.FIND_BY_ID, pList, logger);
	        return network;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
}
