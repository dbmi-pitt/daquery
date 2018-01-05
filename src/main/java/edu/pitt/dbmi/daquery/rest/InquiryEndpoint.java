package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;

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

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.InquiryDAO;


@Path("/inquiries")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class InquiryEndpoint extends AbstractEndpoint {
	@Context
    private UriInfo uriInfo;
    
    /*This take a little explaining.
     * The securityContext is created during the AuthenticationFilter.filter method.
     * This annotations allows the class to extract the username from the securityContext.
     * The username is extracted from the JWT passed to these methods.
     */
    @Context
    SecurityContext securityContext;

	
    private final static Logger logger = Logger.getLogger(InquiryEndpoint.class.getName());
    
    /**
     * Get all inquiries
     * example url: daquery-ws/ws/inquiries
     * @return 200 OK			List of inquiry
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInquiries() {
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            InquiryDAO dao = new InquiryDAO();
            dao.openCurrentSession();
            List inquiries = dao.listSavedInquiries();
            dao.closeCurrentSession();
            
            String jsonString = toJsonArray(inquiries);
            return Response.ok(200).entity(jsonString).build();

    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
    
    /**
     * Get inquiry by id
     * example url: daquery-ws/ws/inquiries/1
     * @return 200 OK Inquiry
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/{id}")
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInquiry(@PathParam("id") String id) {
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            InquiryDAO dao = new InquiryDAO();
            dao.openCurrentSession();
            Inquiry inquiry = dao.get(Long.parseLong(id));
            dao.closeCurrentSession();
            
            String jsonString = inquiry.toJson();
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
     * Create inquiry
     * example url: daquery-ws/ws/inquiries
     * @return 201 Created Inquiry
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createInquiry(LinkedHashMap<?, ?> form) {
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            InquiryDAO dao = new InquiryDAO();
            dao.openCurrentSessionwithTransaction();
            // only create SQLQuery for now
            Inquiry inquiry = new SQLQuery(true);
            inquiry.setAggregate(form.get("dataType").toString().toLowerCase().equals("aggregate"));
            inquiry.setAuthor(currentUser);
            inquiry.setNetwork(NetworkDAO.queryNetwork(form.get("network").toString()));
            inquiry.setVersion(1);
            inquiry.setInquiryName(form.get("inquiryName").toString());
            inquiry.setInquiryDescription(form.get("inquiryDescription").toString());
            ((SQLQuery) inquiry).setCode(form.get("oracleQuery").toString());
            dao.save(inquiry);
            dao.closeCurrentSessionwithTransaction();
            
            String jsonString = inquiry.toJson();
            return Response.ok(201).entity(jsonString).build();

    	} catch (NumberFormatException nfe) {
    		return Response.status(BAD_REQUEST).build();
    	} catch (HibernateException he) {
    		return Response.status(INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }
    
    /**
     * Update inquiry
     * example url: daquery-ws/ws/inquiries/1
     * @return 200 OK Inquiry
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateInquiry(LinkedHashMap<?, ?> form) {
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            InquiryDAO dao = new InquiryDAO();
            dao.openCurrentSessionwithTransaction();
            Inquiry inquiry = dao.get((Long) form.get("id"));
            inquiry.setAggregate(form.get("datatype").toString().toLowerCase().equals("aggregate"));
            inquiry.setAuthor(currentUser);
            inquiry.setNetwork(NetworkDAO.queryNetwork(form.get("network_id").toString()));
            inquiry.setVersion(inquiry.getVersion() + 1);
            dao.update(inquiry.getId(), inquiry);
            dao.closeCurrentSessionwithTransaction();
            
            String jsonString = inquiry.toJson();
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
