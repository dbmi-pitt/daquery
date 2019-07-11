package edu.pitt.dbmi.daquery.common.domain;

import java.io.IOException;
import java.security.Key;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.auth.TokenInvalidException;
import edu.pitt.dbmi.daquery.common.domain.TokenManager.KeyedJWT;
import edu.pitt.dbmi.daquery.common.util.KeyGenerator;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.TokenException;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
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
	
	public static void main(String[] args) {
		String keyString = "password";
		Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
		JsonWebToken t = new JsonWebToken("userId", "siteId", "networkId", "tokenid", key);
		System.out.println("Full token: " + t.generateTokenString(key));
		//System.out.println("Full no netwrok token: " + t.generateClaimsStringWithoutNetwork());
		
	}
	
	/**
	 * Given a userId, siteId, networkId, tokenid, and token key generate a new Json Web token
	 * The token will have an issue timestamp of the current time and the expiration timestamp will
	 * be the current time plus the TokenManager expiration time.
	 * @param userId
	 * @param siteId
	 * @param networkId
	 * @param tokenid
	 * @param tokenkey
	 */
	public JsonWebToken(String userId, String siteId, String networkId, String tokenid, Key tokenkey)
	{
    	this.sub = userId;
    	this.iss = siteId;
    	this.net = networkId;
        Calendar date = Calendar.getInstance();
        long t=date.getTimeInMillis();
        //add thirty minutes to current time to create
        //a token that expires in 30 minutes (30 * 60 milliseconds)
        Date expiryTimestamp = new Date(t + (TokenManager.getExpirationMinutes()  * 60000));
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
	
	public String getTokenString(){return this.token;}
	
	public long getExpiration() { return exp;}
	
	public String getTokenHash() { return this.generateDataHash(); }
	
	
	
    /**
     * Validate a JWT token
     * @return - boolean indicating if the token is valid
     * @throws TokenInvalidException 
     * @throws ExpiredJwtException if the token is expired
     * ClaimJwtException if the validation of an JTW claim failed
     * MalformedJwtException if the JWT if malformed
     * SignatureException if either calculating a signature or verifying an existing signature of a JWT failed
     * UnsupportedJwtException if the JWT version is wrong or the JWT format is incorrect
     */
    public boolean validate() throws TokenInvalidException {
        // Check if it was issued by the server and if it's not expired
        // Throw an Exception if the token is invalid
    	
        return JsonWebToken.validateTokenString(this.getTokenString(), this.getSiteId(), this.getUserId());
     }	

    
    /**
     * Validate a JWT token
     * @return - boolean indicating if the token is valid
     * @throws TokenInvalidException 
     * @throws ExpiredJwtException if the token is expired
     * ClaimJwtException if the validation of an JTW claim failed
     * MalformedJwtException if the JWT if malformed
     * SignatureException if either calculating a signature or verifying an existing signature of a JWT failed
     * UnsupportedJwtException if the JWT version is wrong or the JWT format is incorrect
     */
    public static boolean validateTokenString(String tokenString, String currentSiteId, String currentUserId) throws TokenInvalidException {
        // Check if it was issued by the server and if it's not expired
        // Throw an Exception if the token is invalid
    	
        try {
        	TokenManager tm = TokenManager.getTokenManager();
        	//check if this is a valid token
        	KeyedJWT jwt = tm.getToken(tokenString);
        	Key tokenkey = jwt.getTokenKey();
        	//check the validity of the claims portion
        	Map<String, Object> claims = WSConnectionUtil.extractClaims(tokenString);
        	String extractedSub = (String)claims.get("sub");
        	String extractedIss = (String)claims.get("iss");
        	String aitTemp = (String)claims.get("iat");
	        Long extractedIat = Long.parseLong(aitTemp); 
        	String expTemp = (String)claims.get("exp");
	        Long extractedExp = Long.parseLong(expTemp);

	        if (currentSiteId != null && !currentSiteId.isEmpty()) {
		        //check the user and site against the token payload
		        if(!StringHelper.equalIgnoreCase(extractedIss, currentSiteId))
		        		throw new TokenInvalidException("The provided site id does not match the claimed site id");
	        }
	        if (currentUserId != null && !currentUserId.isEmpty()) {
		        if(!StringHelper.equalIgnoreCase(extractedSub, currentUserId))
		        		throw new TokenInvalidException("The provided user id does not match the claimed userid");
	        }
	        //check if the token is expired.
	        //NOTE: the parseClaimsJws method doesn't automatically
	        //check the "exp" attribute.  So check if it is expired 
	        Calendar date = Calendar.getInstance();
	        long now=date.getTimeInMillis();
	        long exp = (long)extractedExp;
	        if (exp < now) {
        		throw new TokenInvalidException("Token expired.");	        	
	        }
	        
	        return true;
        } catch (TokenException tokenException) {
        	throw new TokenInvalidException("Token exception.", tokenException);
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
    
    
    public String generateDataHash() {
        Map<String, Object> clms = new HashMap<String, Object>();
        clms.put("sub", this.sub);
        clms.put("iss", this.iss);
        clms.put("iat", this.iat);
        clms.put("exp", this.exp);
        clms.put("tokenid", this.tokenid);
        //return clms.toString().hashCode();
        return clms.toString();
    }

    public static String generateDataHash(Map<String, Object> clms) {
        Map<String, Object> retClaims = new HashMap<String, Object>();
        retClaims.put("sub", clms.get("sub"));
        retClaims.put("iss", clms.get("iss"));
        retClaims.put("iat", clms.get("iat"));
        retClaims.put("exp", clms.get("exp"));
        retClaims.put("tokenid", clms.get("tokenid"));
        //create the String of the claims, then create the hashCode.
        //return retClaims.toString().hashCode();
        return retClaims.toString();
    }
    
    public static String extractTokenId(Map<String, Object> clms) {
        return (String)clms.get("tokenid");
    }

    /**
     * Return a String representing the current token with all the token data.
     * @param tokenkey- the key for the current token
     * @return- a String representing the current token
     */
    public String generateTokenString(Key tokenkey) {
        Map<String, Object> clms = new HashMap<String, Object>();
        clms.put("sub", this.sub);
        clms.put("iss", this.iss);
        clms.put("iat", this.iat);
        clms.put("exp", this.exp);
        clms.put("tokenid", this.tokenid);
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
