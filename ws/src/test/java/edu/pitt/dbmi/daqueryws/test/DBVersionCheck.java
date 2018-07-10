package edu.pitt.dbmi.daqueryws.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DDLReader;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.update.UpdateDBForVersion;

public class DBVersionCheck {

	private static final float INFINITESIMAL = 1e-10f;
	@Test
	public void test()
	{
		try
		{
			String ddlFile = AppProperties.getInitializationDDL();
			Float ddlVersion = DDLReader.getVerion(ddlFile);
			float updateVersion = UpdateDBForVersion.getMaxUpdateVersion();
			float upMin = updateVersion - INFINITESIMAL;
			float upMax = updateVersion + INFINITESIMAL;
			if(ddlVersion == null)
				fail("No db version found for daquery db in " + ddlFile);
			if(! (upMin < ddlVersion.floatValue() && upMax > ddlVersion.floatValue()))
				fail("daquery db ddl version and maximum update version do not match");
		}
		catch(DaqueryException e)
		{
			e.printStackTrace(System.err);
			fail(e.getMessage());
		}
		catch(IOException iox)
		{
			iox.printStackTrace(System.err);			
			fail("IOException while looking for max update version.");
		}
	}
}