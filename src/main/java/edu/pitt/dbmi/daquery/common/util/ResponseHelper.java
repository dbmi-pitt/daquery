package edu.pitt.dbmi.daquery.common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;


/**
 * Methods to help with returning web service responsed related to user authentication
 */
public class ResponseHelper {
	private static Logger logger = Logger.getLogger(ResponseHelper.class.getName());
	
	public static void main(String [] args) throws Exception
	{
		/*JsonWebToken token = new JsonWebToken("USER:abc123", "SITE:abc123", null);
		String tkn = token.getToken();
		JsonWebToken jwt = new JsonWebToken(tkn);
		System.out.println(jwt.getSiteId()); */
		
		/*			Exception e = new Exception("Just a message.");
					DaqueryResponse response = new DaqueryResponse(true);
					response.setStatusEnum(ResponseStatus.ERROR);
					response.setErrorMessage(e.getMessage());
					String trace = StringHelper.stackToString(e);
					response.setStackTrace(trace);
					response.setReplyTimestamp(new Date());
					response.setRequest(new DaqueryRequest());
					//ResponseDAO.saveOrUpdate(response);
					HashMap<String, Object> vals = new HashMap<String, Object>();
					vals.put("response", response);
					ResponseHelper.getJsonResponseGen(500, vals); */		
	}
   
    /**
     * Returns a web response of 401 with a subcode of 401.2, which stands for
     * expired password.
     * 
     * @param name the user/authentication name
     * @param uriInfo the URI information from the parent ws call
     * @return A ws Response object
     */
    public static Response expiredPasswordResponse(String name, String siteUUID, String networkUUID) throws DaqueryException
    {
    	return(getTokenResponse(401, 2, name, siteUUID, networkUUID, null));
    }

    /**
     * Returns a web response of 401 with a subcode of 401.4, which stands for
     * expired token.
     * 
     * @param name the user/authentication name
     * @param uriInfo the URI information from the parent ws call
     * @return A ws Response object
     */
    public static Response expiredTokenResponse(String name, String siteUUID, String networkUUID) throws DaqueryException
    {
    	return(getTokenResponse(401, 4, name, siteUUID, networkUUID, null));
    }

    /**
     * Returns a web response of 401 with a subcode of 401.3, which stands for
     * account disabled.
     * 
     * @param name the user/authentication name
     * @param uriInfo the URI information from the parent ws call
     * @return A ws Response object
     */
    public static Response accountDisabledResponse(String name, UriInfo uriInfo) throws DaqueryException
    {
        HashMap<String, Object> vals = new HashMap<String, Object>();
        vals.put("userUUID", name);
    	return(getJsonResponse(401, 3, vals));
    }
    
    /**
     * Gets an http response with a JWT attached
     * 
     * @param responseCode the HTTP response code (usually 200)
     * @param subcode OPTIONAL A response subcode to include in the payload.  These are typically used with 401 (e.g. 401.1, 401.4)
     *                responses and typically not needed by this call.
     * @param name The username or site name that the JWT will be generated against.
     * @param uriInfo The web service URI information for the call that this is being sent in response to.
     * @param OPTIONAL additionalReturnValues Additional parameters/values in a Map<String, Object> to return in the json payload.
     * 
     * @return
     * 
     * @throws DaqueryException
     */
    public static Response getTokenResponse(int responseCode, Integer subcode, String userId, String siteUUID, String networkUUID, Map<String, Object> additionalReturnValues) throws DaqueryException
    {
        // Issue a token for the user
        JsonWebToken token = new JsonWebToken(userId, siteUUID, networkUUID);
        HashMap<String, Object> vals = new HashMap<String, Object>();
        vals.put("token", token.getToken());
        if(additionalReturnValues != null)
        	vals.putAll(additionalReturnValues);
        
        return(getJsonResponse(responseCode, subcode, vals));
    }
	
