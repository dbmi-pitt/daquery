package edu.pitt.dbmi.daquery.central.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.util.*;
import edu.pitt.dbmi.daquery.central.ConnectionRequest;
import edu.pitt.dbmi.daquery.central.ConnectionRequestStatus;
import edu.pitt.dbmi.daquery.central.ExtendedSiteInfo;
import edu.pitt.dbmi.daquery.common.domain.*;

public class DBHelper
{
	public static void main(String [] args) throws Exception
	{
		//for testing set the location of the application database
		AppProperties.setDevHomeDir("/home/devuser/daquery-data");
		List<NetworkInfo> netInfo = getAllowedNetworks("20b23b5c-61ad-44eb-8eef-886adcced18e");
		for(NetworkInfo net : netInfo)
		{
			System.out.println(net.name + ":" + net.id);
			for(SiteInfo site : net.allowedSites)
			{
				System.out.println("\t" + site.siteName + ":" + site.siteURL + ":" + site.id);
			}
		}
		
	}
	
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
			ExtendedSiteInfo info = DBHelper.getExtendedSiteInfo(siteNameOrId);
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
			ExtendedSiteInfo info = DBHelper.getExtendedSiteInfo(siteNameOrId);
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
			SiteInfo info = DBHelper.getExtendedSiteInfo(sitename);
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
			SiteInfo info = DBHelper.getExtendedSiteInfo(siteNameOrId);
			String newKey = PasswordUtils.randomPassword(24);
			if(info.id != null)
			{
				conn = ApplicationDBHelper.getConnection();
				stat = conn.createStatement();
				String sql = "update site set access_key = '" + newKey + "', tempkey = false where id = '" + info.id + "'";
				stat.executeUpdate(sql);
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
	public static ExtendedSiteInfo getExtendedSiteInfo(String siteNameOrId) throws DaqueryCentralException
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
					return(new ExtendedSiteInfo(results));
			}
			else
			{
				results.close();
				stat.close();
				stat = conn.createStatement();
				results = stat.executeQuery("select *from site where id = '" + siteNameOrId + "'");
				if(results.next())
				{
					return(new ExtendedSiteInfo(results));
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
	 * Get a list of networks and associated sites that a given site is
	 * allowed to query from.
	 * 
	 * @param siteId The id for the site who's networks are being requested.
	 * @return a list of networks with associated sites.
	 * @throws DaqueryCentralException
	 */
	public static List<Network> getAllowedNetworks(String siteId) throws DaqueryCentralException
	{
		String sql = "select network_id from network_membership where site_id = '" + siteId +"'";
/*		String sql = "select site_id, network_name, data_model, network_membership.network_id, site.name as site_name, site_url, admin_email " +
		                                  "from network_membership, " +
                                                "(select id as network_id, name as network_name, data_model from network " +
                                                          "where id in " + 
                                                                 "(select network_id from network_membership " +
                                                                                "where site_id = '" + siteId +"')) as inn, " +
                                                 "site " +
                                           "where network_membership.network_id = inn.network_id and " +
                                                 "site.id = network_membership.site_id " +
                                           "order by network_membership.network_id"; */
		List<Network> networks = new ArrayList<Network>();
			return(networks);	
		}
		catch(Throwable t)
		{
			String msg = "An unexpected error occurred while looking up the available networks/sites for site with id: " + siteId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		}
		finally
		{
			ApplicationDBHelper.closeConnection(conn, s, rs);
		}
		
	}

	/**
	 * Get the connection request by network_id, from_site_id, to_site_id
	 * @param networkId
	 * @param fromSiteId
	 * @param toSiteId
	 * @throws DaqueryCentralException
	 */
	public static ConnectionRequest getConnectionRequest(String networkId, String fromSiteId, String toSiteId) throws DaqueryCentralException {
		String sql = "select id, network_id, from_site_id, to_site_id, status from connection_request where network_id=? and from_site_id=? and to_site_id=?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, networkId);
			ps.setString(2, fromSiteId);
			ps.setString(3, toSiteId);
			rs = ps.executeQuery();
			if(rs.next()) {
				return new ConnectionRequest(rs);
			} else {
				return null;
			}
		} catch (Throwable t) {
			String msg = "An unexpected error occurred while looking up the connection request with network_id: " + networkId + " from_site_id: " + fromSiteId + " to_site_id: " + toSiteId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			ApplicationDBHelper.closeConnection(conn, ps, rs);
		}
	}
	
