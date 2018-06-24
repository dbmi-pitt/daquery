package edu.pitt.dbmi.daquery.update;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.transaction.Transaction;

import org.hibernate.internal.util.StringHelper;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ApplicationDBHelper;
import edu.pitt.dbmi.daquery.common.util.ApplicationPropertiesFile;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.FileHelper;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.ReflectionHelper;

public class UpdateDBForVersion
{
	private static Logger log = Logger.getLogger(UpdateDBForVersion.class.getName());
	
	private static final String BASE_DB_PACKAGE = "edu.pitt.dbmi.daquery.update.db";
	
	  private static File[] getResourceFolderFiles (String folder)
	  {
		  ClassLoader loader = Thread.currentThread().getContextClassLoader();
		  URL url = loader.getResource(folder);
		  String path = url.getPath();
		  File f = new File(path);
		  File [] fs = f.listFiles();
		  return fs;
	  }

	public static void main (String[] args)
	{
		updateDB();
	}
	public static void updateDB()
	{
		Connection conn = null;
		try
		{
			//if the database hasn't been set up yet, do nothing
			String dbDir = AppProperties.getDBDir();
			File dbDirF = new File(dbDir);
			if(! dbDirF.exists())			
				return;
			
			Float version = null;
			conn = ApplicationDBHelper.getConnection();
			conn.setAutoCommit(false);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from property where name = 'db.version'");
			if(rs.next())
			{
				try{
					String strVer = rs.getString("value");
					float v = Float.parseFloat(strVer);
					version = new Float(v);
				}
				catch(Throwable t)
				{
					log.log(Level.SEVERE, "Error while reading DB version during strtup.", t);
					HibernateConfiguration.setErroredStartup(true);
					return;
				}
			}
			if(version == null) version = new Float(-1.0);
			List<UpdateInfo> updates = getDBUpdateClasses();
			Collections.sort(updates);
			float maxVersion = version.floatValue();
			for(UpdateInfo ui : updates)
			{
				if(ui.version > version.floatValue())
				{
					log.log(Level.INFO, "Updating database to version " + ui.version);
					updateDDL(ui, conn);
					conn.commit();
					updateData(ui, conn);
					conn.commit();
					maxVersion = ui.version;
					
				}
			}


			if(maxVersion > version.floatValue())
			{
				updateVersion(version, maxVersion, conn);
			}
			conn.commit();
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "Unexpeded error during DB configuration during startup.", t);
			HibernateConfiguration.setErroredStartup(true);
			try{if(conn != null) conn.rollback();}
			catch(SQLException e)
			{
				log.log(Level.SEVERE, "Error while rolling back database changes.", e);
			}
		}
		finally
		{
			try{if(conn != null) conn.close();}
			catch(SQLException e)
			{
				log.log(Level.SEVERE, "Error while closing connection during db updates.", e);
			}
		}		
	}
	private static void updateVersion(Float currentVersion, float newVersion, Connection conn) throws SQLException
	{
		Statement st = conn.createStatement();
		//no version present, need to insert
		if(currentVersion.floatValue() < 0.0f)
		{
			st.executeUpdate("insert into property (name, value) values ('db.version', '" + newVersion + "')");
		}
		else //otherwise update
		{
			st.executeUpdate("update property set value = '" + newVersion + "' where name = 'db.version'");
		}
	}
	private static void updateData(UpdateInfo ui, Connection conn) throws Exception
	{
		Object obj = ui.cls.newInstance();
		DBUpdater updater = (DBUpdater) obj;
		updater.updateData(conn);
		if(AppProperties.isCentral())
			updater.updateCentralData(conn);
	}
	
	private static List<UpdateInfo> getDBUpdateClasses() throws IOException
	{
		List<UpdateInfo> rVal = new ArrayList<UpdateInfo>();
		for(Class<?> cls : ReflectionHelper.classesInPackage("edu.pitt.dbmi.daquery.update.db"))
		{
			if(DBUpdater.class.isAssignableFrom(cls))
			{
				DBVersion vsn = cls.getAnnotation(DBVersion.class);
				if(vsn != null)
				{
					UpdateInfo uInfo = new UpdateInfo();
					uInfo.cls = cls;
					uInfo.version = vsn.version();
					uInfo.ddlFile = vsn.ddlFile();
					uInfo.centralDDLFile = vsn.centralDDLFile();
					rVal.add(uInfo);
				}
			}
		}
		return(rVal);
	}
	
	private static class UpdateInfo implements Comparable<UpdateInfo>
	{
		Class<?> cls;
		float version;
		String ddlFile;
		String centralDDLFile;
		
		@Override
		public int compareTo(UpdateInfo val)
		{
			return this.version < val.version ? -1 : this.version > val.version ? 1 : 0;
		}
	}
	
	private static String classNameFromPath(String path)
	{
		String rVal = path.trim();
		if(rVal.toLowerCase().endsWith(".class"))
			rVal = rVal.substring(0, rVal.length() - 6);
		else
			return(null);
		  
		int lastSlash = rVal.lastIndexOf("/");
		if(lastSlash == -1) lastSlash = rVal.lastIndexOf("\\");
		if(lastSlash != -1)
			rVal = rVal.substring(lastSlash + 1);
		return(BASE_DB_PACKAGE + "." + rVal);
	  }

	private static void updateDDL(UpdateInfo info, Connection conn) throws DaqueryException, SQLException
	{
		if(! StringHelper.isEmpty(info.ddlFile))
			updateDDL(info.ddlFile, conn);
		if( (! StringHelper.isEmpty(info.centralDDLFile)) && AppProperties.isCentral())
			updateDDL(info.centralDDLFile, conn);
	}
	
	private static void updateDDL(String ddlFileName, Connection conn) throws DaqueryException, SQLException
	{
		log.log(Level.INFO, "Updating database with " + "/edu/pitt/dbmi/daquery/update/db/" + ddlFileName);
		InputStream is = ApplicationPropertiesFile.class.getResourceAsStream("/edu/pitt/dbmi/daquery/update/db/" + ddlFileName);
	    Scanner inputScanner = new Scanner(is);
	    inputScanner.useDelimiter(ApplicationDBHelper.DDL_SCANNER_PATTERN);
	    Statement dbStatement = null;
	    dbStatement = conn.createStatement();
	    ApplicationDBHelper.executeDDL(dbStatement, inputScanner);
		
	}
	
	/*	public static boolean updateDB()
	{
		Connection dbConn = null;
	    Scanner inputScanner = new Scanner(input);
	    inputScanner.useDelimiter(ApplicationDBHelper.DDL_SCANNER_PATTERN);
	    Statement dbStatement = null;
	    try
	    {
	    	dbConn = getConnection();
	        dbStatement = dbConn.createStatement();
	        return(ApplicationPropertiesFile.getPropertiesFromFile().getProperty("initialization.ddl.file"));
	        executeDDL(dbStatement, inputScanner);
	
	        return(true);
	    }
	    catch(Throwable t)
	    {
	    	log.log(Level.SEVERE, "An error occurred while trying to import a DDL file.", t);
	    	return(false);
	    }
	    finally
	    {
	    	if(inputScanner != null)
	    		inputScanner.close();
	        closeConnection(dbConn, dbStatement, null);
	    }
	} */
}	
