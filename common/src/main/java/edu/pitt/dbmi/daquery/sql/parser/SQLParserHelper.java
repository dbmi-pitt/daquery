package edu.pitt.dbmi.daquery.sql.parser;

import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import edu.pitt.dbmi.daquery.sql.domain.SQLFragment;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteLexer;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Sql_stmt_listContext;

public class SQLParserHelper
{
	public static List<SQLFragment> parse(String sql, AbstractSQLListener listener)
	{
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
	    
	    walker.walk(listener, sqlLIstContext);
		return(listener.children());
	}
}
