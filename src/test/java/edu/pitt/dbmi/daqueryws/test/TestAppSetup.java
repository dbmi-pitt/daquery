package edu.pitt.dbmi.daqueryws.test;

import edu.pitt.dbmi.daquery.common.util.AppSetup;

public class TestAppSetup
{
	public static void main(String [] args)
	{
		System.setProperty("catalina.home", "C:\\Users\\del20\\Documents\\GitHub\\daquery-ws");
		AppSetup.initialize();
		if(AppSetup.isErroredSetup())
			System.err.println(AppSetup.getErrorMessage());
		else if(AppSetup.isValidSetup())
			System.out.println("All Good");
		else
			System.out.println("Invalid setup, but no error reported");
	}
}
