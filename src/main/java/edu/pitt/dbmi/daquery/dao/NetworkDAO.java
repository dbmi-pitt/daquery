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
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Role;
import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.Site_User;
import edu.pitt.dbmi.daquery.rest.UserEndpoint;
import edu.pitt.dbmi.daquery.dao.ParameterItem;

import java.util.logging.Level;
import java.util.logging.Logger;




public class NetworkDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(NetworkDAO.class.getName());
	
    public static Network queryNetwork(String id) throws Exception {
    	// auto generated ID
        if(id.matches("^\\d+$"))
        	logger.info("searching for #### single Network id= " + id);
        else
        	logger.info("searching for #### single Network uuid= " + id);
    	try {
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
    		Network network = null;
    		if(id.matches("^\\d+$")) {
    			ParameterItem piId = new ParameterItem("id", Long.parseLong(id));
    			pList.add(piId);
    			network = executeQueryReturnSingle(Network.FIND_BY_ID, pList, logger);
    		}
    		else {
    			ParameterItem piUUId = new ParameterItem("uuid", id);
    			pList.add(piUUId);
    			network = executeQueryReturnSingle(Network.FIND_BY_UUID, pList, logger);
    		}
    		
	        return network;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
    }

    public static List<Network> queryAllNetworks() throws Exception {
    	try { 		
    	    List<Network> networks = executeQueryReturnList(Network.FIND_ALL, null, logger);
	        return networks;
	    
        } catch (PersistenceException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
	
}

