package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;

import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=2, ddlFile="db-update-v2.ddl")
public class DBUpdate2 implements DBUpdater
{
	@Override
	public void updateData(Connection conn) throws Exception {
		//nothing to do for this update
		
	}
}
