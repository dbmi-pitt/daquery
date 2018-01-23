package edu.pitt.dbmi.daquery.common.dao;

import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

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
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
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
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
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
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
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
	    String msg = "Unexcpected error while querying a site by name or id.";
	    logger.log(Level.SEVERE, msg, t);
	    throw new DaqueryException(msg + "  Check server logs for more information.", t);
	}
    }
    
    /** Get sites by network_id
     *  @param network_id
     *  @return List<Site>
     * @throws Exception 
     */
    public static List<Site> queryConnectedOutgoingSitesByNetworkId(long network_id) throws Exception{
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
			
			String sql = "SELECT s.* FROM SITE as s JOIN OUTGOING_QUERY_SITES as oqs ON s.id = oqs.site_id JOIN NETWORK as n ON n.id = oqs.network_id WHERE s.status='CONNECTED' and n.id = :network_id";
			Query query = s.createSQLQuery(sql)
						   .addEntity(Site.class)
						   .setParameter("network_id", network_id);
			
			List result = query.list();
    		
	        return result;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
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
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
    }
    
    public long createSite(Site site) throws Exception {
    	return (Long) getCurrentSession().save(site);
    }
    
    public void createOutogingSites(long network_id, long site_id) throws Exception {
			
		String sql = "INSERT INTO OUTGOING_QUERY_SITES (site_id, network_id) VALUES (:site_id, :network_id)";
		Query query = getCurrentSession().createSQLQuery(sql)
										 .setParameter("site_id", site_id)
										 .setParameter("network_id", network_id);
		
		query.executeUpdate();
    }
    
    public void createIncomingSites(long network_id, long site_id) throws Exception {
		String sql = "INSERT INTO INCOMING_QUERY_SITES (site_id, network_id) VALUES (:site_id, :network_id)";
		Query query = getCurrentSession().createSQLQuery(sql)
					   .setParameter("site_id", site_id)
					   .setParameter("network_id", network_id);
		
		query.executeUpdate();
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

