package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.Statement;

import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.39f, ddlFile="db-update-v1.39.ddl")
public class DBUpdate139 implements DBUpdater
{
	@Override
	public void updateData(Connection conn) throws Exception {
		Statement s = null;
		try
		{
			s = conn.createStatement();
			s.executeUpdate("update outgoing_query_sites set site_status = '" + SiteStatus.CONNECTED.toString() + "'");
			s.executeUpdate("update incoming_query_sites set site_status = '" + SiteStatus.CONNECTED.toString() + "'");
		}
		finally
		{
			if(s != null) s.close();
		}
		//nothing to do for this update
	}
}
