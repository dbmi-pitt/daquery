package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;

import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.35f, ddlFile="db-update-v1.35.ddl")
public class DBUpdate135 implements DBUpdater
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
