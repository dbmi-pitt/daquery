package edu.pitt.dbmi.daquery.sql.parser;
import java.util.Hashtable;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.RuleNode;

import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteBaseVisitor;

public abstract class SqlAbstractVisitor extends SQLiteBaseVisitor<Object>
{
	protected TreeNode topNode = null;
	protected Hashtable<ParserRuleContext, TreeNode> nodes = new Hashtable<ParserRuleContext, TreeNode>();

	protected abstract void handleNode(TreeNode node);
	
	protected void addToTree(RuleNode node)
	{
		if(! (node instanceof ParserRuleContext)) return;
		ParserRuleContext ctx = (ParserRuleContext) node;
		ParserRuleContext parentCTX = ctx.getParent();
		String cName = ctx.getClass().getSimpleName();
		if(parentCTX == null && topNode != null)
		{
			System.err.println("ERROR: Two top level nodes found second node is: " + cName);
			throw new ParseError("ERROR: Two top level nodes found second node is: " + cName);
		}
		TreeNode myNode = new TreeNode();
		myNode.self = ctx;
		nodes.put(ctx, myNode);
		if(topNode == null)
			topNode = myNode;
		if(parentCTX != null)
		{
			myNode.parent = nodes.get(parentCTX);
			myNode.parent.children.add(myNode);
		}
		
		handleNode(myNode);
	}
	
	@Override public Object visitChildren(RuleNode node)
	{
		addToTree(node);
		return(super.visitChildren(node));
	}
	
/*	@Override public Object visitWith_select_stmt(SQLiteParser.With_select_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	
	@Override public Object visitParse(SQLiteParser.ParseContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitError(SQLiteParser.ErrorContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	
	@Override public Object visitFrom_table_spec(SQLiteParser.From_table_specContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitSql_stmt(SQLiteParser.Sql_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitAlter_table_stmt(SQLiteParser.Alter_table_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitAnalyze_stmt(SQLiteParser.Analyze_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitAttach_stmt(SQLiteParser.Attach_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitBegin_stmt(SQLiteParser.Begin_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCommit_stmt(SQLiteParser.Commit_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitSelect_set(SQLiteParser.Select_setContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCreate_index_stmt(SQLiteParser.Create_index_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCreate_trigger_stmt(SQLiteParser.Create_trigger_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCreate_view_stmt(SQLiteParser.Create_view_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCreate_virtual_table_stmt(SQLiteParser.Create_virtual_table_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitDelete_stmt(SQLiteParser.Delete_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitDelete_stmt_limited(SQLiteParser.Delete_stmt_limitedContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitDetach_stmt(SQLiteParser.Detach_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitDrop_index_stmt(SQLiteParser.Drop_index_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitDrop_table_stmt(SQLiteParser.Drop_table_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitDrop_trigger_stmt(SQLiteParser.Drop_trigger_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitDrop_view_stmt(SQLiteParser.Drop_view_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}

	@Override public Object visitInsert_stmt(SQLiteParser.Insert_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitPragma_stmt(SQLiteParser.Pragma_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitReindex_stmt(SQLiteParser.Reindex_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitRelease_stmt(SQLiteParser.Release_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitRollback_stmt(SQLiteParser.Rollback_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitSavepoint_stmt(SQLiteParser.Savepoint_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitSelect_stmt(SQLiteParser.Select_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}

	@Override public Object visitUpdate_stmt(SQLiteParser.Update_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitUpdate_stmt_limited(SQLiteParser.Update_stmt_limitedContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitVacuum_stmt(SQLiteParser.Vacuum_stmtContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitColumn_def(SQLiteParser.Column_defContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitType_name(SQLiteParser.Type_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitColumn_constraint(SQLiteParser.Column_constraintContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitConflict_clause(SQLiteParser.Conflict_clauseContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitExpr(SQLiteParser.ExprContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}

	@Override public Object visitComparison_operator(SQLiteParser.Comparison_operatorContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	
	@Override public Object visitForeign_key_clause(SQLiteParser.Foreign_key_clauseContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitRaise_function(SQLiteParser.Raise_functionContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitIndexed_column(SQLiteParser.Indexed_columnContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitTable_constraint(SQLiteParser.Table_constraintContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitWith_clause(SQLiteParser.With_clauseContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitOrdering_term(SQLiteParser.Ordering_termContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitPragma_value(SQLiteParser.Pragma_valueContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitResult_column(SQLiteParser.Result_columnContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitJoin_clause(SQLiteParser.Join_clauseContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitJoin_operator(SQLiteParser.Join_operatorContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitJoin_constraint(SQLiteParser.Join_constraintContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitSelect_core(SQLiteParser.Select_coreContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitAnything_at_all(SQLiteParser.Anything_at_allContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);		
	}
	
	@Override public Object visitSet_operator(SQLiteParser.Set_operatorContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCte_table_name(SQLiteParser.Cte_table_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitSigned_number(SQLiteParser.Signed_numberContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitLiteral_value(SQLiteParser.Literal_valueContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitUnary_operator(SQLiteParser.Unary_operatorContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitError_message(SQLiteParser.Error_messageContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitModule_argument(SQLiteParser.Module_argumentContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitColumn_alias(SQLiteParser.Column_aliasContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitKeyword(SQLiteParser.KeywordContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitName(SQLiteParser.NameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCount_function(SQLiteParser.Count_functionContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitAnd_keyword(SQLiteParser.And_keywordContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}

	@Override public Object visitOr_keyword(SQLiteParser.Or_keywordContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);		
	}

	@Override public Object visitAnd_or(SQLiteParser.And_orContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);		
	}
	
	@Override public Object visitNot_keyword(SQLiteParser.Not_keywordContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);		
	}

	@Override public Object visitIn_keyword(SQLiteParser.In_keywordContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);		
	}

	@Override public Object visitLike_keyword(SQLiteParser.Like_keywordContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);		
	}	

	@Override public Object visitDistinct_keyword(SQLiteParser.Distinct_keywordContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitFunction_name(SQLiteParser.Function_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitAny_function(SQLiteParser.Any_functionContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitDatabase_name(SQLiteParser.Database_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitTable_name(SQLiteParser.Table_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitNew_table_name(SQLiteParser.New_table_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitColumn_name(SQLiteParser.Column_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitCollation_name(SQLiteParser.Collation_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitForeign_table(SQLiteParser.Foreign_tableContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitIndex_name(SQLiteParser.Index_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitTrigger_name(SQLiteParser.Trigger_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitView_name(SQLiteParser.View_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitModule_name(SQLiteParser.Module_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitPragma_name(SQLiteParser.Pragma_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitSavepoint_name(SQLiteParser.Savepoint_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitTable_alias(SQLiteParser.Table_aliasContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitTransaction_name(SQLiteParser.Transaction_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	@Override public Object visitAny_name(SQLiteParser.Any_nameContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
		
	@Override public Object visitDbColumnExpr(SQLiteParser.DbColumnExprContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	
	@Override public Object visitResult_column_expr(SQLiteParser.Result_column_exprContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}

	@Override public Object visitSingle_from_clause(SQLiteParser.Single_from_clauseContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	
	@Override public Object visitMulti_from_clause(SQLiteParser.Multi_from_clauseContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	}
	
	@Override public Object visitEnd_of_select(SQLiteParser.End_of_selectContext ctx)
	{
		addToTree(ctx);
		return visitChildren(ctx);
	} */
}

