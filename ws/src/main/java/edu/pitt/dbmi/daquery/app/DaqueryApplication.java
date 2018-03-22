package edu.pitt.dbmi.daquery.app;

import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;

//NOTE: The ApplicationPath MUST MATCH the web.xml servlet-mapping/url-pattern
//If not, the application will deploy to Tomcat, but it will generate 404 errors for all paths
@ApplicationPath("/ws/")
public class DaqueryApplication extends ResourceConfig {
    public DaqueryApplication() {
        // Define the package which contains the service classes.
        packages("edu.pitt.dbmi.daquery.rest");
        
        //added this line to avoid this message in the log file when the
        //application is stopped:
        //"A web application registered the JBDC driver [...]
        //but failed to unregister it when the web application was stopped. 
        //To prevent a memory leak, the JDBC Driver has been forcibly 
        //unregistered"
        register("org.apache.derby.jdbc.EmbeddedDriver");
    }
}
