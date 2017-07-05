package edu.pitt.dbmi.daquery.dev;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteLexer;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;

public class AntlrTest
{
	public static void main(String [] args)
	{
		//printParse("select count(distinct lmno) as lkjjl from blech;\nselect imzat(abcd) from gef;");
		//printParse("select distinct a.val as cnt, b.value bv, c.value as cv from TA a, TB b, (select bid, value from TC) c where b.AID = a.AID and c.bid = b.bid order by b.value;");
		//printParse("select a from b, (select z from d, (select l from o));");
		//printParse("delete from tbl");
		//printParse("update table set a = b");
		printParse("insert into tbl (c1, c2, c3) values (v1, v2, v3)");
		//printParse("select aliasA.col1 as alias1, tableA.col2 alias2 from tableA aliasA, where mySchema.tableA.col2 = 7 and (aliasA.col3 = '5' or col4 = 6)");
		//printParse("select count(distinct abcd.xycd.blec as mmmmm) from schemaA.tableA ta, (select xyz from tableB) as tb  where tableA.x = 1.2 and b.y = 'abc';");
	}
	
	private static void printParse(String sql) {
		
		CharStream charStream = CharStreams.fromString(sql);
        SQLiteLexer lexer = new SQLiteLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokens);

        SQLPrintVisitor classVisitor = new SQLPrintVisitor();
        classVisitor.visit(parser.sql_stmt_list());
        classVisitor.printTree();
        	
	}
}
