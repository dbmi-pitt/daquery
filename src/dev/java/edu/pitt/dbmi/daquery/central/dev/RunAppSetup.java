package edu.pitt.dbmi.daquery.central.dev;

import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.AppProperties;

public class RunAppSetup
{
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		AppSetup.initialSetup("path@pitt.edu", "password", null);
		if(AppSetup.isErroredSetup())
			System.err.println(AppSetup.getErrorMessage());
		else if(AppSetup.isValidSetup())
		{
			System.out.println("All Good");
		}
		else
			System.out.println("Invalid setup, but no error reported");
	}
	
}
