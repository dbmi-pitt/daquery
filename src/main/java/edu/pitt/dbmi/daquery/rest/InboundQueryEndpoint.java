package edu.pitt.dbmi.daquery.rest;


import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import javax.persistence.Query;
import org.hibernate.Session;
import org.joda.time.DateTime;

import java.security.Principal;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import static javax.ws.rs.core.HttpHeaders.AUTHORIZATION;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

import org.glassfish.jersey.internal.util.Base64;
//import edu.pitt.dbmi.daquery.persistence.PersistenceManager;
import org.hibernate.*;
import edu.pitt.dbmi.daquery.domain.Inbound_Query;
import edu.pitt.dbmi.daquery.domain.Site_User;
import edu.pitt.dbmi.daquery.util.PasswordUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

@Path("/inboundqueries")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class InboundQueryEndpoint {

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
     *  /inboundqueries/byStudy/:studyId- lists all the inboundqueries for a specific study
     *  /inboundqueries/byStudy/:studyId/pending- lists all the inboundqueries for a specific study where status=ending
     *  /inboundqueries/byUsername/:userName- lists all the inboundqueries for a specific user* note,
     *      we need to determine if we pass the id or username
     *  /inboundqueries/byUsername/:userName/pending- lists all the inboundqueries for a specific user* where status=pending note,
     *      we need to determine if we pass the id or username
     *  /inboundqueries/byStatus/:statusName- lists all the inboundqueries for a specific status
   
     * 
     */
    
    @GET
    @Secured
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the inbound queries found in the database.
     * @return a JSON array containing all the inbound queries
     * returns a 500 error on failure
     */
    public Response getAllInboundQueries() {
    	
    	try {

            logger.info("#### returning all inbound queries");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
                        
            List<Inbound_Query> queries = queryAllInboundQueries();
            
            if (queries == null) {
                return Response.status(NOT_FOUND).build();
            }

            Gson gson = new Gson();
            String json = gson.toJson(queries);
            return Response.ok(200).entity(json).build();

    	} catch (NoResultException nre) {
    		return Response.status(NOT_FOUND).build();
        } catch (Exception e) {
            return Response.status(INTERNAL_SERVER_ERROR).build();
        }
    }

    
    @GET
    @Secured
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /**
     * This method returns all the inbound queries found in the database.
     * @return a JSON array containing all the inbound queries
     * returns a 401 error on failure
     */
    public Response getInboundQueryByID(@PathParam("id") long id) {
    	
    	try {

            logger.info("#### returning  inbound query by id=" + id);

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
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

    private Inbound_Query queryInboundQuery(long id) throws Exception {
    	logger.info("searching for #### single Inbound_Query id= " +id);
    	try {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
	        EntityManager em = emf.createEntityManager();
	        Query query = em.createNamedQuery(Inbound_Query.FIND_BY_ID);
	        query.setParameter("id", id);
	        Inbound_Query iq = null;
	        iq = (Inbound_Query)query.getSingleResult();		        
	        return iq;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    
    private List<Inbound_Query> queryAllInboundQueries() throws Exception {
    	logger.info("searching for #### all Inbound_Queries");
    	try {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
	        EntityManager em = emf.createEntityManager();
	        Query query = em.createNamedQuery(Inbound_Query.FIND_ALL);
	        List<Inbound_Query> queries = null;
	        queries = (List<Inbound_Query>)query.getResultList();
	        return queries;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }


}