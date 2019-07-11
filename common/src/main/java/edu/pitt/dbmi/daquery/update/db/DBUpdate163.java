package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.pitt.dbmi.daquery.update.old.domain.DataAttributeOld;
import edu.pitt.dbmi.daquery.update.old.domain.DataModelOld;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.63f)
public class DBUpdate163 implements DBUpdater {

	static boolean cdmUpdated = false;
	
	public static void main(String [] args)
	{
	}
	@Override
	public void updateData(Connection conn) throws Exception {
		
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
		DataModelOld dm = DBUpdate154.importCDM41Model(false);
		//s.executeUpdate("update data_model set data_model_id='" + dm.getId() + "'"); // + " where network_id = '" + netId + "'");
		s.executeUpdate("update data_model set data_export_conf='" + dm.getDataExportConf().replaceAll("'", "''") + "'");
		for(DataAttributeOld da : dm.getAttributes())
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
			}
		}
	}
	
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
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
}