    /**
     * Given an HTTP status code, a subcode and a list (map) of key value pairs,
     * construct a web response object with a json payload.
     * 
     * @param responseCode The HTTP status code for this response.
     * @param subCode OPTIONAL: An integer specifying a subcode that will be tacked onto the
     * 				  main code and returned in the json payload under "subcode".
     * @param additionalResponseValues OPTIONAL: Any additional objects whose data will be included in the json payload.
     *                                 valid object types are DaqueryObject, List<DaqueryObject> or Map<String, Object)
     *                                 where the String/Object types on map are attribute name/data (toString, used)
     *                                 
     * @return A web service response object.
     */
    public static Response getJsonResponse(int responseCode, Integer subCode, HashMap<String, Object> additionalResponseValues) throws DaqueryException
    {
    	if(subCode == null && additionalResponseValues == null)
    	{
    		return Response.status(responseCode).build();
    	}

    	HashMap<String, Object> jsonResponses = new HashMap<String, Object>();

        if(subCode != null)
        	jsonResponses.put("subcode", Integer.toString(responseCode) + "." + subCode);
        
        if(additionalResponseValues != null)
        {
        	jsonResponses.putAll(additionalResponseValues);
        }
        
        return(getJsonResponseGen(responseCode, jsonResponses));
   	
    }

    /**
     * Convert information about an error message into a json formated response with specific error information included.
     * 
     * @param responseCode The HTML error response code- should be in the 400-599 range, but is not checked
     * @param message A short, human readable message. REQUIRED
     * @param longMessage A more descriptive message.  OPTIONAL
     * @param cause The root cause of the problem OPTIONAL
     * 
     * @return A web response with the error information encoded as json
     */
    public static Response getErrorResponse(int responseCode, String message, String longMessage, Throwable cause)
    {
    	return(getErrorResponse(responseCode, message, longMessage,cause, null));
    }
    
    /**
     * Convert information about an error message into a json formated response with specific error information included.
     * 
     * @param responseCode The HTML error response code- should be in the 400-599 range, but is not checked
     * @param message A short, human readable message. REQUIRED
     * @param longMessage A more descriptive message.  OPTIONAL
     * @param cause The root cause of the problem OPTIONAL
     * @param response A DaqueryResponse generated in error from a request with a DaqueryRequest.  THis is only generated in
     *        the rare case that an unforseen exception is thrown when generating a request.  The response info will be needed
     *        in addition to the error information.
     * 
     * @return A web response with the error information encoded as json
     */    
    public static Response getErrorResponse(int responseCode, String message, String longMessage, Throwable cause, DaqueryResponse response)
    {
    	String msg = null;
    	ErrorInfo eInfo = null;
    	try
    	{
    		msg = message;
	    	if(msg == null)
	    	{
	    		msg = "Unexplained error recieved.";
	    		DaqueryException ex;
	    		if(cause == null)
	    			ex = new DaqueryException(msg);
	    		else
	    			ex = new DaqueryException(msg, cause);
	    		throw ex;
	    	}
    	}
    	catch(DaqueryException e)
    	{
    		eInfo = new ErrorInfo(msg, longMessage, e);
    	}
    	
    	try
    	{
    		if(eInfo == null)
    			eInfo = new ErrorInfo(msg, longMessage, cause);
    		if(response != null)
    			eInfo.setResponse(response);
    		
    		return(getJsonResponseGen(responseCode, eInfo));
    	}
    	catch(Throwable t)
    	{
    		logger.log(Level.SEVERE, "Unexplained error while trying to send an error message.", t);
    		if(eInfo != null && ! StringHelper.isBlank(eInfo.getStackTrace()))
    			logger.log(Level.SEVERE, eInfo.getStackTrace());
    		else if(cause != null)
    			logger.log(Level.SEVERE, "Original Cause:", cause);
    		return(getBasicResponse(500, "Unexplained error while trying to send another error message.  Please ask a site admin to check the site logs for more information."));
    	}
    	
    }
    
    /**
     * Given an HTTP status code and extra information for a json response,
     * construct a web response object with a json payload.
     * 
     * @param responseCode The HTTP status code for this response.
     * @param additionalResponseValues OPTIONAL: Any additional objects whose data will be included in the json payload.
     *                                 valid object types are DaqueryObject, List<DaqueryObject> or Map<String, Object)
     *                                 where the String/Object types on map are attribute name/data (toString, used)
     *                                 
     * @return A web service response object.
     */    
    public static Response getJsonResponseGen(int responseCode, Object additionalResponseValues) throws DaqueryException
    {
        String returnedJSON = JSONHelper.toJSON(additionalResponseValues);
        
        return Response.status(responseCode).entity(returnedJSON).build(); 
    }
    public static Response getBasicResponse(int responseCode, String message)
    {
    	return(Response.status(responseCode).type(MediaType.TEXT_PLAIN).entity(message).build());
    }
}
