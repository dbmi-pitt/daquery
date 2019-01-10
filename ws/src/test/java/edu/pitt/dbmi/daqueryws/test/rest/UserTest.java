package edu.pitt.dbmi.daqueryws.test.rest;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserTest extends DaqueryBaseTest {

	private static String userTestUUID = "";
	
	private String badToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0ZTIyNGFiZi03OWVkLTQxZTktOGI3Yy1iODYxZTI3NzEwYTkiLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvZGFxdWVyeS13cy93cy91c2Vycy9sb2dpbiIsImlhdCI6MTUwNzEyMDUyMiwiZXhwIjoxNTA3MTIxNDIyfQ.zlxdwkHOXSldVAgdbpVcTQ0uGSW8fI_LPHtgEMIh5u5BspvOzmXusl09HYeOk_lSrTSkqho-zRBTNL2wBY8feA";
	
	
	//TODO: add a BeforeClass method that creates a dummy user account for testing
	//use the defaultUserEmail and defaultUserPassword parameters to create account

	
	//return the UUID for first user found
	//this sets the userTestUUID list for the rest of the tests
	@BeforeClass
	public static void initializeUUIDList() {
		List<String> uuidList = given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("users").then().statusCode(200)
		.extract().response().path("id");
		userTestUUID = uuidList.get(0);

	}
	
	@Test 
	public void findByIdTest() {
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.pathParam("id", userTestUUID)
		.when().get("users/{id}").then().statusCode(200);
	}

	
	
	//TODO: create some tests to check the HTTP codes when using a bad password, an invalid token, etc.
    // ======================================
    // =          ERROR TEST METHODS        =
    // ======================================

	
	@Test
	public void checkBadLogin() {
        given().pathParam("email", "bad@email.com")
               .pathParam("password", "badPassword")
        .when().get("users/login?email={email}&password={password}")
        .then().statusCode(401);
	}
	
	
	
	
}
