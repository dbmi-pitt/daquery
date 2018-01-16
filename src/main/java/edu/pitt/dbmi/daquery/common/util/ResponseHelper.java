package edu.pitt.dbmi.daquery.common.util;

import java.security.Key;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
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
    public static String issueToken(String userUuid, String siteUUID) {
        Key key = KeyGenerator.generateKey();
        Calendar date = Calendar.getInstance();
        long t=date.getTimeInMillis();
        //add thirty minutes to current time to create
        //a token that expires in 30 minutes (30 * 60 milliseconds)
        Date fifteenMinuteExpiry = new Date(t + (30 * 60000));
        String jwtToken = Jwts.builder()
                .setSubject(userUuid)
                .setIssuer(siteUUID)
                .setIssuedAt(new Date())
                .setExpiration(fifteenMinuteExpiry)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
        logger.info("#### generating token for a key : " + jwtToken + " - " + key);
        return jwtToken;

    }
    
    public static Jws<Claims> parseToken(String jwtToken)
    {
    	String token = jwtToken.trim();
    	if(token.toUpperCase().startsWith("BEARER"))
    		token = token.substring(6).trim();
		Jws<Claims> claims = Jwts.parser().setSigningKey(KeyGenerator.generateKey())
		.parseClaimsJws(token);
	    return(claims);
    }
    
    /**
     * Returns a web response of 401 with a subcode of 401.2, which stands for
     * expired password.
     * 
     * @param name the user/authentication name
     * @param uriInfo the URI information from the parent ws call
     * @return A ws Response object
     */
    public static Response expiredPasswordResponse(String name, String siteUUID) throws DaqueryException
    {
    	return(getTokenResponse(401, 2, name, siteUUID, null));
    }

    /**
     * Returns a web response of 401 with a subcode of 401.4, which stands for
     * expired token.
     * 
     * @param name the user/authentication name
     * @param uriInfo the URI information from the parent ws call
     * @return A ws Response object
     */
    public static Response expiredTokenResponse(String name, String siteUUID) throws DaqueryException
    {
    	return(getTokenResponse(401, 4, name, siteUUID, null));
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
    public static Response getTokenResponse(int responseCode, Integer subcode, String name, String siteUUID, Map<String, Object> additionalReturnValues) throws DaqueryException
    {
        // Issue a token for the user
        String token = ResponseHelper.issueToken(name, siteUUID);
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
