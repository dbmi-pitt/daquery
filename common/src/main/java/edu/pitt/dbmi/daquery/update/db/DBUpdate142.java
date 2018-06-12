package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.Statement;

import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.42f, ddlFile="db-update-v1.42.ddl")
public class DBUpdate142 implements DBUpdater {

	@Override
	public void updateData(Connection conn) throws Exception {
		//nothing to do for this update
	}
}
