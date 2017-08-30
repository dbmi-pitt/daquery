package edu.pitt.dbmi.daquery.rest;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import java.util.logging.Logger;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class Endpoints extends AbstractEndpoint {

    // ======================================
    // =          Injection Points          =
    // ======================================

    @Context
    private UriInfo uriInfo;

    private final static Logger logger = Logger.getLogger(UserEndpoint.class.getName());
        
    // ======================================
    // =          Business methods          =
    // ======================================


    /**
     * Check if the application has been setup
     * example url: daquery/ws/setup
     * @return 200 OK 			true if application has been setup, otherwise false.
     * @throws 400 Bad Request	error message
     */
    @GET
    @Path("/setup")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response setup() {
		return null;

    }
    
    /**
     *  Check if key store exist in tomcat
     *  example url: daquery/ws/keystore
     * @return 200 OK 			true if key store exist, otherwise false
     * @throws 400 Bad Request	error message 
     */
    @GET
    @Path("/keystore")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response keystore() {
    	return null;
    }
    
    /**
     * Set key type. Use existing key store or use new generated Private/Public key pair.
     * example url: daquery/ws/keytype
     * @param keytype either "1" which for existing key store or "2" new generated Private/Public key pair
     * @return 201 Created
     * @throws 400 Bad Request	error message
     */
    @POST
    @Path("/keytype")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response keytype() {
    	return null;
    }
    
    
    /**
     * Get all outbound queries
     * example url: daquery/ws/outbound-queries?offset=40&limit=20
     * @param offset skip offset number, default 0 
     * @param limit  page size, default 20
     * @return 200 OK			List of outbound queries
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/outbound-queries")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveOutboundQueries(@DefaultValue("0") @QueryParam("offset") String offset,
    		 							   @DefaultValue("100") @QueryParam("limit") String limit) {
    	return null;
    }
    
    /**
     * Get specific outbound query by Id
     * example url: daquery/ws/outbound-queries/122
     * @param offset skip offset number, default 0 
     * @param limit  page size, default 20
     * @return 200 OK			List of outbound queries
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/outbound-queries/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retriveOutboundQueryByID(@PathParam("id") String id) {
    	return null;
    }
    
    /**
     * Create a new out bound query
     * example url: daquery/ws/outbound-queries
     * @return 200 OK			the new outbound query object
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Path("/outbound-queries")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createOutboundQuery() {
    	return null;
    }
    
    /**
     * Get all inbound queries
     * example url: daquery/ws/inbound-queries?offset=40&limit=20
     * @param offset skip offset number, default 0 
     * @param limit  page size, default 20
     * @return 200 OK			List of inbound queries
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/inbound-queries")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveInboundQueries(@DefaultValue("0") @QueryParam("offset") String offset,
    		 							   @DefaultValue("100") @QueryParam("limit") String limit) {
    	return null;
    }
    
    /**
     * Get specific inbound query by Id
     * example url: daquery/ws/inbound-queries/122
     * @param offset skip offset number, default 0 
     * @param limit  page size, default 20
     * @return 200 OK			List of inbound queries
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/inbound-queries/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveInboundQueryByID(@PathParam("id") String id) {
    	return null;
    }
    
    /**
     * Create a new in bound query
     * example url: daquery/ws/inbound-queries
     * @return 200 OK			the new inbound query object
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Path("/inbound-queries")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createInboundQuery() {
    	return null;
    }
    
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
    	return null;
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
    
    /**
     * Get all sites by network and type. If type not provided, return all sites
     * example url: daquery/ws/sites?network=PATH&type=in
     * @param network			network that the sites belong to
     * @param type(optional)
     * @return 200 OK			List of sites
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/sites")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveSites(@QueryParam("network") String network,
			  				      @QueryParam("type") String type) {
    	return null;
    }
    
    /**
     * Get all local users
     * example url: daquery/ws/users
     * @return 200 OK			List of users
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/users")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveUsers() {
    	return null;
    }
    
    /**
     * Create a new local users
     * example url: daquery/ws/users
     * @return 200 OK			new local user object
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Path("/users")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser() {
    	return null;
    }
    
    /**
     * Update user's role
     * example url: daquery/ws/users/122
     * @param  userId 
     * @return 200 OK			List of roles
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Path("/users")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("id") String id) {
    	return null;
    }
    
    /**
     * Get all local roles
     * example url: daquery/ws/roles
     * @return 200 OK			List of roles
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/roles")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveRoles() {
    	return null;
    }
    
    /**
     * Get roles by userId
     * example url: daquery/ws/roles?userId=21
     * @param  userId
     * @return 200 OK			List of roles
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/roles")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveRolesByUserId(@QueryParam("userId") String userId) {
    	return null;
    }
    
    /**
     * Get all remote users by site
     * example url: daquery/ws/remote-site-users?site=PITT
     * @param  site				Site
     * @return 200 OK			List of remote users
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/remote-site-users")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveRemoteSiteUsers(@QueryParam("site") String site) {
    	return null;
    }
    
    /**
     * Get all active notifications
     * example url: daquery/ws/notifications
     * @return 200 OK			List of notification
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/notifications")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNotifications() {
    	return null;
    }
}
