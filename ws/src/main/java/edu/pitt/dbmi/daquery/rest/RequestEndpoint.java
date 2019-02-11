package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;

import java.io.FileNotFoundException;
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

import edu.pitt.dbmi.daquery.common.dao.DaqueryRequestDAO;
import edu.pitt.dbmi.daquery.common.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.common.dao.DataModelDAO;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.ResponseDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.EmailContents;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLCode;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery.CodeAndDialect;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.EmailUtil;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.queue.QueueManager;
import edu.pitt.dbmi.daquery.queue.ResponseTask;
import edu.pitt.dbmi.daquery.queue.TaskQueue;

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
    public Response getRequests(@QueryParam("direction") String direction, @QueryParam("archived") String archived) {
        DaqueryRequestDAO dao = new DaqueryRequestDAO();
    	try {

            logger.info("#### returning all requests with direction [" + direction + "] and archived [" + archived + "]");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            String[] directions = direction.split("\\!");
            
            dao.openCurrentSession();
            List requests = dao.list(directions, archived);
            dao.closeCurrentSession();
            
            for(Object r : requests){
            	DaqueryRequest request = (DaqueryRequest)r;
            	CodeAndDialect cAndD = ((SQLQuery)request.getInquiry()).getCode(((SQLDataSource)request.getNetwork().getDataModels().iterator().next().getDataSource(SourceType.SQL)).getDialectEnum());
            	if(cAndD == null || StringHelper.isEmpty(cAndD.code))
            		request.setCode("");
            	else
            		request.setCode(cAndD.code);
            }
            
            for(Object r : requests) {
            	DaqueryRequest request = (DaqueryRequest)r;
            	request.getNetwork().setDataModels(null);
            }
            
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
            
            Object dobj = form.get("dialect");
            if(dobj == null)
            	return(ResponseHelper.getErrorResponse(400, "Dialect parameter required.", null, null));
            
            String dialectStr = dobj.toString();
            SQLDialect dialect = SQLDialect.fromString(dialectStr);
            if(dialect == null)
            	return(ResponseHelper.getErrorResponse(400, "Invalid dialect value: " + dialectStr, null, null));
            
            
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
		            //inquiry.setAggregate(form.get("dataType").toString().toLowerCase().equals("aggregate"));
		            inquiry.setQueryType(form.get("dataType").toString().toUpperCase());
		            inquiry.setAuthor(currentUser);
		            inquiry.setNetwork(NetworkDAO.queryNetwork(form.get("network").toString()));
		            inquiry.setVersion(1);
		            inquiry.setInquiryName(form.get("inquiryName").toString());
		            inquiry.setInquiryDescription(form.get("inquiryDescription").toString());
		            ((SQLQuery) inquiry).addCode(new SQLCode(form.get("oracleQuery").toString(), dialect));
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
    
    /**
     * Approve request
     * example url: daquery/ws/requests/1/approve
     * @return 200 OK Request
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Path("/{id}/approve")
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response approveDataRequest(@PathParam("id") String id) {
    	try {

            logger.info("#### updating a request");

            Principal principal = securityContext.getUserPrincipal();
            String userUUID = principal.getName();
            logger.info("Responding to request from: " + userUUID);
            
            DaqueryUser currentUser = DaqueryUserDAO.getUserByNameOrId(userUUID);
            
            DaqueryRequest request = DaqueryRequestDAO.getRequestById(id);
            
            if(!DaqueryUserDAO.hasRole(currentUser.getId(), request.getNetwork().getNetworkId(), "STEWARD")) {
            	return ResponseHelper.getErrorResponse(400, "You are not a data export steward for this network.", "The current user is not a steward of the current working network.  Steward rights are required.", null);
            }
            
            TaskQueue queue = QueueManager.getNamedQueue(TaskQueue.EXPORT_QUEUE);
            ResponseTask task = new ResponseTask(request, DaqueryUserDAO.getSysUser(), DataModelDAO.getDataModelbyId(request.getNetwork().getId(), request.getDataModelId()));
            queue.addTask(task);

            String jsonString = task.getResponse().toJson();
            return Response.ok(200).entity(jsonString).build();

    	} catch (HibernateException he) {
    		String msg = "Could not access the database when updating a new request.";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered updating a new request.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
    
    /**
     * Deny request
     * example url: daquery/ws/requests/1/deny
     * @return 200 OK Request
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Path("/{id}/deny")
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response denyDataRequest(@PathParam("id") String id) {
    	try {

            logger.info("#### updating a request");

            Principal principal = securityContext.getUserPrincipal();
            String userUUID = principal.getName();
            logger.info("Responding to request from: " + userUUID);
            
            DaqueryUser currentUser = DaqueryUserDAO.getUserByNameOrId(userUUID);
            
            DaqueryRequest request = DaqueryRequestDAO.getRequestById(id);
            
            if(!DaqueryUserDAO.hasRole(currentUser.getId(), request.getNetwork().getNetworkId(), "STEWARD")) {
            	return ResponseHelper.getErrorResponse(400, "You are not steward of this network", "The current user is not a steward of the current working network.", null);
            }
            
            ResponseDAO.denyDataRequest(request.getId());
            request = DaqueryRequestDAO.getRequestById(id);
            
			String dt = "";
			dt = StringHelper.displayDateFormat(request.getSentTimestamp());
            
            EmailContents emailContents = new EmailContents();
            emailContents.toAddresses.add(request.getRequester().getEmail());
            emailContents.subject = "Daquery Data Request Denied";
            emailContents.message = EmailUtil.generateEmailHeader(request.getNetwork().getName(), SiteDAO.getLocalSite().getName(), request.getInquiry().getInquiryName()); 
			emailContents.message += "<br //><br //>Your data request was denied by the site: " + SiteDAO.getLocalSite().getName() + "<br //>"; 
			emailContents.message += "The site administrator " + currentUser.getRealName() + " (" + currentUser.getEmail() +") denied your request.  Please contact this site administrator for more details regarding this request denial.<br //>";

			try{EmailUtil.sendEmail(emailContents);}
			catch(Throwable t)
			{
				if(t instanceof DaqueryErrorException)
				{
					DaqueryErrorException dee = (DaqueryErrorException) t;
					if(dee.getErrorInfo() != null)
					{
						logger.log(Level.SEVERE, "\n\t" + dee.getErrorInfo().displayMessage + "\n\t" + dee.getErrorInfo().getLongMessage() + "\n\t" + dee.getErrorInfo().getStackTrace());
					}
				}
				logger.log(Level.SEVERE, "Unable to send an email for request with id: " + request.getRequestId() + " because an error occurred.", t);
			}
			
            String jsonString = request.getResponses().iterator().next().toJson();
            return Response.ok(200).entity(jsonString).build();
    	} catch (HibernateException he) {
    		String msg = "Could not access the database when denying a pending request.";
    		logger.log(Level.SEVERE, msg, he);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", he));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered denying a pending request.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        } catch (Throwable e) {
        	String msg = "An unexpected error was encountered denying a pending request.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
		}
    }
    
    /**
     * Archive request 
     * example url: daquery-ws/ws/requests/1/archive
     * @return 200 OK Request
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @PUT
    @Path("/{id}/archive")
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response archiveRequest(@PathParam("id") String id) {
        DaqueryRequestDAO dao = new DaqueryRequestDAO();
    	try {

            logger.info("#### updating a request");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            DaqueryRequest request = DaqueryRequestDAO.getRequestById(id);
            request.setArchived(true);
            DaqueryRequestDAO.saveOrUpdate(request);
            
            String jsonString = request.toJson();
            return Response.ok(200).entity(jsonString).build();

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
    
    /**
     * Archive request group
     * example url: daquery-ws/ws/requests/archive-all?groupId=***
     * @return 200 OK Request
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @POST
    @Path("/archive-all")
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response archiveRequestGroup(@QueryParam("groupId") String groupId) {
        DaqueryRequestDAO dao = new DaqueryRequestDAO();
    	try {

            logger.info("#### updating a request");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DaqueryUser currentUser = DaqueryUserDAO.queryUserByUsername(username);
            
            List<DaqueryRequest> requests = DaqueryRequestDAO.getRequestsByGroupId(groupId);
            for(DaqueryRequest r : requests){
            	r.setArchived(true);
            	DaqueryRequestDAO.saveOrUpdate(r);
            }
            
            return Response.ok(200).build();

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
    
    /**
     * Export Data
     * 
     * @param request_id
     * example URL: daquery-ws/ws/requests/d2dd12f4-6b2e-430a-90db-dfe0c1617a48/export
     * @return 200 OK Request
     * @throws FileNotFoundException 
     * @throws 500 Server Error	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/{id}/data")
    @Secured
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response data(@PathParam("id") String id) {
    	//validate the user
    	// new thread
	    	// ask for patid list
	    	
	    	// load the xml into java objects (JAXB)
	    	
	    	// test if output file location available
	    	
	    	// pass in export function
	    	
    	// return response
    	
    	try {
    		DaqueryRequest dq = DaqueryRequestDAO.getRequestById(id);
    		if(dq.getDirection().equals("IN-OUT")) {
    			// local request
    			
    			// Send Data
        		
    		} else {
    			// outgoing request
    			
    		}
    	} catch(Throwable t) {
    		String msg = "An unexpected error was encountered updating a new request.";
    		logger.log(Level.SEVERE, msg, t);
    		return ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", t);
    	} 
    	
    	return Response.ok(200).entity("{}").build();
    }
}
