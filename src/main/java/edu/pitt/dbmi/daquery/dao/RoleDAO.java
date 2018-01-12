package edu.pitt.dbmi.daquery.dao;

import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.util.StringHelper;

import edu.pitt.dbmi.daquery.common.dao.AbstractDAO;
import edu.pitt.dbmi.daquery.common.dao.ParameterItem;
import edu.pitt.dbmi.daquery.common.domain.RemoteRole;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class RoleDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(RoleDAO.class.getName());
	
    public static void grantRemoteUserRole(long id, String userId, String siteId, String netId) throws DaqueryException
    {
    	Session sess = null;
    	Transaction tx = null;
    	try
    	{
    		sess = HibernateConfiguration.openSession();
    		tx = sess.beginTransaction();
    		RemoteRole role = new RemoteRole(id, userId, siteId, netId);
    		sess.save(role);
    		tx.commit();
    	}
    	catch(Throwable t)
    	{
    		if(tx != null) tx.rollback();
    		throw t;
    	}
    	finally
    	{
    		if(sess != null) sess.close();    		
    	}
    	
    }
    public static List<Role> queryAllRoles() throws Exception {
    	try { 		
    	    List<Role> role_list = executeQueryReturnList(Role.FIND_ALL, null, logger);
	        return role_list;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }

    public static Role queryRoleByName(String name) throws Exception {
    	try {
    		if(StringHelper.isEmpty(name)) return(null);
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		Role role = null;
			ParameterItem piName = new ParameterItem("name", name.trim().toUpperCase());
			pList.add(piName);
			role = executeQueryReturnSingle(Role.FIND_BY_NAME, pList, logger);
    		
	        return role;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
    }    
}

