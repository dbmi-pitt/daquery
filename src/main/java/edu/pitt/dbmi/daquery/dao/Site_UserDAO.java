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

import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
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
    
    /**
     * Return an object representing the user matching the given UUID
     * @param uuid- the UUID of the user to find 
     * @return- a Site_User object representing the UUID
     * @throws PersistenceException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static Site_User queryUserByID(String uuid) throws Exception {
    	try {
			List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piUser = new ParameterItem("id", uuid);
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
    
    /**
     * Return an first created user object
     * @return- a Site_User object of first created
     * @throws PersistenceException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static Site_User getAdminUser() throws Exception {
    	try {
	        Site_User user = executeQueryReturnSingle(Site_User.FIND_ADMIN, null, logger);	
	        return user;
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
    	} catch (Exception e) {
	        throw e;    		
    	}
    	
    }

    /**
     * Return a boolean indicating if the user's account has an expired password
     * @param uuid the User's UUID to check
     * @return true if the user's status matches an expired password
     *         false otherwise
     * @throws PersistenceException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static boolean expiredPassword(String uuid) throws Exception
    {
    	try {
    		Site_User currentUser = queryUserByID(uuid);
    		return UserStatus.PWD_EXPIRED == UserStatus.fromInt(currentUser.getStatus());
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
    	} catch (Exception e) {
	        throw e;    		
    	}
    }

    
    /**
     * Return a boolean indicating if the user's account has been set to one of the
     * "disabled" statuses
     * @param uuid the User's UUID to check
     * @return true if the user's status matches one of the disabled statuses
     *         false otherwise
     * @throws PersistenceException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static boolean accountDisabled(String uuid) throws Exception
    {
    	try {
    		Site_User currentUser = queryUserByID(uuid);
    		return UserStatus.DISABLED == UserStatus.fromInt(currentUser.getStatus());
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
    	} catch (Exception e) {
	        throw e;    		
    	}
    }
    
    /**
     * Return a boolean indicating if the user has a particular role.
     * @param uuid- the UUID for the user
     * @param role- the single role to find in the list of the user's assigned roles
     * @return True if the user's role list is populated and contains the
     * role parameter.  
     * True if the role is blank (a blank role is assumed to mean "any user")
     * False if the user's role list is empty (this means the code is looking
     * for a role, but the user does not have any roles
     * False if the user's role list does not contain the role
     * @throws Exception
     */
    public static boolean hasRole(String uuid, String role) throws Exception
    {
    	if (role.isEmpty()) {
    		return true;
    	}
    	try {
    		Site_User currentUser = queryUserByID(uuid);
    		List<Role> roleList = currentUser.getRoles();
    		if (roleList == null || roleList.isEmpty()) {
    			return false;
    		}
    		return roleList.contains(role);
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
    	} catch (Exception e) {
	        throw e;    		
    	}
    	
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
    		return UserStatus.ACTIVE == UserStatus.fromInt(user.getStatus());
	    
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

