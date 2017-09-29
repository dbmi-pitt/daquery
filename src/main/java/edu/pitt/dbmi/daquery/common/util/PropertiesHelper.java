package edu.pitt.dbmi.daquery.common.util;

import java.io.File;

public class PropertiesHelper
{
	private static final String confDir = "conf";
	private static String devHomeDir = null;
	
	public static void setDevHomeDir(String val)
	{
		devHomeDir = val;
	}
	
	public static String getHomeDirectory()
	{
		String rVal = null;
		if(devHomeDir != null)
		{
			rVal = devHomeDir;
		}
		else if (System.getProperty("catalina.home") == null)
		{
			rVal = System.getenv("CATALINA_HOME");
		}
		else 
			rVal = System.getProperty("catalina.home");
		return(rVal);
	}
	
	public static String getConfDirectory()
	{	if ( getHomeDirectory() == null )
			return null;
		else
			return(getHomeDirectory() + File.separator + confDir + File.separator);
	}
	
	public static String getDBDir() throws Exception
	{
		String sep = File.separator;
		if (getHomeDirectory() == null)
			return(null);
		else
		{
			String confDir = getConfDirectory();
			if(confDir.trim().endsWith(File.separator))
				sep = "";
				
		}
			return(getConfDirectory() + sep + getDBName() + File.separator);
	}
	
	public static String getCurrentVersion()
	{
		return(ApplicationProperties.getProps().getProperty("current.version"));
	}
	public static String getDBName() throws Exception
	{
		String dbName = ApplicationProperties.getProps().getProperty("db.name");
		if(dbName == null)
			throw new Exception("Unable to get database name, db.name, from application.properties file.");
		return(dbName);
	}
	public static int getCurrentTableCount()
	{
		try{
			return(Integer.parseInt(ApplicationProperties.getProps().getProperty("current.table.count")));
		}
		catch(Throwable t)
		{
			return(-1);
		}
	}
	
	public static String getInitializationDDL()
	{
		return(ApplicationProperties.getProps().getProperty("initialization.ddl.file"));
	}
	
	public static boolean setupAdminUser()
	{
		String doit = ApplicationProperties.getProps().getProperty("setup.admin.user");
		if(doit == null) return(false);
		doit = doit.toLowerCase().trim();
		return(doit.equals("1") || doit.equals("true") || doit.equals("yes"));
	}
	
	public static boolean isDebugMode()
	{
		boolean retValue = false;
		String sDebug = ApplicationProperties.getProps().getProperty("debug.flag");
		if ((sDebug != null) && (sDebug.compareToIgnoreCase("true") == 0)) {
			retValue = true;
		}
		return retValue;
		
	}
	
	public static String getCentralServerURL()
	{
		String propertyName = ".central.server.url";
		if(isDebugMode())
			propertyName = "dev" + propertyName;
		else
			propertyName = "prod" + propertyName;
		
		return(ApplicationProperties.getProps().getProperty(propertyName));
	}

}
