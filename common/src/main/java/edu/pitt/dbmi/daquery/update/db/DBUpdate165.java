package edu.pitt.dbmi.daquery.update.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.update.old.domain.DataAttributeOld;
import edu.pitt.dbmi.daquery.update.old.domain.DataModelOld;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.65f)
public class DBUpdate165 implements DBUpdater {

	static boolean cdmUpdated = false;
	
	public static void main(String [] args)
	{
	}
	@Override
	public void updateData(Connection conn) throws Exception {
		
		//create a list of existing network->data model->datasources
		Statement s = conn.createStatement();
		ResultSet nets = s.executeQuery("select id from network"); //, ds.ds_id from network net left join data_source ds on net.data_model_id = ds.model_id");
	//	Hashtable<String, List<Long>> netsAndSources = new Hashtable<String, List<Long>>();
		int netCount = 0;
		long netId = 1;
		while(nets.next())
		{
			netCount++;
			netId = nets.getLong(1);
		}
		if(netCount != 1)
			throw new Exception("Error updating the database to version 1.65, this update only supports a single network");
		
		//delete the old data models
		s.executeUpdate("delete from data_model");
		s.executeUpdate("delete from data_attribute");
		cdmUpdated = true;
		//for each network, replace the datamodel
		DataModelOld dm = importCDM51Model(true, netId);
		s.executeUpdate("update data_source set model_id = " + dm.getId());
		s.executeUpdate("update daquery_request set data_model_id = '" + dm.getDataModelId() + "'");
/*		for(String netId : netsAndSources.keySet())
		{
			s.executeUpdate("update network set data_model_id=" + dm.getId() + " where network_id = '" + netId + "'");						
			List<Long> dsIds = netsAndSources.get(netId);
			for(Long dsId : dsIds)
			{
				if(dsId == null || dsId.longValue() == -1l)
					s.executeUpdate("update data_source set model_id=null where ds_id = " + dsId);
				else
					s.executeUpdate("update data_source set model_id=" + dm.getId() + " where ds_id = " + dsId);				
			}
		} */
		s.close();
		conn.commit();
		//updateData158(conn);
		updateData163(conn, dm);
		//updateData164(conn, dm);
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
	
/*	private void updateData158(Connection conn) throws Exception {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select ID, DATA_MODEL_ID from NETWORK");
		List<String> qs = new ArrayList<>();
 		while(rs.next())
		{
			int network_id = rs.getInt(1);
			int data_model_id = rs.getInt(2);
			qs.add("update DATA_MODEL set NETWORK_ID = " + network_id + " where ID=" + data_model_id);
		}
		rs.close();
		
		for(String q : qs){
			s.executeUpdate(q);
		}
		s.close();
	}	*/
	
	public void updateData163(Connection conn, DataModelOld dmo) throws Exception {
		
		//create a list of existing network->data model->datasources
		Statement s = conn.createStatement();
		ResultSet modelIds = s.executeQuery("select distinct id from data_model");
		List<String> mIds = new ArrayList<String>();
		while(modelIds.next())
		{
			long id = modelIds.getLong(1);
			mIds.add(Long.toString(id));
		}
		s.executeUpdate("delete from data_attribute");
		cdmUpdated = true;
		//for each network, replace the datamodel
		//for(String netId : netsAndSources.keySet())
		//{
		//DataModelOld dm = DBUpdate154.importCDM41Model(false);
		//s.executeUpdate("update data_model set data_model_id='" + dm.getId() + "'"); // + " where network_id = '" + netId + "'");
		s.executeUpdate("update data_model set data_export_conf='" + dmo.getDataExportConf().replaceAll("'", "''") + "'");
		for(DataAttributeOld da : dmo.getAttributes())
		{
			String entName = stringVal(da.getEntityName());
			String fieldName = stringVal(da.getFieldName());
			String phi = boolVal(da.isPhi());			
			String agg = boolVal(da.isAggregatable());
			String fieldType = stringVal(da.getFieldType());
			String ident = boolVal(da.isIdentifier());
			String identName = stringVal(da.getIdentifierName());
			String bDate = boolVal(da.isBirthDate());
			String dte = boolVal(da.isDateField());
			String zCode = boolVal(da.isZipCode());
			
			for(String modelId : mIds)
			{
				String vals = entName + ", " + fieldName + ", " + phi + ", " + modelId + ", " + agg + ", " + fieldType + ", " + ident + ", " + identName + ", " + bDate + ", " + dte + ", " + zCode;
				s.execute("insert into data_attribute (ENTITY_NAME,FIELD_NAME,PHI, MODEL_ID, AGGREGATABLE, FIELD_TYPE, IDENTIFIER, IDENT_NAME, BIRTH_DATE, DATE_FIELD, ZIP_CODE) values (" + vals + ")");
				s.executeUpdate("update data_source set model_id = " + modelId);

			}
		}
	}	

/*	public void updateData164(Connection conn, DataModelOld dmo) throws Exception {
		
		//create a list of existing network->data model->datasources
		Statement s = conn.createStatement();
		//DataModelOld dm = DBUpdate154.importCDM41Model(false);
		s.executeUpdate("update data_model set data_model_id='" + dmo.getDataModelId() + "' where name = 'CDM-4.1'");
	} */	
	
	
	private String stringVal(String val)
	{
		if(StringHelper.isEmpty(val)) return("NULL");
		return("'" + val + "'");
	}
	
	private String boolVal(boolean val)
	{
		if(val) return("TRUE");
		else return("FALSE");
	}	
	
	
	public static DataModelOld importCDM51Model(boolean saveModel, long networkId) throws IOException, DaqueryException
	{
		InputStream is = DBUpdate154.class.getResourceAsStream("/data-modelCDM-5.1.json");
		DataModelOld dm = JSONHelper.fromJson(is, DataModelOld.class);
		dm.setRevision(1l);
		dm.setNetworkId(networkId);
		for(DataAttributeOld da : dm.getAttributes())
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
