package edu.pitt.dbmi.daquery.app;

import org.glassfish.jersey.server.ResourceConfig;

public class DaqueryApplication extends ResourceConfig {
    public DaqueryApplication() {
        // Define the package which contains the service classes.
        packages("edu.pitt.dbmi.daquery.rest");
    }
}
