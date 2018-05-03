package edu.pitt.dbmi.daquery.common.dao;

import java.util.ArrayList;
import java.util.HashMap;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.ConnectionDirection;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteConnection;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import oracle.net.aso.n;




public class NetworkDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(NetworkDAO.class.getName());
    
    public static List<Network> getAllNetworks() throws DaqueryException
    {
    	Session sess = null;
    	try
    	{
    		sess = HibernateConfiguration.openSession();
    		Query q = sess.createQuery("from Network");
    		List<Network> nets = q.list();
    		return(nets);
    	}
    	finally
    	{
    		if(sess != null) sess.close();
    	}
    }
    
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
        	String msg = "Error unable to connect to database.  Please check database settings.";
        	logger.log(Level.SEVERE, msg);
        	logger.log(Level.SEVERE, msg, e);
            throw e;
        } catch (Throwable t) {
        	String msg = "Unexpected error when accessing network id [" + id + "].";
        	logger.log(Level.SEVERE, msg);
        	logger.log(Level.SEVERE, msg, t);
            throw t;        	
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
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.");
        	logger.log(Level.SEVERE, e.getLocalizedMessage());
            throw e;
        } catch (Throwable t) {
        	String msg = "Unexpected error when accessing network named [" + networkname + "].";
        	logger.log(Level.SEVERE, msg);
        	logger.log(Level.SEVERE, msg, t);
            throw t;        	
        }
    }
    
    public static List<Network> queryAllNetworks() throws Exception {
    	try { 		
    	    List<Network> networks = executeQueryReturnList(Network.FIND_ALL, null, logger);
    	    SiteDAO.updatePendingSitesByNetwork(networks);
	        return networks;
	    
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.");
        	logger.log(Level.SEVERE, e.getLocalizedMessage());
            throw e;
        } catch (Throwable t) {
        	String msg = "Unexpected error when retriving all networks.";
        	logger.log(Level.SEVERE, msg);
        	logger.log(Level.SEVERE, msg, t);
            throw t;        	
        }
    }
    
	
    public static Network createNetwork(HashMap<String, String> params, DataModel dataModel, Site localSite) throws Exception {
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		s.getTransaction().begin();
    		
    		s.save(dataModel);
    		
    		Network network = new Network();
    		network.setName(params.get("name"));
    		network.setNetworkId(params.get("network_id"));
    		network.setDataModel(dataModel);
    		network.setObfuscateAggregateResults(false);
    		network.setAggregateObfuscateType("");
    		network.setAggregateObfuscateRange(0);
    		network.setAggregateObfuscatePercent((float) 0);
    		network.setAggregateObfuscateThreshold(0);
    		network.setShiftDates(false);
    		network.setMinDateShift(0);
    		network.setMaxDateShift(0);
    		network.setTruncateZipCode(false);
    		network.setSerializePatientId(false);
    		
    		SiteConnection outCon = new SiteConnection(localSite, network, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING); 
    		SiteConnection inCon = new SiteConnection(localSite, network, SiteStatus.CONNECTED, ConnectionDirection.INCOMING); 
    		network.getSiteConnections().add(outCon);
    		network.getSiteConnections().add(inCon);
    		
    		s.save(network);
    		s.getTransaction().commit();
    		
	        return network;
	    
        } catch (HibernateException e) {
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.");
        	logger.log(Level.SEVERE, e.getLocalizedMessage());
            throw e;
        } catch (Throwable t) {
        	String msg = "Unexpected error when creating network.";
        	logger.log(Level.SEVERE, msg);
        	logger.log(Level.SEVERE, msg, t);
            throw t;        	
        } finally {
        	if (s != null) {
	    		s.close();
	    	}
        }
    }
    
