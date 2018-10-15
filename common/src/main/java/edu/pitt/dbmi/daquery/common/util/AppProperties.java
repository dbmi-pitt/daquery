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
	
	public static void main(String [] args)
	{
		System.out.println(getDisplayVersion());
	}
	
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
	{
		if (! StringHelper.isBlank(System.getenv("DAQUERY_CONF_DIR")))
		{
			return(StringHelper.ensureTrailingSlashFile(System.getenv("DAQUERY_CONF_DIR")));
		}		
		else if ( getHomeDirectory() == null )
			return null;
		else
			return(StringHelper.ensureTrailingSlashFile(getHomeDirectory()) + confDir + File.separator);
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
		String major = getMajorVersion();
		String minor = getMinorVersion();
		String subMinor = getSubMinorVersion();
		
		String mm;
		
		if(StringHelper.isEmpty(major))
			mm = ""; 
		else
		{
			if(! StringHelper.isEmpty(minor))
			{
				mm = " " + major.trim() + "." + minor.trim();
				if(! StringHelper.isEmpty(subMinor))
					mm = mm + "." + subMinor;
			}
			else mm = " " + major.trim();
		}

		return(mm);
	}
	public static String getDBName() throws Exception
	{
		String dbName = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("db.name");
		if(dbName == null)
			throw new Exception("Unable to get database name, db.name, from application.properties file.");
		return(dbName);
	}
	public static boolean getDebugDataExport()
	{
		try
		{
		String debugDataExport = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("debug.data.export");
		if(debugDataExport == null)
			return(false);
		return Boolean.parseBoolean(debugDataExport);
		} catch (Throwable t) {
			log.log(Level.SEVERE, "An unexpeded error occured while trying to get the deliver data from the application database.", t);
			return(false);	
		}		
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
	
	public static String getKeystorePath()
	{
		return(ApplicationPropertiesFile.getPropertiesFromFile().getProperty("keystore.path"));
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
	
	public static boolean isCentral()
	{
		String isCent = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("is.central", "");
		return(StringHelper.equalIgnoreCase(isCent, "true") || StringHelper.equalIgnoreCase(isCent, "yes"));
	}
	
	public static String getCentralServerURL() throws DaqueryException
	{
//		if(!StringHelper.isBlank(System.getenv("DAQUERY_CENT_URL")))
//		{
//			return(System.getenv("DAQUERY_CENT_URL"));
//		}
//		String propertyName = ".central.server.url";
//		if(isDebugMode())
//			propertyName = "dev" + propertyName;
//		else
//			propertyName = "prod" + propertyName;
//		
//		return(ApplicationPropertiesFile.getPropertiesFromFile().getProperty(propertyName));
		return AppProperties.getCentralURL();
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
				stat.executeUpdate("update PROPERTY set value = '" + value + "' where upper(name) = '" + propertyName.trim().toUpperCase() + "'");
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
			String msg = "An unexpected error occured while getting the application database property: " + propertyName;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryException(msg + " Check the application logs for further information.", t);
		}
		finally{ApplicationDBHelper.closeConnection(conn, stat, null);}
	}		
	
/*	public static String getDBProperty(String propertyName) throws DaqueryException
	{	
		
		if(StringHelper.isEmpty(propertyName)) return(null);
		Session sess = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			String sql = "select value from property where upper(name) = '" + propertyName.trim().toUpperCase() + "'";
			SQLQuery q = sess.createSQLQuery(sql);
			String val = (String) q.uniqueResult();
			return(val);
		}
		catch(Throwable t)
		{
			String msg = "An unexpected error occured while setting the application database property: " + propertyName;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryException(msg + " Check the application logs for further information.", t);
		}
		finally{if(sess != null) sess.close();}
	} */
	
	private static final int defaultTaskQueueMaxLength = 4;
	private static final String taskQueuePrefix = "task.queue.length.";
	
	public static int getDefaultTaskQueueMaxLength()
	{
		try
		{
			String mLen = getDBProperty(taskQueuePrefix + "default");
			if(StringHelper.isEmpty(mLen)) return(defaultTaskQueueMaxLength);
			return(Integer.parseInt(mLen));
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An unexpeded error occured while trying to get the task queue lenght from the application database.", t);
			return(defaultTaskQueueMaxLength);			
		}
		
	}
	private static String taskDBPropName(String queueName)
	{
		return(taskQueuePrefix + queueName.trim().toLowerCase());
	}
/*	public static void setTaskQueueMaxLenghtexit(int max) throws DaqueryException
	{
		if(max <= 0) throw new DaqueryException("The maximum task queue length must be greater than zero.");
		String maxStr = Integer.toString(max);
		setDBProperty("task.queue.length", maxStr);
	} */
	
	public static int getTaskQueueMaxLength(String queueName)
	{
		try
		{
			String mLen = null;
			mLen = getDBProperty(taskDBPropName(queueName));
			if(StringHelper.isEmpty(mLen)) return(getDefaultTaskQueueMaxLength());
			return(Integer.parseInt(mLen));
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An unexpeded error occured while trying to get the download task queue length from the application database.", t);
			return(getDefaultTaskQueueMaxLength());			
		}		
	}
	
	public static void setTaskQueueMaxLength(String queueName, int queueLength) throws DaqueryException
	{
		if(! StringHelper.isEmpty(queueName))
		{
			setDBProperty(taskDBPropName(queueName), (new Integer(queueLength)).toString());			
		}
	}
	private static final boolean defaultDeliverData = true; 
	public static boolean getDeliverData() {
		//hard code to true for now
		return defaultDeliverData;
/*		try {
			String val = getDBProperty("deliver.data");
			if(StringHelper.isEmpty(val)) return(defaultDeliverData);
			return Boolean.parseBoolean(val);
		} catch (Throwable t) {
			log.log(Level.SEVERE, "An unexpeded error occured while trying to get the deliver data from the application database.", t);
			return(defaultDeliverData);	
		} */
	}
	public static void setDeliverData(boolean val) throws DaqueryException {
		setDBProperty("deliver.data", Boolean.toString(val));
	}
	
	private static final boolean defaultThreeDigitZip = true;
	public static boolean getThreeDigitZip() {
		try {
			String val = getDBProperty("three.digit.zip");
			if(StringHelper.isEmpty(val)) return(defaultThreeDigitZip);
			return Boolean.parseBoolean(val);
		} catch (Throwable t) {
			log.log(Level.SEVERE, "An unexpeded error occured while trying to get the three digit zip from the application database.", t);
			return(defaultThreeDigitZip);	
		}
	}
	public static void setThreeDigitZip(boolean val) throws DaqueryException {
		setDBProperty("three.digit.zip", Boolean.toString(val));
	}
	
	private static final boolean defaultDateShift = true;
	public static boolean getDateShift() {
		try {
			String val = getDBProperty("date.shift");
			if(StringHelper.isEmpty(val)) return(defaultDateShift);
			return Boolean.parseBoolean(val);
		} catch (Throwable t) {
			log.log(Level.SEVERE, "An unexpeded error occured while trying to get the date shift from the application database.", t);
			return(defaultDateShift);	
		}
	}
	public static void setDateShift(boolean val) throws DaqueryException {
		setDBProperty("date.shift", Boolean.toString(val));
	}
	
	public static String getFileOutputDir() throws DaqueryException
	{
		String val = getDBProperty("file.output.dir");
		if(val == null)
			return(System.getProperty("java.io.tmpdir"));
		else
			return(val);
	}
	public static void setFileOutputDir(String dir) throws DaqueryException
	{
		setDBProperty("file.output.dir", dir);
	}
	
	public static String getTempFileExportDir() throws DaqueryException
	{
		String val = getDBProperty("temp.export.dir");
		if(val == null)
			return(System.getProperty("java.io.tmpdir"));
		else
			return(val);
	}
	public static void setTempFileExportDir(String dir) throws DaqueryException
	{
		setDBProperty("temp.export.dir", dir);
	}
	
	private static final String defaultCasePerFile = "70000";
	public static String getCasePerFile() throws DaqueryException
	{
		String val = getDBProperty("case.per.file");
		if(val == null)
			return defaultCasePerFile;
		else
			return val;
	}
	
	public static void setCasePerFile(String val) throws DaqueryException
	{
		setDBProperty("case.per.file", val);
	}
	
	public static String getDefaultCentralServerURL() throws DaqueryException
	{
		if(!StringHelper.isBlank(System.getenv("DAQUERY_CENT_URL")))
		{
			return(System.getenv("DAQUERY_CENT_URL"));
		}
		String propertyName = "default.central.server.url";
		
		return(ApplicationPropertiesFile.getPropertiesFromFile().getProperty(propertyName));
	}
	
	public static String getCentralURL() throws DaqueryException
	{
		try{
			String val = getDBProperty("central.url");
			if(val == null)
				return getDefaultCentralServerURL();
			else
				return val;
		} catch(Throwable t){
			return getDefaultCentralServerURL();
		}
	}
	
	public static void setCentralURL(String val) throws DaqueryException
	{
		setDBProperty("central.url", val);
	}
	
	
	public static String getTrackingDir() throws DaqueryException
	{
		String val = getDBProperty("tracking.output.dir");
		if(val == null)
			return(StringHelper.ensureTrailingSlashFile(System.getProperty("java.io.tmpdir")) + "daquery_tracking_logs");
		else
			return(val);
	}	
	public static void setTrackingDir(String dir) throws DaqueryException
	{
		setDBProperty("tracking.output.dir", dir);
	}
	
	public static String getLocalDeliveryDir() throws DaqueryException
	{
		String val = getDBProperty("local.delivery.dir");
		if(val == null)
			return(System.getProperty("java.io.tmpdir"));
		else
			return(val);
	}
	public static void setLocalDeliveryDir(String dir) throws DaqueryException
	{
		setDBProperty("local.delivery.dir", dir);
	}
	
	public static String getBuildNo()
	{
		String bn = VersionPropertiesFile.getPropertiesFromFile().getProperty("build.no", "");
		if(StringHelper.isEmpty(bn)) return(null);
		return(bn);
	}

	public static String getBuildBranch()
	{
		String bn = VersionPropertiesFile.getPropertiesFromFile().getProperty("branch", "");
		if(StringHelper.isEmpty(bn)) return(null);
		return(bn);
	}

	public static String getMajorVersion()
	{
		String bn = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("major.version", "");
		if(StringHelper.isEmpty(bn)) return(null);
		return(bn);
	}

	public static String getMinorVersion()
	{
		String bn = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("minor.version", "");
		if(StringHelper.isEmpty(bn)) return(null);
		return(bn);
	}

	public static String getSubMinorVersion()
	{
		String bn = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("sub.minor.version", "");
		if(StringHelper.isEmpty(bn)) return(null);
		return(bn);
	}
	
	
	public static String getBuildType()
	{
		String bn = ApplicationPropertiesFile.getPropertiesFromFile().getProperty("build.type", "");
		if(StringHelper.isEmpty(bn)) return(null);
		return(bn);
	}
		
	public static String getDisplayVersion()
	{
		String buildN = getBuildNo();
		String branch = getBuildBranch();
		String type = getBuildType();
		
		
		if(!StringHelper.isEmpty(type)) type = " " + type.trim();
		else type = "";
		
		if(!StringHelper.isBlank(buildN)) buildN = " build " + buildN.trim();
		else buildN = "";
		
		if(!StringHelper.isBlank(branch) && ! branch.trim().toLowerCase().equals("master")) branch = " <font color=\"red\"><em>BRANCH</em> " + branch.trim() + "</font>";
		else branch = "";
		
		String vsn = getCurrentVersion() + type + buildN + branch;
		if(! StringHelper.isEmpty(vsn)) vsn = "<b>Version</b>" + vsn;
		
		return(vsn);
		
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
