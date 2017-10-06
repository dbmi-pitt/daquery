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
import javax.persistence.Query;
import javax.transaction.Transactional;

import edu.pitt.dbmi.daquery.common.util.PropertiesHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.KeyGenerator;

import edu.pitt.dbmi.daquery.common.util.PasswordUtils;
import edu.pitt.dbmi.daquery.domain.Role;
import edu.pitt.dbmi.daquery.domain.Site_User;
import edu.pitt.dbmi.daquery.rest.UserEndpoint;
import edu.pitt.dbmi.daquery.dao.ParameterItem;

import java.util.logging.Level;
import java.util.logging.Logger;




public class Site_UserDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(Site_UserDAO.class.getName());
	
    /**
     * Return a list of all the Site_Users for the current site.
     * @return- a List of all the query users
     * @throws Exception- throw any errors encountered back to the calling method
     */
    public static List<Site_User> queryAllUsers() throws Exception {
    	try { 		
    	    List<Site_User> user_list = executeQueryReturnList(Site_User.FIND_ALL, null, logger);
	        return user_list;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
    
    public static Site_User queryUserByID(String id) throws Exception {
    	try {
			List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piUser = new ParameterItem("id", id);
			pList.add(piUser);
	        Site_User user = executeQueryReturnSingle(Site_User.FIND_BY_ID, pList, logger);	
	        return user;
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
    	} catch (Exception e) {
	        throw e;    		
    	}
    	
    }

    //TODO implement this method, probably move to a helper class..
    public static boolean expiredPassword(String uuid)
    {
    	return false;
    }

    
    //TODO implement this method, probably move to a helper class..
    //Do we want to pass in the Site_User object instead of the id?
    public static boolean accountDisabled(String id)
    {
                return false;
    }
        
    
    /**
     * Query the database to find the current user (represented by UUID).
     * Determine: a) if the user has a valid account and b) if the user's status is active
     * @param uuid- The user's UUID
     * @return- True is the UUID represents a valid AND active account,
     * return False otherwise
     * @throws PersistenceException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static boolean isUserValid(String id) throws Exception {
    	logger.info("checking if user: " + id + " is valid");
    	EntityManagerFactory emf = null;
    	EntityManager em = null;
    	try {
	        emf = Persistence.createEntityManagerFactory("derby");
	        em = emf.createEntityManager();
	        Query query = em.createNamedQuery(Site_User.FIND_BY_ID);
	        query.setParameter("id", id);
	        Site_User user = null;
	        user = (Site_User)query.getSingleResult();
	        return true;
	        //TODO: compare with status
	        //return user.getStatusEnum() == UserStatus.ACTIVE;
	    
        } catch (PersistenceException pe) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(pe.getLocalizedMessage());
            throw pe;
        } catch (Exception e) {
    		logger.info(e.getLocalizedMessage());
        	throw e;
        }
    	finally {
    		if (em != null) {
    			em.close();
    		}
    		
    	}
            
    }

	
}

