package edu.pitt.dbmi.daquery.dev;

import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteBaseVisitor;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;

public class SQLPrintVisitor extends SQLiteBaseVisitor<Object>
{
	@Override
	public Object visitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx)
	{ 
		System.out.println("Factored_select_stmt: " + ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public Object visitSelect_stmt(SQLiteParser.Select_stmtContext ctx)
	{ 
		System.out.println("select_stmt: " + ctx.getText());
		return visitChildren(ctx);
	}

}
