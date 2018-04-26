package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;

import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.38f, ddlFile="db-update-v1.38.ddl")
public class DBUpdate138 implements DBUpdater
{
	@Override
	public void updateData(Connection conn) throws Exception {
		//nothing to do for this update
	}
}
