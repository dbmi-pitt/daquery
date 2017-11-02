package edu.pitt.dbmi.daqueryws.test.domain;

import org.junit.BeforeClass;

import edu.pitt.dbmi.daquery.common.util.AppProperties;

public class AbstractTest {

	
    @BeforeClass
    public static void setupBeforeClass() {
    	//create a dummy user account for use in the RoleTests
    	AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
    }	
}
