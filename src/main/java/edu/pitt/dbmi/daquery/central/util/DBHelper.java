package edu.pitt.dbmi.daquery.central.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.util.*;
import edu.pitt.dbmi.daquery.central.ConnectionRequest;
import edu.pitt.dbmi.daquery.central.ConnectionRequestStatus;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.*;

public class DBHelper
{
	public static void main(String [] args) throws Exception
	{
		//for testing set the location of the application database
		AppProperties.setDevHomeDir("/home/devuser/daquery-data");
		List<Network> nets = getAllowedNetworks("20b23b5c-61ad-44eb-8eef-886adcced18e");
		for(Network net : nets)
		{
			System.out.println(net.getName() + ":" + net.getNetworkId());
			for(Site site : net.getOutgoingQuerySites())
			{
				System.out.println("\t" + site.getName() + ":" + site.getUrl() + ":" + site.getSiteId());
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
			Site site = SiteDAO.querySiteByID(siteNameOrId);
			if(site == null) site = SiteDAO.querySiteByName(siteNameOrId);
			if(site == null) return(false);
			
			return(sitekey.equals(site.getAccessKey()));
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
			Site site = SiteDAO.getSiteByNameOrId(siteNameOrId);
			return(site.isTempKey());
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
	 * @return The database id of the site.				Query q2 = sess.createQuery(queryString)

	 * @throws DaqueryCentralException
	 */
	public static String getSiteId(String sitename) throws DaqueryCentralException
	{
		try
		{
			Site site = SiteDAO.querySiteByName(sitename);
			return(site.getSiteId());
			
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
			Site site = SiteDAO.getSiteByNameOrId(siteNameOrId);
			String newKey = PasswordUtils.randomPassword(24);
			if(site != null)
			{
				conn = ApplicationDBHelper.getConnection();
				stat = conn.createStatement();
				String sql = "update site set access_key = '" + newKey + "', tempkey = false where site_id = '" + site.getSiteId() + "'";
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
	 * Get a list of networks and associated sites that a given site is
	 * allowed to query from.
	 * 
	 * @param siteId The id for the site who's networks are being requested.
	 * @return a list of networks with associated sites.
	 * @throws DaqueryCentralException
	 */
	public static List<Network> getAllowedNetworks(String siteId) throws DaqueryCentralException
	{
		
		String sql = "select distinct net.network_id from outgoing_query_sites oqs, site, network net  where oqs.site_id = site.id and oqs.network_id = net.id and site.site_id = '" + siteId +"'";
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

		Session sess = null;
		Statement stat = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			SQLQuery q = sess.createSQLQuery(sql);
			List<String> netIds = q.list();
			for(String netId : netIds)
			{
				Network net = NetworkDAO.queryNetwork(netId);
				if(net != null) networks.add(net);
			}
			
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
			if(sess != null) sess.close();
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
	
	

}
