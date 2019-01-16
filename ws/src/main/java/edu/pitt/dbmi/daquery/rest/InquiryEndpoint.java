package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import org.hibernate.HibernateException;

import edu.pitt.dbmi.daquery.common.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.common.dao.InquiryDAO;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.QueryType;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLCode;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;


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
        InquiryDAO dao = new InquiryDAO();
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            dao.openCurrentSession();
            List inquiries = dao.listSavedInquiries();
            dao.closeCurrentSession();
            
            String jsonString = toJsonArray(inquiries);
            return Response.ok(200).entity(jsonString).build();

    	} catch (HibernateException he) {
    		String msg = "A database error occured while getting a list of inquiries.";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg + "  Check the server logs for more information.", "This error usually indicates that the database is down or cannot be accessed.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error occured while getting a list of inquiries.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg + "  Check the server logs for more information.", null, e));
        } finally {
        	if (dao.getCurrentSession() != null) {
        		dao.closeCurrentSession();
        	}
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
        InquiryDAO dao = new InquiryDAO();
    	try {

            logger.info("#### returning single inquiry [" + id + "]");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            dao.openCurrentSession();
            Inquiry inquiry = dao.get(Long.parseLong(id));
            dao.closeCurrentSession();
            
            String jsonString = inquiry.toJson();
            return Response.ok(200).entity(jsonString).build();

    	} catch (NumberFormatException nfe) {
    		String msg = "Could not convert [" + id + "] to an integer.";
    		logger.log(Level.SEVERE, msg, nfe);
    		return(ResponseHelper.getErrorResponse(400, msg, "This error indicates that the URL contained an invalid Inquiry id.", nfe));
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when retrieving inquiry [" + id + "]";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered when retrieving inquiry  [" + id + "]";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } finally {
        	if (dao.getCurrentSession() != null) {
        		dao.closeCurrentSession();
        	}
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
        InquiryDAO dao = new InquiryDAO();
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            dao.openCurrentSessionwithTransaction();
            // only create SQLQuery for now
            Inquiry inquiry = new SQLQuery(true);
            //inquiry.setAggregate(form.get("dataType").toString().toLowerCase().equals("aggregate"));
            inquiry.setQueryType(form.get("queryType").toString().toUpperCase());
            inquiry.setAuthor(currentUser);
            inquiry.setNetwork(NetworkDAO.queryNetwork(form.get("network").toString()));
            inquiry.setVersion(1);
            inquiry.setInquiryName(form.get("inquiryName").toString());
            inquiry.setInquiryDescription(form.get("inquiryDescription").toString());
            inquiry.setNotDateShift(form.get("notDateShift").toString().equals("true"));
            
            Set<SQLCode> s = new HashSet<>();
            if(!((LinkedHashMap<?, ?>)form.get("query")).get("ansi").toString().equals(""))
            	s.add(new SQLCode(((LinkedHashMap<?, ?>)form.get("query")).get("ansi").toString(), SQLDialect.ANSI));
            if(!((LinkedHashMap<?, ?>)form.get("query")).get("oracle").toString().equals(""))
            	s.add(new SQLCode(((LinkedHashMap<?, ?>)form.get("query")).get("oracle").toString(), SQLDialect.ORACLE));
            if(!((LinkedHashMap<?, ?>)form.get("query")).get("sqlServer").toString().equals(""))
            	s.add(new SQLCode(((LinkedHashMap<?, ?>)form.get("query")).get("sqlServer").toString(), SQLDialect.SQL_SERVER));
            for(SQLCode c : s) {
            	c.setQuery((SQLQuery)inquiry);
            }
            ((SQLQuery)inquiry).setCode(s);

            dao.save(inquiry);
            dao.closeCurrentSessionwithTransaction();
            
            String jsonString = inquiry.toJson();
            return Response.ok(201).entity(jsonString).build();

    	} catch (HibernateException he) {
    		String msg = "Could not access the database when creating a new inquiry.";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered when creating a new inquiry.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } finally {
        	if (dao.getCurrentSession() != null) {
        		dao.closeCurrentSession();
        	}
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
    @Path("/{id}")
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateInquiry(@PathParam("id") String id, LinkedHashMap<?, ?> form) {
        InquiryDAO dao = new InquiryDAO();
    	try {

            logger.info("#### returning all inquires");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            dao.openCurrentSessionwithTransaction();
            Inquiry inquiry = dao.getByUUID(id);
            //inquiry.setAggregate(form.get("dataType").toString().toLowerCase().equals("aggregate"));
            inquiry.setQueryType(form.get("queryType").toString().toUpperCase());
            inquiry.setAuthor(currentUser);
            inquiry.setVersion(inquiry.getVersion() + 1);
            inquiry.setInquiryName(form.get("inquiryName").toString());
            inquiry.setInquiryDescription(form.get("inquiryDescription").toString());
            inquiry.setNotDateShift(form.get("notDateShift").toString().equals("true"));
            
            ArrayList<String> codeToAdd = new ArrayList<>();
            if(!((LinkedHashMap<?, ?>)form.get("query")).get("ansi").toString().equals("")) codeToAdd.add("ansi");
            if(!((LinkedHashMap<?, ?>)form.get("query")).get("oracle").toString().equals("")) codeToAdd.add("oracle");
            if(!((LinkedHashMap<?, ?>)form.get("query")).get("sqlServer").toString().equals("")) codeToAdd.add("sqlServer");
            Set<SQLCode> s = ((SQLQuery)inquiry).getCode();
            Iterator<SQLCode> iter = s.iterator();
            
            while(iter.hasNext()) {
            	SQLCode c = iter.next();
            	if(c.getDialect().equals(SQLDialect.ANSI.toString())) {
            		if(!((LinkedHashMap<?, ?>)form.get("query")).get("ansi").toString().equals("")) {
            			c.setCode(((LinkedHashMap<?, ?>)form.get("query")).get("ansi").toString());
            			codeToAdd.remove("ansi");
            		} else {
            			iter.remove();
            		}
            	} else if(c.getDialect().equals(SQLDialect.ORACLE.toString())) {
            		if(!((LinkedHashMap<?, ?>)form.get("query")).get("oracle").toString().equals("")) {
            			c.setCode(((LinkedHashMap<?, ?>)form.get("query")).get("oracle").toString());
            			codeToAdd.remove("oracle");
            		} else {
            			iter.remove();
            		}
            	} else if(c.getDialect().equals(SQLDialect.SQL_SERVER.toString())) {
            		if(!((LinkedHashMap<?, ?>)form.get("query")).get("sqlServer").toString().equals("")) {
            			c.setCode(((LinkedHashMap<?, ?>)form.get("query")).get("sqlServer").toString());
            			codeToAdd.remove("sqlServer");
            		} else {
            			iter.remove();
            		}
            	}
            
            }
            for(String dialect : codeToAdd) {
            	String dialect_enum = dialect.replaceAll("(.)(\\p{Upper})", "$1_$2").toLowerCase();
            	s.add(new SQLCode(((LinkedHashMap<?, ?>)form.get("query")).get(dialect).toString(), SQLDialect.fromString(dialect_enum)));
            }
            for(SQLCode c : s) {
            	c.setQuery((SQLQuery)inquiry);
            }
            
            dao.update(inquiry.getId(), inquiry);
            dao.closeCurrentSessionwithTransaction();
            
            String jsonString = inquiry.toJson();
            return Response.ok(200).entity(jsonString).build();

    	} catch (HibernateException he) {
    		String msg = "Could not access the database when updating inquiry [" + id + "].";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error occurred when updating inquiry [" + id + "].";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } finally {
        	if (dao.getCurrentSession() != null) {
        		dao.closeCurrentSession();
        	}
        }
    }
}
