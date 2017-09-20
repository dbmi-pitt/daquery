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

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


/**
 * Methods to help with returning web service responsed related to user authentication
 */
public class AuthHelper {
	private static Logger logger = Logger.getLogger(AuthHelper.class.getName());
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
        String jwtToken = Jwts.builder()
                .setSubject(uuid)
                .setIssuer(uriInfo.getAbsolutePath().toString())
                .setIssuedAt(new Date())
                .setExpiration(fifteenMinuteExpiry)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
        logger.info("#### generating token for a key : " + jwtToken + " - " + key);
        return jwtToken;

    }
    
    
    /**
     * Returns a web response of 201 with a subcode of 201.2, which stands for
     * expired password.
     * 
     * @param name the user/authentication name
     * @param uriInfo the URI information from the parent ws call
     * @return A ws Response object
     */
    public static Response expiredPasswordResponse(String name, UriInfo uriInfo)
    {
    	return(getTokenResponse(401, 2, name, uriInfo, null));
    }
    
    public static Response getTokenResponse(int responseCode, Integer subcode, String name, UriInfo uriInfo, Map<String, String> additionalReturnValues)
    {
        // Issue a token for the user
        String token = AuthHelper.issueToken(name, uriInfo);
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
     * @param additionalResponseValues OPTIONAL: Any additional key/value pairs to be sent
     *                                 in the json payload.
     * @return A web service response object.
     */
    public static Response getJsonResponse(int responseCode, Integer subCode, Map<String, Object> additionalResponseValues)
    {
    	if(subCode == null && additionalResponseValues == null)
    	{
    		return Response.status(responseCode).build();
    	}
    	
        JsonBuilderFactory jFactory = Json.createBuilderFactory(null);
        JsonObjectBuilder jsonData = jFactory.createObjectBuilder();

        if(subCode != null)
        	jsonData.add("subcode", Integer.toString(responseCode) + "." + subCode);
        
        if(additionalResponseValues != null)
        {
        	for(String key : additionalResponseValues.keySet())
        	{
        		jsonData.add(key, additionalResponseValues.get(key).toString());
        	}
        }
        
        return Response.status(responseCode).entity(jsonData.build().toString()).build();    	
    }
    
    public static Response getBasicResponse(int responseCode, String message)
    {
    	return(Response.status(responseCode).type(MediaType.TEXT_PLAIN).entity(message).build());
    }
}
