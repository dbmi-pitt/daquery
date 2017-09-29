package edu.pitt.dbmi.daquery.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.util.UserRoles;

@Path("/")
public class DaqueryEndpoint
{
	@GET
	@Path("/is-site-setup")
    @Produces(MediaType.TEXT_PLAIN)
	public Response isSiteSetup()
	{
		int dbStatus = AppSetup.getDBStatus();
		if(dbStatus == AppSetup.DBSTATUS_ALL_GOOD)
			return(ResponseHelper.getBasicResponse(200, "Y"));
		else if(dbStatus == AppSetup.DBSTATUS_EMPTY)
			return(ResponseHelper.getBasicResponse(200, "N"));
		else
			return(ResponseHelper.getBasicResponse(500, "The application database is in an indeterminate state.  Check the application error logs for more information."));
	}
	
	@Secured(UserRoles.ADMIN)
    @GET
    @Path("/available-networks/{siteid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response availableNetworks(@PathParam("siteid") String id) {
    	
    	return(null);
    	
    }
	
/*	@GET
	@Path("setupSite")
	public Response setupSite
	{
		
	} */
}
