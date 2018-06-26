package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.Statement;

import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.45f, ddlFile="db-update-v1.45.ddl", centralDDLFile="central-db-update-v1.45.ddl")
public class DBUpdate145 implements DBUpdater {

	@Override
	public void updateData(Connection conn) throws Exception {
		//nothing to do for this update
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
}
