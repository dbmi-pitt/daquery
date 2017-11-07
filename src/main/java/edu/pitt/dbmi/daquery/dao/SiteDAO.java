package edu.pitt.dbmi.daquery.dao;

import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;

import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.dao.ParameterItem;



public class SiteDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(SiteDAO.class.getName());
	
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

}

