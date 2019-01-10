package edu.pitt.dbmi.daqueryws.test.rest;

import org.junit.Test;

import edu.pitt.dbmi.daquery.common.dao.RoleDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class DaqueryBaseTest {
	
	public static String currentTokenid = "";
	public static String currentToken = "";
	public static Integer defaultPort = 9090;
	public static String defaultServerName = "localhost";
	public static String username = "";
	public static String password = "";
	
		
    @BeforeClass
    public static void setup() {
    	
    	Properties props = DomainTestSuite.getPropertiesFromFile();
    	String propPort = props.getProperty("rest.test.port", "");
    	username = props.getProperty("rest.test.username", "");
    	password = props.getProperty("rest.test.password", "");
    	
        String port = System.getProperty("server.port");
        if (port == null) {
            RestAssured.port = Integer.valueOf(defaultPort);
        }
        else{
            RestAssured.port = Integer.valueOf(port);
        }

        if (!propPort.isEmpty()) {
        	RestAssured.port = Integer.valueOf(propPort);
        }


        String basePath = System.getProperty("server.base");
        if(basePath==null){
            basePath = "/daquery/ws/";
        }
        RestAssured.basePath = basePath;

        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://" + defaultServerName;
        }
        RestAssured.baseURI = baseHost;
        System.out.println("Starting server..." + RestAssured.baseURI + ":" + RestAssured.port + RestAssured.basePath);

        try {        	
	        checkLogin();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        	//if there is a problem, let JUnit know
        	assertTrue(false);
        }
        
    }
    
	//I have to login before running any of the other testing methods...
    //I need a valid token for all the other calls
	public static void checkLogin() {
        currentToken = given().pathParam("email", username)
               .pathParam("password", password)
        .log().all()
        .when().get("users/login?email={email}&password={password}")
        .then().statusCode(200)
        .extract().path("token");
		System.out.println("in checkLogin: " + currentToken);
	}
	

	
}
