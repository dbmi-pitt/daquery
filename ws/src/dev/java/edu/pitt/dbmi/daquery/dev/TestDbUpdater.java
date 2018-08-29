package edu.pitt.dbmi.daquery.dev;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.update.UpdateDBForVersion;

public class TestDbUpdater
{
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("/home/devuser/daquery-data");
		UpdateDBForVersion.updateDB();
	}
}
