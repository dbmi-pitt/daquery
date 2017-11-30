package edu.pitt.dbmi.daquery.central.dev;

import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.AppProperties;

public class RunAppSetup
{
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("/home/devuser/daquery-data/");
		AppSetup.initialSetup("123456789", "central-test", "", "path@pitt.edu", "temppwd", "Test User");

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
