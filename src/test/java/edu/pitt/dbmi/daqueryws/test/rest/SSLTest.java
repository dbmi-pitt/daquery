package edu.pitt.dbmi.daqueryws.test.rest;

import static io.restassured.RestAssured.given;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.rest.util.WSConnectionUtil;
import edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;

public class SSLTest extends DaqueryBaseTest {

	public static void main(String[] args) {
//		org.junit.runner.JUnitCore.main("edu.pitt.dbmi.daqueryws.test.rest.SSLTest");
	}
	
    /*@Test
    public void getAliasesTest() {
            given().with().contentType("application/json")
            .headers("Authorization", "Bearer " + currentToken)
            .when().get("sites/getKeystoreAliases").then().statusCode(200);
    }*/

    @Test
    public void checkSSLTest() {
            String urlString = "https://dbmi-i2b2-dev02.dbmi.pitt.edu:6443/daquery/ws/sites/getKeystoreAliases";
            System.out.println("Checking URL: " + urlString);
            URL url = null;
            URLConnection urlConnection = null;
            HttpsURLConnection httpsUrlConnection = null;
            try {
                    url = new URL(urlString);
                    urlConnection = url.openConnection();
                    httpsUrlConnection = (HttpsURLConnection) urlConnection;
                    SSLSocketFactory sslSocketFactory = WSConnectionUtil.getDaqueryKeyStoreSSLFactory();
                    System.out.println("Got sslSocketFactory");
                    httpsUrlConnection.setSSLSocketFactory(sslSocketFactory);
                    try (InputStream inputStream = httpsUrlConnection.getInputStream()) {
                    //try (InputStream inputStream = urlConnection.getInputStream()) {
                            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                            String line = null;
                            while ((line = reader.readLine()) != null) {
                                    System.out.println(line);
                            }
                    } catch (Exception e) {
                            e.printStackTrace();
                    }

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	

	
	
	
	
}
