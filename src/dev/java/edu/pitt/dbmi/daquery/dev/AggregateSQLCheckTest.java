package edu.pitt.dbmi.daquery.dev;

import edu.pitt.dbmi.daquery.sql.SQLAnalyzer;
import edu.pitt.dbmi.daquery.sql.parser.ParseException;

public class AggregateSQLCheckTest
{
	public static void main(String [] args)
	{
		//printParse("select count(distinct lmno) as lkjjl from blech;\nselect imzat(abcd) from gef;");
		//printParse("select distinct a.val as cnt, b.value bv, c.value as cv from TA a, TB b, (select bid, value from TC) c where b.AID = a.AID and c.bid = b.bid order by b.value;");
		//printParse("select a from b, (select z from d, (select l from o));");
		//printParse("delete from tbl");
		//printParse("update table set a = b");
		//printParse("insert into tbl (c1, c2, c3) values (v1, v2, v3)");
		//printParse("select aliasA.col1 as alias1, tableA.col2 alias2 from tableA aliasA, where mySchema.tableA.col2 = 7 and (aliasA.col3 = '5' or col4 = 6)");
		
//		evaluate ("crap crap crap");
		evaluate("select count(patid) from demographic;");
//		evaluate("select count(abcd.xycd.blec) from schemaA.tableA ta, (select xyz from tableB) as tb  where tableA.x = 1.2 and b.y = 'abc'; select x from y;");
/*		//fail because more than one result is returned
		evaluate("select count(distinct abcd.xycd.blec as mmmmm), aasdf from schemaA.tableA ta, (select xyz from tableB) as tb  where tableA.x = 1.2 and b.y = 'abc';");
		
		//these should all work
		evaluate("select count(distinct abcd.xycd.blec) from schemaA.tableA ta, (select xyz from tableB) as tb  where tableA.x = 1.2 and b.y = 'abc';");
		evaluate("select count(distinct abcd.xycd.blec as mmmmm) from schemaA.tableA ta, (select xyz from tableB) as tb  where tableA.x = 1.2 and b.y = 'abc';");
		evaluate("select count(abcd.xycd.blec as mmmmm) from schemaA.tableA ta, (select xyz from tableB) as tb  where tableA.x = 1.2 and b.y = 'abc';");
		evaluate("select count(abcd.xycd.blec) from schemaA.tableA ta, (select xyz from tableB) as tb  where tableA.x = 1.2 and b.y = 'abc';");
		evaluate("select count(blec) from schemaA.tableA ta, (select xyz from tableB) as tb  where tableA.x = 1.2 and b.y = 'abc';");
*/		
	}
	
	public static void evaluate(String sql) {
		SQLAnalyzer analyzer = null;
		analyzer = new SQLAnalyzer(sql);
		if(analyzer.isRejected())
			System.out.println(analyzer.getRejectionMessage());
		else
			System.out.println("All Good");

	}	
}
