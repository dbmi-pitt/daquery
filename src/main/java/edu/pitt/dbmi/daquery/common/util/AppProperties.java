package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * API into application level properties.  Properties are read from both the internal (inlcuded in war) application.properties
 * file and from the PROPERY 
 * 
 * @author bill
 *
 */
public class AppProperties
{
	private static Logger log = Logger.getLogger(AppProperties.class.getName());
	
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
		return(ApplicationPropertiesFile.getPropertiesFromFile().getProperty("current.version"));
	}
	public static String getDBName() throws Exception
	{
		String dbName = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("db.name");
		if(dbName == null)
			throw new Exception("Unable to get database name, db.name, from application.properties file.");
		return(dbName);
	}
	public static int getCurrentTableCount()
	{
		try{
			return(Integer.parseInt(ApplicationPropertiesFile.getPropertiesFromFile().getProperty("current.table.count")));
		}
		catch(Throwable t)
		{
			return(-1);
		}
	}
	
	public static String getInitializationDDL()
	{
		return(ApplicationPropertiesFile.getPropertiesFromFile().getProperty("initialization.ddl.file"));
	}
	
	public static boolean setupAdminUser()
	{
		String doit = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("setup.admin.user");
		if(doit == null) return(false);
		doit = doit.toLowerCase().trim();
		return(doit.equals("1") || doit.equals("true") || doit.equals("yes"));
	}
	
	public static boolean isDebugMode()
	{
		boolean retValue = false;
		String sDebug = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("debug.flag");
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
		
		return(ApplicationPropertiesFile.getPropertiesFromFile().getProperty(propertyName));
	}
	
	public static void setDBProperty(String propertyName, String value) throws DaqueryException
	{
		if(StringHelper.isEmpty(propertyName) || StringHelper.isEmpty(value))
			throw new DaqueryException("Cannot set a database property both name and value must be non-blank");
		Connection conn = null;
		Statement stat = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			stat = conn.createStatement();
			if(isDBProperty(propertyName))
			{  //update
				stat.executeUpdate("update PROPERTY set value = '' where upper(name) = '" + propertyName.trim().toUpperCase() + "'");
			}
			else
			{ //insert
				stat.executeUpdate("insert into PROPERTY (name, value) values ('" + propertyName.trim() +"','"+ value +"')");
			}
			conn.commit();
		}
		catch(Throwable t)
		{
			if(conn != null)
			{
				try{conn.rollback();}catch(Throwable t2){}
			}
			throw new DaqueryException("An unexpected error happened while updating property " + propertyName, t);
		}
		finally{ApplicationDBHelper.closeConnection(conn, stat, null);}
	}

	/**
	 * Retrieve the value of a property from the PROPERTY table in the application database.  Null
	 * is returned if the property doesn't exist.
	 * 
	 * @param propertyName The property name.
	 * @return The value of the property of null if it doesn't exist.
	 * @throws DaqueryException Is thrown if an unexpected error occurs.
	 */
	public static String getDBProperty(String propertyName) throws DaqueryException
	{
		if(StringHelper.isEmpty(propertyName)) return(null);
		Connection conn = null;
		Statement stat = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			stat = conn.createStatement();
			ResultSet result = stat.executeQuery("select value from property where ucase(name) = '" + propertyName.trim().toUpperCase() + "'");
			if(result.next())
				return(result.getString(1));
			else
				return(null);
		}
		catch(Throwable t)
		{
			String msg = "An unexpected error occured while setting the application database property: " + propertyName;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryException(msg + " Check the application logs for further information.", t);
		}
		finally{ApplicationDBHelper.closeConnection(conn, stat, null);}
	}
	
	/**
	 * Check for the existence of a property in the application database table PROPERTY.
	 * @param propertyName  The name of the property to check for.
	 * @return  True if the property exists in the database, false otherwise.
	 */
	private static boolean isDBProperty(String propertyName) throws DaqueryException
	{
		return(getDBProperty(propertyName) != null);
			
	}
}
