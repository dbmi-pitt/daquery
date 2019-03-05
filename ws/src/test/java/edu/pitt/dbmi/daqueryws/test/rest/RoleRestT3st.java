package edu.pitt.dbmi.daqueryws.test.rest;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RoleRestT3st extends DaqueryBaseTest {

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
    

    @BeforeClass
    public static void setupUsers() {
    	try {
	        createAllUsers();
	   	} catch (Exception e) {
	    		System.out.println(e.getMessage());
	        	//if there is a problem, let JUnit know
	        	assertTrue(false);
	    }
    }
    
    /**
     * Create a set of users for testing
     * @throws Exception- throw an Exception for unhandled errors
     */
    private static void createAllUsers() throws Exception {
    	createTestUser(adminUsername, adminUseremail, userpassword, "admin");
    	createTestUser(stewardUsername, stewardUseremail, userpassword, "steward");
    	createTestUser(viewerUsername, viewerUseremail, userpassword, "viewer");
    	createTestUser(aqUsername, aqUseremail, userpassword, "aggregate_querier");
    	createTestUser(dqUsername, dqUseremail, userpassword, "data_querier");
    	createTestUser(nrUsername, nrUseremail, userpassword, null);
    }

    /**
     * Create a single DaqueryUser object for use in testing scenarios.  The user will be optionally assigned a single role.
     * success: create a new DaqueryUser with at most one role
     * failure: return Assert.fail
     * @param username- the DaqueryUser realName
     * @param email- the DaqueryUser email
     * @param password- the DaqueryUser password
     * @param rolename- optional a String representing the name of the role to assign to the DaqueryUser
     * @throws Exception- throw any unhandled exceptions
     */
	private static void createTestUser(String username, String email, String password, String rolename) throws Exception
	{

		login("chb69@pitt.edu", "demouser");
		//login(DaqueryBaseTest.username, DaqueryBaseTest.password);
        //Map<String, String> user = new HashMap<>();
		JsonObject user = new JsonObject();
        user.addProperty("email", email);
        user.addProperty("password", password);
        user.addProperty("realName", username);
        user.addProperty("utype", "FULL");

        Client client = null;
		Entity<String> ent = Entity.entity(user.toString(), MediaType.APPLICATION_JSON);
		
		Builder respBuilder = null;
		String newURL = null;
		String serviceName = "users";
		try
		{
			//assertTrue("Cannot connect to server", WSConnectionUtil.checkConnection(defaultServerName, defaultPort));
			newURL = RestAssured.baseURI + ":" + RestAssured.port;
			client = WSConnectionUtil.getRemoteClient(newURL);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to connect to server: " + newURL + " Error: " + e.getMessage());
		}
		respBuilder = client.target(StringHelper.ensureTrailingSlashURL(newURL) + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON_TYPE);
		
		javax.ws.rs.core.Response resp  = respBuilder.header("Authorization", "Bearer " + currentToken).post(ent);
		
		assertTrue("Error expected status of 201, got: " 
		    + resp.getStatus() + " Request details: " + respBuilder.toString() + " Reply details: " + resp.toString(), resp.getStatus() == 201);
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
	

	/**
	 * Perform a login using the username and password parameters.
	 * @param username
	 * @param password
	 * @return- a String representing the JWT token on success
	 * @throws Exception
	 */
	private static String login(String username, String password) throws Exception
	{
		Client client = null;
		Response resp = null;
		Map<String, String> args = new HashMap<String, String>();
		args.put("email", username);
		args.put("password", password);
		//String getURL = RestAssured.baseURI + ":" + RestAssured.port +  "/daquery/ws/users/login?email=" + username + "&password=" + password;
		String getURL = WSConnectionUtil.buildGetUrl(RestAssured.baseURI + ":" + RestAssured.port, "users/login", args);
		System.out.println("In RoleRestTest:login.  URL is: " + getURL);
		try
		{
			URL url = new URL(getURL);
			System.out.println("In RoleRestTest:login.  URL is: " + url.getHost() + ", " + url.getPort());
			/*if(!WSConnectionUtil.checkConnection(url.getHost(), url.getPort()))
			{
				System.err.println("Server is not reachable for site localhost:8080.");
				System.exit(1);
			}*/

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
		currentToken = jwt.getTokenString();
		return(jwt.getTokenString());
	}	
	

	/**
	 * Return a list of all the Roles currently recognized by the Daquery system.  
	 * @return success: A list of all the Role objects found in Daquery
	 *    error: Assert.fail
	 * 
	 */
	public static List<Role> getAllRoles() {
        Client client = null;
		
		Builder respBuilder = null;
		String newURL = null;
		String serviceName = "roleaccesstest/allroles";
		try
		{
			login(DaqueryBaseTest.username, DaqueryBaseTest.password);
			assertTrue("Cannot connect to server", WSConnectionUtil.checkConnection(defaultServerName, defaultPort));
			newURL = "http://" + defaultServerName + ":" + defaultPort;
			client = WSConnectionUtil.getRemoteClient(newURL);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to connect to server: " + newURL + " Error: " + e.getMessage());
		}
		respBuilder = client.target(StringHelper.ensureTrailingSlashURL(newURL) + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON_TYPE);
		
		javax.ws.rs.core.Response resp  = respBuilder.header("Authorization", "Bearer " + currentToken).get();
		
		String jsonData = resp.readEntity(String.class);
		Gson gson = new Gson();
		Role[] arrayRoles = gson.fromJson(jsonData, Role[].class);
		List<Role> lstRoles = new ArrayList<Role>(Arrays.asList(arrayRoles));
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