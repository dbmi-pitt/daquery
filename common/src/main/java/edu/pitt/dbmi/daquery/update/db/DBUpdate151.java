package edu.pitt.dbmi.daquery.update.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ApplicationDBHelper;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.51f, ddlFile="db-update-v1.51.ddl")
public class DBUpdate151 implements DBUpdater {

	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		InputStream is = DBUpdate151.class.getResourceAsStream("/data-modelCDM-3.1.json");
		DataModel dm = JSONHelper.fromJson(is, DataModel.class);
		Connection conn = null;
		DBUpdate151 db151Updater = new DBUpdate151();
		try
		{
			conn = ApplicationDBHelper.getConnection();
			conn.setAutoCommit(false);
			db151Updater.updateData(conn);
			conn.commit();
		}
		catch(Throwable t)
		{
			t.printStackTrace(System.err);
		}
		finally
		{
			if(conn != null)
			{
				try{conn.close();}
				catch(Throwable t)
				{
					System.err.println("Error closing connection, model could be updated...check..");
					t.printStackTrace(System.err);
					System.err.println("Error closing connection, model could be updated...check..");
				}
			}
		}
		
	}
	@Override
	public void updateData(Connection conn) throws Exception {
		
		//create a list of existing network->data model->datasources
		Statement s = conn.createStatement();
		ResultSet nets = s.executeQuery("select net.network_id, ds.ds_id from network net left join data_source ds on net.data_model_id = ds.model_id");
		Hashtable<String, List<Long>> netsAndSources = new Hashtable<String, List<Long>>();
		while(nets.next())
		{
			String netId = nets.getString(1);
			Long dsId = nets.getLong(2);
			if(! netsAndSources.containsKey(netId))
				netsAndSources.put(netId, new ArrayList<Long>());
			if(dsId == null) dsId = new Long(-1);
			netsAndSources.get(netId).add(dsId);
		}
		
		//delete the old data models
		s.executeUpdate("delete from data_model");
		
		//for each network, replace the datamodel
		for(String netId : netsAndSources.keySet())
		{
			DataModel dm = importCDM31Model(true);
			s.executeUpdate("update network set data_model_id=" + dm.getId() + " where network_id = '" + netId + "'");						
			List<Long> dsIds = netsAndSources.get(netId);
			for(Long dsId : dsIds)
			{
				if(dsId == null || dsId.longValue() == -1l)
					s.executeUpdate("update data_source set model_id=null where ds_id = " + dsId);
				else
					s.executeUpdate("update data_source set model_id=" + dm.getId() + " where ds_id = " + dsId);				
			}
		}
		s.close(); 
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
	
	public static DataModel importCDM31Model(boolean saveModel) throws IOException, DaqueryException
	{
		InputStream is = DBUpdate151.class.getResourceAsStream("/data-modelCDM-3.1.json");
		DataModel dm = JSONHelper.fromJson(is, DataModel.class);
		dm.setRevision(1l);
		for(DataAttribute da : dm.getAttributes())
			da.setDataModel(dm);
		//dm.setId(null);
		if(saveModel)
		{
			Session sess = null;
			try
			{
				sess = HibernateConfiguration.openSession();
				Transaction t = sess.beginTransaction();
				sess.save(dm);
				t.commit();
				return(dm);
			}
			catch(Throwable tr)
			{
				throw new DaqueryException("Error while saving data model.", tr);
			}
			finally
			{
				if(sess != null) sess.close();
			}
		}
		else
			return(dm);
		
	}	
}
