package edu.pitt.dbmi.daquery.dao;

import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;

import edu.pitt.dbmi.daquery.common.domain.Role;



public class RoleDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(RoleDAO.class.getName());
	
    public static List<Role> queryAllRolees() throws Exception {
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
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		Role role = null;
			ParameterItem piName = new ParameterItem("name", name);
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

