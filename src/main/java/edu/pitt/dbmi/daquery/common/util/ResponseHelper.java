package edu.pitt.dbmi.daquery.common.util;

import java.security.Key;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


/**
 * Methods to help with returning web service responsed related to user authentication
 */
public class ResponseHelper {
	private static Logger logger = Logger.getLogger(ResponseHelper.class.getName());
	
    /**
     * Create a JWT based on a user's uuid.  The JWT is set to expire in 15 minutes.
     * @param uuid- a user's uuid
     * @return a String representing the JWT for the user set to expire in 15 minutes.
     */
    public static String issueToken(String uuid, UriInfo uriInfo) {
        Key key = KeyGenerator.generateKey();
        Calendar date = Calendar.getInstance();
        long t=date.getTimeInMillis();
        //add fifteen minutes to current time to create
        //a token that expires in 15 minutes (15 * 60 milliseconds)
        Date fifteenMinuteExpiry = new Date(t + (15 * 60000));
        String issuer;
        if(uriInfo == null)
        	issuer = "local-context";
        else
        	issuer = uriInfo.getAbsolutePath().toString();
        String jwtToken = Jwts.builder()
                .setSubject(uuid)
                .setIssuer(issuer)
                .setIssuedAt(new Date())
                .setExpiration(fifteenMinuteExpiry)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
        logger.info("#### generating token for a key : " + jwtToken + " - " + key);
        return jwtToken;

    }
    
    
    /**
     * Returns a web response of 401 with a subcode of 401.2, which stands for
     * expired password.
     * 
     * @param name the user/authentication name
     * @param uriInfo the URI information from the parent ws call
     * @return A ws Response object
     */
    public static Response expiredPasswordResponse(String name, UriInfo uriInfo) throws DaqueryException
    {
    	return(getTokenResponse(401, 2, name, uriInfo, null));
    }

    /**
     * Returns a web response of 401 with a subcode of 401.4, which stands for
     * expired token.
     * 
     * @param name the user/authentication name
     * @param uriInfo the URI information from the parent ws call
     * @return A ws Response object
     */
    public static Response expiredTokenResponse(String name, UriInfo uriInfo) throws DaqueryException
    {
    	return(getTokenResponse(401, 4, name, uriInfo, null));
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
    
    public static Response getTokenResponse(int responseCode, Integer subcode, String name, UriInfo uriInfo, Map<String, Object> additionalReturnValues) throws DaqueryException
    {
        // Issue a token for the user
        String token = ResponseHelper.issueToken(name, uriInfo);
        HashMap<String, Object> vals = new HashMap<String, Object>();
        vals.put("token", token);
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
