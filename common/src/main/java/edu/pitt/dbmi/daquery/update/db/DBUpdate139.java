package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;

import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.39f, ddlFile="db-update-v1.39.ddl")
public class DBUpdate139 implements DBUpdater
{
	@Override
	public void updateData(Connection conn) throws Exception {
		//nothing to do here
	}
}
