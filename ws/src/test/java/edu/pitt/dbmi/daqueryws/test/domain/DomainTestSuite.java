package edu.pitt.dbmi.daqueryws.test.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import edu.pitt.dbmi.daquery.common.dao.RoleDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daqueryws.test.DBVersionCheck;


@RunWith(Suite.class)

@Suite.SuiteClasses({
   DaqueryRequestTest.class,
   DaqueryResponseAndFilesetTest.class,
   DaqueryUserTest.class,
   NetworkTest.class,
   RoleTest.class,
   SASDataSourceTest.class,
   SiteTest.class,
   SQLDataSourceTest.class,
   DBVersionCheck.class
})

public class DomainTestSuite {
	
    private final static Logger logger = Logger.getLogger(DomainTestSuite.class.getName());
	private static Properties props = null;
  
    public static String databaseHomeDir = "/opt/apache-tomcat-6.0.53";
    public static String adminEmail = "";
    public static String adminPassword = "";
    public static String adminRealName = "Test UserAdmin Account";
    public static String localSiteName = "testSite1";
    public static String testPort = "";

    @BeforeClass
    public static void init() {
    	AppProperties.setDevHomeDir(DomainTestSuite.databaseHomeDir);
    	String localSiteURL = "http://localhost:8008/";
    	
    	//String adminEmail = "dqadmin@pitt.edu";
    	//String adminPassword = "temppassword";
    	//String adminRealName = "Test User";
    	try {
    		props = getPropertiesFromFile();
    		DomainTestSuite.adminEmail = getTestUsername();
    		assertFalse(DomainTestSuite.adminEmail.isEmpty());
    		DomainTestSuite.adminPassword = getTestPassword();
    		assertFalse(DomainTestSuite.adminPassword.isEmpty());    		
    		DomainTestSuite.testPort = getTestPort();
			assertTrue(AppSetup.initialSetup(UUID.randomUUID().toString(), localSiteName, localSiteURL, adminEmail, adminPassword, adminRealName));
			if(AppSetup.isErroredSetup())
				throw new DaqueryException(AppSetup.getErrorMessage());
			else if(!AppSetup.isValidSetup())
				throw new DaqueryException("Invalid DB setup, but no error was reported.");
			//set the local site information
			Site localSite = SiteDAO.getSiteByNameOrId(localSiteName);
			AppProperties.setDBProperty("site.id",localSite.getSiteId());
			AppProperties.setDBProperty("site.name",localSiteName);
			System.out.println("The local site's id is: " + localSite.getSiteId());
	   	} catch (Exception e) {
	    		System.out.println(e.getMessage());
	    		logger.info(e.getMessage());
	    }
    }

	public static Properties getPropertiesFromFile()
	{
		if(props == null)
		{
			String testFilePath = "/opt/apache-tomcat-6.0.53/conf/test.properties";
			File initialFile = new File(testFilePath);
		    InputStream is = null;
		    
		    try {is = new FileInputStream(initialFile);}
		    catch (Throwable t)
		    {
				logger.log(Level.SEVERE, "Find file " + testFilePath, t);		    	
		    }
			props = new Properties();
			try{props.load(is);}
			catch(Throwable t)
			{
				logger.log(Level.SEVERE, "Unable to load test.properties from " + AppProperties.getConfDirectory(), t);
			}
		}
		return(props);
	}

	private static String getTestUsername()
	{
		String username = props.getProperty("test.username", "");
		return username;
	}

	private static String getTestPassword()
	{
		String password = props.getProperty("test.password", "");
		return password;
	}

	public static String getTestPort()
	{
		String port = props.getProperty("test.port", "");
		return port;
	}

    
    @Test
    //I added this method because maven's surefire plugin does not like it
    //if a test class does not contain at least one @Test annotation
    public void dummyTest() {
    	System.out.println("Dummy Test");
    }
    
    @AfterClass
    //It seems like some of the connections remain open after running the classes in the suite
    //Also, create the test data for the Rest tests
    public static void tearDown() {
    	try {
    		generateData();
	    	HibernateConfiguration.getSessionFactory().close();
    	} catch (Exception e) {
    		logger.info(e.getMessage());
  
    	}
    }

	public static String testNetworkUUID1 = "a2610ae0-22b1-4dc8-92c6-8780c2cf0e9f";
	public static String testNetworkName1 = "testNetwork1";
	public static String testNetworkUUID2 = "5ea729c1-4190-4955-925c-f1af61711e5b";
	public static String testNetworkName2 = "testNetwork2";
	
	public static String testSiteUUID1 = "fb7aa4e1-35e7-45a7-aa05-d50691439652";
	public static String testSiteName1 = "testSite1";
	public static String testSiteUUID2 = "98c7b618-68d9-4767-82c9-cc3a7f5d8749";
	public static String testSiteName2 = "testSite2";
	
	public static String testUserEmail1 = "newemail@email.com";
	public static String testUsername1 = "admin1";
	public static String testUserPassword1 = "demouser";
	public static String testUserEmail2 = "newemail2@email.com";
	public static String testUsername2 = "admin2";
	public static String testUserPassword2 = "demouser";

	
	
	private static void createUsers() {
		try {	
			newTestUser(testUsername1, testUserEmail1, testUserPassword1);
			newTestUser(testUsername2, testUserEmail2, testUserPassword2);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			
		}
	}
	
	private static void createNetworks() {
		try {	
			newTestNetwork(testNetworkName1, testNetworkUUID1);
			newTestNetwork(testNetworkName2, testNetworkUUID2);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			
		}		
	}
	
	private static void newTestNetwork(String networkName, String UUID) {
		Network n = new Network();
		n.setName(networkName);
		n.setNetworkId(UUID);
		save(n);
	}

	private static void createSites() {
		try {	
			newTestSite(testSiteName1, testSiteUUID1);
			newTestSite(testSiteName2, testSiteUUID2);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			
		}		
	}
	
	private static void newTestSite(String siteName, String UUID) {
		Site s = new Site();
		s.setName(siteName);
		s.setSiteId(UUID);
		save(s);
	}
	
	private static void newTestUser(String username, String email, String password) throws Exception
	{
		DaqueryUser user = new DaqueryUser(true);
		user.setEmail(email);
		user.setRealName("Test User");
		user.setStatusEnum(UserStatus.ACTIVE);
		user.setUsername(username);
		user.setPassword(password);
		List<Role> roles = new ArrayList<Role>();
		//Role role = RoleDAO.queryRoleByName("aggregate_querier");
		Role role1 = RoleDAO.queryRoleByName("admin");
		//roles.add(role);
		roles.add(role1);
		user.setRoles(roles);
		List<DaqueryUser> users = new ArrayList<DaqueryUser>();
		users.add(user);
		//role.setUsers(users);
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
	
	public static void generateData() {
		createUsers();
		createNetworks();
		createSites();
	}

	
}
