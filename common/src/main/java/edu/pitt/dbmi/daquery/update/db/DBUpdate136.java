package edu.pitt.dbmi.daquery.update.db;

import java.sql.Connection;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.queue.TaskQueue;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.36f)
public class DBUpdate136 implements DBUpdater
{
	@Override
	public void updateData(Connection conn) throws Exception
	{
		AppProperties.setTaskQueueMaxLength(TaskQueue.EXPORT_QUEUE, 1);
		AppProperties.setTaskQueueMaxLength(TaskQueue.MAIN_QUEUE, 4);
	}
}
