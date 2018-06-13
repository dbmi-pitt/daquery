package edu.pitt.dbmi.daquery.common.dao;

import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.PersistenceException;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.internal.util.StringHelper;

import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.PasswordUtils;




public class DaqueryUserDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(DaqueryUserDAO.class.getName());

    public static void main(String [] args)
    {
    	AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53/");
    	UserInfo uinfo = DaqueryUserDAO.getUserInfo("abc-123-xyz-nnn"); //("a211840d-185c-456e-9fd8-53b13ffcf30f"); //abc-123-xyz-nnn
    	System.out.println(uinfo.getRealName());
    }
    
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
     * Return an object representing the user matching the given email
     * @param email- the email of the user to find 
     * @return- a DaqueryUser object
     * @throws HibernateException if the database is incorrectly configured
     * Exception for any other issue
     */
    public static DaqueryUser queryUserByEmail(String email) throws Exception {
    	try {
			List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piUser = new ParameterItem("email", email);
			pList.add(piUser);
	        DaqueryUser user = executeQueryReturnSingle(DaqueryUser.FIND_BY_EMAIL, pList, logger);	
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
     * Get UserInfo information for a given user's UUID.  Returns the UserInfo directly
     * if it is a remote user who's UserInfo is stored in the local DB, or creates a UserInfo
     * copy of the full DaqueryUser if the user is local.  If there is no match for the UUID
     * or an error occurs during the retrieval null is returned. 
     */
    public static UserInfo getUserInfo(String userUUID)
    {
    	Session sess = null;
    	try
    	{
    		sess = HibernateConfiguration.openSession();
    		UserInfo user = (UserInfo) sess.get(UserInfo.class, userUUID);
    		if(user == null)
    		{
    			DaqueryUser dUser = (DaqueryUser) sess.get(DaqueryUser.class, userUUID);
    			if(dUser != null)
    				user = dUser;
    		}
    		return(user);
    	}
    	catch(Throwable t)
    	{
    		logger.log(Level.SEVERE, "Unexpected error while tring to find UserInfo for user with id " + userUUID);
    		return(null);
    	}
    	finally
    	{
    		if(sess != null) sess.close();
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
    
    public static boolean isLocalUserId(String userUUID) throws Exception
    {
    	DaqueryUser user = DaqueryUserDAO.queryUserByID(userUUID);
    	return(user != null);
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
    	logger.info("searching for #### email/password : " + email + "/***********");
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piEmail = new ParameterItem("email", email);
			pList.add(piEmail);
    		ParameterItem piPassword = new ParameterItem("password", PasswordUtils.digestPassword(password));
    		pList.add(piPassword);
	        DaqueryUser user = AbstractDAO.executeQueryReturnSingle(DaqueryUser.FIND_BY_EMAIL_PASSWORD, pList, logger);
	        if (user == null)
	        {
	    		logger.info("Invalid email/password.  Tried to login using: " + email + " / *******");
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
     * @return- a DaqueryUser object of first created
     * @throws PersistenceException if the database is incorrectly configured
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
    public static boolean hasRole(String userUUID, String networkUUID, String role) throws Exception
    {
    	if (role.isEmpty()) {
    		return true;
    	}
    	if(StringHelper.isEmpty(userUUID)) return(false);
    	Session sess = null;
    	
    	try {
    		DaqueryUser currentUser = queryUserByID(userUUID);
    		if(currentUser != null)
    		{
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
    		}
    		
    		if(networkUUID != null)
    		{
    			String sql = "select REMOTE_USER_ROLE.USER_ID from REMOTE_USER_ROLE, ROLE " +
    						   "where ROLE.id = REMOTE_USER_ROLE.role_id and " +
    					            "upper(trim(REMOTE_USER_ROLE.user_id)) = '" + userUUID.trim().toUpperCase() + "' and " +
    						        "upper(trim(REMOTE_USER_ROLE.network_id)) = '" + networkUUID.trim().toUpperCase() + "' and " +
    					            "upper(trim(ROLE.name)) = '" + role.trim().toUpperCase() + "'";
    			
    			sess = HibernateConfiguration.openSession();
    			SQLQuery q = sess.createSQLQuery(sql);
    			List vals = q.list();
    			return(vals != null && vals.size() > 0);
    		}
    		return(false);
        } catch (HibernateException he) {
    		logger.log(Level.SEVERE, "Database error while checking a user role.", he);
            throw he;
    	} catch (Exception e) {
    		logger.log(Level.SEVERE, "Unhandled error while checking a user role.", e);
	        throw e;    		
    	}
    	finally
    	{
    		if(sess != null) sess.close();
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
    
    public static void addContact(String id) throws Exception {
    	logger.info("add user to contact: " + id + " is valid");
    	try {

    		DaqueryUser user = DaqueryUserDAO.queryUserByID(id);
    		user.setContact(true);
	    
        } catch (HibernateException pe) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(pe.getLocalizedMessage());
            throw pe;
        } catch (Exception e) {
    		logger.info(e.getLocalizedMessage());
        	throw e;
        }
            
    }
    
    public static void removeContact(String id) throws Exception {
    	logger.info("remove user to contact: " + id + " is valid");
    	try {

    		DaqueryUser user = DaqueryUserDAO.queryUserByID(id);
    		user.setContact(false);
	    
        } catch (HibernateException pe) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(pe.getLocalizedMessage());
            throw pe;
        } catch (Exception e) {
    		logger.info(e.getLocalizedMessage());
        	throw e;
        }
            
    }
}

