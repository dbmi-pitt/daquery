package edu.pitt.dbmi.daqueryws.test.rest;

import org.junit.Test;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DaqueryBaseTest {
	
	public static String defaultUserEmail = "newemail@email.com";
	public static String defaultUserPassword = "demouser";
	public static String currentToken = "";
	
    @BeforeClass
    public static void setup() {
        String port = System.getProperty("server.port");
        if (port == null) {
            RestAssured.port = Integer.valueOf(8080);
        }
        else{
            RestAssured.port = Integer.valueOf(port);
        }


        String basePath = System.getProperty("server.base");
        if(basePath==null){
            basePath = "/daquery-ws/ws/";
        }
        RestAssured.basePath = basePath;

        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://localhost";
        }
        RestAssured.baseURI = baseHost;
        System.out.println("Starting server..." + RestAssured.baseURI);

        checkLogin();
    }
    
	//I have to login before running any of the other testing methods...
    //I need a valid token for all the other calls
	public static void checkLogin() {
        currentToken = given().pathParam("email", defaultUserEmail)
               .pathParam("password", defaultUserPassword)
        .when().get("users/login?email={email}&password={password}")
        .then().statusCode(200)
        .extract().path("token");
		System.out.println("in checkLogin: " + currentToken);
	}

}