/*    public static Network getNetworkForIncomingSite(Site site)
    {
    	if(site == null || site.getSiteId() == null)
    		return(null);
    	
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		String sql = "select network_id from site_connection where s.site_id = '" + site.getSiteId() + "' and s.id = iqs.site_id and iqs.network_id = n.id";
    		SQLQuery q = s.createSQLQuery(sql);
    		String netId = (String) q.uniqueResult();
    		Network net = queryNetwork(netId);
	        return net;
	    
        } catch (Throwable t) {
        	String msg = "Unable to get a network for an incoming site [" + site.getSiteId() + "] due to an unexpected error.";
        	logger.log(Level.SEVERE, msg, t);
    		return(null);
        } finally {
        	if (s != null) {
	    		s.close();
	    	}
        }    	
    } */
    
    public static DataModel getDatamodelbyNetworkId(Network network) throws DaqueryException {
    	if (network == null) {
    		return (null);
    	}
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
        	String msg = "Error unable to connect to database.  Please check database settings.";
        	logger.log(Level.SEVERE, msg, e);
            throw e;
        } catch (Throwable t) {
        	String msg = "Unable to get a network for an incoming site [" + network.getId() + "] due to an unexpected error.";
        	logger.log(Level.SEVERE, msg, t);
    		return(null);
        } finally {
    		if(s != null) s.close();
    	}
    }
    
    /* get a network based on its database id (NETWORK.ID) */
    public static Network getNetworkById(long networkId) throws DaqueryException
    {
    	Session s = null;
    	try
    	{
    		s = HibernateConfiguration.openSession();
    		String hql = "select n FROM Network n where n.id = " + networkId;
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
    		String msg = "An unexpected error occured while trying to retrieve a network with id " + networkId;
    		logger.log(Level.SEVERE, msg, t);
    		throw new DaqueryException(msg + "  Check the local server logs for more information.", t);
    	}
    	finally
    	{
    		if(s != null) s.close();
    	}
    	
    }
    
    /* get a network based on its uuid (NETWORK.NETWORK_ID */
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
    			return(null);
    		}
    		else
    		{
    			throw new DaqueryException("Network with uuid " + networkId + " is found multiple times. (" + nets.size() + ")");
    		}
    	}
    	catch(Throwable t)
    	{
    		String msg = "An unexpected error occured while trying to retrieve a network with id " + networkId;
    		logger.log(Level.SEVERE, msg, t);
    		throw new DaqueryException(msg + "  Check the local server logs for more information.", t);
    	}
    	finally
    	{
    		if(s != null) s.close();
    	}
    	
    }
    
    public static SQLDataSource getSQLDataSourcebyNetworkId(Network network) throws DaqueryException {
        if (network == null)
        	return (null);
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
        	logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.");
        	logger.log(Level.SEVERE, e.getLocalizedMessage());
            throw e;
        } catch(Throwable t) {
    		String msg = "An unexpected error occured while trying to retrieve SQL Datasource for a network:  " + network.toString();
    		logger.log(Level.SEVERE, msg, t);
    		throw new DaqueryException(msg + "  Check the local server logs for more information.", t);
    	} finally {
    		if(s != null) s.close();
    	}
    }
    
    public static void updateSQLDataSource(Network network, SQLDataSource sqlDatasource) throws DaqueryException {
    	if(network == null || sqlDatasource == null)
    		return;
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		Transaction t = s.beginTransaction();
    		
			((SQLDataSource) network.getDataModel().getDataSource(SourceType.SQL)).setConnectionUrl(sqlDatasource.getConnectionUrl());
			((SQLDataSource) network.getDataModel().getDataSource(SourceType.SQL)).setUsername(sqlDatasource.getUsername());
			((SQLDataSource) network.getDataModel().getDataSource(SourceType.SQL)).setPassword(sqlDatasource.getPassword());
			((SQLDataSource) network.getDataModel().getDataSource(SourceType.SQL)).setDriverClass(sqlDatasource.getDriverClass());
			
			s.saveOrUpdate(network.getDataModel().getDataSource(SourceType.SQL));
			t.commit();
			return;
    	} catch(HibernateException e) {
    		logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.");
        	logger.log(Level.SEVERE, e.getLocalizedMessage());
            throw e;
    	} finally {
    		if(s != null) s.close();
    	}
    }
    
    public static void updateDeIDProps(String networkId, Network n) throws Exception {
    	if(networkId == null || n == null)
    		return;
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		Transaction t = s.beginTransaction();
    		
    		Network network = NetworkDAO.queryNetwork(networkId);
    		network.setObfuscateAggregateResults(n.getObfuscateAggregateResults());
    		network.setAggregateObfuscateType(n.getAggregateObfuscateType());
    		network.setAggregateObfuscateRange(n.getAggregateObfuscateRange());
    		network.setAggregateObfuscatePercent(n.getAggregateObfuscatePercent());
    		network.setAggregateObfuscateThreshold(n.getAggregateObfuscateThreshold());
    		network.setShiftDates(n.getShiftDates());
    		network.setMinDateShift(n.getMinDateShift());
    		network.setMaxDateShift(n.getMaxDateShift());
    		network.setTruncateZipCode(n.getTruncateZipCode());
    		network.setSerializePatientId(n.getSerializePatientId());
    		
			s.saveOrUpdate(network);
			t.commit();
			return;
    	} catch(HibernateException e) {
    		logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.");
        	logger.log(Level.SEVERE, e.getLocalizedMessage());
            throw e;
    	} finally {
    		if(s != null) s.close();
    	}
    }
}

