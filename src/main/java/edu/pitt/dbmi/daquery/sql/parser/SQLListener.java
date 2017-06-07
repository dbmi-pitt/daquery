package edu.pitt.dbmi.daquery.sql.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import edu.pitt.dbmi.daquery.sql.domain.SelectQuery;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteBaseListener;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteLexer;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Sql_stmt_listContext;

public class SQLListener extends SQLiteBaseListener
{
	private List<SelectQuery> queries = new ArrayList<SelectQuery>();

	protected SQLListener()
	{

	}
	
	public static List<SelectQuery> parse(String sql)
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
	    
	    SQLListener listener = new SQLListener();
	    walker.walk(listener, sqlLIstContext);
		return(listener.queries);
	}
	
	@Override
	public void enterSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx)
	{
		System.out.println("Sql_stmt_list:" + ctx.getText());
		for(ParseTree pt : ctx.children)
		{
			System.out.println(":\t" + pt.getText());
			for(int n = 0; n < pt.getChildCount(); n++)
				System.out.println("::\t\t" + pt.getChild(n).getText());
		}	
	}
	@Override
	public void exitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx)
	{
		System.out.println("EXIT: Sql_stmt_list:" + ctx.getText());
	}	
	@Override
	public void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx)
	{
		System.out.println("Sql_stmt:" + ctx.getText());
	}
	
	@Override
	public void enterSelect_stmt(SQLiteParser.Select_stmtContext ctx)
	{
		System.out.println("Select_stmt:" + ctx.getText());
	}

	@Override
	public void enterSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx)
	{
		System.out.println("Simple_select_stmt:" + ctx.getText());
	}
	
	@Override public void enterCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx)
	{
		System.out.println("Common_table_expression:" + ctx.getText());
	}

	@Override public void enterExpr(SQLiteParser.ExprContext ctx)
	{
		System.out.println("Expr:" + ctx.getText());
	}
	
	@Override public void enterResult_column(SQLiteParser.Result_columnContext ctx)
	{
		System.out.println("Result_column:" + ctx.getText());
	}	

	@Override public void enterColumn_name(SQLiteParser.Column_nameContext ctx)
	{
		System.out.println("Column_name:" + ctx.getText());
	}
	
	@Override public void exitCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx)
	{
		System.out.println("Compound_select_stmt:" + ctx.getText());		
	}	
	@Override public void enterFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx)
	{
		System.out.println("Factored_select_stmt:" + ctx.getText());		
	}
	@Override public void exitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx)
	{
		System.out.println("EXIT Factored_select_stmt:" + ctx.getText());		
	}	
	@Override public void enterSelect_core(SQLiteParser.Select_coreContext ctx)
	{
		System.out.println("Select_core:" + ctx.getText());		
	}
	
	@Override public void enterFunction_name(SQLiteParser.Function_nameContext ctx)
	{
		System.out.println("Function_name:" + ctx.getText());		
	}
	@Override public void enterCount_function(SQLiteParser.Count_functionContext ctx)
	{
		System.out.println("Count_function:" + ctx.getText());
	}
	@Override public void exitCount_function(SQLiteParser.Count_functionContext ctx)
	{
		System.out.println("EXIT Count_function:" + ctx.getText());
	}	
	@Override public void enterDistinct_keyword(SQLiteParser.Distinct_keywordContext ctx)
	{
		System.out.println("Distinct_keyword:" + ctx.getText());
	}	
}
