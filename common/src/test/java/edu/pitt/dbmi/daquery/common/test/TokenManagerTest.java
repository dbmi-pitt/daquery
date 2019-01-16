package edu.pitt.dbmi.daquery.common.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

import javax.crypto.spec.SecretKeySpec;

import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import edu.pitt.dbmi.daquery.common.auth.TokenInvalidException;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.TokenManager;
import edu.pitt.dbmi.daquery.common.domain.TokenManager.KeyedJWT;
import edu.pitt.dbmi.daquery.common.util.TokenException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.BeforeClass;

public class TokenManagerTest {

	private static String userUuid = "USER123-45-678";
	private static String siteUUID = "SITE123-45-678";
	private static String networkUUID = "NETWORK123-45-678";
	private static List<String> validTokens = new ArrayList<String>();
	
	
	@BeforeClass
	/**
	 * Initialize the test class with 5 tokens
	 * This data is needed for testing the get and delete methods
	 */
	public static void setup() {
		try {
			for (int i=0; i < 5; i++) {
				TokenManager tm = TokenManager.getTokenManager();
				tm.setExpirationMinutes(1);
				String token = tm.addToken(userUuid, siteUUID, networkUUID);
				KeyedJWT jwt = tm.getToken(token);
				validTokens.add(token);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testAddToken() {
		try {
			TokenManager tm = TokenManager.getTokenManager();
			String tokenid = tm.addToken(userUuid, siteUUID, networkUUID);
			KeyedJWT jwt = tm.getToken(tokenid);
			Assert.assertNotNull("Cannot find token with tokenid = " + tokenid, jwt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = TokenException.class)
	public void testAddDuplicateToken() throws TokenInvalidException, IOException, JsonMappingException, TokenException, JsonParseException {
		TokenManager tm = TokenManager.getTokenManager();
		String tokenid = tm.addToken(userUuid, siteUUID, networkUUID);
		KeyedJWT jwt = tm.getToken(tokenid);
		tm.addToken(tokenid, jwt);
	}
	
	@Test
	public void testDeleteToken() {
		try {
			TokenManager tm = TokenManager.getTokenManager();
			String token = tm.addToken(userUuid, siteUUID, networkUUID);
			tm.deleteToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error deleting token with tokenid = " + validTokens.get(0) + ".  Error: " + e.getMessage());
		}
		
	}

	@Test(expected = TokenException.class)
	public void testDeleteInvalidToken() throws TokenException {
		TokenManager tm = TokenManager.getTokenManager();
		tm.deleteToken("badtoken");
	}

	@Test(expected = TokenException.class)
	public void testGetToken() throws TokenException {
		TokenManager tm = TokenManager.getTokenManager();
		for (int i=0;i < validTokens.size(); i++) {
			KeyedJWT jwt = tm.getToken(validTokens.get(i));
			Assert.assertNotNull("Cannot find token with tokenid = " + validTokens.get(i), jwt);
		}
	}

	@Test(expected = TokenException.class)
	public void testGetInvalidToken() throws TokenException {
		TokenManager tm = TokenManager.getTokenManager();
		tm.getToken("badtoken");
	}
	
	@Test(expected = TokenException.class)
	public void renewToken() throws TokenException {
		try {
			TokenManager tm = TokenManager.getTokenManager();
			String tokenString = validTokens.get(validTokens.size()-1);
			String newTokenString = tm.renewToken(tokenString);
			//there are two tests to run
			//1) when renewing a token, the token strings should not match
			Assert.assertTrue("Error old token " + tokenString + " is the same as the new token " + newTokenString, tokenString.compareTo(newTokenString) != 0);
			//2_ we should also throw an error if the old token is still in the manager
			tm.getToken(tokenString);
			Assert.fail("Error: the old token " + tokenString + " is still in the token manager");
		} catch (TokenException te) {
			throw new TokenException("Token not found");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error deleting token with tokenid = " + validTokens.get(0) + ".  Error: " + e.getMessage());
		}
	}
	
	@Test(expected = TokenInvalidException.class)
	public void testExpiredToken() throws TokenInvalidException, IOException, JsonMappingException, TokenException, JsonParseException {
		TokenManager tm = TokenManager.getTokenManager();
		//change the expiration to one minute
		tm.setExpirationMinutes(1);
		String tokenid = tm.addToken(userUuid, siteUUID, networkUUID);
		KeyedJWT jwt = tm.getToken(tokenid);
		Key tokenkey = jwt.getTokenKey();
		
		//just a quick-n-dirty two minute wait
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;

		while (elapsedTime < 4*60*1000) {
		    elapsedTime = (new Date()).getTime() - startTime;
		}
		
		JsonWebToken tok = jwt.getToken();
		boolean b = tok.validate();
		System.out.println("here");
	}



}
