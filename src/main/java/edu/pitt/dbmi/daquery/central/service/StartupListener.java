package edu.pitt.dbmi.daquery.central.service;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.ws.rs.ext.Provider;

import edu.pitt.dbmi.daquery.common.util.AppSetup;

@Provider
public class StartupListener implements ServletContextListener
{
	private static Logger log = Logger.getLogger(StartupListener.class.getName());
	
	public void contextDestroyed(ServletContextEvent sce) {
		log.info("Daquery Central shut down");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		log.info("Daquery Central started");
		AppSetup.initialize();
	}

}

