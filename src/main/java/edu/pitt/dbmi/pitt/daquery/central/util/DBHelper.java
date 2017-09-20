package edu.pitt.dbmi.pitt.daquery.central.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.util.ApplicationDBHelper;
import edu.pitt.dbmi.daquery.common.util.PasswordUtils;

public class DBHelper
{
	private static Logger log = Logger.getLogger(DBHelper.class.getName());
	public static boolean authenticateSite(String sitename, String sitekey)
	{
		Connection conn = null;
		Statement stat = null;
		ResultSet results = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			stat = conn.createStatement();
			results = stat.executeQuery("select access_key from site where ucase(name) = " + sitename.trim().toUpperCase());
			if(results.next())
			{
				if(sitekey.equals(results.getString(1)))
					return(true);
				else
					return(false);
			}
			else
				return(false);
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An error occured while checking a site authorization when accessing the daquery-central application database.", t);
			return(false);
		}
		finally{ApplicationDBHelper.closeConnection(conn, stat, results);}
		
		
	}
	
	public static boolean isSiteKeyTemp(String sitename) throws DaqueryCentralException
	{
		Connection conn = null;
		Statement stat = null;
		ResultSet results = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			stat = conn.createStatement();
			results = stat.executeQuery("select tempkey from site where ucase(name) = " + sitename.trim().toUpperCase());
			if(results.next())
			{
				return(results.getBoolean(1));
			}
			else
				throw new DaqueryCentralException("Site: " + sitename + " not found while checking to see if the site has a temporary access key");
		}
		catch(Throwable t)
		{
			if(t instanceof DaqueryCentralException)
				throw (DaqueryCentralException) t;
			else
			{
				log.log(Level.SEVERE, "An error occured while checking if a site key is temporary when accessing the daquery-central application database.", t);
				return(false);
			}
		}
		finally{ApplicationDBHelper.closeConnection(conn, stat, results);}
	}
	
	public static String getNewSiteKey(String sitename) throws DaqueryCentralException
	{
		Connection conn = null;
		Statement stat = null;
		ResultSet results = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			stat = conn.createStatement();
			results = stat.executeQuery("select id from site where ucase(name) = " + sitename.trim().toUpperCase());
			if(results.next())
			{
				int siteId = results.getInt(1);
				String newKey = PasswordUtils.randomPassword(24);
				results.close();
				stat.close();
				stat = conn.createStatement();
				stat.executeUpdate("update site set access_key = '" + newKey + "', tempkey = false where id = " + siteId);
				return(newKey);
			}
			else
				throw new DaqueryCentralException("Site: " + sitename + " not found while trying to generate and store a new site key");
		}
		catch(Throwable t)
		{
			if(t instanceof DaqueryCentralException)
				throw (DaqueryCentralException) t;
			else
			{
				log.log(Level.SEVERE, "An error occured while checking if a site key is temporary when accessing the daquery-central application database.", t);
				return(null);
			}
		}
		finally{ApplicationDBHelper.closeConnection(conn, stat, results);}
	}
}
