package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppSetup
{
	private static Logger log = Logger.getLogger(AppSetup.class.getName());
	
	private static boolean validSetup = false;
	private static boolean erroredSetup = false;
	private static String setupErrorMessage = "";
	
	private static final int DBSTATUS_EMPTY = 1;
	private static final int DBSTATUS_ALL_GOOD = 2;
	private static final int DBSTATUS_OLD_VERSION = 3;
	private static final int DBSTATUS_NEWER_VERSION = 4;
	private static final int DBSTATUS_INDETERMINATE = 5;
	
	public static void main(String [] args)
	{
		System.setProperty("catalina.home", "C:\\Users\\del20\\Documents\\GitHub\\daquery-ws\\target");
		initialize();
		if(erroredSetup)
			System.err.println(setupErrorMessage);
		else if(validSetup)
			System.out.println("All Good");
		else
			System.out.println("Invalid setup, but no error reported");
	}
	
	public static void initialize()
	{
		validSetup = checkSetup();
	}
	
	/**
	 * Check to see if the application was set up or needs to
	 * be updated.
	 * 
	 * Verify that a valid daquery-central.xml configuration file exists.
	 * 
	 * If JavaDB was never created do it now.
	 */
	private static boolean checkSetup()
	{
		if(PropertiesHelper.getHomeDirectory() == null)
		{
			setErroredSetup("Unable to find the Tomcat home directory.  Make sure the environment variable, CATALINA_HOME, is set and points to the root of your Tomcat installation directory.");
			return(false);
		}
		if(PropertiesHelper.getConfDirectory() == null)
		{
			setErroredSetup("Unable to find the Tomcat configuration directory.  Make sure the environment variable, CATALINA_HOME, is set and points to the root of your Tomcat installation directory.");
			return(false);
		}
		
		if(! isConfDirWritable())
		{
			setErroredSetup("Tomcat Configuration Dir: " + PropertiesHelper.getConfDirectory() + " is not writable."); 
			return(false);
		}
		
		if(isValidSetup())
		{
			validSetup = true;
			return(true);
		}

		if(! dbExists())
		{
			if(! createDatabase())
			{
				setErroredSetup("Unable to create the application database. Check the application logs for more information.");
				return(false);
			}				
		}
		
		int dbStatus = checkDB();
		if(dbStatus == AppSetup.DBSTATUS_ALL_GOOD)
			return(true);
		else if(dbStatus == AppSetup.DBSTATUS_EMPTY)
		{
			if(initializeDB())
				return(true);
			else
			{
				setErroredSetup("Unable to initialize the database.  Check the application logs for more information.");
				return(false);
			}
		}
		else if(dbStatus == AppSetup.DBSTATUS_INDETERMINATE)
		{
			setErroredSetup("Unable to determine the state of the application database.  The database is in an indeterminate state.  You may need to remove and reset the database.  Check the application logs for more information.");
			return(false);
		}
		
		setErroredSetup("The application database checkup ended in an invalid state.  Please check the database.");
		return(false);
		
	}
	private static void setErroredSetup(String msg)
	{
		log.severe(msg);
		setupErrorMessage = msg;
		erroredSetup = true;
	}
	private static boolean isConfDirWritable()
	{
		File f = new File(PropertiesHelper.getConfDirectory());
		return(f.canWrite());
	}
	
	private static boolean initializeDB()
	{
		InputStream is = ApplicationProperties.class.getResourceAsStream("/" + PropertiesHelper.getInitializationDDL());
		if(! ApplicationDBHelper.executeDDL(is))
		{
			setErroredSetup("An error occured while trying to initialize the application database.  Check the application logs for more information.");
			return(false);			
		}
		else
		{
			Connection conn = null;
			Statement st = null;
			try
			{
				conn = ApplicationDBHelper.getConnection();
				st = conn.createStatement();
				st.executeUpdate("insert into properties (property_id, name, value) values (1, 'current.version', '" + PropertiesHelper.getCurrentVersion() + "')");
				conn.commit();
				return(true);
			}
			catch(Throwable t)
			{
				log.log(Level.SEVERE, "Error while inserting version number into application database.");
				return(false);
			}
			finally
			{
				ApplicationDBHelper.closeConnection(conn, st, null);
			}
			
		}
	}
	private static boolean dbExists()
	{
		Connection conn = null;
		try
		{
			String driver = "org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(driver);
			String url = "jdbc:derby:" + PropertiesHelper.getDBDir();
			conn = DriverManager.getConnection(url);
			return(true);
		}
		catch(Throwable t)
		{
			return(false);
		}
		finally
		{
			if(conn != null)
			{
				try{ conn.close();}
				catch(Throwable t2)
				{
					log.log(Level.SEVERE, "Error while trying to close application database during setup.", t2);
				}
			}
		}
		
	}
	private static boolean createDatabase()
	{
		Connection conn = null;
		try
		{
			String driver = "org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(driver);
			String url = ApplicationDBHelper.getDBURL() + ";create=true";
			conn = DriverManager.getConnection(url);
			return(true);
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "Error while creating application database", t);
			return(false);
		}
		finally
		{
			if(conn != null)
			{
				try{ conn.close();}
				catch(Throwable t2)
				{
					log.log(Level.SEVERE, "Error while trying to close application database during setup.", t2);
				}
			}
		}
	}
	public static int checkDB()
	{
		int tableCount = ApplicationDBHelper.getTableCount();
		if(tableCount == 0)
		{
			return(AppSetup.DBSTATUS_EMPTY);
		}
		else if(tableCount != PropertiesHelper.getCurrentTableCount())
		{
			log.log(Level.SEVERE, "The application database table count does not match the current model.");
			return(AppSetup.DBSTATUS_INDETERMINATE);
		}
		Connection conn = null;
		Statement state = null;
		ResultSet rs = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			state = conn.createStatement();
			rs = state.executeQuery("select value from properties where name = 'current.version'");
			String version = null;
			if(rs.next())
				version = rs.getString(1);
			else
			{
				log.log(Level.SEVERE, "Unable to get application version number from the application database.");;
				return(DBSTATUS_INDETERMINATE);
			}
			if(version == null || ! version.trim().equals(PropertiesHelper.getCurrentVersion().trim()))
			{
				log.log(Level.SEVERE, "The applicationcurrent version does not match the configured version.");
				return(DBSTATUS_INDETERMINATE);
			}
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An error occured while checking the application database status", t);
			return(AppSetup.DBSTATUS_INDETERMINATE);
		}
		finally
		{
			ApplicationDBHelper.closeConnection(conn, state, rs);
		}
		
		return(AppSetup.DBSTATUS_ALL_GOOD);
	}
	public static boolean isErroredSetup()
	{
		return(erroredSetup);
	}
	public static String getErrorMessage()
	{
		return(setupErrorMessage);
	}
	public static boolean isValidSetup()
	{
		return(validSetup);
	}
}
