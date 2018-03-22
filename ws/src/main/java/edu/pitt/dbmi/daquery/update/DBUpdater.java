package edu.pitt.dbmi.daquery.update;

import java.sql.Connection;

public interface DBUpdater
{
	public void updateData(Connection conn) throws Exception;
}
