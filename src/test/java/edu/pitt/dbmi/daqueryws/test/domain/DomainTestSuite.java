package edu.pitt.dbmi.daqueryws.test.domain;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.UUID;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;

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
    	System.out.println(AppProperties.getConfDirectory());
    	try {
    	System.out.println(AppProperties.getDBDir()); 
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	rebuildDatabase();
    }
    
	public static void rebuildDatabase() {
    	
    	String siteUUID = 	UUID.randomUUID().toString().trim();
		AppSetup.initialSetup(siteUUID, "testSite", "http://site.edu", "path@pitt.edu", "password", "Admin Name");
		if(AppSetup.isErroredSetup())
			System.err.println(AppSetup.getErrorMessage());
		else if(AppSetup.isValidSetup())
		{
			System.out.println("All Good");
		}
		else
			System.out.println("Invalid setup, but no error reported");
	    
	}
	
}
