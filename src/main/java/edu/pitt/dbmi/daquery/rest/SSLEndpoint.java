package edu.pitt.dbmi.daquery.rest;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.common.util.ResponseHelper;

@Path("/")
public class SSLEndpoint extends AbstractEndpoint {
	private final static Logger log = Logger.getLogger(SSLEndpoint.class.getName());

    @Context
    private UriInfo uriInfo;
	
	@GET
	@Path("/helloofficerbarbrady")
    @Produces(MediaType.TEXT_PLAIN)
	public Response helloWorld()
	{
		String retMsg = "Hello, this is Officer Barbrady.  I am partolling " + uriInfo.getPath()
		  + ".  Nothing to see here.";
		return(ResponseHelper.getBasicResponse(200, retMsg));
	}

}
