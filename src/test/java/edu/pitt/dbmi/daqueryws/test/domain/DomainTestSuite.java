package edu.pitt.dbmi.daqueryws.test.domain;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.UUID;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;


@RunWith(Suite.class)

@Suite.SuiteClasses({
   DaqueryRequestTest.class,
   DaqueryResponseAndFilesetTest.class,
   DaqueryUserTest.class,
   NetworkTest.class,
   RoleTest.class,
   SASDataSourceTest.class,
   SiteTest.class,
   SQLDataSourceTest.class
})

public class DomainTestSuite {
	
    private final static Logger logger = Logger.getLogger(DomainTestSuite.class.getName());

    public static String databaseHomeDir = "/opt/apache-tomcat-6.0.53";

    @BeforeClass
    public static void init() {
    	AppProperties.setDevHomeDir(DomainTestSuite.databaseHomeDir);
    	String siteName = "dq-test-site";
    	String localSiteURL = "http://localhost:8008/";
    	String adminEmail = "dqadmin@pitt.edu";
    	String adminPassword = "temppassword";
    	String adminRealName = "Test User";
    	try {
			assertTrue(AppSetup.initialSetup(UUID.randomUUID().toString(), siteName, localSiteURL, adminEmail, adminPassword, adminRealName));
			if(AppSetup.isErroredSetup())
				throw new DaqueryException(AppSetup.getErrorMessage());
			else if(!AppSetup.isValidSetup())
				throw new DaqueryException("Invalid DB setup, but no error was reported.");
	   	} catch (Exception e) {
	    		System.out.println(e.getMessage());
	    }
    }
    
    @Test
    //I added this method because maven's surefire plugin does not like it
    //if a test class does not contain at least one @Test annotation
    public void dummyTest() {
    	System.out.println("Dummy Test");
    }
    
	
}
