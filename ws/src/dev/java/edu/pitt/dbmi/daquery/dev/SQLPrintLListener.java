package edu.pitt.dbmi.daquery.dev;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import edu.pitt.dbmi.daquery.sql.domain.SQLFragment;
import edu.pitt.dbmi.daquery.sql.domain.SQLPhrase;
import edu.pitt.dbmi.daquery.sql.parser.AbstractSQLListener;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;

public class SQLPrintLListener extends AbstractSQLListener
{

	long pc = 0;
	List<SQLFragment> chunks = new ArrayList<SQLFragment>();

	private void addChunk(String val)
	{
		chunks.add(new SQLChunk(val));
	}

	@Override
	public List<SQLFragment> children(){ return chunks; }
	
	@Override
	public void enterSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx)
	{
		addChunk("Sql_stmt_list:" + ctx.getText());
		for(ParseTree pt : ctx.children)
		{
			addChunk(":\t" + pt.getText());
			for(int n = 0; n < pt.getChildCount(); n++)
				addChunk("::\t\t" + pt.getChild(n).getText());
		}	
	}
	@Override
	public void exitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx)
	{
		addChunk("EXIT: Sql_stmt_list:" + ctx.getText());
	}	
	@Override
	public void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx)
	{
		addChunk("Sql_stmt:" + ctx.getText() + " DEPTH:" + ctx.depth());
	}

	@Override
	public void exitSql_stmt(SQLiteParser.Sql_stmtContext ctx)
	{
		addChunk("EXIT: Sql_stmt:" + ctx.getText() + " DEPTH:" + ctx.depth());
	}
		
	@Override
	public void enterSelect_stmt(SQLiteParser.Select_stmtContext ctx)
	{
		addChunk("Select_stmt:" + ctx.getText() + " DEPTH:" + ctx.depth());
	}
	@Override
	public void exitSelect_stmt(SQLiteParser.Select_stmtContext ctx)
	{
		addChunk("EXIT: Select_stmt:" + ctx.getText() + " DEPTH:" + ctx.depth());
	}
	@Override
	public void enterSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx)
	{
		addChunk("Simple_select_stmt:" + ctx.getText());
	}
	
	@Override public void enterCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx)
	{
		addChunk("Common_table_expression:" + ctx.getText());
	}

	@Override public void enterExpr(SQLiteParser.ExprContext ctx)
	{
		addChunk("Expr:" + ctx.getText());
	}
	
	@Override public void enterResult_column(SQLiteParser.Result_columnContext ctx)
	{
		addChunk("Result_column:" + ctx.getText());
	}	

	@Override public void enterColumn_name(SQLiteParser.Column_nameContext ctx)
	{
		addChunk("Column_name:" + ctx.getText());
	}
	
	@Override public void exitCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx)
	{
		addChunk("Compound_select_stmt:" + ctx.getText());		
	}	
	@Override public void enterFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx)
	{
		addChunk("Factored_select_stmt:" + ctx.getText());		
	}
	@Override public void exitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx)
	{
		addChunk("EXIT Factored_select_stmt:" + ctx.getText());		
	}	
	@Override public void enterSelect_core(SQLiteParser.Select_coreContext ctx)
	{
		addChunk("Select_core:" + ctx.getText());		
	}
	
	@Override public void enterFunction_name(SQLiteParser.Function_nameContext ctx)
	{
		addChunk("Function_name:" + ctx.getText());		
	}
	@Override public void enterCount_function(SQLiteParser.Count_functionContext ctx)
	{
		addChunk("Count_function:" + ctx.getText());
	}
	@Override public void exitCount_function(SQLiteParser.Count_functionContext ctx)
	{
		addChunk("EXIT Count_function:" + ctx.getText());
	}	
	@Override public void enterDistinct_keyword(SQLiteParser.Distinct_keywordContext ctx)
	{
		addChunk("Distinct_keyword:" + ctx.getText());
	}
	
	private class SQLChunk implements SQLPhrase
	{
		private String val;
		SQLChunk(String val)
		{
			this.val = val;
		}
		public String toString()
		{
			return(val);
		}
		public List<SQLFragment> children(){ return null;}
	}
}
