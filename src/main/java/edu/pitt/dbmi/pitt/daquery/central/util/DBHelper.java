package edu.pitt.dbmi.pitt.daquery.central.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.util.ApplicationDBHelper;
import edu.pitt.dbmi.daquery.common.util.PasswordUtils;

public class DBHelper
{
	private static Logger log = Logger.getLogger(DBHelper.class.getName());
	
	/**
	 * Authenticate a site based on it's name or id and the static site key.
	 * 
	 * @param siteNameOrId The site name or id.
	 * @param sitekey The key to check against.
	 * @return true if the site key matches, false otherwise.
	 */
	public static boolean authenticateSite(String siteNameOrId, String sitekey)
	{
		try
		{
			SiteInfo info = DBHelper.getSiteInfo(siteNameOrId);
			return(sitekey.equals(info.accessKey));
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An error occured while checking a site authorization when accessing the daquery-central application database.", t);
			return(false);
		}
		
		
	}
	
	/**
	 * Find out if a site's current authentication key has been temporarily assigned.  Takes the site name or id.
	 * 
	 * @param siteNameOrId The site name or id
	 * @return true if the site key is temporary, otherwise false
	 * @throws DaqueryCentralException
	 */
	public static boolean isSiteKeyTemp(String siteNameOrId) throws DaqueryCentralException
	{
		try
		{
			SiteInfo info = DBHelper.getSiteInfo(siteNameOrId);
			return(info.tempKey);
		}
		catch(Throwable t)
		{
			String msg = "An error occured while checking if a site key is temporary when accessing the daquery-central application database.  The site name or id being checked " + siteNameOrId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		}
		
	}
	
	/**
	 * Get a site's id given it's name
	 * 
	 * @param sitename The name of the site.
	 * @return The database id of the site.
	 * @throws DaqueryCentralException
	 */
	public static String getSiteId(String sitename) throws DaqueryCentralException
	{
		try
		{
			SiteInfo info = DBHelper.getSiteInfo(sitename);
			return(info.id);
			
		}
		catch(Throwable t)
		{
			if(t instanceof DaqueryCentralException)
				throw (DaqueryCentralException) t;
			else
			{
				String msg = "An error occured while looking up a site id with name: " + sitename;
				log.log(Level.SEVERE, msg, t);
				throw new DaqueryCentralException(msg, t);
			}
		}

	}
	
	/**
	 * Generate a new key for a site and update the site record in the application db with this key.
	 * @param siteNameOrId
	 * @return The newly generated key.
	 * @throws DaqueryCentralException
	 */
	public static String getNewSiteKey(String siteNameOrId) throws DaqueryCentralException
	{
		Connection conn = null;
		Statement stat = null;
		try
		{
			SiteInfo info = DBHelper.getSiteInfo(siteNameOrId);
			String newKey = PasswordUtils.randomPassword(24);
			if(info.id != null)
			{
				conn = ApplicationDBHelper.getConnection();
				stat = conn.createStatement();
				stat.executeUpdate("update site set access_key = '" + newKey + "', tempkey = false where id = " + info.id);
				conn.commit();
				return(newKey);
			}
			else
				throw new DaqueryCentralException("Site with name or id: " + siteNameOrId + " not found while trying to generate and store a new site key");
		}
		catch(Throwable t)
		{
			String msg = "An error occured while generating and setting a site access key.  Site name or id was " + siteNameOrId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);

		}
		finally{ApplicationDBHelper.closeConnection(conn, stat, null);}
	}
	
	/**
	 * Get the information for a given site given the sites name or id.  If a record isn't found null is returned.
	 * 
	 * @param siteNameOrId
	 * @return A SiteInfo object with the information for the site or a null if no record was found.
	 * @throws DaqueryCentralException
	 */
	private static SiteInfo getSiteInfo(String siteNameOrId) throws DaqueryCentralException
	{
		Connection conn = null;
		Statement stat = null;
		ResultSet results = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			stat = conn.createStatement();
			results = stat.executeQuery("select * from site where ucase(name) = '" + siteNameOrId.trim().toUpperCase() +"'");
			if(results.next())
			{
					return(new SiteInfo(results));
			}
			else
			{
				results.close();
				stat.close();
				stat = conn.createStatement();
				results = stat.executeQuery("select *from site where id = '" + siteNameOrId + "'");
				if(results.next())
				{
					return(new SiteInfo(results));
				}
				else
				{
					return(null);
				}
			}
		}
		catch(Throwable t)
		{
			String msg = "An error occured while looking for site information with an id or site name of: " + siteNameOrId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		}
		finally{ApplicationDBHelper.closeConnection(conn, stat, results);}
		
	}
	
	/**
	 * A helper class to hold site information.
	 *
	 */
	private static class SiteInfo
	{
		String id;
		String accessKey;
		boolean tempKey;
		String siteName;
		boolean emailAccess;
		
		SiteInfo(){}
		
		SiteInfo(ResultSet rs) throws SQLException
		{
			id = rs.getString("id");
			accessKey = rs.getString("access_key");
			tempKey = rs.getBoolean("tempkey");
			siteName = rs.getString("name");
			emailAccess = rs.getBoolean("email_access");
		}
	}
}
