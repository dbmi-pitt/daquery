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
	
	public synchronized static TokenManager getTokenManager() {
		if (manager == null) {
			manager = new TokenManager();
		}
		manager.clearExpiredTokens();
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
	private void clearExpiredTokens() {
		List<String> invalidTokens = new ArrayList<String>();
		if (tokenTable == null) {
			return;
		}
		for (KeyedJWT kj : tokenTable.values() ) {
			Key tokenkey = kj.getTokenKey();
			String token = kj.getToken().generateTokenString(tokenkey);
			long exp = kj.getExpirationDate();
	        Calendar date = Calendar.getInstance();
	        long t=date.getTimeInMillis();
	        //the expcutoff represents the current time, plus a delta of one minute 
	        long expcutoff = t + (60000);
	        if (exp < expcutoff) {
	        	invalidTokens.add(token);
	        	//System.out.println("Gonna delete this token with expdate of " + exp + " because it is now " + expcutoff);
	        }

		}
		for (String token : invalidTokens) {
			try {
				deleteToken(token);
			} catch (TokenException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String addToken(String userUuid, String siteUUID, String networkUUID) throws IOException, JsonMappingException, TokenException, TokenInvalidException, JsonParseException {
		Key token_key = generateTokenKey();
		String tokenid = generateTokenId();
		JsonWebToken jwt = new JsonWebToken(userUuid, siteUUID, networkUUID, tokenid, token_key);
		KeyedJWT keyjwt = manager.new KeyedJWT(token_key, jwt);
		String tokenString = keyjwt.getToken().generateTokenString(token_key);
		addToken(tokenString, keyjwt);
		return tokenString;
	}

	public String renewToken(String oldTokenString) throws IOException, JsonMappingException, TokenException, TokenInvalidException, JsonParseException {
		KeyedJWT kj = getToken(oldTokenString);
		JsonWebToken jwt = kj.getToken();
		//call validate to extract the data from the token string
		jwt.validate();
		deleteToken(oldTokenString);		
		return addToken(jwt.getUserId(), jwt.getSiteId(), jwt.getNetworkId());
	}

	public void addToken(String tokenString, KeyedJWT new_keyjwt) throws TokenException {
		if (tokenTable.containsKey(tokenString)) {
			throw new TokenException("Duplicate token found.  Token " + tokenString + " already exists in token table.");
		}
		tokenTable.put(tokenString, new_keyjwt);		
	}
	
	public void deleteToken(String tokenString) throws TokenException {
		KeyedJWT retToken = tokenTable.remove(tokenString);
		if (retToken == null) {
			throw new TokenException("No token found.  Cannot delete token " + tokenString + " not found in token table.");						
		}
	}
	
	public KeyedJWT getToken(String tokenString) throws TokenException {
		KeyedJWT retToken = tokenTable.get(tokenString);
		if (retToken == null) {
			//no Tolkien found
			throw new TokenException("No token found.  Token " + tokenString + " not found in token table.");			
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
    
	
}
