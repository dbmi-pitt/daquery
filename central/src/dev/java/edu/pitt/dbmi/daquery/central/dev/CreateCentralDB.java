package edu.pitt.dbmi.daquery.central.dev;

import java.util.UUID;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;

public class CreateCentralDB
{
	public static void main(String [] args) throws Throwable
	{
		AppProperties.setDevHomeDir("/home/devuser/daquery-data/");
		AppSetup.initialSetup(UUID.randomUUID().toString(), "PaTH-Central", "", "shirey@pitt.edu", UUID.randomUUID().toString(), "Central User");
		if(AppSetup.isErroredSetup())
			System.err.println(AppSetup.getErrorMessage());
		else if(AppSetup.isValidSetup())
		{
			CreateProdNetwork.createPathtNetwork();
			System.out.println("All Good");
		}
		else
			System.out.println("Invalid setup, but no error reported");
	}
}
