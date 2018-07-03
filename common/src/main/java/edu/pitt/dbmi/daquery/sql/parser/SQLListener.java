package edu.pitt.dbmi.daquery.sql.parser;

import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;

public class SQLListener extends AbstractSQLListener
{
	
	@Override
	public void enterSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx)
	{
		
	}
	@Override
	public void exitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx)
	{
		
	}	
	@Override
	public void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx)
	{
		
	}
	
	@Override
	public void enterSelect_stmt(SQLiteParser.Select_stmtContext ctx)
	{
	
	}

/*	@Override
	public void enterSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx)
	{
	
	} */
	
	@Override public void enterCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx)
	{
	
	}

	@Override public void enterExpr(SQLiteParser.ExprContext ctx)
	{
	
	}
	
	@Override public void enterResult_column(SQLiteParser.Result_columnContext ctx)
	{
	
	}	

	@Override public void enterColumn_name(SQLiteParser.Column_nameContext ctx)
	{
	
	}
	
	@Override public void exitSelect_set(SQLiteParser.Select_setContext ctx)
	{
	
	}
	
	@Override public void exitAnything_at_all(SQLiteParser.Anything_at_allContext ctx)
	{
		
	}
/*	@Override public void enterFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx)
	{
	
	}
	@Override public void exitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx)
	{
	
	}	
	@Override public void enterSelect_core(SQLiteParser.Select_coreContext ctx)
	{
	
	} */
	
	@Override public void enterFunction_name(SQLiteParser.Function_nameContext ctx)
	{
	
	}
	
	@Override public void enterAny_function(SQLiteParser.Any_functionContext ctx)
	{
	
	}	
	
	@Override public void enterCount_function(SQLiteParser.Count_functionContext ctx)
	{
	
	}
	@Override public void exitCount_function(SQLiteParser.Count_functionContext ctx)
	{
	
	}	
	@Override public void enterDistinct_keyword(SQLiteParser.Distinct_keywordContext ctx)
	{
	
	}	
}
