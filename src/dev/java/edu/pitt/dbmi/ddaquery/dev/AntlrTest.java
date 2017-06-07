package edu.pitt.dbmi.ddaquery.dev;

//import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import edu.pitt.dbmi.daquery.sql.parser.SQLListener;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteLexer;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Sql_stmt_listContext;

public class AntlrTest
{
	public static void main(String [] args)
	{
		print("select count(distinct lmno) as lkjjl from blech;\nselect imzat(abcd) from gef;");
	}
	
	private static void print(String sql) {
		
		CharStream cs =  CharStreams.fromString(sql);
	    // Get our lexer
		SQLiteLexer lexer = new SQLiteLexer(cs);
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    SQLiteParser parser = new SQLiteParser(tokens);
	 
	    // Specify our entry point
	    Sql_stmt_listContext sqlLIstContext = parser.sql_stmt_list();
	 
	    // Walk it and attach our listener
	    ParseTreeWalker walker = new ParseTreeWalker();
	    SQLListener listener = new LocalSQLListener();
	    walker.walk(listener, sqlLIstContext);
	}
	
	private static class LocalSQLListener extends SQLListener
	{
		public LocalSQLListener()
		{
			super();
		}
	}
}
