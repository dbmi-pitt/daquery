package edu.pitt.dbmi.daquery.central.dev.util;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.update.UpdateDBForVersion;


/** utility class to update the central server database version **/
public class UpdateDatabase
{
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("C:\\Users\\del20");
		UpdateDBForVersion.updateDB();
	}
}
