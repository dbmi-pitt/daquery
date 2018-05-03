package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
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
import javax.ws.rs.DefaultValue;
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
import org.hibernate.Session;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.RoleDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.KeystoreAlias;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;

@Path("/roleaccesstest")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class RoleAccessEndpoint extends AbstractEndpoint  {

	private final static Logger logger = Logger.getLogger(RoleAccessEndpoint.class.getName());

    @Context
    private UriInfo uriInfo;

    @Context
    SecurityContext securityContext;
	
    @GET
    @Path("/allroles")
    //@Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Secured({"ADMIN"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns a JSON list of the available roles.
     * @return a 200 if list of roles is successfully returned
     * returns a 500 error on failure 
     */
    public Response getAllRoles() {
    	try {
    		return(ResponseHelper.getJsonResponseGen(200, RoleDAO.queryAllRoles()));
        } catch (Exception e) {
    		String msg = "An unexpected error was encountered returning all roles.";
    		logger.log(Level.SEVERE, msg, e);
    		return(ResponseHelper.getErrorResponse(500, msg, "Please ask the admin to check the log files for more information.", e));
        }
    }
	
    @GET
    @Path("/admin")
    //@Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Secured({"ADMIN"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns a 200 if the user successfully
     * access this method.  The @Secured annotation determines which
     * user role can succesfully access the web service method.
     * @return a 200 if the user can successfully access the method
     * returns a 500 error on failure (from the AuthenticationFilter class
     */
    public Response adminResponse() {
        return Response.ok(200).build();
    }

    @GET
    @Path("/aggregate")
    //@Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Secured({"AGGREGATE_QUERIER"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns a 200 if the user successfully
     * access this method.  The @Secured annotation determines which
     * user role can succesfully access the web service method.
     * @return a 200 if the user can successfully access the method
     */
    public Response aggregateResponse() {
        return Response.ok(200).build();
    }

    @GET
    @Path("/datadownload")
    //@Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Secured({"DATA_QUERIER"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns a 200 if the user successfully
     * access this method.  The @Secured annotation determines which
     * user role can succesfully access the web service method.
     * @return a 200 if the user can successfully access the method
     */
    public Response datadownloadResponse() {
        return Response.ok(200).build();
    }

    @GET
    @Path("/steward")
    //@Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Secured({"STEWARD"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns a 200 if the user successfully
     * access this method.  The @Secured annotation determines which
     * user role can succesfully access the web service method.
     * @return a 200 if the user can successfully access the method
     */
    public Response stewardResponse() {
        return Response.ok(200).build();
    }

    @GET
    @Path("/viewer")
    //@Secured({"ADMIN", "AGGREGATE", "DATADOWNLOAD", "STEWARD", "VIEWER"})
    @Secured({"VIEWER"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns a 200 if the user successfully
     * access this method.  The @Secured annotation determines which
     * user role can succesfully access the web service method.
     * @return a 200 if the user can successfully access the method
     */
    public Response viewerResponse() {
        return Response.ok(200).build();
    }

}
