package edu.pitt.dbmi.daqueryws.test.rest;

import static io.restassured.RestAssured.given;

import edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite;
import edu.pitt.dbmi.daqueryws.test.rest.DaqueryBaseTest;
import io.restassured.RestAssured;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.RoleDAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    //@Override
    public static void setup() {
    	AppProperties.setDevHomeDir(DomainTestSuite.databaseHomeDir);
    	String siteName = "dq-test-site";
    	int port = 8008;
    	String urlBase = "http://localhost";
    	String localSiteURL = urlBase + ":" + port;
    	String adminEmail = "dqadmin@pitt.edu";
    	String adminPassword = "temppassword";
    	String adminRealName = "Test User";
    	try {
			assertTrue(AppSetup.initialSetup(UUID.randomUUID().toString(), siteName, localSiteURL, adminEmail, adminPassword, adminRealName));
			if(AppSetup.isErroredSetup())
				throw new DaqueryException(AppSetup.getErrorMessage());
			else if(!AppSetup.isValidSetup())
				throw new DaqueryException("Invalid DB setup, but no error was reported.");
	        createAllUsers();
	        RestAssured.baseURI = urlBase;
	        RestAssured.port = port;
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
		save(user);
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

	public static void performLogin(String userEmail, String password) {
        currentToken = given().pathParam("email", userEmail)
               .pathParam("password", password)
        .when().get("users/login?email={email}&password={password}")
        .then().statusCode(200)
        .extract().path("token");
		System.out.println("in checkLogin: " + currentToken);
	}

	@Test
	public void adminTest() {
 /*   	createTestUser(adminUsername, adminUseremail, userpassword, "admin");
    	createTestUser(stewardUsername, stewardUseremail, userpassword, "steward");
    	createTestUser(viewerUsername, viewerUseremail, userpassword, "viewer");
    	createTestUser(aqUsername, aqUseremail, userpassword, "aggregate_querier");
    	createTestUser(dqUsername, dqUseremail, userpassword, "data_querier");
    	createTestUser(nrUsername, nrUseremail, userpassword, null);*/
		performLogin(adminUseremail, userpassword);
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("roleaccesstest/admin").then().statusCode(200);
	}


}
