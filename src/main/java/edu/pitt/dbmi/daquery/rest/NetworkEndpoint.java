package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.logging.Logger;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/networks")
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
    	
    	return Response.ok().build();
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
    	return null;
    }
}
