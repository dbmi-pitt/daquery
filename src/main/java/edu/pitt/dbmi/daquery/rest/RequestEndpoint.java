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

import edu.pitt.dbmi.daquery.dao.DaqueryRequestDAO;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.InquiryDAO;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.dao.SiteDAO;
import edu.pitt.dbmi.daquery.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLQuery;

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
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryRequestDAO dao = new DaqueryRequestDAO();
            dao.openCurrentSession();
            List requests = dao.list(direction);
            dao.closeCurrentSession();
            
            String jsonString = toJsonArray(requests);
            return Response.ok(200).entity(jsonString).build();

    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
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
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryRequestDAO dao = new DaqueryRequestDAO();
            dao.openCurrentSession();
            DaqueryRequest request = dao.get(Long.parseLong(id));
            dao.closeCurrentSession();
            
            String jsonString = request.toJson();
            return Response.ok(200).entity(jsonString).build();

    	} catch (NumberFormatException nfe) {
    		return Response.status(BAD_REQUEST).build();
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
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
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            DaqueryRequestDAO dao = new DaqueryRequestDAO();
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
		            ((SQLQuery) inquiry).setCode(form.get("oracleQuery").toString());
		            request.setInquiry(inquiry);
		            dao.save(request);
            	}
            }
            dao.closeCurrentSessionwithTransaction();
            
            return Response.ok(201).build();

    	} catch (NumberFormatException nfe) {
    		return Response.status(BAD_REQUEST).build();
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
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
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            DaqueryRequestDAO dao = new DaqueryRequestDAO();
            dao.openCurrentSessionwithTransaction();
            DaqueryRequest request = dao.get((Long) form.get("id"));
            dao.update(request.getId(), request);
            dao.closeCurrentSessionwithTransaction();
            
            String jsonString = request.toJson();
            return Response.ok(201).entity(jsonString).build();

    	} catch (NumberFormatException nfe) {
    		return Response.status(BAD_REQUEST).build();
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
}
