package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;

import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.34f, ddlFile="db-update-v1.34.ddl")
public class DBUpdate134 implements DBUpdater
{

	@Override
	public void updateData(Connection conn) throws Exception {
		//nothing to do for this update
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
}
