package edu.pitt.dbmi.daquery.dev;

import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.AppProperties;

public class TestAppSetup
{
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("C:\\Users\\del20\\Documents\\GitHub\\daquery-ws");
		AppSetup.initialize();
		if(AppSetup.isErroredSetup())
			System.err.println(AppSetup.getErrorMessage());
		else if(AppSetup.isValidSetup())
		{
			if(AppSetup.wasFirstUserCreated())
				System.out.println(AppSetup.getFirstUserDetails());			
			System.out.println("All Good");
		}
		else
			System.out.println("Invalid setup, but no error reported");
	}
	
}
