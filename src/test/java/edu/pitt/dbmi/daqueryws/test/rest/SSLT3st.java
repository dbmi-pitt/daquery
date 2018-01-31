package edu.pitt.dbmi.daqueryws.test.rest;

import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;

/**
 * NOTE: For this class to work, a network of sites complete with certificates and keystores
 * must exist.  You will need to include the ip addresses for the sites when you run this code.
 * @author devuser
 *
 */
public class SSLT3st extends DaqueryBaseTest  {

	
	private String sitePort = "6443";
	private String siteIP = "130.49.213.163";
	private String siteURL = "https://" + siteIP + ":" + sitePort + "/";
	public static void main(String[] args) {
//		org.junit.runner.JUnitCore.main("edu.pitt.dbmi.daqueryws.test.rest.SSLTest");
	}
	
    /*@Test
    public void getAliasesTest() {
            given().with().contentType("application/json")
            .headers("Authorization", "Bearer " + currentToken)
            .when().get("sites/getKeystoreAliases").then().statusCode(200);
    }*/

	//@Test
	public void checkSSLGetConnection() {
        try {
        	//s = SiteDAO.querySiteByID("101");
        	Site s = new Site();
        	s.setKeystoreAlias(siteIP);
        	s.setUrl(siteURL);
        	System.out.println("Connecting to site: " +  " " + s.getUrl() + " " + s.getKeystoreAlias());
        	Response r = WSConnectionUtil.getFromRemoteSite(s, "sites/getKeystoreAliases", null, null);
        	String json = r.readEntity(String.class);
        	System.out.println("Response: " + json);
       } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	//@Test
	public void checkSSLPostConnection() {
        try {
        	//s = SiteDAO.querySiteByID("101");
        	Site s = new Site();
        	s.setKeystoreAlias(siteIP);
        	s.setUrl(siteURL);
        	System.out.println("Connecting to site: " +  " " + s.getUrl() + " " + s.getKeystoreAlias());
        	Response r = WSConnectionUtil.postJSONToRemoteSite(s, "echopost", s.toJson(), null);
        	String json = r.readEntity(String.class);
        	System.out.println("Response: " + json);
       } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	/*
    @Test
    public void checkSSLTest() {
            String urlString = "https://130.49.213.163:6443/daquery/ws/sites/getKeystoreAliases";
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
	*/

	
	
	
	
}
