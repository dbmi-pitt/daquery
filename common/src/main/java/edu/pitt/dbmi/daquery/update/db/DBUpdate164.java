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

@DBVersion(version=1.64f)
public class DBUpdate164 implements DBUpdater {

	static boolean cdmUpdated = false;
	
	public static void main(String [] args)
	{
	}
	@Override
	public void updateData(Connection conn) throws Exception {
		
		//create a list of existing network->data model->datasources
		Statement s = conn.createStatement();
		DataModelOld dm = DBUpdate154.importCDM41Model(false);
		s.executeUpdate("update data_model set data_model_id='" + dm.getDataModelId() + "' where name = 'CDM-4.1'");
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
