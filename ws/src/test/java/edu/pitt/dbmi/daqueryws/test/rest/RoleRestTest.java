package edu.pitt.dbmi.daqueryws.test.rest;

import static io.restassured.RestAssured.given;

import edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite;
import edu.pitt.dbmi.daqueryws.test.rest.DaqueryBaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
import edu.pitt.dbmi.daquery.dao.RoleDAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class RoleRestTest extends DaqueryBaseTest {

	private static String userpassword = "demouser";
	//append a string to the end of the user accounts to avoid overwriting existing users
	private static String roleTestString = "RoleTest";
	private static String roleTestEmailDomain = "@roletest.org";
	
	private static String adminUsername = "admin" + roleTestString;
	private static String adminUseremail = "admin" + roleTestEmailDomain;

	private static String stewardUsername = "steward" + roleTestString;
	private static String stewardUseremail = "steward" + roleTestEmailDomain;

	private static String viewerUsername = "viewer" + roleTestString;
	private static String viewerUseremail = "viewer" + roleTestEmailDomain;

	private static String aqUsername = "aggregate_querier" + roleTestString;
	private static String aqUseremail = "aggregate_querier" + roleTestEmailDomain;

	private static String dqUsername = "data_querier" + roleTestString;
	private static String dqUseremail = "data_querier" + roleTestEmailDomain;

	//got no role
	private static String nrUsername = "norole" + roleTestString;
	private static String nrUseremail = "norole" + roleTestEmailDomain;

    public static String databaseHomeDir = "/opt/apache-tomcat-6.0.53";
    
    private static List<Role> lstRoles = new ArrayList<Role>();

    @BeforeClass
    public static void setupUsers() {
    	//AppProperties.setDevHomeDir(DomainTestSuite.databaseHomeDir);
    	System.out.println("In setupUsers...");
    	String siteName = "dq-test-site";
    	int port = 8008;
    	String urlBase = "http://localhost";
    	String localSiteURL = urlBase + ":" + port;
    	String adminEmail = "dqadmin@pitt.edu";
    	String adminPassword = "temppassword";
    	String adminRealName = "Test User";
    	try {
			/*assertTrue(AppSetup.initialSetup(UUID.randomUUID().toString(), siteName, localSiteURL, adminEmail, adminPassword, adminRealName));
			if(AppSetup.isErroredSetup())
				throw new DaqueryException(AppSetup.getErrorMessage());
			else if(!AppSetup.isValidSetup())
				throw new DaqueryException("Invalid DB setup, but no error was reported.");
			*/
	        createAllUsers();
	        //RestAssured.baseURI = urlBase;
	        //RestAssured.port = port;
	   	} catch (Exception e) {
	    		System.out.println(e.getMessage());
	        	//if there is a problem, let JUnit know
	        	assertTrue(false);
	    }
    }
    
    private static void createAllUsers() throws Exception {
    	createTestUser(adminUsername, adminUseremail, userpassword, "admin");
    	createTestUser(stewardUsername, stewardUseremail, userpassword, "steward");
    	createTestUser(viewerUsername, viewerUseremail, userpassword, "viewer");
    	createTestUser(aqUsername, aqUseremail, userpassword, "aggregate_querier");
    	createTestUser(dqUsername, dqUseremail, userpassword, "data_querier");
    	createTestUser(nrUsername, nrUseremail, userpassword, null);
    }

	private static void createTestUser(String username, String email, String password, String rolename) throws Exception
	{

		login(DomainTestSuite.adminEmail, DomainTestSuite.adminPassword);
        //Map<String, String> user = new HashMap<>();
		JsonObject user = new JsonObject();
        user.addProperty("email", email);
        user.addProperty("password", password);
        user.addProperty("realName", username);
        user.addProperty("utype", "FULL");

        Client client = null;
		System.out.println("JSON for new user account: " + user.toString());
		Entity<String> ent = Entity.entity(user.toString(), MediaType.APPLICATION_JSON);
		
		Builder respBuilder = null;
		String newURL = null;
		String serviceName = "users";
		try
		{
			assertTrue("Cannot connect to server", WSConnectionUtil.checkConnection(defaultServerName, defaultPort));
			newURL = "http://" + defaultServerName + ":" + defaultPort;
			client = WSConnectionUtil.getRemoteClient(newURL);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to connect to server: " + newURL + " Error: " + e.getMessage());
		}
		respBuilder = client.target(StringHelper.ensureTrailingSlashURL(newURL) + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON_TYPE);
		
		javax.ws.rs.core.Response resp  = respBuilder.header("Authorization", "Bearer " + currentToken).post(ent);
		
		assertTrue("Error expected status of 201, got: " + resp.getStatus(), resp.getStatus() == 201);
		System.out.println("Successfully created user account: " + email);

		Gson gson = new Gson();
		DaqueryUser newUser = gson.fromJson(resp.readEntity(String.class), DaqueryUser.class);

		user.addProperty("id", newUser.getId());
		
		if (rolename != null) {
			List<Role> lstRoles = getAllRoles();
			Role currRole = null;
			for (Role r : lstRoles)
			{
				if (r.getName().equalsIgnoreCase(rolename)) {
					currRole = r;
					break;
				}
			}
			JsonObject objRole = new JsonObject();
			objRole.addProperty(currRole.getName(), new Boolean(true));

			user.add("roles",objRole);

			client = null;
			System.out.println("JSON for new user account: " + user.toString());
			ent = Entity.entity(user.toString(), MediaType.APPLICATION_JSON);
			
			respBuilder = null;
			newURL = null;
			serviceName = "users/update-role/" + newUser.getId();
			try
			{
				assertTrue("Cannot connect to server", WSConnectionUtil.checkConnection(defaultServerName, defaultPort));
				newURL = "http://" + defaultServerName + ":" + defaultPort;
				client = WSConnectionUtil.getRemoteClient(newURL);
				respBuilder = client.target(StringHelper.ensureTrailingSlashURL(newURL) + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON_TYPE);
				
				resp  = respBuilder.header("Authorization", "Bearer " + currentToken).put(ent);
				
				assertTrue("Error expected status of 200, got: " + resp.getStatus(), resp.getStatus() == 200);
				System.out.println("Successfully added role: " + rolename + " to user account: " + email);
			} catch (Exception e) {
				//any exception fails the test
				Assert.fail("Error attempting to connect to server: " + newURL + " Error: " + e.getMessage());
			}
		}
	}
	

	private static String login(String username, String password) throws Exception
	{
		Client client = null;
		Response resp = null;
		Map<String, String> args = new HashMap<String, String>();
		args.put("email", username);
		args.put("password", password);
		String getURL = WSConnectionUtil.buildGetUrl("http://"+defaultServerName + ":" + defaultPort, "users/login", args);
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
		javax.ws.rs.core.Response answer = builder.get();
		if(answer.getStatus() != 200)
		{
			System.err.println("Could not authenticate. Status:" + answer.getStatus());
			System.exit(1);
		}
		String json = answer.readEntity(String.class);
		JsonWebToken jwt = JSONHelper.gson.fromJson(json, JsonWebToken.class);
		currentToken = jwt.getToken();
		return(jwt.getToken());
	}	
	

	public static List<Role> getAllRoles() {
        Client client = null;
		
		Builder respBuilder = null;
		String newURL = null;
		String serviceName = "roleaccesstest/allroles";
		String baseURI = "localhost";
		int port = 8080;
		try
		{
			login(DomainTestSuite.adminEmail, DomainTestSuite.adminPassword);
			assertTrue("Cannot connect to server", WSConnectionUtil.checkConnection(baseURI, port));
			newURL = "http://" + baseURI + ":" + port;
			client = WSConnectionUtil.getRemoteClient(newURL);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to connect to server: " + newURL + " Error: " + e.getMessage());
		}
		respBuilder = client.target(StringHelper.ensureTrailingSlashURL(newURL) + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON_TYPE);
		
		javax.ws.rs.core.Response resp  = respBuilder.header("Authorization", "Bearer " + currentToken).get();
		
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Role>>(){}.getType();
		List<Role> lstRoles = gson.fromJson(resp.readEntity(String.class), listType);

		return lstRoles;
		
	}

	@Test
	public void adminTest() {
		try {
			login(adminUseremail, userpassword);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to login into server using admin account: " + adminUseremail + " Error: " + e.getMessage());
		}
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("roleaccesstest/admin").then().statusCode(200);
	}

	@Test
	public void aggregateTest() {
		try {
			login(aqUseremail, userpassword);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to login into server using admin account: " + adminUseremail + " Error: " + e.getMessage());
		}
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("roleaccesstest/aggregate").then().statusCode(200);
	}

	@Test
	public void dataDownloadTest() {
		try {
			login(dqUseremail, userpassword);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to login into server using admin account: " + adminUseremail + " Error: " + e.getMessage());
		}
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("roleaccesstest/datadownload").then().statusCode(200);
	}

	@Test
	public void stewardTest() {
		try {
			login(stewardUseremail, userpassword);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to login into server using admin account: " + adminUseremail + " Error: " + e.getMessage());
		}
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("roleaccesstest/steward").then().statusCode(200);
	}

	@Test
	public void viewerTest() {
		try {
			login(viewerUseremail, userpassword);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to login into server using admin account: " + adminUseremail + " Error: " + e.getMessage());
		}
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("roleaccesstest/viewer").then().statusCode(200);
	}

}