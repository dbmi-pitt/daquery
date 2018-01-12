package edu.pitt.dbmi.daquery.dao;

import java.io.IOException;
import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.dao.AbstractDAO;
import edu.pitt.dbmi.daquery.common.dao.ParameterItem;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.RemoteRole;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.PasswordUtils;
import edu.pitt.dbmi.daquery.rest.UserEndpoint;

import java.util.logging.Level;




public class DaqueryUserDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(DaqueryUserDAO.class.getName());
	
    /**
     * Return a list of all the DaqueryUsers for the current site.
     * @return- a List of all the query users
     * @throws HibernateException- throw any errors encountered back to the calling method
     */
    public static List<DaqueryUser> queryAllUsers() throws Exception {
    	try { 		
    	    List<DaqueryUser> user_list = executeQueryReturnList(DaqueryUser.FIND_ALL, null, logger);
	        return user_list;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
    
    /**
     * Return an object representing the user matching the given UUID
     * @param uuid- the UUID of the user to find 
     * @return- a DaqueryUser object representing the UUID
     * @throws HibernateException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static DaqueryUser queryUserByID(String uuid) throws Exception {
    	try {
			List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piUser = new ParameterItem("id", uuid);
			pList.add(piUser);
	        DaqueryUser user = executeQueryReturnSingle(DaqueryUser.FIND_BY_ID, pList, logger);	
	        return user;
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
    	} catch (Exception e) {
	        throw e;    		
    	}
    	
    }

    
    /**
     * Return an object representing the user matching the given username
     * @param username- the username of the user to find 
     * @return- a DaqueryUser object representing the username
     * @throws HibernateException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static DaqueryUser queryUserByUsername(String username) throws Exception {
    	try {
			List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piUser = new ParameterItem("username", username);
			pList.add(piUser);
	        DaqueryUser user = executeQueryReturnSingle(DaqueryUser.FIND_BY_USERNAME, pList, logger);	
	        return user;
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
    	} catch (Exception e) {
	        throw e;    		
    	}
    	
    }
    
    public static DaqueryUser getUserByNameOrId(String nameOrId) throws Exception
    {
    	DaqueryUser user = queryUserByID(nameOrId);
    	if(user != null) return(user);
    	else
    		return(queryUserByUsername(nameOrId));
    }
    
    /**
     * A back-end call that uses the id/password combination to find the user's
     * account in the database.  Throws an error if the account cannot be verified.
     * @param email- the email for the account.  This value must not be empty.
     * @param password- the plaintext password for the account.  This value must not be empty.
     * @throws SecurityException on authentication failure
     * NoResultException if no user is found
     */
    public static DaqueryUser authenticate(String email, String password) throws SecurityException, HibernateException, Exception {
    	logger.info("searching for #### email/password : " + email + "/" + password);
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piEmail = new ParameterItem("email", email);
			pList.add(piEmail);
    		ParameterItem piPassword = new ParameterItem("password", PasswordUtils.digestPassword(password));
    		pList.add(piPassword);
	        DaqueryUser user = AbstractDAO.executeQueryReturnSingle(DaqueryUser.FIND_BY_EMAIL_PASSWORD, pList, logger);
	        if (user == null)
	        {
	    		logger.info("Invalid email/password.  Tried to login using: " + email + " / " + password);
	            throw new SecurityException("Invalid email/password");
	        }
	        
	        return user;
        } catch (NonUniqueResultException nure) {
    		logger.info("Invalid email/password.  Found multiple username/password entries using: " + email + " / " + password);
            throw new SecurityException("Invalid email/password");
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    
    /**
     * Return an first created user object
<<<<<<< HEAD:src/main/java/edu/pitt/dbmi/daquery/dao/DaqueryUserDAO.java
     * @return- a DaqueryUser object of first created
     * @throws PersistenceException if the database is incorrectly configured
=======
     * @return- a Site_User object of first created
     * @throws HibernateException if the database is incorrectly configured
>>>>>>> master:src/main/java/edu/pitt/dbmi/daquery/dao/Site_UserDAO.java
     * Exception for any other issue
     */
    public static DaqueryUser getAdminUser() throws Exception {
    	try {
	        DaqueryUser user = executeQueryReturnSingle(DaqueryUser.FIND_ADMIN, null, logger);	
	        return user;
        } catch (HibernateException e) {
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
     * @throws HibernateException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static boolean expiredPassword(String uuid) throws Exception
    {
    	try {
    		DaqueryUser currentUser = queryUserByID(uuid);
    		return UserStatus.PWD_EXPIRED == UserStatus.valueOf(currentUser.getStatus());
        } catch (HibernateException e) {
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
     * @throws HibernateException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static boolean accountDisabled(String uuid) throws Exception
    {
    	try {
    		DaqueryUser currentUser = queryUserByID(uuid);
    		return UserStatus.DISABLED == UserStatus.valueOf(currentUser.getStatus());
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
    	} catch (Exception e) {
	        throw e;    		
    	}
    }
    
    /**
     * Return a boolean indicating if the user has a particular role.  This method
     * is CASE-INSENSITIVE (e.g. ADMIN==admin)
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
    		DaqueryUser currentUser = queryUserByID(uuid);
    		List<Role> roleList = currentUser.getRoles();
    		List<String> roleNames = new ArrayList<String>();
    		if (roleList == null || roleList.isEmpty()) {
    			return false;
    		}
    		//build a String list of the role names
    		//make them lowercase to support case-insensitive matching
    		String trimmedRole = role.toLowerCase().trim();
    		for (Role r : roleList) {
    			if(trimmedRole.equals(r.getName().toLowerCase().trim()))
    					return(true);
    		}
    		return(false);
        } catch (HibernateException e) {
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
     * @throws HibernateException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static boolean isUserValid(String id) throws Exception {
    	logger.info("checking if user: " + id + " is valid");
    	try {

    		DaqueryUser user = DaqueryUserDAO.queryUserByID(id);
    		return UserStatus.ACTIVE == UserStatus.valueOf(user.getStatus());
	    
        } catch (HibernateException pe) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(pe.getLocalizedMessage());
            throw pe;
        } catch (Exception e) {
    		logger.info(e.getLocalizedMessage());
        	throw e;
        }
            
    }

	
    public static UserInfo getSysUser()
    {
    	UserInfo sysUser = null;
    	try
    	{
    		sysUser = (UserInfo) DaqueryUserDAO.queryUserByUsername("system");
    	}
    	catch(Throwable t)
    	{
    		logger.log(Level.SEVERE, "An unexpected exception occured while retrieving the SYSTEM user", t);
    	}
    	return(sysUser);
    }
    
    public static List<String> getRemoteUserRoles(String userId) throws IOException, DaqueryException
    {
    	Session s = null;
    	try
    	{
    		s = HibernateConfiguration.openSession();
    		SQLQuery q = s.createSQLQuery("select distinct role.name from role, remote_user_role where role.id = remote_user_role.role_id and remote_user_role.user_id = '" + userId + "'");
    		List<Object []> rows = q.list();
    		List<String> roles = new ArrayList<String>();
    		for(Object row : rows)
    			roles.add((String) row);
    		return(roles);
    	}
    	catch(Throwable t)
    	{
    		throw t;
    	}
    	finally
    	{
    		if(s != null) s.close();
    	}
    }
}

