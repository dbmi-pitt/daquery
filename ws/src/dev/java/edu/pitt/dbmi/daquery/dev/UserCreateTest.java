package edu.pitt.dbmi.daquery.dev;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.JsonObject;

import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
import edu.pitt.dbmi.daqueryws.test.rest.RoleRestTest;

public class UserCreateTest
{
	public static void main(String [] args) throws Exception
	{
		RoleRestTest.createTestUser("tester3", "tester3@pitt.edu", "abc1233", "ADMIN");
		//AppProperties.setDevHomeDir("/home/devuser/dq-data");		
		//String token = login("shirey@pitt.edu", "demouser");
		//createUser(token);
	}
	
	private static String login(String username, String password) throws Exception
	{
		Client client = null;
		Response resp = null;
		Map<String, String> args = new HashMap<String, String>();
		args.put("email", "shirey@pitt.edu");
		args.put("password", "demouser");
		String getURL = WSConnectionUtil.buildGetUrl("http://localhost:8080", "users/login", args);
		try
		{
			URL url = new URL(getURL);
			if(!WSConnectionUtil.checkConnection(url.getHost(), url.getPort()))
			{
				System.err.println("Server is not reachable for site localhost:8080.");
				System.exit(1);
			}

			client = WSConnectionUtil.getRemoteClient(getURL);
		}
		catch(KeyManagementException kme)
		{
			System.err.println("Unable to contact remote site localhost:8080.  An error happened while configuring the secure key management for the site GET connection.");
			System.exit(1);
		}
		catch(MalformedURLException mue)
		{
			System.err.println("Unable to contact remote site, bad site address for site localhost:8080.  This was due to a malformed url: " + getURL);
		}

		

		Builder builder = client.target(getURL)
				.request(MediaType.APPLICATION_JSON); //.get();
		Response answer = builder.get();
		if(answer.getStatus() != 200)
		{
			System.err.println("Could not authenticate. Status:" + answer.getStatus());
			System.exit(1);
		}
		String json = answer.readEntity(String.class);
		JsonWebToken jwt = JSONHelper.gson.fromJson(json, JsonWebToken.class);
		return(jwt.getToken());
	}
	private static void createUser(String jwtToken)
	{
		//performUserLogin(DomainTestSuite.adminEmail, DomainTestSuite.adminPassword);
        //Map<String, String> user = new HashMap<>();
		/*JsonObject user = new JsonObject();
        user.addProperty("email", "tester@pitt.edu");
        user.addProperty("password", "abc123");
        user.addProperty("realName", "tester testy");
        user.addProperty("utype", "FULL");*/
		DaqueryUser user = new DaqueryUser();
		user.setEmail("tester2@pitt.edu");
		user.setPassword("abc1232");
		user.setRealName("tester tester2");
		user.setUtype("FULL");

		Client client = null;
		Entity<String> ent = Entity.entity(user.toJson(), MediaType.APPLICATION_JSON);
		
		Builder respBuilder = null;
		String newURL = null;
		String serviceName = "users";
		String baseURI = "localhost";
		int port = 8080;
		try
		{
			if(!WSConnectionUtil.checkConnection(baseURI, port))
			{
				System.err.println("Cannot connect to server");
				System.exit(1);
			}
			newURL = "http://" + baseURI + ":" + port;
			client = WSConnectionUtil.getRemoteClient(newURL);
		} catch (Exception e) {
			//any exception fails the test
			System.err.println("Error attempting to connect to server: " + newURL + " Error: " + e.getMessage());
			System.exit(1);
		}
		respBuilder = client.target(StringHelper.ensureTrailingSlashURL(newURL) + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON_TYPE);
		
		
		javax.ws.rs.core.Response resp  = respBuilder.header("Authorization", "Bearer " + jwtToken).post(ent);

		if(resp.getStatus() >= 300)
			System.err.println("Error expected status of 201, got: " + resp.getStatus());
		else
			System.out.println("Successfully created user account: ");
		
	}

}
