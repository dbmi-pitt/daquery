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
import java.util.List;
import java.util.logging.Logger;

import static javax.ws.rs.core.HttpHeaders.AUTHORIZATION;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;

import org.glassfish.jersey.internal.util.Base64;
//import edu.pitt.dbmi.daquery.persistence.PersistenceManager;
import org.hibernate.*;
import edu.pitt.dbmi.daquery.domain.Inbound_Query;
import com.fasterxml.jackson.annotation.JsonInclude;

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
    @Path("/")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllQueries() {
    	
    	try {

            logger.info("#### returning all inbound queries");

            Principal principal = securityContext.getUserPrincipal();
            String username = principal.getName();
            logger.info("Responding to request from: " + username);
            
            DateTime dt = new DateTime();

            JsonBuilderFactory jFactory = Json.createBuilderFactory(null);
            JsonArray jsonArray = jFactory.createArrayBuilder()
            		.add(jFactory.createObjectBuilder()
	            		.add("id", 1)
	            		.add("studyName", "Diabetes")
	            		.add("name", "Query 1")
	            		.add("type", "Data")
	            		.add("site", "PITT")
	            		.add("username", username)
	            		.add("datetime", dt.toString())
	            		.add("status", "pending")
	            		.add("oracleQuery", "SELECT * FROM OracleTableX")
	            		.add("sqlQuery", "SELECT * FROM SQLTableX" ) )
            		.add(jFactory.createObjectBuilder()
	            		.add("id", 2)
	            		.add("studyName", "Diabetes")
	            		.add("name", "Query 2")
	            		.add("type", "Data")
	            		.add("site", "PITT")
	            		.add("username", username)
	            		.add("datetime", dt.toString())
	            		.add("status", "pending")
	            		.add("oracleQuery", "SELECT * FROM OracleTableX")
	            		.add("sqlQuery", "SELECT * FROM SQLTableX" ) )
            		.build();
            
             return Response.ok(200).entity(jsonArray).build();

        } catch (Exception e) {
            return Response.status(UNAUTHORIZED).build();
        }
    }



}