package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.security.Principal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import org.hibernate.HibernateException;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;


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
                        
            List<Network> networks = NetworkDAO.queryAllNetworks();
            
            if (networks == null) {
                return Response.status(NOT_FOUND).build();
            }
            if (networks.isEmpty()) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(networks);
            return Response.ok(200).entity(jsonString).build();

    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
    
    /**
     * Get specific network by ID or UUID
     * example url: daquery-ws/ws/networks/1
     *           or daquery-ws/ws/networks/a3477419-657d-4ddd-8750-c014e2033937
     * @return 200 OK			Network information for one network
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNetworkByID(@PathParam("id") String id) {
    	try {

            logger.info("#### returning network by uuid=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.queryNetwork(id);
            
            if (network == null) {
                return Response.status(NOT_FOUND).build();
            }
        
            
            String json = network.toJson();

            return Response.ok(200).entity(json).build();
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @PUT
    @Secured
    @Path("/join")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response joinNetwork(LinkedHashMap<?, ?> payload) {
    	try {

            logger.info("#### joining network by uuid=" + ((LinkedHashMap<?, ?>)payload.get("network")).get("id"));

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            HashMap<String, String> network_params = new HashMap<>();
            network_params.put("id", ((LinkedHashMap<?, ?>)payload.get("network")).get("id").toString());
            network_params.put("name", ((LinkedHashMap<?, ?>)payload.get("network")).get("name").toString());
            network_params.put("data_model", ((LinkedHashMap<?, ?>)payload.get("network")).get("dataModel").toString());
            
            HashMap<String, String> sqldatasource_params = new HashMap<>();
            sqldatasource_params.put("url", ((LinkedHashMap<?, ?>)payload.get("form")).get("url").toString());
            sqldatasource_params.put("name", network_params.get("name") + "_datasource");
            sqldatasource_params.put("username", ((LinkedHashMap<?, ?>)payload.get("form")).get("username").toString());
            sqldatasource_params.put("password", ((LinkedHashMap<?, ?>)payload.get("form")).get("password").toString());
            
            //SQLDataSource sqlDataSource = SQLDataSourceDAO.createSQLDataSource(sqldatasource_params);
            SQLDataSource sqlDataSource = new SQLDataSource();
            sqlDataSource.setConnectionUrl(sqldatasource_params.get("url"));
            sqlDataSource.setName(sqldatasource_params.get("name"));
            sqlDataSource.setUsername(sqldatasource_params.get("username"));
            sqlDataSource.setPassword(sqldatasource_params.get("password"));
            
            Set<DataSource> dsset = new HashSet<DataSource>();
            
            DataModel dModel = new DataModel(true);
            dModel.setName(((LinkedHashMap<?, ?>)payload.get("network")).get("dataModel").toString());
            dsset.add(sqlDataSource);
            
            dModel.setDataSources(dsset);
            sqlDataSource.setDataModel(dModel);
            
            Network network = NetworkDAO.createNetwork(network_params, dModel);
            
            String json = network.toJson();

            return Response.ok(200).entity(json).build();
    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    	
    }
    
}
