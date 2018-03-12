package edu.pitt.dbmi.daquery.common.dao;

import java.util.ArrayList;
import java.util.HashMap;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.Response;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.util.StringHelper;

import edu.pitt.dbmi.daquery.common.domain.DecodedErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;

public class SiteDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(SiteDAO.class.getName());
	
    public static final String LOCAL_SITE_ID_PROP_NAME = "site.id";
    
    public static void main(String [] args)
    {
    	//AppProperties.setDevHomeDir("/home/devuser/dq-data");
    	AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
    	getLocalSite();
    }
    
    public static List<Site> queryAllSites() throws Exception {
    	try { 		
    	    List<Site> site_list = executeQueryReturnList(Site.FIND_ALL, null, logger);
	        return site_list;
	    
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings." ,e);
            throw e;
        } catch (Throwable t) {
        	logger.log(Level.SEVERE, "Unexpected error querying all sites." ,t);
            throw t;
        }
            
    }

    public static Site querySiteByID(String id) throws Exception {
    	// auto generated ID
        if(id.matches("^\\d+$"))
        	logger.info("searching for #### single Site id= " + id);
        else
        	logger.info("searching for #### single Site uuid= " + id);
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		Site site = null;
    		if(id.matches("^\\d+$")) {
    			ParameterItem piId = new ParameterItem("id", Long.parseLong(id));
    			pList.add(piId);
    			site = executeQueryReturnSingle(Site.FIND_BY_ID, pList, logger);
    			if(site == null)
    			{
	    			ParameterItem piUUId = new ParameterItem("uuid", id);
	    			pList.clear();
	    			pList.add(piUUId);
	    			site = executeQueryReturnSingle(Site.FIND_BY_UUID, pList, logger);    				
    			}
    		}
    		else {
    			ParameterItem piUUId = new ParameterItem("uuid", id);
    			pList.add(piUUId);
    			site = executeQueryReturnSingle(Site.FIND_BY_UUID, pList, logger);
    		}
    		
	        return site;
	    
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings." ,e);
            throw e;
        } catch (Throwable t) {
        	logger.log(Level.SEVERE, "Unexpected error encountered trying to retrieve site by id [" + id + "]", t);
            throw t;        	
        }
    }
    
    public static Site querySiteByName(String name) throws Exception {
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		Site site = null;
    		ParameterItem piName = new ParameterItem("name", name);
			pList.add(piName);
			site = executeQueryReturnSingle(Site.FIND_BY_NAME, pList, logger);
    		
	        return site;
	    
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.", e);
            throw e;
        } catch (Throwable t) {
        	logger.log(Level.SEVERE, "Unexpected error encountered trying to retrieve site by name [" + name + "]", t);
            throw t;        	
        }
    }

    public static Site getSiteByNameOrId(String nameOrId) throws DaqueryException
    {
		try
		{
		    Site site = querySiteByID(nameOrId);
		    if(site == null) site = querySiteByName(nameOrId);
		    return(site);
		}
		catch(Throwable t)
		{
		    String msg = "Unexpected error while querying a site by name or id: [" + nameOrId + "].";
		    logger.log(Level.SEVERE, msg, t);
		    throw new DaqueryException(msg + "  Check server logs for more information.", t);
		}
    }
    
    /** Get sites by network_id
     *  @param netId
     *  @return List<Site>
     * @throws DaqueryErrorException 
     * @throws DaqueryException 
     * @throws Exception 
     */
    public static List<Site> queryConnectedOutgoingSitesByNetworkId(long netId) throws DaqueryException, DaqueryErrorException {
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		
    		updatePendingSitesByNetwork(netId, s);
    		
    		String sql = "SELECT s.* FROM SITE as s JOIN OUTGOING_QUERY_SITES as oqs ON s.id = oqs.site_id JOIN NETWORK as n ON n.id = oqs.network_id WHERE s.status='CONNECTED' and n.id = :network_id";
			Query query = s.createSQLQuery(sql)
						   .addEntity(Site.class)
						   .setParameter("network_id", netId);
			
			List result = query.list();
    		
	        return result;
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.", e);
            throw e;
        } catch (Throwable t) {
        	logger.log(Level.SEVERE, "Unexpected error encountered trying to retrieve outgoing sites site by network id [" + netId + "]", t);
            throw t;        	
        }
    	finally
    	{
    		if(s != null) s.close();
    	}
    }
    
    /**
     * Check the central server to see if any outstanding PENDING sites for a network
     * have responded and update accordingly.  This uses the Network database id (not UUID).
     * 
     * @param netId The database id for the Network to check (id field, not network_id/UUID field)
     *
     */
    public static void updatePendingSitesByNetwork(long netId, Session s) throws DaqueryException, DaqueryErrorException
    {
		//before getting connected sites see if there are any pending sites that have been approved or disapproved
		String sql = "SELECT s.site_id, n.network_id FROM SITE as s JOIN OUTGOING_QUERY_SITES as oqs ON s.id = oqs.site_id JOIN NETWORK as n ON n.id = oqs.network_id WHERE s.status='PENDING' and n.id = " + netId;    		
		
		Query q1 = s.createSQLQuery(sql);
		List<Object[]> idList = q1.list();
		if(idList.size() > 0)
		{
			Site mySite = SiteDAO.getLocalSite();
			for(Object [] ids : idList)
			{
				String siteUUID = (String) ids[0];
				String netUUID = (String) ids[1];
				String status = checkSiteStatusAtCentral(mySite.getSiteId(), siteUUID, netUUID, s);
				if(! StringHelper.isEmpty(status))
				{
					if(!status.equals("PENDING"))
					{
						if(status.equals("APPROVED"))
							updateOutgoingSiteStatus(siteUUID, netId, "CONNECTED", s);
						else
							updateOutgoingSiteStatus(siteUUID, netId, status, s);
					}
				}
			}
		}    	
    }
    
    public static void updatePendingSitesByNetwork(List<Network> nets) throws DaqueryException, DaqueryErrorException
    {
    	Session s = null;
    	try
    	{
    		s = HibernateConfiguration.openSession();
    		for(Network net : nets)
    			updatePendingSitesByNetwork(net.getId(), s);
    	} catch (HibernateException e) {
    		logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.", e);
    		throw e;
    	} catch (Throwable t) {
    		logger.log(Level.SEVERE, "Unexpected error encountered trying to update pending sites site by network", t);
    		throw t;        	
    	}
    	finally
    	{
    		if(s != null) s.close();
    	}
    }
    
    private static String checkSiteStatusAtCentral(String fromSiteId, String toSiteId, String networkId, Session s) throws DaqueryErrorException, DaqueryException
    {
    	Map<String, String> params = new HashMap<String, String>();
    	params.put("to-site-id", toSiteId);
    	params.put("from-site-id", fromSiteId);
    	params.put("network-id", networkId);
    	Response resp = WSConnectionUtil.centralServerGet("site-status", params);
    	if(resp.getStatus() == 200)
    		return(resp.readEntity(String.class));
    	else
    	{
    		DecodedErrorInfo decodedInfo = ResponseHelper.decodeErrorResponse(resp);
    		if(decodedInfo != null && decodedInfo.getErrorInfo() != null)
    			throw new DaqueryErrorException(decodedInfo.getErrorInfo());
    		else
    		{
    			String addlInfo = "";
    			if(decodedInfo != null && decodedInfo.getErrorMessage() != null)
    				addlInfo = "  Additional Information: " + decodedInfo.getErrorMessage();
    			throw new DaqueryException("Error while checking site status at the Central Site." + addlInfo);
    		}	
    	}
    }
    
    private static void updateOutgoingSiteStatus(String siteUUID, long networkId, String status, Session s)
    {
		String sql = "SELECT s.* FROM SITE as s JOIN OUTGOING_QUERY_SITES as oqs ON s.id = oqs.site_id JOIN NETWORK as n ON n.id = oqs.network_id WHERE n.id = :network_id and s.site_id = :siteID";
		Transaction t = s.beginTransaction();
		Query query = s.createSQLQuery(sql)
					   .addEntity(Site.class)
					   .setParameter("network_id", networkId)
					   .setParameter("siteID", siteUUID);
		List<Site> vals = query.list();
		for(Site site : vals)
		{
			site.setStatus(status);
			s.update(site);
		}
		t.commit();
    }

    /** Get sites by network_id
     *  @param network_id
     *  @return List<Site>
     * @throws Exception 
     */
    public static List<Site> queryConnectedIncomingSitesByNetworkId(long network_id) throws Exception{
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
			
			String sql = "SELECT s.* FROM SITE as s JOIN INCOMING_QUERY_SITES as oqs ON s.id = oqs.site_id JOIN NETWORK as n ON n.id = oqs.network_id WHERE s.status='CONNECTED' and n.id = :network_id";
			Query query = s.createSQLQuery(sql)
						   .addEntity(Site.class)
						   .setParameter("network_id", network_id);
			
			List result = query.list();
    		
	        return result;
	    
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.", e);
            throw e;
    	} catch (Throwable t) {
    		logger.log(Level.SEVERE, "Unexpected error encountered trying to query incoming sites site by networkid [" + network_id + "]", t);
    		throw t;        	
    	}
    }
    
    public long createSite(Site site) throws Exception {
    	return (Long) getCurrentSession().save(site);
    }
    
    public void createOutogingSites(long network_id, long site_id) throws Exception {
    	Session s = null;
    	try {			
			String sql = "INSERT INTO OUTGOING_QUERY_SITES (site_id, network_id) VALUES (:site_id, :network_id)";
			Query query = getCurrentSession().createSQLQuery(sql)
											 .setParameter("site_id", site_id)
											 .setParameter("network_id", network_id);
			
			query.executeUpdate();
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.", e);
            throw e;
    	} catch (Throwable t) {
    		logger.log(Level.SEVERE, "Unexpected error encountered trying to create outgoing site for networkid [" + network_id + "], site id [" + site_id + "]", t);
    		throw t;        	
    	} finally {
    		if (s != null) {
    			s.close();
    		}
    	}
    }
    
    public void createIncomingSites(long network_id, long site_id) throws Exception {
    	Session s = null;
    	try {
			String sql = "INSERT INTO INCOMING_QUERY_SITES (site_id, network_id) VALUES (:site_id, :network_id)";
			Query query = getCurrentSession().createSQLQuery(sql)
						   .setParameter("site_id", site_id)
						   .setParameter("network_id", network_id);
			
			query.executeUpdate();
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.", e);
            throw e;
    	} catch (Throwable t) {
    		logger.log(Level.SEVERE, "Unexpected error encountered trying to create outgoing site for networkid [" + network_id + "], site id [" + site_id + "]", t);
    		throw t;        	
    	} finally {
    		if (s != null) {
    			s.close();
    		}
    	}
    }

    private static Site mySite = null;
    
    public static Site getLocalSite()
    {
    	try
    	{
    		if(mySite == null)
    		{
	    		String localSiteId = AppProperties.getDBProperty(LOCAL_SITE_ID_PROP_NAME);
	    		if(localSiteId == null) return null;
	    		mySite = SiteDAO.querySiteByID(localSiteId);
    		}
    		return(mySite);
    	}
    	catch(Throwable t)
    	{
    		logger.log(Level.SEVERE, "Unexpected error while trying to find local site.", t);
    		return(null);
    	}
    }
    
}

