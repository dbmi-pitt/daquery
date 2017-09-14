package edu.pitt.dbmi.daquery.rest;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.inject.Inject;
import javax.json.Json;
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
import javax.ws.rs.core.UriInfo;

import javax.persistence.Query;
import org.hibernate.Session;

import java.security.Key;
import java.util.ArrayList;
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
import edu.pitt.dbmi.daquery.domain.Site_User;
import com.fasterxml.jackson.annotation.JsonInclude;


@Path("/")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Transactional
public class SiteEndpoint extends AbstractEndpoint {

	private final static Logger logger = Logger.getLogger(SiteEndpoint.class.getName());
	
	/**
     * Get all sites by type
     * example url: daquery/ws/sites?type=inbound
     * @param  type inbound, outbound or pending 
     * @return 200 OK			List of sites
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/sites")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNetworks(@QueryParam("type") String type) {
		try {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby");
		    EntityManager em = emf.createEntityManager();
			
		    @SuppressWarnings("rawtypes")
			List sites = em.createNamedQuery(Site.FIND_BY_TYPE)
					       .setParameter("type", type)
					       .getResultList();
		
		    em.close();
		   
		    logger.info("Done trying to get all sites");
		    
		    //TODO: build some JSON into the response.  Return the new UUID
		    
		    return Response.ok().entity(sites).build();
		} catch (Exception e) {
		    return Response.serverError().build();
		}
    }
    
    /**
     * Get specific site by Id
     * example url: daquery/ws/site/1
     * @return 200 OK			Site
     * @throws 400 Bad Request	error message
     * @throws 401 Unauthorized	
     */
    @GET
    @Path("/sites/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveNetworkByID(@PathParam("id") String id) {
    	try {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby");
		    EntityManager em = emf.createEntityManager();
		    
		    Site site = em.find(Site.class, Integer.parseInt(id));
		
		    em.close();
		   
		    logger.info("Done trying to get site: " + site.toString());
		    
		    //TODO: build some JSON into the response.  Return the new UUID
		    
		    return Response.ok().entity(site).build();
		} catch (Exception e) {
		    return Response.serverError().build();
		}
    }
}
