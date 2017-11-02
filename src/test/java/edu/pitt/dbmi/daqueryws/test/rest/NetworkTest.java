package edu.pitt.dbmi.daqueryws.test.rest;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class NetworkTest extends DaqueryBaseTest {

	private String networkTestUUID = "a2610ae0-22b1-4dc8-92c6-8780c2cf0e9f";
	
	private String badToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0ZTIyNGFiZi03OWVkLTQxZTktOGI3Yy1iODYxZTI3NzEwYTkiLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvZGFxdWVyeS13cy93cy91c2Vycy9sb2dpbiIsImlhdCI6MTUwNzEyMDUyMiwiZXhwIjoxNTA3MTIxNDIyfQ.zlxdwkHOXSldVAgdbpVcTQ0uGSW8fI_LPHtgEMIh5u5BspvOzmXusl09HYeOk_lSrTSkqho-zRBTNL2wBY8feA";
	
	
	//TODO: add a BeforeClass method that creates a dummy user account for testing
	//use the defaultUserEmail and defaultUserPassword parameters to create account

	
	//return the UUID for first user found
	@Test
	public void findAllNetworksTest() {
		List<String> uuidList = given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("networks").then().statusCode(200)
		.extract().response().path("network_id");
		networkTestUUID = uuidList.get(0);

	}
	
	@Test 
	public void findByIdTest() {
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.pathParam("id", networkTestUUID)
		.when().get("networks/{id}").then().statusCode(200);
	}

	
	
	//TODO: create some tests to check the HTTP codes when using a bad password, an invalid token, etc.
    // ======================================
    // =          ERROR TEST METHODS        =
    // ======================================

	
	
	/* TODO: skip this for now.  Apparently we are returning a 200 for this
	 * the ResponseHelper code returns a new token in this case
	@Test
	public void checkExpiredToken() {
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.when().get("networks").then().statusCode(401);

	}
	*/
	
	
}
