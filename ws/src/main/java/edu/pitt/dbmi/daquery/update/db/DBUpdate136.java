package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.rest.DaqueryEndpoint;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.36f)
public class DBUpdate136 implements DBUpdater
{
	@Override
	public void updateData(Connection conn) throws Exception
	{
		AppProperties.setTaskQueueMaxLength(DaqueryEndpoint.EXPORT_QUEUE, 1);
		AppProperties.setTaskQueueMaxLength(DaqueryEndpoint.MAIN_QUEUE, 4);
	}
}
