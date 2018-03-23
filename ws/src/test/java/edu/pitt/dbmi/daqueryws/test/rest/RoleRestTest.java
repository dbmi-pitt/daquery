package edu.pitt.dbmi.daqueryws.test.rest;

import static io.restassured.RestAssured.given;

import edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite;
import edu.pitt.dbmi.daqueryws.test.rest.DaqueryBaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
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

import com.google.gson.JsonObject;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
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

		performUserLogin(DomainTestSuite.adminEmail, DomainTestSuite.adminPassword);
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
		String baseURI = "localhost";
		int port = 9090;
		try
		{
			assertTrue("Cannot connect to server", WSConnectionUtil.checkConnection(baseURI, port));
			newURL = "http://" + baseURI + ":" + port;
			client = WSConnectionUtil.getRemoteClient(newURL);
		} catch (Exception e) {
			//any exception fails the test
			Assert.fail("Error attempting to connect to server: " + newURL + " Error: " + e.getMessage());
		}
		respBuilder = client.target(StringHelper.ensureTrailingSlashURL(newURL) + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON_TYPE);
		
		javax.ws.rs.core.Response resp  = respBuilder.post(ent);
		
		assertTrue("Error expected status of 201, got: " + resp.getStatus(), resp.getStatus() == 201);
		System.out.println("Successfully created user account: " + email);

/*
		Client client = null;
		Entity<String> ent = Entity.entity(email.toJson(), MediaType.APPLICATION_JSON);
		
		Builder respBuilder = null;
		String centServerURL = null;
		try
		{
			centServerURL = AppProperties.getCentralServerURL();
			URL url = new URL(centServerURL);
			        RestAssured.basePath = basePath;
        RestAssured.baseURI = baseHost;
 RestAssured.port
			if(!checkConnection(url.getHost(), url.getPort()))
					return(ResponseHelper.getErrorResponse(500, "Central server is not reachable at site " + centServerURL, "Cannot connect to " + url.getHost(), null));
			
			client = getRemoteClient(centServerURL);
		}
		catch(KeyManagementException kme)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact central server at " + centServerURL, "An error happened while configuring the secure key management for the site POST connection.", kme));
		}
		catch(MalformedURLException mue)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact central server, bad site address.  Site:" + centServerURL, "This was due to a malformed url: " + centServerURL, mue));
		}
		
		respBuilder = client.target(StringHelper.ensureTrailingSlash(centServerURL) + "daquery-central/" + serviceName).request(MediaType.APPLICATION_JSON_TYPE);
		
		Response resp  = respBuilder.post(ent);
		
		return(resp);
*/
		
		/*
        Response res = given().contentType("application/json")
			//.body(user.toJson())
        	.body(user.toString())
			.headers("Authorization", "Bearer " + currentToken)
			.headers("Accept-Encoding", "gzip, deflate")
			.headers("Accept", "application/json, text/plain")
			.log().all()
			.when().post("users/tempcreate").then()
			.log().all()
			.statusCode(201)
			.extract().response();
		System.out.println("here is the request: " + res.prettyPrint());
*/		
/*        System.out.println("in checkLogin: " + currentToken);
		DaqueryUser user = new DaqueryUser(true);
		user.setEmail(email);
		user.setRealName("Test User");
		user.setStatusEnum(UserStatus.ACTIVE);
		user.setUsername(username);
		user.setPassword(password);
		List<Role> roles = new ArrayList<Role>();
		if (rolename != null) {
			Role role1 = RoleDAO.queryRoleByName(rolename);
			roles.add(role1);
			user.setRoles(roles);
		}
		List<DaqueryUser> users = new ArrayList<DaqueryUser>();
		users.add(user);
		save(user);*/
	}
	
	private static void save(Object obj)
	{
		Session session = null;
		Transaction t = null;
		int exitCode = 0;
		try
		{
			session = HibernateConfiguration.openSession();
			t = session.beginTransaction();
			session.saveOrUpdate(obj);
			t.commit();
		}
		catch(Throwable tr)
		{
			if(t != null) t.rollback();
			System.out.println(tr.getMessage());
			tr.printStackTrace();
		}
		finally
		{
			if(session != null) session.close();
		}
	}

	public static void performUserLogin(String userEmail, String password) {
		System.out.println("in performUserLogin");
		System.out.println("in performUserLogin: " + currentToken);
        currentToken = given().pathParam("email", userEmail)
               .pathParam("password", password)
        .when().get("users/login?email={email}&password={password}")
        .then().statusCode(200)
        .extract().path("token");
		System.out.println("in performUserLogin: " + currentToken);
	}

	@Test
	public void adminTest() {
 /*   	createTestUser(adminUsername, adminUseremail, userpassword, "admin");
    	createTestUser(stewardUsername, stewardUseremail, userpassword, "steward");
    	createTestUser(viewerUsername, viewerUseremail, userpassword, "viewer");
    	createTestUser(aqUsername, aqUseremail, userpassword, "aggregate_querier");
    	createTestUser(dqUsername, dqUseremail, userpassword, "data_querier");
    	createTestUser(nrUsername, nrUseremail, userpassword, null);*/
		System.out.println("in AdminTest");
		performUserLogin(adminUseremail, userpassword);
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("roleaccesstest/admin").then().statusCode(200);
	}


}