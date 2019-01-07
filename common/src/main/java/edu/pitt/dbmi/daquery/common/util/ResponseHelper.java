package edu.pitt.dbmi.daquery.common.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.pitt.dbmi.daquery.common.domain.DecodedErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.TokenManager;
import edu.pitt.dbmi.daquery.common.domain.TokenManager.KeyedJWT;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;


/**
 * Methods to help with returning web service responsed related to user authentication
 */
public class ResponseHelper {
	private static Logger logger = Logger.getLogger(ResponseHelper.class.getName());
	
	public static void main(String [] args) throws Exception
	{
		Response resp = getBasicResponse(444, null);
		DecodedErrorInfo ei = decodeErrorResponse(resp);
		System.out.println(ei.getErrorInfo());
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
    	HashMap<String, Object> map = new HashMap<>();
    	map.put("UserId", name);
    	//return(getTokenResponse(401, 2, name, siteUUID, networkUUID, map));
    	return getJsonResponse(401, 2, map);
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
    	try {
	        // Issue a token for the user
	    	TokenManager tm = TokenManager.getTokenManager();
	    	String token = tm.addToken(userId, siteUUID, networkUUID);
	        //JsonWebToken token = new JsonWebToken(userId, siteUUID, networkUUID);
	        HashMap<String, Object> vals = new HashMap<String, Object>();
	        vals.put("token", token);
	        if(additionalReturnValues != null)
	        	vals.putAll(additionalReturnValues);
	        
	        return(getJsonResponse(responseCode, subcode, vals));
    	} catch(Exception e)
		{
			logger.log(Level.SEVERE, String.format("Error occured while creating token for user %s, network %s, site %s\nError message:%s\n", userId, networkUUID, siteUUID, e.getMessage()));
			return(getBasicResponse(500, "Error occured while creating a token.  Check the site logs for more information."));
		}

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
     * Given a response that comes from a server, check to see if it is an error and
     * wrap it in another ErrorResponse, otherwise just return the response from the server.
     * This only works on incoming responses, which are converted to outgoing responses
     * in the case that ErrorInfo is found encoded within the response.
     *  
     * @param resp
     * @return
     */
    public static Response wrapServerResponse(Response resp, String serverName)
    {
    	if(resp == null) return(null);
    	if(resp.getStatus() >= 400)
    	{
    		DecodedErrorInfo decodedInfo = decodeErrorResponse(resp);
    		if(decodedInfo != null && decodedInfo.getErrorInfo() != null)
    		{
    			ErrorInfo info = decodedInfo.getErrorInfo();
    			String msg = info.getDisplayMessage();
    			String longMsg = null;
    			if(StringHelper.isEmpty(msg))
    			{
    				msg = "An error was recieved from " + serverName;
    				longMsg = info.getLongMessage();
    			}
    			else
    				longMsg = "This error was recieved from " + serverName +"<\br><\br> " + ((StringHelper.isEmpty(info.getLongMessage()))?"":info.getLongMessage());
    			info.setDisplayMessage(msg);
    			info.setLongMessage(longMsg);
    			
    			try{return(getJsonResponseGen(resp.getStatus(), info));}
    			catch(Throwable t)
    			{
    				logger.log(Level.SEVERE, "Error occured while transmiting an error from " + serverName + ".\n\tmessage:" + info.displayMessage + "\n\tlongMessage:" + info.longMessage + "\n\tstackTrace:" + info.stackTrace + "\n", t);
    				return(getBasicResponse(500, "Error occured while transmiting an error from " + serverName + ".  Check the site logs for more information."));
    			}
    		}
    		else if(decodedInfo != null && decodedInfo.getErrorMessage() != null)
    		{
    			return(getErrorResponse(500, "An unknown error occured on server " + serverName, "Error Information:" + decodedInfo.getErrorMessage(), null));
    		}
    		else
    			return(resp);
    	}
    	else
    		return(resp);
    }
    
    
    /**
     * Check the response to see if it contains a json encoded ErrorInfo, if
     * so decode it and send back an ErrorInfo object.  If it isn't an encoded
     * Error response return null;
     * 
     * @param resp
     * @return
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     */
    public static DecodedErrorInfo decodeErrorResponse(Response resp)
    {
    	try
    	{
	    	if(resp == null) return(null);
	    	String val = null;
    		if(resp instanceof OutboundJaxrsResponse)
    		{
    			OutboundJaxrsResponse outResp = (OutboundJaxrsResponse) resp;
    			Object ent = outResp.getEntity();
    			if(ent != null) val = ent.toString();
    		}	    	
    		else
    		{
    			//val = "ResponseStatus:" + resp.getStatus() + " " + resp.readEntity(String.class);
    			val = resp.readEntity(String.class);
    		}
	    	if(StringHelper.isEmpty(val)) return(null);
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<ErrorInfo> type = new TypeReference<ErrorInfo>(){};
			ErrorInfo errorInfo = null;
			try{errorInfo = mapper.readValue(val, type);}
			catch(JsonParseException jpe)
			{
				DecodedErrorInfo dei = new DecodedErrorInfo(new ErrorInfo(), val);
				dei.getErrorInfo().setDisplayMessage(val);
				return(dei);
			}
			catch(JsonMappingException jpe)
			{
				DecodedErrorInfo dei = new DecodedErrorInfo(new ErrorInfo(), val);
				dei.getErrorInfo().setDisplayMessage(val);
				return(dei);
			}			
			catch(IOException jpe)
			{
				DecodedErrorInfo dei = new DecodedErrorInfo(new ErrorInfo(), val);
				dei.getErrorInfo().setDisplayMessage(val);
				return(dei);
			}			
			if(errorInfo == null || StringHelper.isEmpty(errorInfo.type))
			{
				DecodedErrorInfo dei = new DecodedErrorInfo(new ErrorInfo(), val);
				dei.getErrorInfo().setDisplayMessage(val);
				return(dei);
			}				
			if(errorInfo.type.equals(ErrorInfo.ERROR_INFO_TYPE_VERSION))
				return(new DecodedErrorInfo(errorInfo, null));
			else
			{
				if(val != null)
				{
					return(new DecodedErrorInfo(null, val));
				}
				else
					return(null);
			}
    	}
    	catch(Throwable t)
    	{
    		//if were here, probably an outbound message was provided, which is a no-no
    		return(null);
    	}
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

		if(! StringHelper.isEmpty(message))
			msg = message;
		else
			msg = "";    	

		if(cause != null && cause instanceof DaqueryErrorException)
    	{
    		DaqueryErrorException ex = (DaqueryErrorException) cause;
   			eInfo = ex.getErrorInfo();
   			if(eInfo != null)
   			{
   				if(! StringHelper.isEmpty(eInfo.getDisplayMessage()))
   					msg = eInfo.getDisplayMessage() + " : " + msg;
   				else if(! StringHelper.isEmpty(eInfo.getLongMessage()))
   					msg = msg + " : " + eInfo.getLongMessage();
   			}
   			
    	}
    	else if(cause != null && StringHelper.isEmpty(message))
    	{
    		msg = cause.getMessage();
    	}
		
    	try
    	{
	    	if(StringHelper.isEmpty(msg) && eInfo == null)
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
    	String returnedJSON = null;
    	if(additionalResponseValues instanceof String)
    		returnedJSON = (String) additionalResponseValues;
    	else
    		returnedJSON = JSONHelper.toJSON(additionalResponseValues);
        
        return Response.status(responseCode).entity(returnedJSON).build(); 
    }
    public static Response getBasicResponse(int responseCode, String message)
    {
    	return(Response.status(responseCode).type(MediaType.TEXT_PLAIN).entity(message).build());
    }
    
    /**
     * Get the last "caused by exception" in an exception
     */
    public static Throwable getRootCause(Throwable t)
    {
    	Throwable cause = t;
    	while(cause.getCause() != null)
    		cause = cause.getCause();
    	return(cause);
    }
}