	/**
	 * Create the connection request with network_id, from_site_id, to_site_id
	 * @param ConnectionRequest cr
	 * @throws DaqueryCentralException
	 */
	public static boolean createConnectionRequest(String networkId, String fromSiteId, String toSiteId) throws DaqueryCentralException {
		String sql = "insert into connection_request (network_id, from_site_id, to_site_id, status) values (?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, networkId);
			ps.setString(2, fromSiteId);
			ps.setString(3, toSiteId);
			ps.setString(4, "PENDING");
			ps.execute();
			
			return true;
		} catch(Throwable t) {
			String msg = "An unexpected error occurred while creating the connection request with network_id: " + networkId + " from_site_id: " + fromSiteId + " to_site_id: " + toSiteId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			ApplicationDBHelper.closeConnection(conn, ps, null);
		}
	}
	
	/**
	 * Get sites waiting for response
	 * @param <ConnectionRequestStatus>
	 * @param String siteId
	 * @throws DaqueryCentralException
	 */
	public static List<SiteInfo> getPendingSites(String networkId, String siteId, ConnectionRequestStatus status) throws DaqueryCentralException{
		String sql = "select s.id, name, access_key, tempkey, site_url, admin_email, email_access from site s join connection_request cr on s.id = cr.from_site_id where cr.network_id = ? and cr.to_site_id = ? and cr.status = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<SiteInfo> sites = new ArrayList<>();
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, networkId);
			ps.setString(2, siteId);
			ps.setString(3, status.toString());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ExtendedSiteInfo site = new ExtendedSiteInfo();
				site.id = rs.getString("id");
				site.siteName = rs.getString("name");
				site.siteURL = rs.getString("site_url");
				site.adminEmail = rs.getString("admin_email");
				sites.add(site);
			}
			
			return sites;	
		} catch(Throwable t) {
			String msg = "An unexpected error occurred while geting pending sites with site_id: " + siteId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			ApplicationDBHelper.closeConnection(conn, ps, null);
		}
	}
	
	/**
	 * Get site by site id
	 * @param String siteId
	 * @throws DaqueryCentralException
	 */
	public static ExtendedSiteInfo getSite(String siteId) throws DaqueryCentralException{
		String sql = "select id, name, access_key, tempkey, site_url, admin_email, email_access from site where site.id = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ExtendedSiteInfo site = new ExtendedSiteInfo();
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, siteId);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				site.id = rs.getString("id");
				site.siteName = rs.getString("name");
				site.siteURL = rs.getString("site_url");
				site.adminEmail = rs.getString("admin_email");
			}
			
			return site;	
		} catch(Throwable t) {
			String msg = "An unexpected error occurred while geting pending sites with site_id: " + siteId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			ApplicationDBHelper.closeConnection(conn, ps, null);
		}
	}
	
	/**
	 * Approve connection request
	 * @param String networkId
	 * @param String fromSiteId
	 * @param String toSiteId
	 * @throws DaqueryCentralException
	 */
	public static boolean updateConnectionRequest(String networkId, String fromSiteId, String toSiteId, String status) throws DaqueryCentralException{
		String sql = "update connection_request set status = ? where network_id = ? and from_site_id = ? and to_site_id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		
		ExtendedSiteInfo site = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, status);
			ps.setString(2, networkId);
			ps.setString(3, fromSiteId);
			ps.setString(4, toSiteId);
			int rows = ps.executeUpdate();
			
			if(rows == 1)
				return true;
			else
				throw new Exception();
		} catch(Throwable t) {
			String msg = "An unexpected error occurred while approving connection request, network_id: " + networkId + " from_site_id: " + fromSiteId + " to_site_id: " + toSiteId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			ApplicationDBHelper.closeConnection(conn, ps, null);
		}
	}
}
