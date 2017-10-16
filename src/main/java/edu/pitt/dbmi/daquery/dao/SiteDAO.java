package edu.pitt.dbmi.daquery.dao;

import java.security.Key;
import java.security.Principal;
import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.KeyGenerator;

import edu.pitt.dbmi.daquery.common.util.PasswordUtils;
import edu.pitt.dbmi.daquery.domain.Role;
import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.Site_User;
import edu.pitt.dbmi.daquery.rest.UserEndpoint;
import edu.pitt.dbmi.daquery.dao.ParameterItem;

import java.util.logging.Level;
import java.util.logging.Logger;




public class SiteDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(SiteDAO.class.getName());
	
    public static List<Site> queryAllSites() throws Exception {
    	try { 		
    	    List<Site> site_list = executeQueryReturnList(Site.FIND_ALL, null, logger);
	        return site_list;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    public static Site querySiteByID(long id) throws Exception {
    	try {
			List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piSite = new ParameterItem("id", id);
			pList.add(piSite);
	        Site site = executeQueryReturnSingle(Site.FIND_BY_ID, pList, logger);	
	        return site;
    	} catch (Exception e) {
	        throw e;    		
    	}
    	
    }
    
    public static List<Site> querySitesByType(String type) throws Exception {
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		ParameterItem piType = new ParameterItem("type", type);
    		pList.add(piType);
    	    List<Site> sites = executeQueryReturnList(Site.FIND_BY_TYPE, pList, logger);
	        return sites;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
    
    public static List<Site> querySiteByNetworkId(long id) throws Exception {
    	try {
			List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piNetworkId = new ParameterItem("network_id", id);
			pList.add(piNetworkId);
			List<Site> sites = executeQueryReturnList(Site.FIND_BY_NETWORK, pList, logger);	
	        return sites;
    	} catch (Exception e) {
	        throw e;    		
    	}
    	
    }
	
}

