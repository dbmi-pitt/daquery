package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.domain.UserStatus;

public class AppSetup
{
	private static Logger log = Logger.getLogger(AppSetup.class.getName());
	
	//private static boolean validDatabaseSetup = false;
	private static boolean erroredSetup = false;
	private static String setupErrorMessage = "";
	private static boolean isValidSetup = false;
	private static boolean firstUserCreated = false;
	
	public static final int DBSTATUS_EMPTY = 1;
	public static final int DBSTATUS_ALL_GOOD = 2;
	public static final int DBSTATUS_OLD_VERSION = 3;
	public static final int DBSTATUS_NEWER_VERSION = 4;
	public static final int DBSTATUS_INDETERMINATE = 5;
	public static final int DBSTATUS_UNKNOWN = 6;
	public static final int DBSTATUS_NONEXISTENT = 7;
	
	private static Integer dbStatus = null;
	
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		int status = AppSetup.getDBStatus();
		System.out.println(status);
	}
	
	public static boolean initialize()
	{
		isValidSetup = initializeDB(null, null, null);
		return(isValidSetup);
	}

	public static boolean initialSetup(String adminEmail, String adminPwd, String adminRealName)
	{
		if(StringHelper.isEmpty(adminPwd) || StringHelper.isEmpty(adminPwd) )
			isValidSetup = false;
		else
			isValidSetup = initializeDB(adminEmail, adminPwd, adminRealName);
		return(isValidSetup);
	}

	
	/**
	 * Check to see if the application was set up or needs to
	 * be updated.
	 * 
	 * Verify that a valid daquery-central.xml configuration file exists.
	 * 
	 * If JavaDB was never created do it now.
	 */
	private static boolean initializeDB(String adminEmail, String adminPwd, String adminRealName)
	{
		if(AppProperties.getHomeDirectory() == null)
		{
			setErroredSetup("Unable to find the Tomcat home directory.  Make sure the environment variable, CATALINA_HOME, is set and points to the root of your Tomcat installation directory.");
			return(false);
		}
		if(AppProperties.getConfDirectory() == null)
		{
			setErroredSetup("Unable to find the Tomcat configuration directory.  Make sure the environment variable, CATALINA_HOME, is set and points to the root of your Tomcat installation directory.");
			return(false);
		}
		
		if(! isConfDirWritable())
		{
			if(! mkConfDir())
			{	
				setErroredSetup("Tomcat Configuration Dir: " + AppProperties.getConfDirectory() + " is not writable."); 
				return(false);
			}
		}
		
		if(! dbExists())
		{
			if(! createDatabase())
			{
				setErroredSetup("Unable to create the application database. Check the application logs for more information.");
				return(false);
			}
		}
		
		try{dbStatus = checkDB();}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An unexpected error occured while check the state of the application database during initialization.", t);
			setErroredSetup("Unable to determine the state of the application database during initialization.  Check the application logs for more information.");
			return(false);
		}
		if(dbStatus == AppSetup.DBSTATUS_ALL_GOOD)
		{
			return(true);
		}
		else if(dbStatus == AppSetup.DBSTATUS_EMPTY)
		{
			if(initializeDBData())
			{
				if(AppProperties.setupAdminUser() && ! StringHelper.isEmpty(adminPwd) && ! StringHelper.isEmpty(adminEmail))
				{
					if(! setupAdminUser(adminEmail, adminPwd, adminRealName))
					{
						setErroredSetup("Unable to create the initial admin user.  Check the application logs for more information.");
						return(false);
					}
				}
				dbStatus = AppSetup.DBSTATUS_ALL_GOOD;
				return(true);
			}
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
	private static boolean setupAdminUser(String adminEmail, String adminPwd, String adminRealName)
	{
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery("select count(*) from site_user where lower(username) = 'admin'");
			int adminCount = 0;
			if(rs.next())
				adminCount = rs.getInt(1);
			if(adminCount > 0)
			{
				log.log(Level.SEVERE, "An admin user already exists while trying to add the first admin user.");
				return(false);
			}
			UUID uuid = UUID.randomUUID();
		    String uuidStr = uuid.toString();
			String hashedPwd = PasswordUtils.digestPassword(adminPwd.trim());
			if(StringHelper.isEmpty(adminRealName)) adminRealName = "";
			String insertSQL = "insert into site_user (id, username, password, status, email, real_name) values ('"  + uuidStr.trim() + "', 'admin', '" + hashedPwd + "', " + UserStatus.ACTIVE.getValue() + ", '" + adminEmail.trim() + "', '" + adminRealName + "')";
			log.info("User inserted with: " + insertSQL);
			stat.executeUpdate(insertSQL);
			insertSQL = "insert into user_role (role_id, user_id) values ((select id from role where name='admin'), '" + uuidStr.trim() + "')";
			stat.executeUpdate(insertSQL);
			firstUserCreated = true;
			return(true);
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An error occured while trying to create the first admin user.", t);
			setErroredSetup("An error occured while trying to create the first admin user.  Check the application logs for more information.");
			return(false);
		}
		finally
		{
			ApplicationDBHelper.closeConnection(conn, stat, rs);
		}
	}
	private static void setErroredSetup(String msg)
	{
		log.severe(msg);
		setupErrorMessage = msg;
		erroredSetup = true;
	}
	private static boolean isConfDirWritable()
	{
		File f = new File(AppProperties.getConfDirectory());
		return(f.canWrite());
	}

	private static boolean mkConfDir()
	{
		try
		{
			Path p = Paths.get(AppProperties.getConfDirectory());
			Files.createDirectories(p);
		}
		catch(Throwable t){return(false);}
		return(true);
	}
	
	private static boolean initializeDBData()
	{
		InputStream is = ApplicationPropertiesFile.class.getResourceAsStream("/" + AppProperties.getInitializationDDL());
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
				String currentDateTime = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				conn = ApplicationDBHelper.getConnection();
				st = conn.createStatement();
				AppProperties.setDBProperty("current.version", AppProperties.getCurrentVersion());
				AppProperties.setDBProperty("initial.setup", currentDateTime);
				conn.commit();
				return(true);
			}
			catch(Throwable t)
			{
				log.log(Level.SEVERE, "Error while inserting version number into application database.", t);
				return(false);
			}
			finally
			{
				ApplicationDBHelper.closeConnection(conn, st, null);
			}
			
		}
	}
	public static boolean dbExists()
	{
		Connection conn = null;
		
		try
		{
			String dbDir = AppProperties.getDBDir();
			File dbDirF = new File(dbDir);
			if(! dbDirF.exists()) return(false);
			
			String driver = "org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(driver);
			String url = "jdbc:derby:" + dbDir;
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
			log.log(Level.INFO, "database created with: " + url);
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
	private static int checkDB() throws Exception
	{
		String dbDir = AppProperties.getDBDir();
		File dbDirF = new File(dbDir);
		if(! dbDirF.exists())
			return(AppSetup.DBSTATUS_NONEXISTENT);
		
		int tableCount = ApplicationDBHelper.getTableCount();
		if(tableCount == 0)
		{
			return(AppSetup.DBSTATUS_EMPTY);
		}
		else if(tableCount != AppProperties.getCurrentTableCount())
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
			
			rs = state.executeQuery("select value from property where name = 'current.version'");
			String version = null;
			if(rs.next())
				version = rs.getString(1);
			else
			{
				log.log(Level.SEVERE, "Unable to get application version number from the application database.");;
				return(DBSTATUS_INDETERMINATE);
			}
			if(version == null || ! version.trim().equals(AppProperties.getCurrentVersion().trim()))
			{
				log.log(Level.SEVERE, "The applicationcurrent version does not match the configured version.");
				return(DBSTATUS_INDETERMINATE);
			}
			rs.close();
			rs = state.executeQuery("select value from property where name = 'initial.setup'");
			if(!rs.next())
			{
				log.log(Level.SEVERE, "Unable to get initial setup date from the database, can't validate a complete setup.");
				return(DBSTATUS_INDETERMINATE);
			}
			rs.close();
			rs = state.executeQuery("select id from site_user where lcase(username) = 'admin'");
			if(!rs.next())
			{
				log.log(Level.SEVERE, "Unable to find the initial admin user, can't validate a complete setup.");
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
	public static boolean isValidDatabaseSetup()
	{
		return(dbStatus == DBSTATUS_ALL_GOOD);
	}
	public static int getDBStatus()
	{
		try
		{
			if(dbStatus == null) dbStatus = checkDB();
			return(dbStatus);
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An unexpected error occured while check the state of the application database.", t);
			return(AppSetup.DBSTATUS_UNKNOWN);
		}
		
	}
	public static boolean isValidSetup()
	{
		return(isValidSetup);
	}
	public static boolean wasFirstUserCreated()
	{
		return(firstUserCreated);
	}
}
