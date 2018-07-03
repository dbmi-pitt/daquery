package edu.pitt.dbmi.daquery.common.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

import edu.pitt.dbmi.daquery.sql.ReturnFieldsAnalyzer;

public class SQLAnalyzerTest
{
	private static List<ReturnTest> returnTests = new ArrayList<ReturnTest>();
	static
	{
		returnTests.add(new ReturnTest("select vital.patid adsd, selst.somefield, myfunc(lmno.abc, pq.def) as mfun from VITAL, (select somefield, otherfield from adfa) selst where patid like 'PIT100_' or patid like 'PIT101_';"));
	}
	
	@Test
	public void testReturnFields()
	{
		for(ReturnTest test : returnTests)
		{
			checkReturn(test);
		}
	}
	public void checkReturn(ReturnTest test)
	{
		System.out.println("Checking: " + test.sql);
		ReturnFieldsAnalyzer analyze = new ReturnFieldsAnalyzer(test.sql);
		Assert.assertEquals(analyze.isRejected(), test.rejected);
	}
	@Test
	public void testAggregate()
	{
		
	}
	
	static class ReturnTest
	{
		public ReturnTest(String sql){ this.sql = sql; }
		public ReturnTest(String sql, boolean rejected, String rejectMatch){this.sql = sql; this.rejected = rejected; this.rejectMatch = rejectMatch;}
		public ReturnTest(String sql, int nWarnings, String...warningMatches)
		{
			this.sql = sql;
			this.nWarnings = nWarnings;
			if(warningMatches != null)
			{
				for(int i = 0; i < warningMatches.length; i++)
				{
					this.warningMatches.add(warningMatches[i]);
				}
			}
		}
		public String sql;
		public boolean rejected = false;
		public int nWarnings = 0;
		public String rejectMatch;
		public List<String> warningMatches = new ArrayList<String>();
	}
	
}
