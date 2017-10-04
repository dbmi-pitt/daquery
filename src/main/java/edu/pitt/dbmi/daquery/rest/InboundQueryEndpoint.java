package edu.pitt.dbmi.daquery.rest;


import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

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

import edu.pitt.dbmi.daquery.domain.Inbound_Query;
import edu.pitt.dbmi.daquery.util.UserRoles;

@Path("/inboundqueries")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class InboundQueryEndpoint extends AbstractEndpoint {

    // ======================================
    // =          Injection Points          =
    // ======================================

    @Context
    private UriInfo uriInfo;
    
    /*This take a little explaining.
     * The securityContext is created during the AuthenticationFilter.filter method.
     * This annotations allows the class to extract the username from the securityContext.
     * The username is extracted from the JWT passed to these methods.
     */
    @Context
    SecurityContext securityContext;

    private final static Logger logger = Logger.getLogger(InboundQueryEndpoint.class.getName());
        
    // ======================================
    // =          Business methods          =
    // ======================================
        
    //TODO: Do we want to return 401 for all failures? (Desheng wants 401's for all failures)
    //I think the front-end might want specific error messages
    
    /* TODO:I think I need these method sigs:
     * 
     *  /inboundqueries/- lists all the inboundqueries, not filtered, ordered by lastUpdate time
     *  /inboundqueries/newquery - create a new inbound query
     *  /inboundqueries/:id - return a single inbound query
     *  /inboundqueries/study/:studyId- lists all the inboundqueries for a specific study
     *  /inboundqueries/study/:studyId/pending- lists all the inboundqueries for a specific study where status=ending
     *  /inboundqueries/username/:userName- lists all the inboundqueries for a specific user* note,
     *      we need to determine if we pass the id or username
     *  /inboundqueries/username/:userName/pending- lists all the inboundqueries for a specific user* where status=pending note,
     *      we need to determine if we pass the id or username
     *  /inboundqueries/status/:statusName- lists all the inboundqueries for a specific status
   
     * 
     */
    
    @GET
    //@Secured({UserRoles.ADMIN, UserRoles.AGGREGATE, UserRoles.DATADOWNLOAD, UserRoles.STEWARD, UserRoles.VIEWER})
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the inbound queries found in the database.
     * example URL: daquery-ws/ws/inboundqueries/
     * @return a JSON array containing all the inbound queries
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    public Response getAllInboundQueries() {
    	
    	try {

            logger.info("#### returning all inbound queries");

            //Principal principal = securityContext.getUserPrincipal();
            //String username = principal.getName();
            //logger.info("Responding to request from: " + username);
                        
            List<Inbound_Query> queries = queryAllInboundQueries();
            
            if (queries == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(queries);
            return Response.ok(200).entity(jsonString).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
        	e.printStackTrace();
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }

    
    @GET
    @Secured({UserRoles.ADMIN, UserRoles.AGGREGATE, UserRoles.DATADOWNLOAD, UserRoles.STEWARD, UserRoles.VIEWER})
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the inbound queries found in the database.
     * example URL: daquery-ws/ws/inboundqueries/1
     * @return a JSON object containing single inbound query
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    public Response getInboundQueryByID(@PathParam("id") long id) {
    	
    	try {

            logger.info("#### returning  inbound query by id=" + id);

            //Principal principal = securityContext.getUserPrincipal();
            //String username = principal.getName();
            //logger.info("Responding to request from: " + username);
            
            Inbound_Query iq = queryInboundQuery(id);
            
            if (iq == null) {
                return Response.status(NOT_FOUND).build();
            }
            
            String json = iq.toJson();

            return Response.ok(200).entity(json).build();
    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Secured({UserRoles.ADMIN, UserRoles.AGGREGATE, UserRoles.DATADOWNLOAD, UserRoles.STEWARD, UserRoles.VIEWER})
    @Path("/status/{statusType}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the inbound queries found in the database for a given status.
     * example URL: daquery-ws/ws/inboundqueries/status/pending
     * @return a JSON object containing a list of matching inbound queries
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    public Response getInboundQueryByStatus(@PathParam("statusType") String statusType) {
    	
    	try {

            logger.info("#### returning  inbound query by status=" + statusType);

            //Principal principal = securityContext.getUserPrincipal();
            //String username = principal.getName();
            //logger.info("Responding to request from: " + username);
                        
            List<Inbound_Query> queries = queryInboundQueriesByStatus(statusType);
            
            if (queries == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(queries);
            return Response.ok(200).entity(jsonString).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Secured({UserRoles.ADMIN, UserRoles.AGGREGATE, UserRoles.DATADOWNLOAD, UserRoles.STEWARD, UserRoles.VIEWER})
    @Path("/site/{siteName}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the inbound queries found in the database sent from a given site.
     * example URL: daquery-ws/ws/inboundqueries/site/Pitt
     * @return a JSON object containing a list of matching inbound queries
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
    public Response getInboundQueryBySite(@PathParam("siteName") String siteName) {
    	
    	try {

            logger.info("#### returning  inbound query by site=" + siteName);

            //Principal principal = securityContext.getUserPrincipal();
            //String username = principal.getName();
            //logger.info("Responding to request from: " + username);
                        
            List<Inbound_Query> queries = queryInboundQueriesBySite(siteName);
            
            if (queries == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(queries);
            return Response.ok(200).entity(jsonString).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }

/*    @GET
    @Secured
    @Path("/site/{siteName}/status/{statusType}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the inbound queries found in the database sent from a given site.
     * example URL: daquery-ws/ws/inboundqueries/site/Pitt/status/pending
     * @return a JSON object containing a list of matching inbound queries
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
/*    public Response getInboundQueryBySiteStatus(@PathParam("siteName") String siteName, @PathParam("statusType") String statusType) {
    	
    	try {

            logger.info("#### returning  inbound query by site=" + siteName + " and status =" + statusType);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
                        
            List<Inbound_Query> queries = queryInboundQueriesBySiteAndStatus(siteName, statusType);
            
            if (queries == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(queries);
            return Response.ok(200).entity(jsonString).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
/*
    @GET
    @Secured
    @Path("/site/{userName}/status/{statusType}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the inbound queries found in the database sent from a given site.
     * example URL: daquery-ws/ws/inboundqueries/site/user1/status/pending
     * @return a JSON object containing a list of matching inbound queries
     * returns a 404 error if no queries are found,
     *   a 500 error on failure
     */
/*    public Response getInboundQueryByUserStatus(@PathParam("userName") String userName, @PathParam("statusType") String statusType) {
    	
    	try {

            logger.info("#### returning  inbound query by user=" + userName + " and status =" + statusType);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
                        
            List<Inbound_Query> queries = queryInboundQueriesByUserAndStatus(userName, statusType);
            
            if (queries == null) {
                return Response.status(NOT_FOUND).build();
            }

            String jsonString = toJsonArray(queries);
            return Response.ok(200).entity(jsonString).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
 */   
    
    
    
    // ======================================
    // =          PRIVATE METHODS           =
    // ======================================
    
    
    private Inbound_Query queryInboundQuery(long id) throws Exception {
    	logger.info("searching for #### single Inbound_Query id= " +id);
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piId = new ParameterItem("id", id);
    		pList.add(piId);
    		Inbound_Query iq = executeQueryReturnSingle(Inbound_Query.FIND_BY_ID, pList, logger);
	        return iq;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    private List<Inbound_Query> queryAllInboundQueries() throws Exception {
    	try { 		
    	    List<Inbound_Query> queries = executeQueryReturnList(Inbound_Query.FIND_ALL, null, logger);
	        return queries;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
    
    private List<Inbound_Query> queryInboundQueriesByStatus(String status) throws Exception {
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piStatus = new ParameterItem("status", status);
    		pList.add(piStatus);
    	    List<Inbound_Query> queries = executeQueryReturnList(Inbound_Query.FIND_BY_STATUS, pList, logger);
	        return queries;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
    
    private List<Inbound_Query> queryInboundQueriesByStudy(String study) throws Exception {
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piStudy = new ParameterItem("study", study);
    		pList.add(piStudy);
    	    List<Inbound_Query> queries = executeQueryReturnList(Inbound_Query.FIND_BY_STUDY, pList, logger);
	        return queries;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    private List<Inbound_Query> queryInboundQueriesBySite(String site) throws Exception {
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piSite = new ParameterItem("site", site);
    		pList.add(piSite);
    	    List<Inbound_Query> queries = executeQueryReturnList(Inbound_Query.FIND_BY_SITE, pList, logger);
	        return queries;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    private List<Inbound_Query> queryInboundQueriesBySiteAndStatus(String site, String status) throws Exception {
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piSite = new ParameterItem("site", site);
    		pList.add(piSite);
    		ParameterItem piStatus = new ParameterItem("status", status);
    		pList.add(piStatus);
    	    List<Inbound_Query> queries = executeQueryReturnList(Inbound_Query.FIND_BY_SITE_STATUS, pList, logger);
	        return queries;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    private List<Inbound_Query> queryInboundQueriesByUserAndStatus(String username, String status) throws Exception {
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piUser = new ParameterItem("username", username);
    		pList.add(piUser);
    		ParameterItem piStatus = new ParameterItem("status", status);
    		pList.add(piStatus);
    	    List<Inbound_Query> queries = executeQueryReturnList(Inbound_Query.FIND_BY_USER_STATUS, pList, logger);
	        return queries;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }



/*
 *      *  /inboundqueries/- lists all the inboundqueries, not filtered, ordered by lastUpdate time
     *  /inboundqueries/newquery - create a new inbound query
     *  /inboundqueries/:id - return a single inbound query
     *  /inboundqueries/bystudy/:studyId- lists all the inboundqueries for a specific study
     *  /inboundqueries/bystudy/:studyId/pending- lists all the inboundqueries for a specific study where status=ending
     *  /inboundqueries/byusername/:userName- lists all the inboundqueries for a specific user* note,
     *      we need to determine if we pass the id or username
     *  /inboundqueries/byusername/:userName/pending- lists all the inboundqueries for a specific user* where status=pending note,
     *      we need to determine if we pass the id or username
     *  /inboundqueries/bystatus/:statusName- lists all the inboundqueries for a specific status

 * 
 */
    
    

}