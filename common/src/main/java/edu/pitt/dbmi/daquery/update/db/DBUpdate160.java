package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.hibernate.annotations.common.util.StringHelper;

import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.60f, ddlFile="db-update-v1.60.ddl")
public class DBUpdate160 implements DBUpdater {

	@Override
	public void updateData(Connection conn) throws Exception {
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
}
