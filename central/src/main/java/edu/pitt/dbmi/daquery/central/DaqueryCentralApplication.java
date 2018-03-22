package edu.pitt.dbmi.daquery.central;

import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;

//NOTE: The ApplicationPath MUST MATCH the web.xml servlet-mapping/url-pattern
//If not, the application will deploy to Tomcat, but it will generate 404 errors for all paths
@ApplicationPath("/")
public class DaqueryCentralApplication extends ResourceConfig {
    public DaqueryCentralApplication() {
        // Define the package which contains the service classes.
        packages("edu.pitt.dbmi.daquery.central.service");
    }
}
