package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;

import org.hibernate.annotations.common.util.StringHelper;

import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.5f, ddlFile="db-update-v1.5.ddl")
public class DBUpdate15 implements DBUpdater {

	@Override
	public void updateData(Connection conn) throws Exception {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select DS_ID, CONNECTION_URL from SQL_DATA_SOURCE");
		Hashtable<String, String> dialectsById = new Hashtable<String, String>();
		while(rs.next())
		{
			String id = rs.getString(1);
			String url = rs.getString(2);
			String dialect = "ANSI";
			if(! StringHelper.isEmpty(url))
			{
				String compUrl = url.toLowerCase();
				if(compUrl.contains("oracle"))
					dialect = SQLDialect.ORACLE.name();
				else if(compUrl.contains("sqlserver"))
					dialect = SQLDialect.SQLDialect.name();
				dialectsById.put(id, dialect);
			}
		}
		rs.close();
		s.close();
		s = conn.createStatement();
		for(String key : dialectsById.keySet())
		{
			String sql = "update SQL_DATA_SOURCE set dialect='" + dialectsById.get(key) + "' where ds_id="+key;
			s.executeUpdate(sql);
		}
			
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
}
