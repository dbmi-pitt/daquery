package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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

import edu.pitt.dbmi.daquery.common.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.DataBaseTestResult;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.TestConnection;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
import edu.pitt.dbmi.daquery.update.db.DBUpdate151;
import edu.pitt.dbmi.daquery.update.db.DBUpdate154;



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
            
            // get networks from daquery central
            Map<String, String> idParam = new HashMap<String, String>();
			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
			Response resp = WSConnectionUtil.centralServerGet("availableNetworks", idParam);
			if (resp.getStatus() != 200) {
				return ResponseHelper.getErrorResponse(500, "Error happen when download network info from daquery cenral", "Please ask the admin to check the log files for more information.", null);
			}
			
			String json = resp.readEntity(String.class);
			Network[] netsFromCentral = JSONHelper.gson.fromJson(json, Network[].class);
            
            HashMap<String, String> network_params = new HashMap<>();
            network_params.put("id", ((LinkedHashMap<?, ?>)payload.get("network")).get("id").toString());
            network_params.put("network_id", ((LinkedHashMap<?, ?>)payload.get("form")).get("network").toString());
            network_params.put("name", ((LinkedHashMap<?, ?>)payload.get("network")).get("name").toString());
            network_params.put("data_model", "temp");
            Network net = null;
            for(Network n : netsFromCentral){
            	if(n.getNetworkId().equals(network_params.get("network_id"))){
            		net = n;
            		break;
            	}
            }
            
            HashMap<String, String> sqldatasource_params = new HashMap<>();
            sqldatasource_params.put("connectionUrl", ((LinkedHashMap<?, ?>)payload.get("form")).get("connectionUrl").toString());
            sqldatasource_params.put("name", network_params.get("name") + "_datasource");
            sqldatasource_params.put("username", ((LinkedHashMap<?, ?>)payload.get("form")).get("username").toString());
            sqldatasource_params.put("password", ((LinkedHashMap<?, ?>)payload.get("form")).get("password").toString());
            sqldatasource_params.put("driverClass", ((LinkedHashMap<?, ?>)payload.get("form")).get("driverClass").toString());
            
            //SQLDataSource sqlDataSource = SQLDataSourceDAO.createSQLDataSource(sqldatasource_params);
            SQLDataSource sqlDataSource = new SQLDataSource();
            sqlDataSource.setConnectionUrl(sqldatasource_params.get("connectionUrl"));
            sqlDataSource.setName(sqldatasource_params.get("name"));
            sqlDataSource.setUsername(sqldatasource_params.get("username"));
            sqlDataSource.setPassword(sqldatasource_params.get("password"));
            sqlDataSource.setDriverClass(sqldatasource_params.get("driverClass"));
            String dialect = "";
            if(sqldatasource_params.get("driverClass").contains("oracle")) {
            	dialect = SQLDialect.ORACLE.toString();
            } else if (sqldatasource_params.get("driverClass").contains("sqlserver")) {
            	dialect = SQLDialect.SQL_SERVER.toString();
            } else {
            	dialect = SQLDialect.ANSI.toString();
            }
            sqlDataSource.setDialect(dialect);
            
            Set<DataSource> dsset = new HashSet<DataSource>();
            
            
            //dModel.setName(((LinkedHashMap<?, ?>)payload.get("network")).get("dataModel").toString());
            //String netId = network_params.get("network_id");
            //DataModel dModel = getDataModelFromCentral(netId);
