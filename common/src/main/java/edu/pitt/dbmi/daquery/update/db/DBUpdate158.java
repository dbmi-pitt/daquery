package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.hibernate.annotations.common.util.StringHelper;

import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.58f, ddlFile="db-update-v1.58.ddl")
public class DBUpdate158 implements DBUpdater {

	@Override
	public void updateData(Connection conn) throws Exception {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select NETWORK_ID, DATA_MODEL_ID from NETWORK");
		List<String> qs = new ArrayList<>();
 		while(rs.next())
		{
			String network_id = rs.getString(1);
			int data_model_id = rs.getInt(2);
			qs.add("update DATA_MODEL set NETWORK_ID = '" + network_id + "' where ID=" + data_model_id);
		}
		rs.close();
		
		for(String q : qs){
			s.executeUpdate(q);
		}
		s.close();
		s = conn.createStatement();
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
}
