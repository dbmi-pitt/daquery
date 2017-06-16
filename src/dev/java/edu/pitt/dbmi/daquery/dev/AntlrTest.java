package edu.pitt.dbmi.daquery.dev;

import java.util.List;

import edu.pitt.dbmi.daquery.sql.domain.SQLFragment;
import edu.pitt.dbmi.daquery.sql.parser.SQLParserHelper;

public class AntlrTest
{
	public static void main(String [] args)
	{
		printParse("select count(distinct lmno) as lkjjl from blech;\nselect imzat(abcd) from gef;");
	}
	
	private static void printParse(String sql) {
		
		List<SQLFragment> frags = SQLParserHelper.parse(sql, new SQLPrintLListener());
		for(SQLFragment frag : frags)
			System.out.println(frag);
	}
}
