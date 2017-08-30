package edu.pitt.dbmi.daquery.common.util;

import java.io.File;

public class PropertiesHelper
{
	private static final String confDir = "conf";
	
	public static String getHomeDirectory()
	{
		if (System.getProperty("catalina.home") == null)
		{
			return(System.getenv("CATALINA_HOME"));
		}
		else 
			return(System.getProperty("catalina.home"));
	}
	
	public static String getConfDirectory()
	{	if ( getHomeDirectory() == null )
			return null;
		else
			return(getHomeDirectory() + File.separator + confDir + File.separator);
	}
	
	public static String getDBDir() throws Exception
	{
		if (getHomeDirectory() == null)
			return(null);
		else
			return(getConfDirectory() + File.separator + getDBName() + File.separator);
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
}
