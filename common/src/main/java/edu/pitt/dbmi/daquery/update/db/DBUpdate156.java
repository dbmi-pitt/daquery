package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.Statement;

import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.56f, ddlFile="db-update-v1.56.ddl")
public class DBUpdate156 implements DBUpdater {

	@Override
	public void updateData(Connection conn) throws Exception
	{
		//made this change at Daquer vsn 1.1.3 (db version 1.6)
		//because a bug caused duplicate data model attributes
		//the bug was fixed in 1.54, but if this was already run
		//in a previous install we'll fix it now.
		if(! DBUpdate154.cdmUpdated)
		{
			DBUpdate154 up = new DBUpdate154();
			up.updateData(conn);
		}
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
}
