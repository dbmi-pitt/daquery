package edu.pitt.dbmi.daquery.central.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.util.*;
import edu.pitt.dbmi.daquery.central.ConnectionRequest;
import edu.pitt.dbmi.daquery.central.ConnectionRequestStatus;
import edu.pitt.dbmi.daquery.central.DaqueryVersion;
import edu.pitt.dbmi.daquery.central.SiteContact;
import edu.pitt.dbmi.daquery.common.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.*;

public class DBHelper
{
    public static void main(String [] args) throws Exception
    {
    	AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
    	NetworkDAO.getAllNetworks();
    }
	
	private static Logger log = Logger.getLogger(DBHelper.class.getName());
	
	/**
	 * Authenticate a site based on it's name or id and the static site key.
	 * 
	 * @param siteNameOrId The site name or id.
	 * @param sitekey The key to check against.
	 * @return true if the site key matches, false otherwise.
	 */
	public static boolean authenticateSite(String siteNameOrId, String sitekey) throws DaqueryException
	{
		try
		{
			Site site = SiteDAO.querySiteByID(siteNameOrId);
			if(site == null) site = SiteDAO.querySiteByNameCaseInsensitive(siteNameOrId);
			if(site == null || StringHelper.isEmpty(site.getAccessKey())) return(false);
			return(sitekey.equals(site.getAccessKey()));
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An error occurred while checking a site authorization when accessing the daquery-central application database.", t);
			throw new DaqueryException("An unexpected error occurred on the central server while trying to authenticate " + siteNameOrId, t);
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
			String msg = "An error occurred while checking if a site key is temporary when accessing the daquery-central application database.  The site name or id being checked " + siteNameOrId;
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
				String msg = "An error occurred while looking up a site id with name: " + sitename;
				log.log(Level.SEVERE, msg, t);
				throw new DaqueryCentralException(msg, t);
			}
		}

	}
	
	/**
	 * Get a site by siteId
	 * 
	 * @param sitename The name of the site.
	 * @return The database id of the site.				Query q2 = sess.createQuery(queryString)

	 * @throws DaqueryCentralException
	 */
	public static Site getSite(String siteId) throws DaqueryCentralException
	{
		try
		{
			Site site = SiteDAO.querySiteByID(siteId);
			return site;
			
		}
		catch(Throwable t)
		{
			if(t instanceof DaqueryCentralException)
				throw (DaqueryCentralException) t;
			else
			{
				String msg = "An error occurred while looking up a site id with siteId: " + siteId;
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
	public static String getNewSiteKey(String siteName) throws DaqueryCentralException
	{
		Connection conn = null;
		Statement stat = null;
		try
		{
			Site site = SiteDAO.getSiteByNameOrIdCaseInsensitive(siteName);
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
				throw new DaqueryCentralException("Site with name or id: " + siteName + " not found while trying to generate and store a new site key");
		}
		catch(Throwable t)
		{
			String msg = "An error occurred while generating and setting a site access key.  Site name or id was " + siteName;
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
	public static List<Network> getAllowedNetworks(String siteId) throws DaqueryCentralException, DaqueryException
	{
		List<Network> nets = NetworkDAO.getAllNetworks();
		List<Network> returnNets = new ArrayList<Network>();
		for(Network net : nets)
		{
			//CDB remove the Data Sources and Data Models from the Networks before passing them back to
			//the sites.  I removed the Data Sources because it makes no sense for the Central Network to have
			//a defined data source.  I removed the Data Model because I could not pass the Network back with 
			//a defined Data Model XML.  It kept throwing errors.
			if(net != null && net.findOutgoingSite(siteId) != null)
			{
				if (net.getDataModels().iterator().next() != null)
				{
					net.getDataModels().iterator().next().setDataSources(new HashSet<DataSource>());
					//net.getDataModel().setDataExportConf("");
				}
				returnNets.add(net);
			}
		}
			
		return(returnNets);
		
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
	 * Get the latest daquery_version
	 * @throws DaqueryCentralException
	 */
	public static DaqueryVersion getLatestDaqueryVersion() throws DaqueryCentralException {
		String sql = "select * from daquery_version order by build_num desc fetch first row only";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return new DaqueryVersion(rs);
			} else {
				return null;
			}
		} catch (Throwable t) {
			String msg = "An unexpected error occurred while looking up the lastest daquery version";
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			ApplicationDBHelper.closeConnection(conn, ps, rs);
		}
	}
	
	/**
	 * Get the site contact by site_id, user_id
	 * @param siteId
	 * @param userId
	 * @throws DaqueryCentralException
	 */
	public static SiteContact getSiteContact(String siteId, String userId) throws DaqueryCentralException {
		String sql = "select id, site_id, user_id, email, real_name from site_contact where site_id=? and user_id=?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, siteId);
			ps.setString(2, userId);
			rs = ps.executeQuery();
			if(rs.next()) {
				return new SiteContact(rs);
			} else {
				return null;
			}
		} catch (Throwable t) {
			String msg = "An unexpected error occurred while looking up the site contact with site_id: " + siteId + " user_id: " + userId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			ApplicationDBHelper.closeConnection(conn, ps, rs);
		}
	}
	
	/**
	 * Get the site contacts by site_id
	 * @param siteId
	 * @param userId
	 * @throws DaqueryCentralException
	 */
	public static List<String> getSiteContactsEmail(String siteId) throws DaqueryCentralException {
		String sql = "select email from site_contact where site_id=?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, siteId);
			rs = ps.executeQuery();
			List<String> contacts = new ArrayList<>();
			while(rs.next()) {
				contacts.add(rs.getString("email"));
			}
			
			return contacts;
		} catch (Throwable t) {
			String msg = "An unexpected error occurred while looking up the site contact with site_id: " + siteId;
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
	public static boolean createConnectionRequest(String networkId, String fromSiteId, String toSiteId, String requesterEmail) throws DaqueryCentralException {
		String sql = "insert into connection_request (network_id, from_site_id, to_site_id, status, requester_email) values (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, networkId);
			ps.setString(2, fromSiteId);
			ps.setString(3, toSiteId);
			ps.setString(4, "PENDING");
			ps.setString(5, requesterEmail);
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
	 * Create the site contact with site_id, user_id, email, real_name
	 * @param String siteId
	 * @param String userId
	 * @param String email
	 * @param String realName
	 * @throws DaqueryCentralException
	 */
	public static boolean createSiteContact(String siteId, String userId, String email, String realName) throws DaqueryCentralException {
		String sql = "insert into site_contact (site_id, user_id, email, real_name) values (?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, siteId);
			ps.setString(2, userId);
			ps.setString(3, email);
			ps.setString(4, realName);
			ps.execute();
			
			return true;
		} catch(Throwable t) {
			String msg = "An unexpected error occurred while creating the site contact with site_id: " + siteId + " user_id: " + userId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			ApplicationDBHelper.closeConnection(conn, ps, null);
		}
	}
	
	/**
	 * Delete the site contact with site_id, user_id
	 * @param String siteId
	 * @param String userId
	 * @throws DaqueryCentralException
	 */
	public static boolean deleteSiteContact(String siteId, String userId) throws DaqueryCentralException {
		String sql = "delete from site_contact where site_id=? and user_id=?";
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ApplicationDBHelper.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, siteId);
			ps.setString(2, userId);
			ps.execute();
			
			return true;
		} catch(Throwable t) {
			String msg = "An unexpected error occurred while deleteing the site contact with site_id: " + siteId + " user_id: " + userId;
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
	public static List<Site> getPendingSites(String networkId, String siteId, ConnectionRequestStatus status) throws DaqueryCentralException{
		String sql = "select s.site_id from site s join connection_request cr on s.site_id = cr.from_site_id where cr.network_id = '" + networkId + "' and cr.to_site_id = '" + siteId + "' and trim(upper(cr.status)) = '" + status.name().trim().toUpperCase() + "'";
		System.out.println(sql);
		Session sess = null;
		
		try {
			sess = HibernateConfiguration.openSession();
			SQLQuery q = sess.createSQLQuery(sql);
			List<String> sIds = q.list();
			List<Site> sites = new ArrayList<Site>();
			for(String sid : sIds)
			{
				Site s = SiteDAO.querySiteByID(sid);
				sites.add(s);
			}
			return sites;
		} catch(Throwable t) {
			String msg = "An unexpected error occurred while geting pending sites with site_id: " + siteId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryCentralException(msg, t);
		} finally {
			if(sess != null) sess.close();
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
		
		try {
			conn = ApplicationDBHelper.getConnection();
			
			Site toSite = SiteDAO.getSiteByUUID(toSiteId);
			Site fromSite = SiteDAO.getSiteByNameOrId(fromSiteId);
			Network net = NetworkDAO.getNetworkById(networkId);
			
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select requester_email from connection_request where network_id = '" + networkId + "' and from_site_id = '" + fromSiteId + "' and to_site_id = '" + toSiteId + "'");
			String requesterEmail = null;
			if(rs.next())
				requesterEmail = rs.getString(1);
			if(requesterEmail != null)
			{
				DaqueryUser user = DaqueryUserDAO.queryUserByEmail(requesterEmail);
				List<String> toAddresses = new ArrayList<String>();
				toAddresses.add(requesterEmail);
				EmailHelper eh = new EmailHelper();
	            String emailMessage = EmailUtil.generateEmailHeader(net.getName(), toSite.getName(), null); 

	            emailMessage += "Daquery site " + toSite.getName() + 
						  " on network " + net.getName() + 
						  " has " + status.toLowerCase() + " your request to connect from your site " + fromSite.getName();
				eh.sendMail("Daquery Connection Request " + StringHelper.capitalize(status), emailMessage, toAddresses, null);
			}
			else
				log.log(Level.WARNING, "Unable to email a site on a " + status.toLowerCase() + " connection request because a requester email was not found.  toSiteId:" + toSiteId + " fromSiteId:" + fromSiteId + " networkId:" + networkId);
			
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

	public static String getOutgoingSiteStatus(String fromSiteId, String toSiteId, String networkId) throws DaqueryException
	{
		Session s = null;
		try
		{
			s = HibernateConfiguration.openSession();
			String sql = "select status from connection_request where network_id = '" + networkId +"' and to_site_id = '" + toSiteId + "' and from_site_id = '" + fromSiteId + "'";
			SQLQuery q = s.createSQLQuery(sql);
			List<String> vals = q.list();
			if(vals != null && vals.size() == 1)
				return(vals.get(0));
			else
				return(null);
				
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "Error while getting outging site status for fromSite:" + fromSiteId + " toSite:" + toSiteId + " networkId:" + networkId, t);
			throw t;
		}
		finally
		{
			if(s != null) s.close();
		}
	}
}
