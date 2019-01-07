package edu.pitt.dbmi.daquery.common.domain;

import java.io.IOException;
import java.security.Key;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.auth.TokenInvalidException;
import edu.pitt.dbmi.daquery.common.util.KeyGenerator;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;


/**
 * A wrapper to handle Json Web Tokens (jwt).
 * 
 * @author devuser
 *
 */
public class JsonWebToken extends DaqueryObject
{
	private static final long serialVersionUID = 89483934534534l;
	
	@Deprecated
	public JsonWebToken(){}
	
	/**
	 * Constructor to create from a token and validate. Given an existing token, the token will be decoded
	 * and parsed.  The JWT fields will be set in the instance based on the parsed results.
	 * 
	 * After it is parsed the token will be validated.  If the token is invalid an exception will be thrown.
	 */
	@Deprecated
	public JsonWebToken(String token) throws JsonParseException, IOException, TokenInvalidException
	{
		this(token, true);
	}
	
	/**
	 * Constructor to create from a token and validate. Given an existing token, the token will be decoded
	 * and parsed.  The JWT fields will be set in the instance based on the parsed results.
	 * 
	 * After it is parsed the token will be validated if validate is set to true, otherwise it will not be validated.
	 * If the token is validated and found to be invalid an exception will be thrown.
	 */

	@Deprecated
	public JsonWebToken(String token, boolean validate) throws IOException, JsonMappingException, JsonParseException, TokenInvalidException
	{
		if(token != null && token.toUpperCase().trim().startsWith("BEARER"))
			this.token = token.trim().substring(6).trim();
		else
			this.token = token.trim();
		String [] tokenParts = token.split("\\.");
		String middle = tokenParts[1];
		String json = StringUtils.newStringUtf8(Base64.decodeBase64(middle.getBytes()));		
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<JsonWebToken> type = new TypeReference<JsonWebToken>(){};
		JsonWebToken jwt = mapper.readValue(json, type);
		this.sub = jwt.sub;
		this.iss = jwt.iss;
		this.iat = jwt.iat;
		this.exp = jwt.exp;
		this.net = jwt.net;
		this.tokenid = jwt.tokenid;
		if(validate)
		{
			validate();
		}
	}

	/**
	 * Constructor to create from a token and validate. Given an existing token, the token will be decoded
	 * and parsed.  The JWT fields will be set in the instance based on the parsed results.
	 * 
	 * After it is parsed the token will be validated if validate is set to true, otherwise it will not be validated.
	 * If the token is validated and found to be invalid an exception will be thrown.
	 */

	public JsonWebToken(String token, Key tokenkey, boolean validate) throws IOException, JsonMappingException, JsonParseException, TokenInvalidException
	{
		if(token != null && token.toUpperCase().trim().startsWith("BEARER"))
			this.token = token.trim().substring(6).trim();
		else
			this.token = token.trim();
		String [] tokenParts = token.split("\\.");
		String middle = tokenParts[1];
		String json = StringUtils.newStringUtf8(Base64.decodeBase64(middle.getBytes()));		
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<JsonWebToken> type = new TypeReference<JsonWebToken>(){};
		JsonWebToken jwt = mapper.readValue(json, type);
		this.sub = jwt.sub;
		this.iss = jwt.iss;
		this.iat = jwt.iat;
		this.exp = jwt.exp;
		this.net = jwt.net;
		this.tokenid = jwt.tokenid;
		if(validate)
		{
			validate(tokenkey);
		}
	}

	/**
	 * Constructor to create a new JWT from a userId, siteId and networkId.  The networkId is optional.
	 * This issues the token (retrieved with getToken).
	 */
	@Deprecated
	public JsonWebToken(String userId, String siteId, String networkId)
	{
		this.token = issueToken(userId, siteId, networkId);
	}

