package edu.pitt.dbmi.daquery.central.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/")
public class CentralService {

	@GET
	@Path("hello/")
	public Response getHello(@QueryParam("msg") String msg)
	{
		String say = "Hello: " + msg;
		return Response.status(200).entity(say).build();
	}
}
