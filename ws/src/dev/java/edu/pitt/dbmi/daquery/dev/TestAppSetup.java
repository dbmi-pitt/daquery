package edu.pitt.dbmi.daquery.dev;

import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;

import java.util.UUID;

import edu.pitt.dbmi.daquery.common.util.AppProperties;

public class TestAppSetup
{
	public static void main(String [] args) throws DaqueryException
	{
		TestAppSetup.setupDB("/opt/apache-tomcat-6.0.53", "dqadmin@pitt.edu", "temppassword", "dq-test-site", "http://localhost:8008/", "Test User");
	}

	/**
	 * Create an initial database for a local site.  The following parameters are required.
	 * 
	 * @param dbFilePath The local file system path to the location where the database will
	 *                   be stored. e.g. for a db stored in the Tomcat directory "/opt/apache-tomcat-6.0.53"
	 * @param adminEmail The email address of the admin for the site
	 * @param adminPassword The password for the admin account
	 * @param siteName The name of the site being managed from this database 
	 * @param localSiteURL The URL where this site can be reached by other sites
	 * @return
	 */
	public static void setupDB(String dbFilePath, String adminEmail, String adminPassword, String siteName, String localSiteURL, String adminRealName) throws DaqueryException
	{
		AppProperties.setDevHomeDir(dbFilePath);
		AppSetup.initialSetup(UUID.randomUUID().toString(), siteName, localSiteURL, adminEmail, adminPassword, adminRealName);
		if(AppSetup.isErroredSetup())
			throw new DaqueryException(AppSetup.getErrorMessage());
		else if(!AppSetup.isValidSetup())
			throw new DaqueryException("Invalid DB setup, but no error was reported.");
		
		
	}
}