	public JsonWebToken(String userId, String siteId, String networkId, String tokenid, Key tokenkey)
	{
    	this.sub = userId;
    	this.iss = siteId;
    	this.net = networkId;
        Calendar date = Calendar.getInstance();
        long t=date.getTimeInMillis();
        //add thirty minutes to current time to create
        //a token that expires in 30 minutes (30 * 60 milliseconds)
        Date expiryTimestamp = new Date(t + ((TokenManager.getExpirationMinutes() +1) * 60000));
        Date now = new Date();
        this.iat = now.getTime();
        this.exp = expiryTimestamp.getTime();
        this.tokenid = tokenid;
		this.token = generateTokenString(tokenkey);
	}

	@Expose
	private String token;
	
	//subject- user name or user UUID
	@Expose
	public String sub;
	
	//issuer- issuing site UUID
	@Expose
	public String iss;
	
	@Expose
	public long iat;
	
	@Expose
	public long exp;
	
	@Expose
	public String net;
	
	@Expose 
	public String tokenid;
	
	public String getUserId(){return(sub);}
	public void setUserId(String userUUID){sub = userUUID;}
	
	public String getSiteId(){return(iss);}
	public void setSiteId(String siteUUID){iss = siteUUID;}
	
	public String getNetworkId(){return(net);}
	public void setNetworkId(String networkUUID){net = networkUUID;}
	
	public String getTokenId(){return(tokenid);}
	public void setTokenId(String newTokenId) {tokenid = newTokenId;}
	
	public String getToken(){return(token);}
	
	public long getExpiration() { return exp;}
	
	
	
    /**
     * Validate a JWT token
     * @param JWT token
     * @return - the UUID extracted from the token
     * @throws TokenInvalidException 
     * @throws ExpiredJwtException if the token is expired
     * ClaimJwtException if the validation of an JTW claim failed
     * MalformedJwtException if the JWT if malformed
     * SignatureException if either calculating a signature or verifying an existing signature of a JWT failed
     * UnsupportedJwtException if the JWT version is wrong or the JWT format is incorrect
     */
	@Deprecated
    public boolean validate() throws TokenInvalidException {
        // Check if it was issued by the server and if it's not expired
        // Throw an Exception if the token is invalid
    	
    	//TODO: Replace this with a call to a key manager to get the key for this token
    	KeyGenerator kg = new KeyGenerator();
        Key key = kg.generateKey();
        try {
        	//check the validity of the signed portion
	        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
	        
	        //check the user and site against the token payload
	        if(!StringHelper.equalIgnoreCase(claims.getIssuer(), getSiteId()))
	        		throw new TokenInvalidException("The provided site id does not match the claimed site id");

	        if(!StringHelper.equalIgnoreCase(claims.getSubject(), getUserId()))
	        		throw new TokenInvalidException("The provided user id does not match the claimed userid");

	        return true;
        } catch (ExpiredJwtException expired) {
        	throw new TokenInvalidException("Token expired.", expired);
	    } catch (ClaimJwtException claim) {
	    	throw new TokenInvalidException("Invalid token", claim);
	    } catch (MalformedJwtException malformed) {
	    	throw new TokenInvalidException("Malformed token", malformed);
	    } catch (SignatureException sig) {
	    	throw new TokenInvalidException("Invalid token signature", sig);
	    } catch (UnsupportedJwtException unsupported) {
	    	throw new TokenInvalidException("Unsupported token format", unsupported);
	    }
     }	

