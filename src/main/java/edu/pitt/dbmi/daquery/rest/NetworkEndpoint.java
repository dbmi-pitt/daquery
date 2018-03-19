package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.security.Principal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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

import com.fasterxml.jackson.core.type.TypeReference;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.DataBaseTestResult;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.TestConnection;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
import edu.pitt.dbmi.daquery.dao.SQLDataSourceDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;



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
            
//            if (networks == null) {
//                return Response.ok(200).entity(networks).build();
//            }
//            if (networks.isEmpty()) {
//            	return Response.ok(200).entity(networks).build();
//            }

            String jsonString = toJsonArray(networks);
            return Response.ok(200).entity(jsonString).build();

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
    			return(ResponseHelper.getErrorResponse(500, "An unhandled error occured while retrieving all network information.", null, de));
    		}    		
    	}
    	catch (HibernateException he) {
    		String msg = "A database error occured while getting a list of networks.";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg + "  Check the server logs for more information.", "This error usually indicates that the database is down or cannot be accessed.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error occured while getting a list of networks.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg + "  Check the server logs for more information.", null, e));
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
    		String msg = "Could not access the database when retrieving inquiry [" + id + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered when retrieving inquiry  [" + id + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
    
    @PUT
    @Secured
    @Path("/join")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response joinNetwork(LinkedHashMap<?, ?> payload) {
        SiteDAO sitedao = new SiteDAO();
    	try {

            logger.info("#### joining network by id=" + ((LinkedHashMap<?, ?>)payload.get("form")).get("network"));

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            HashMap<String, String> network_params = new HashMap<>();
            network_params.put("id", ((LinkedHashMap<?, ?>)payload.get("network")).get("id").toString());
            network_params.put("network_id", ((LinkedHashMap<?, ?>)payload.get("form")).get("network").toString());
            network_params.put("name", ((LinkedHashMap<?, ?>)payload.get("network")).get("name").toString());
            //network_params.put("data_model", ((LinkedHashMap<?, ?>)payload.get("network")).get("dataModel").toString());
            network_params.put("data_model", "temp");
            
            HashMap<String, String> sqldatasource_params = new HashMap<>();
            sqldatasource_params.put("url", ((LinkedHashMap<?, ?>)payload.get("form")).get("url").toString());
            sqldatasource_params.put("name", network_params.get("name") + "_datasource");
            sqldatasource_params.put("username", ((LinkedHashMap<?, ?>)payload.get("form")).get("username").toString());
            sqldatasource_params.put("password", ((LinkedHashMap<?, ?>)payload.get("form")).get("password").toString());
            sqldatasource_params.put("driver", ((LinkedHashMap<?, ?>)payload.get("form")).get("driver").toString());
            
            //SQLDataSource sqlDataSource = SQLDataSourceDAO.createSQLDataSource(sqldatasource_params);
            SQLDataSource sqlDataSource = new SQLDataSource();
            sqlDataSource.setConnectionUrl(sqldatasource_params.get("url"));
            sqlDataSource.setName(sqldatasource_params.get("name"));
            sqlDataSource.setUsername(sqldatasource_params.get("username"));
            sqlDataSource.setPassword(sqldatasource_params.get("password"));
            sqlDataSource.setDriverClass(sqldatasource_params.get("driver"));
            
            Set<DataSource> dsset = new HashSet<DataSource>();
            
           
            //dModel.setName(((LinkedHashMap<?, ?>)payload.get("network")).get("dataModel").toString());
            String netId = network_params.get("network_id");
            DataModel dModel = getDataModelFromCentral(netId);
            dsset.add(sqlDataSource);
            
            if(dModel != null)
	            dModel.setDataSources(dsset);
	        sqlDataSource.setDataModel(dModel);
	        Network network = NetworkDAO.createNetwork(network_params, dModel);
            
            Site site = SiteDAO.getLocalSite();
            
            sitedao.openCurrentSessionwithTransaction();
            sitedao.createOutogingSites(network.getId(), site.getId());
            sitedao.createIncomingSites(network.getId(), site.getId());
            sitedao.closeCurrentSessionwithTransaction();
            
            String json = network.toJson();

            return Response.ok(200).entity(json).build();
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered when joining a network.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } finally {
        	if (sitedao.getCurrentSession() != null) {
        		sitedao.closeCurrentSession();
        	}
        }
    	
    }
    
    private DataModel getDataModelFromCentral(String networkId) throws DaqueryException
    {
	    Map<String, String> netIdParam = new HashMap<String, String>();
	    netIdParam.put("network-id", networkId);
	    Response resp = WSConnectionUtil.centralServerGet("data-model", netIdParam);
	    DataModel dm = (DataModel) JSONHelper.decodeResponse(resp, new TypeReference<DataModel>(){});
	    return(dm);
    }
    
    
    /**
     * Get data mode by network ID or UUID
     * example url: daquery-ws/ws/networks/1/datamodel
     *           or daquery-ws/ws/networks/a3477419-657d-4ddd-8750-c014e2033937/datamodel
     * @return 200 OK			Datamodel information for one network
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Path("/{id}/datamodel")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDatamodelbyNetworkId(@PathParam("id") String id) {
    	try {

            logger.info("#### returning network by uuid=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.queryNetwork(id);
            DataModel datamodel = NetworkDAO.getDatamodelbyNetworkId(network);
             
            String json = datamodel.toJson();

            return Response.ok(200).entity(json).build();
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving datamodel data for network [" + id + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered retrieving datamodel data for network  [" + id + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
    
    /**
     * Get data mode by network ID or UUID
     * example url: daquery-ws/ws/networks/1/datamodel
     *           or daquery-ws/ws/networks/a3477419-657d-4ddd-8750-c014e2033937/datamodel
     * @return 200 OK			Datamodel information for one network
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Secured
    @Path("/{id}/sqldatasource")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateSQLDataSourceByNetworkId(@PathParam("id") String id, SQLDataSource ds) {
    	try {

            logger.info("#### returning network by uuid=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.queryNetwork(id);
            NetworkDAO.updateSQLDataSource(network, ds);

            return Response.ok(200).entity("{}").build();
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving datamodel data for network [" + id + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered retrieving datamodel data for network  [" + id + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
    
    /**
     * Get SQL data source by network ID or UUID
     * example url: daquery-ws/ws/networks/1/sqldatasource
     *           or daquery-ws/ws/networks/a3477419-657d-4ddd-8750-c014e2033937/sqldatasource
     * @return 200 OK			sqldatasource information for one network
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Path("/{id}/sqldatasource")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSQLDataSourcebyNetworkId(@PathParam("id") String id) {
    	try {

            logger.info("#### returning network by uuid=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.queryNetwork(id);
            SQLDataSource sql_data_source = NetworkDAO.getSQLDataSourcebyNetworkId(network);
             
            String json = sql_data_source.toJson();

            return Response.ok(200).entity(json).build();
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving SQL datasource data for network [" + id + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered retrieving SQL datasource data for network  [" + id + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
    
    @POST
    @Secured
    @Path("/test-data-source")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response testDataSource(LinkedHashMap<?, ?> databaseInfo) {
    	try {

            logger.info("#### testing datbase connection");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            if(!TestConnection.checkConnection((String)databaseInfo.get("connectionUrl"))) {
            	String msg = "Unable to connect to url " + databaseInfo.get("connectionUrl");
            	logger.log(Level.WARNING, msg);
            	
            	return Response.ok(200).entity("{\"result\": true, \"errorMsg\": \"" + msg + "\", \"detailErrorMsg\": \"\"}").build();
            }
            
            String q = ((String)databaseInfo.get("driver")).contains("oracle") ? "select * from dual" : "select 'sql'";
            DataBaseTestResult result = TestConnection.runQuery((String) databaseInfo.get("connectionUrl"), (String) databaseInfo.get("username"), (String) databaseInfo.get("password"), (String) databaseInfo.get("driver"), q);
            
            return Response.ok(200).entity(result.toJson()).build();
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered testing datasource connection";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
}
