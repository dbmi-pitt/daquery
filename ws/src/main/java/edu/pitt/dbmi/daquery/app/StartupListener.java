package edu.pitt.dbmi.daquery.app;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import edu.pitt.dbmi.daquery.update.UpdateDBForVersion;

public class StartupListener implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		UpdateDBForVersion.updateDB();
		
	}
	
}