    /**
     * Validate a JWT token
     * @param JWT token
     * @return - boolean indicating if the token is valid
     * @throws TokenInvalidException 
     * @throws ExpiredJwtException if the token is expired
     * ClaimJwtException if the validation of an JTW claim failed
     * MalformedJwtException if the JWT if malformed
     * SignatureException if either calculating a signature or verifying an existing signature of a JWT failed
     * UnsupportedJwtException if the JWT version is wrong or the JWT format is incorrect
     */
    public boolean validate(Key tokenkey) throws TokenInvalidException {
        // Check if it was issued by the server and if it's not expired
        // Throw an Exception if the token is invalid
    	
        try {
        	//check the validity of the signed portion
	        Claims claims = Jwts.parser().setSigningKey(tokenkey).parseClaimsJws(token).getBody();
	        //check the user and site against the token payload
	        if(!StringHelper.equalIgnoreCase(claims.getIssuer(), getSiteId()))
	        		throw new TokenInvalidException("The provided site id does not match the claimed site id");

	        if(!StringHelper.equalIgnoreCase(claims.getSubject(), getUserId()))
	        		throw new TokenInvalidException("The provided user id does not match the claimed userid");

	        //check if the token is expired.
	        //NOTE: the parseClaimsJws method doesn't automatically
	        //check the "exp" attribute.  So check if it is expired 
	        Calendar date = Calendar.getInstance();
	        long now=date.getTimeInMillis();
	        long exp = (long)claims.get("exp");
	        if (exp < now) {
        		throw new TokenInvalidException("Token expired.");	        	
	        }
	        
	        return true;
        } catch (ExpiredJwtException expired) {
        	throw new TokenInvalidException("Token expired.", expired);
	    } catch (ClaimJwtException claim) {
	    	throw new TokenInvalidException("Invalid token", claim);
	    } catch (MalformedJwtException malformed) {
	    	throw new TokenInvalidException("Malformed token", malformed);
	    } catch (SignatureException sig) {
	    	throw new TokenInvalidException("Invalid token signature", sig);
	    } catch (UnsupportedJwtException unsupported) {
	    	throw new TokenInvalidException("Unsupported token format", unsupported);
	    }
     }	
    
    
    /**
     * Create a JWT based on a user's uuid.  The JWT is set to expire in 15 minutes.
     * @param uuid- a user's uuid
     * @return a String representing the JWT for the user set to expire in 15 minutes.
     */
    @Deprecated
    private String issueToken(String userUuid, String siteUUID, String networkUUID) {
    	this.sub = userUuid;
    	this.iss = siteUUID;
    	this.net = networkUUID;
        Key key = KeyGenerator.generateKey();
        Calendar date = Calendar.getInstance();
        long t=date.getTimeInMillis();
        //add thirty minutes to current time to create
        //a token that expires in 30 minutes (30 * 60 milliseconds)
        Date fifteenMinuteExpiry = new Date(t + (30 * 60000));
        Claims c;
        Date now = new Date();
        this.iat = now.getTime();
        this.exp = fifteenMinuteExpiry.getTime();
        Map<String, Object> clms = new HashMap<String, Object>();
        clms.put("sub", userUuid);
        clms.put("iss", siteUUID);
        clms.put("iat", new Date());
        clms.put("exp", fifteenMinuteExpiry);
        if(! StringHelper.isEmpty(networkUUID))
        	clms.put("net", networkUUID);
        JwtBuilder builder = Jwts.builder().setClaims(clms);        
        String jwtToken = builder.signWith(SignatureAlgorithm.HS512, key).compact();
        return jwtToken;
    }

    
    public String generateTokenString(Key tokenkey) {
        Map<String, Object> clms = new HashMap<String, Object>();
        clms.put("sub", this.sub);
        clms.put("iss", this.iss);
        clms.put("iat", this.iat);
        clms.put("exp", this.exp);
        clms.put("tokenid", this.tokenid);
        if(! StringHelper.isEmpty(this.net))
        	clms.put("net", this.net);
        JwtBuilder builder = Jwts.builder().setClaims(clms);        
        String jwtToken = builder.signWith(SignatureAlgorithm.HS512, tokenkey).compact();
        return jwtToken;
    }
    
	@Override
	public String toString() {
		return "JsonWebToken [token=" + token + ", sub=" + sub + ", iss=" + iss + ", iat=" + iat + ", exp=" + exp
				+ ", net=" + net + ", tokenid=" + tokenid + "]";
	}    

    
}
