package edu.pitt.dbmi.daquery.rest;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.filter.JWTTokenNeeded;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@Path("/echo")
@Produces(TEXT_PLAIN)
public class EchoEndpoint {

    // ======================================
    // =          Injection Points          =
    // ======================================


    // ======================================
    // =          Business methods          =
    // ======================================

    @GET
    public Response echo(@QueryParam("message") String message) {
        return Response.ok().entity(message == null ? "no message" : message).build();
    }

    @GET
    @Path("jwt")
    @JWTTokenNeeded
    public Response echoWithJWTToken(@QueryParam("message") String message) {
        return Response.ok().entity(message == null ? "no message" : message).build();
    }
}
