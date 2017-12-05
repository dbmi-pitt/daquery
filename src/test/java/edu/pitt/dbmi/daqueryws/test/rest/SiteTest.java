package edu.pitt.dbmi.daqueryws.test.rest;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite;

public class SiteTest extends DaqueryBaseTest {

	private String siteTestUUID = "";
	
	private long testNetworkID = 1;
	
	private String badToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0ZTIyNGFiZi03OWVkLTQxZTktOGI3Yy1iODYxZTI3NzEwYTkiLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvZGFxdWVyeS13cy93cy91c2Vycy9sb2dpbiIsImlhdCI6MTUwNzEyMDUyMiwiZXhwIjoxNTA3MTIxNDIyfQ.zlxdwkHOXSldVAgdbpVcTQ0uGSW8fI_LPHtgEMIh5u5BspvOzmXusl09HYeOk_lSrTSkqho-zRBTNL2wBY8feA";
	
	
	//TODO: add a BeforeClass method that creates a dummy user account for testing
	//use the defaultUserEmail and defaultUserPassword parameters to create account

	
	//return the UUID for first user found
/*	@Test
	public void findAllSitesTest() {
		List<String> uuidList = given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.queryParam("network_id", testNetworkID)
		.when().get("sites").then().statusCode(200)
		.extract().response().path("site_id");
		siteTestUUID = uuidList.get(0);

	}
*/	
	@Test 
	public void findByIdTest() {
		given().with().contentType("application/json")
		.headers("Authorization", "Bearer " + currentToken)
		.pathParam("id", DomainTestSuite.testSiteUUID1)
		.when().get("sites/{id}").then().statusCode(200);
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
		.when().get("sites").then().statusCode(401);

	}
	*/
	
	
}
