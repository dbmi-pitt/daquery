package edu.pitt.dbmi.daquery.common.domain;

import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.crypto.spec.SecretKeySpec;

import edu.pitt.dbmi.daquery.common.auth.TokenInvalidException;
import edu.pitt.dbmi.daquery.common.util.KeyGenerator;
import edu.pitt.dbmi.daquery.common.util.TokenException;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class TokenManager {
		
	public class KeyedJWT {
		private Key token_key;
		private String userid;
		private JsonWebToken token;
		private long expDate;
		
		public KeyedJWT(Key newkey, JsonWebToken newtoken) {
			this.token_key = newkey;
			this.token = newtoken;
			this.expDate = newtoken.getExpiration();
		}

		public Key getTokenKey() {
			return token_key;
		}

		public void setTokenKey(Key token_key) {
			this.token_key = token_key;
		}

		public JsonWebToken getToken() {
			return token;
		}

		public void setToken(JsonWebToken token) {
			this.token = token;
		}
		
		public long getExpirationDate() {
			return expDate;
		}
		
		public void setExpirationDate(long newdate) {
			this.expDate = newdate;
		}
	}
	
	private static TokenManager manager = null;
	private HashMap<String, KeyedJWT>tokenTable = null;
	private static int expirationMinutes = 15;
	
	private TokenManager() {
		tokenTable = new HashMap<String, KeyedJWT>();
	}
	
	public static TokenManager getTokenManager() {
		if (manager == null) {
			manager = new TokenManager();
		}
		manager.validateCurrentTokens();
		return manager;		
	}

	public static int getExpirationMinutes() {
		return expirationMinutes;
	}
	
	public static void setExpirationMinutes(int newminutes) {
		expirationMinutes = newminutes;
	}
	
	/**
	 * Loop through the list of tokens and delete any expired tokens
	 */
	public void validateCurrentTokens() {
		List<String> invalidTokenIds = new ArrayList<String>();
		if (tokenTable == null) {
			return;
		}
		for (KeyedJWT kj : tokenTable.values() ) {
			String tokenid = kj.getToken().getTokenId();
			long exp = kj.getExpirationDate();
	        Calendar date = Calendar.getInstance();
	        long t=date.getTimeInMillis();
	        //the expcutoff represents the current time, plus a delta of one minute 
	        long expcutoff = t + (60000);
	        if (exp < expcutoff) {
	        	invalidTokenIds.add(tokenid);
	        	//System.out.println("Gonna delete this token with expdate of " + exp + " because it is now " + expcutoff);
	        }

		}
		for (String tokenid : invalidTokenIds) {
			try {
				deleteToken(tokenid);
			} catch (TokenException e) {
				e.printStackTrace();
			}
		}
	}
	
	private String addToken(JsonWebToken token) throws TokenException {
		String tokenid = generateTokenId();
		Key token_key = generateTokenKey();
		KeyedJWT keyjwt = manager.new KeyedJWT(token_key, token);
		addToken(tokenid, keyjwt);
		return tokenid;
	}
	
	public String addToken(String userUuid, String siteUUID, String networkUUID) throws IOException, JsonMappingException, TokenException, TokenInvalidException, JsonParseException {
		Key token_key = generateTokenKey();
		String tokenid = generateTokenId();
		JsonWebToken jwt = new JsonWebToken(userUuid, siteUUID, networkUUID, tokenid, token_key);
		KeyedJWT keyjwt = manager.new KeyedJWT(token_key, jwt);
		addToken(tokenid, keyjwt);
		return tokenid;
	}

	private void addToken(String tokenid, JsonWebToken token) throws TokenException {
		Key token_key = generateTokenKey();
		KeyedJWT keyjwt = manager.new KeyedJWT(token_key, token);
		addToken(tokenid, keyjwt);		
	}
		
	public void addToken(String tokenid, KeyedJWT new_keyjwt) throws TokenException {
		if (tokenTable.containsKey(tokenid)) {
			throw new TokenException("Duplicate token found.  Tokenid " + tokenid + " already exists in token table.");
		}
		tokenTable.put(tokenid, new_keyjwt);		
	}
	
	public void deleteToken(String tokenid) throws TokenException {
		KeyedJWT retToken = tokenTable.remove(tokenid);
		if (retToken == null) {
			throw new TokenException("No token found.  Cannot delete tokenid " + tokenid + " not found in token table.");						
		}
	}
	
	public KeyedJWT getToken(String tokenid) throws TokenException {
		KeyedJWT retToken = tokenTable.get(tokenid);
		if (retToken == null) {
			//no Tolkien found
			throw new TokenException("No token found.  Tokenid " + tokenid + " not found in token table.");			
		}	
		return retToken;
	}
	
	private static String generateTokenId() {
		String retString = UUID.randomUUID().toString();
		return retString;
	}

    public static Key generateTokenKey(String keyString) {
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
        return key;
    }
	
    public static Key generateTokenKey() {
    	String keyString = UUID.randomUUID().toString();
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
        return key;
    }
    
    /**
     * Create a JWT based on a user's uuid.  The JWT is set to expire in 15 minutes.
     * @param uuid- a user's uuid
     * @return a String representing the JWT for the user set to expire in 15 minutes.
     */
    private static String issueToken_OLD(String userUuid, String siteUUID, String networkUUID, Key newkey) {
    	String sub = userUuid;
    	String iss = siteUUID;
    	String net = networkUUID;
        Calendar date = Calendar.getInstance();
        long t=date.getTimeInMillis();

        TokenManager tm = TokenManager.getTokenManager();
        //Date expiry = new Date(t + (tm.getExpirationMinutes() * 60000));
        Claims c;
        Date now = new Date();
        long iat = now.getTime();
        long exp = t + (tm.getExpirationMinutes() * 60000);
        Date expiry = new Date(exp);
        Map<String, Object> clms = new HashMap<String, Object>();
        clms.put("sub", userUuid);
        clms.put("iss", siteUUID);
        //clms.put("tokenid", tokenid);
        clms.put("iat", new Date());
        clms.put("exp", exp);
        if(! StringHelper.isEmpty(networkUUID))
        	clms.put("net", networkUUID);
        JwtBuilder builder = Jwts.builder().setClaims(clms);
        builder.setExpiration(expiry);
        String jwtToken = builder.signWith(SignatureAlgorithm.HS512, newkey).compact();
        return jwtToken;
    }    

	
}
