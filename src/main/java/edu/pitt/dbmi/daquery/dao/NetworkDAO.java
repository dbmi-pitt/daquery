package edu.pitt.dbmi.daquery.dao;

import java.util.ArrayList;
import java.util.HashMap;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.domain.Network;




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
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
    }

    public static List<Network> queryAllNetworks() throws Exception {
    	try { 		
    	    List<Network> networks = executeQueryReturnList(Network.FIND_ALL, null, logger);
	        return networks;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
	
    public static Network createNetwork(HashMap<String, String> params) throws Exception {
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		s.getTransaction().begin();
    		
    		
    		Network network = new Network();
    		network.setName(params.get("name"));
    		network.setNetwork_Id(params.get("id"));
    		network.setData_model(params.get("data_model"));
    		
    		s.persist(network);
    		s.getTransaction().commit();
    		
	        return network;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        } finally {
        	if (s != null) {
	    		s.close();
	    	}
        }
    }
}