//            DataModel dModel = DBUpdate154.importCDM41Model(false);
            
            DataModel dModel = null;
            for(DataModel dm : net.getDataModels()){
            	if(dm.getDataModelId().equals(((LinkedHashMap<?, ?>)payload.get("form")).get("dataModel"))){
            		dModel = dm;
            		break;
            	}
            }
            
            dsset.add(sqlDataSource);
            if(dModel != null)
	            dModel.setDataSources(dsset);
            dModel.setActive(true);
	        sqlDataSource.setDataModel(dModel);
	        Site localSite = SiteDAO.getLocalSite();
	        Network network = NetworkDAO.createNetwork(network_params, net.getDataModels(), localSite);

            String ret_json = network.toJson();

            return Response.ok(200).entity(ret_json).build();
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
    @Path("/{id}/datamodels")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDatamodelsbyNetworkId(@PathParam("id") String id) {
    	try {

            logger.info("#### returning network by uuid=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.queryNetwork(id);
            Set<DataModel> datamodels = network.getDataModels();
            
            List listOfDataModels = new ArrayList(datamodels);
            
            String json = toJsonArray(listOfDataModels);

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
            String dialect = "";
            if(ds.getDriverClass().contains("oracle")) {
            	dialect = SQLDialect.ORACLE.toString();
            } else if(ds.getDriverClass().contains("sqlserver")) {
            	dialect = SQLDialect.SQL_SERVER.toString();
            } else {
            	dialect = SQLDialect.ANSI.toString();
            }
            ds.setDialect(dialect);
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
     * Update DeID properties by network ID or UUID
     * example url: daquery-ws/ws/networks/1/deid
     *           or daquery-ws/ws/networks/a3477419-657d-4ddd-8750-c014e2033937/deid
     * @return 200 OK			Datamodel information for one network
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Secured
    @Path("/{id}/deid")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateDeIDByNetworkId(@PathParam("id") String id, Network n) {
    	try {
    		
    		if(n.getMinDateShift() != null && n.getMaxDateShift() != null && n.getMinDateShift() > n.getMaxDateShift()) {
    			return Response.status(Response.Status.BAD_REQUEST)
    						   .entity("Maximum date shift must be greater than Minimum date shift")
    						   .build();
    			//return ResponseHelper.getErrorResponse(400, "Maximum date shift must be greater than Minimum date shift", "Maximum date shift must be greater than Minimum date shift", null);
    		}
    		
            logger.info("#### returning network by uuid=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.queryNetwork(id);
            NetworkDAO.updateDeIDProps(id, n);

            return Response.ok(200).entity("{}").build();
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving network [" + id + "]";
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
            
            if(!TestConnection.checkConnection((String)databaseInfo.get("connectionUrl"), (String) databaseInfo.get("driverClass"))) {
            	String msg = "Database is unreachable. Check that the server and port are specified correctly.  Or check firewall settings.";
            	logger.log(Level.SEVERE, msg);
            	
            	return Response.ok(200).entity("{\"result\": false, \"errorMsg\": \"" + msg + "\", \"detailErrorMsg\": \"\"}").build();
            }
            
            String q = ((String)databaseInfo.get("driverClass")).contains("oracle") ? "select * from dual" : "select 'sql'";
            DataBaseTestResult result = TestConnection.runQuery((String) databaseInfo.get("connectionUrl"), (String) databaseInfo.get("username"), (String) databaseInfo.get("password"), (String) databaseInfo.get("driverClass"), q);
            
            return Response.ok(200).entity(result.toJson()).build();
    	}
    	catch(DaqueryException e)
    	{
    		return Response.ok(200).entity("{\"result\": false, \"errorMsg\": \"" + e.getMessage() + "\", \"detailErrorMsg\": \"\"}").build();    		
        }
    	catch (Exception e) {
    		String msg = "An unexpected error was encountered testing datasource connection";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
    
    @POST
    @Secured
    @Path("/{id}/add-contact")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addContact(@PathParam("id") int id, DaqueryUser user) {
    	try {

            logger.info("#### adding network contact");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.getNetworkById(id);
            
            DaqueryUser u = DaqueryUserDAO.getUserByNameOrId(user.getId());
            
            NetworkDAO.addContactToNetwork(network, u);
            
            return Response.ok(201).entity("{}").build();
    	}
    	catch(DaqueryException e)
    	{
    		return Response.ok(200).entity("{\"result\": false, \"errorMsg\": \"" + e.getMessage() + "\", \"detailErrorMsg\": \"\"}").build();    		
        }
    	catch (Exception e) {
    		String msg = "An unexpected error was encountered adding network contact";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
    
    @DELETE
    @Secured
    @Path("/{id}/remove-contact/{userid}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response removeContact(@PathParam("id") int id, @PathParam("userid") String userId) {
    	try {

            logger.info("#### adding network contact");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            Network network = NetworkDAO.getNetworkById(id);
            
            NetworkDAO.removeContactToNetwork(network, userId);
            
            return Response.ok(200).entity("{}").build();
    	}
    	catch(DaqueryException e)
    	{
    		return Response.ok(200).entity("{\"result\": false, \"errorMsg\": \"" + e.getMessage() + "\", \"detailErrorMsg\": \"\"}").build();    		
        }
    	catch (Exception e) {
    		String msg = "An unexpected error was encountered adding network contact";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
}
