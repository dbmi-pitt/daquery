package edu.pitt.dbmi.daquery.dev;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import edu.pitt.dbmi.daquery.sql.domain.SQLFragment;
import edu.pitt.dbmi.daquery.sql.parser.SQLParserHelper;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteLexer;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;

public class AntlrTest
{
	public static void main(String [] args)
	{
		//printParse("select count(distinct lmno) as lkjjl from blech;\nselect imzat(abcd) from gef;");
		//printParse("select distinct a.val as cnt, b.value bv, c.value as cv from TA a, TB b, (select bid, value from TC) c where b.AID = a.AID and c.bid = b.bid order by b.value;");
		//printParse("select a from b, (select z from d, (select l from o));");
		printParse("select col1 as alias1, col2 alias2 from tableA aliasA where col2 = 7 and (col3 = '5' or col4 = 6)");
	}
	
	private static void printParse(String sql) {
		
/*		List<SQLFragment> frags = SQLParserHelper.parse(sql, new SQLPrintLListener());
		for(SQLFragment frag : frags)
			System.out.println(frag); */
		
        CharStream charStream = new ANTLRInputStream(sql);
        SQLiteLexer lexer = new SQLiteLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokens);

        SQLPrintVisitor classVisitor = new SQLPrintVisitor();
        classVisitor.visit(parser.sql_stmt_list());
        classVisitor.printTree();
        	
	}
}
