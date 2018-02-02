package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

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

import org.hibernate.HibernateException;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.dao.DaqueryRequestDAO;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;

@Path("/requests")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class RequestEndpoint extends AbstractEndpoint {
	@Context
    private UriInfo uriInfo;
    
    /*This take a little explaining.
     * The securityContext is created during the AuthenticationFilter.filter method.
     * This annotations allows the class to extract the username from the securityContext.
     * The username is extracted from the JWT passed to these methods.
     */
    @Context
    SecurityContext securityContext;

	
    private final static Logger logger = Logger.getLogger(RequestEndpoint.class.getName());
    
    /**
     * Get all requests
     * example url: daquery-ws/ws/requests
     * @params direction 
     * @return 200 OK			List of request
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRequests(@QueryParam("direction") String direction) {
        DaqueryRequestDAO dao = new DaqueryRequestDAO();
    	try {

            logger.info("#### returning all requests with direction [" + direction + "]");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            String[] directions = direction.split("\\!");
            
            dao.openCurrentSession();
            List requests = dao.list(directions);
            dao.closeCurrentSession();
            
            String jsonString = toJsonArray(requests);
            return Response.ok(200).entity(jsonString).build();

    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving requests for direction [" + direction + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered retrieving requests for direction [" + direction + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } finally {
        	if (dao.getCurrentSession() != null) {
        		dao.closeCurrentSession();
        	}
        }
    }
    
    /**
     * Get request by id
     * example url: daquery-ws/ws/requests/1
     * @return 200 OK Request
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/{id}")
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRequest(@PathParam("id") String id) {
        DaqueryRequestDAO dao = new DaqueryRequestDAO();
    	try {

            logger.info("#### returning a single request with id [" + id + "]");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            dao.openCurrentSession();
            DaqueryRequest request = dao.get(Long.parseLong(id));
            dao.closeCurrentSession();
            
            String jsonString = request.toJson();
            return Response.ok(200).entity(jsonString).build();

    	} catch (NumberFormatException nfe) {
    		String msg = "Could not convert [" + id + "] to a valid request id.";
    		logger.log(Level.SEVERE, msg, nfe);
    		return(ResponseHelper.getErrorResponse(BAD_REQUEST.getStatusCode(), msg, "Please ask the admin to check the log files for more information.", nfe));
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving data for request [" + id + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered retrieving data for request  [" + id + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } finally {
        	if (dao.getCurrentSession() != null) {
        		dao.closeCurrentSession();
        	}
        }
    }
    
    /**
     * Create requests
     * example url: daquery-ws/ws/requests
     * @return 201 Created Requests
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createRequest(LinkedHashMap<?, ?> form) {
        DaqueryRequestDAO dao = new DaqueryRequestDAO();
    	try {

            logger.info("#### creating a new request");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            dao.openCurrentSessionwithTransaction();
            
            UUID requestGroupUUID = UUID.randomUUID();
            
            for(LinkedHashMap site : (ArrayList<LinkedHashMap>)form.get("sitesToQuery")) {
            	if(site.get("check").equals(true)) {
		            DaqueryRequest request = new DaqueryRequest(true);
		            request.setRequestSite(SiteDAO.querySiteByName(site.get("name").toString()));
		            request.setDirection("OUT");
		            request.setNetwork(NetworkDAO.queryNetwork(form.get("network").toString()));
		            request.setSentTimestamp(new Date());
		            request.setRequestGroup(requestGroupUUID.toString());
		            Inquiry inquiry = new SQLQuery(true);
		            inquiry.setAggregate(form.get("dataType").toString().toLowerCase().equals("aggregate"));
		            inquiry.setAuthor(currentUser);
		            inquiry.setNetwork(NetworkDAO.queryNetwork(form.get("network").toString()));
		            inquiry.setVersion(1);
		            inquiry.setInquiryName(form.get("inquiryName").toString());
		            inquiry.setInquiryDescription(form.get("inquiryDescription").toString());
		            ((SQLQuery) inquiry).setCode(form.get("oracleQuery").toString());
		            request.setInquiry(inquiry);
		            dao.save(request);
            	}
            }
            dao.closeCurrentSessionwithTransaction();
            
            return Response.ok(201).build();

    	} catch (HibernateException he) {
    		String msg = "Could not access the database when creating a new request.";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered creating a new request.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } finally {
        	if (dao.getCurrentSession() != null) {
        		dao.closeCurrentSession();
        	}
        }
    }
    
    /**
     * Update request
     * example url: daquery-ws/ws/requests/1
     * @return 200 OK Request
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateRequest(LinkedHashMap<?, ?> form) {
        DaqueryRequestDAO dao = new DaqueryRequestDAO();
    	try {

            logger.info("#### updating a request");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            dao.openCurrentSessionwithTransaction();
            DaqueryRequest request = dao.get((Long) form.get("id"));
            dao.update(request.getId(), request);
            dao.closeCurrentSessionwithTransaction();
            
            String jsonString = request.toJson();
            return Response.ok(201).entity(jsonString).build();

    	} catch (HibernateException he) {
    		String msg = "Could not access the database when updating a new request.";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered updating a new request.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } finally {
        	if (dao.getCurrentSession() != null) {
        		dao.closeCurrentSession();
        	}
        }
    }
}
