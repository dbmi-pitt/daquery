package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.Statement;

import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.66f)
public class DBUpdate166 implements DBUpdater {

	public static void main(String [] args)
	{
	}
	@Override
	public void updateData(Connection conn) throws Exception {
		
		//create a list of existing network->data model->datasources
		Statement s = conn.createStatement();
		 
		s.executeUpdate("DELETE FROM DATA_ATTRIBUTE WHERE FIELD_NAME = 'RAW_PRO_CODE' OR FIELD_NAME = 'RAW_PRO_RESPONSE'");
	}
	
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
}
