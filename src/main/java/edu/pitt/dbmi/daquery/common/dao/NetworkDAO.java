package edu.pitt.dbmi.daquery.common.dao;

import java.util.ArrayList;
import java.util.HashMap;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;




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

    public static Network queryNetworkByName(String networkname) throws Exception {
    	try { 	
    		List<ParameterItem> pList = new ArrayList<ParameterItem>();
			ParameterItem piName = new ParameterItem("name", networkname);
			pList.add(piName);
    		
    	    Network network = executeQueryReturnSingle(Network.FIND_BY_NAME, pList, logger);
	        return network;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
            
    }
    
    public static List<Network> queryAllNetworks() throws DaqueryException, DaqueryErrorException {
    	    List<Network> networks = executeQueryReturnList(Network.FIND_ALL, null, logger);
    	    SiteDAO.updatePendingSitesByNetwork(networks);
	        return networks;
    }
    
	
    public static Network createNetwork(HashMap<String, String> params, DataModel dataModel) throws Exception {
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		s.getTransaction().begin();
    		
    		
    		Network network = new Network();
    		network.setName(params.get("name"));
    		network.setNetworkId(params.get("network_id"));
    		network.setDataModel(dataModel);
    		
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
    
    public static Network getNetworkForIncomingSite(Site site)
    {
    	if(site == null || site.getSiteId() == null)
    		return(null);
    	
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		String sql = "select n.network_id from incoming_query_sites iqs, site s, network n where s.site_id = '" + site.getSiteId() + "' and s.id = iqs.site_id and iqs.network_id = n.id";
    		SQLQuery q = s.createSQLQuery(sql);
    		String netId = (String) q.uniqueResult();
    		Network net = queryNetwork(netId);
	        return net;
	    
        } catch (Throwable t) {
    		logger.log(Level.SEVERE, "Unable to get a network for an incoming site due to an unexpected error.", t);
    		return(null);
        } finally {
        	if (s != null) {
	    		s.close();
	    	}
        }    	
    }
    
    public static DataModel getDatamodelbyNetworkId(Network network) throws DaqueryException {
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
			
			String sql = "SELECT dm.* FROM Network as n join Data_model as dm on n.data_model_id = dm.id where n.id = :network_id ";
			Query query = s.createSQLQuery(sql)
						   .addEntity(DataModel.class)
						   .setParameter("network_id", network.getId());
			
			DataModel result = (DataModel) query.uniqueResult();		
	        return result;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
    	finally
    	{
    		if(s != null) s.close();
    	}
    }
    
    public static Network getNetworkById(String networkId) throws DaqueryException
    {
    	if(StringHelper.isBlank(networkId)) return(null);
    	Session s = null;
    	try
    	{
    		s = HibernateConfiguration.openSession();
    		String hql = "select n FROM Network n where n.networkId = '" + networkId + "'";
    		Query q = s.createQuery(hql);
    		List<Network> nets = q.list();
    		if(nets.size() == 1)
    			return(nets.get(0));
    		else if(nets.size() == 0)
    		{
    			throw new DaqueryException("Network with id " + networkId + " is not found.");
    		}
    		else
    		{
    			throw new DaqueryException("Network with id " + networkId + " is found multiple times. (" + nets.size() + ")");
    		}
    	}
    	catch(Throwable t)
    	{
    		String msg = "An unexpeced error occured while trying to retrieve a network with id " + networkId;
    		logger.log(Level.SEVERE, msg, t);
    		throw new DaqueryException(msg + "  Check the local server logs for more information.", t);
    	}
    	finally
    	{
    		if(s != null) s.close();
    	}
    	
    }
    
    public static SQLDataSource getSQLDataSourcebyNetworkId(Network network) throws DaqueryException {
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
			
			String sql = "SELECT sds.*, ds.* FROM Sql_data_source as sds join Data_source as ds on sds.ds_id = ds.ds_id "
																+ "join Data_model as dm on ds.model_id = dm.id "
																+ "join Network as n on n.data_model_id = dm.id "
																+ "where n.id = :network_id ";
			Query query = s.createSQLQuery(sql)
						   .addEntity(SQLDataSource.class)
						   .setParameter("network_id", network.getId());
			
			Object obj = query.uniqueResult();
			SQLDataSource result = (SQLDataSource) obj;	
	        return result;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        }
    }
}

