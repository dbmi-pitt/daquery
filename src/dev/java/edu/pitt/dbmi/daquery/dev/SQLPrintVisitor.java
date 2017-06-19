package edu.pitt.dbmi.daquery.dev;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteBaseVisitor;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;

public class SQLPrintVisitor extends SQLiteBaseVisitor<Object>
{
	private TreeNode topNode = null;
	private Hashtable<ParserRuleContext, TreeNode> nodes = new Hashtable<ParserRuleContext, TreeNode>();
	private int nodesAdded = 0;
	private void addToTree(ParserRuleContext ctx)
	{
		nodesAdded++;
		ParserRuleContext parentCTX = ctx.getParent();
		String cName = ctx.getClass().getSimpleName();
		if(parentCTX == null && topNode != null)
		{
			System.err.println("ERROR: Two top level nodes found second node is: " + cName);
			System.exit(1);
		}
		TreeNode parentNode = null;
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
		
	}
	
	public void printTree()
	{
		printNode(topNode, 1);
	}
	
	private void printNode(TreeNode node, int level)
	{
		for(int i = 1; i < level; i++)
			System.out.print("    ");
		if(node == null || node.self == null)
		{
			System.out.println("null");
			return;
		}
		String cName = node.self.getClass().getSimpleName();
		System.out.println(cName + ":  " + node.self.getText());
		int nextLevel = level + 1;
		for(TreeNode n : node.children)
			printNode(n, nextLevel);
	}
	@Override public Object visitParse(SQLiteParser.ParseContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitError(SQLiteParser.ErrorContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSql_stmt(SQLiteParser.Sql_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitAlter_table_stmt(SQLiteParser.Alter_table_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitAnalyze_stmt(SQLiteParser.Analyze_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitAttach_stmt(SQLiteParser.Attach_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitBegin_stmt(SQLiteParser.Begin_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCommit_stmt(SQLiteParser.Commit_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCreate_index_stmt(SQLiteParser.Create_index_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCreate_trigger_stmt(SQLiteParser.Create_trigger_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCreate_view_stmt(SQLiteParser.Create_view_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCreate_virtual_table_stmt(SQLiteParser.Create_virtual_table_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitDelete_stmt(SQLiteParser.Delete_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitDelete_stmt_limited(SQLiteParser.Delete_stmt_limitedContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitDetach_stmt(SQLiteParser.Detach_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitDrop_index_stmt(SQLiteParser.Drop_index_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitDrop_table_stmt(SQLiteParser.Drop_table_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitDrop_trigger_stmt(SQLiteParser.Drop_trigger_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitDrop_view_stmt(SQLiteParser.Drop_view_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitInsert_stmt(SQLiteParser.Insert_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitPragma_stmt(SQLiteParser.Pragma_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitReindex_stmt(SQLiteParser.Reindex_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitRelease_stmt(SQLiteParser.Release_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitRollback_stmt(SQLiteParser.Rollback_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSavepoint_stmt(SQLiteParser.Savepoint_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSelect_stmt(SQLiteParser.Select_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSelect_or_values(SQLiteParser.Select_or_valuesContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitUpdate_stmt(SQLiteParser.Update_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitUpdate_stmt_limited(SQLiteParser.Update_stmt_limitedContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitVacuum_stmt(SQLiteParser.Vacuum_stmtContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitColumn_def(SQLiteParser.Column_defContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitType_name(SQLiteParser.Type_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitColumn_constraint(SQLiteParser.Column_constraintContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitConflict_clause(SQLiteParser.Conflict_clauseContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitExpr(SQLiteParser.ExprContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}

	@Override public Object visitComparison_operator(SQLiteParser.Comparison_operatorContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	
	@Override public Object visitForeign_key_clause(SQLiteParser.Foreign_key_clauseContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitRaise_function(SQLiteParser.Raise_functionContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitIndexed_column(SQLiteParser.Indexed_columnContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitTable_constraint(SQLiteParser.Table_constraintContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitWith_clause(SQLiteParser.With_clauseContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitOrdering_term(SQLiteParser.Ordering_termContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitPragma_value(SQLiteParser.Pragma_valueContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitResult_column(SQLiteParser.Result_columnContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitJoin_clause(SQLiteParser.Join_clauseContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitJoin_operator(SQLiteParser.Join_operatorContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitJoin_constraint(SQLiteParser.Join_constraintContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSelect_core(SQLiteParser.Select_coreContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCompound_operator(SQLiteParser.Compound_operatorContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCte_table_name(SQLiteParser.Cte_table_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSigned_number(SQLiteParser.Signed_numberContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitLiteral_value(SQLiteParser.Literal_valueContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitUnary_operator(SQLiteParser.Unary_operatorContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitError_message(SQLiteParser.Error_messageContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitModule_argument(SQLiteParser.Module_argumentContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitColumn_alias(SQLiteParser.Column_aliasContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitKeyword(SQLiteParser.KeywordContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitName(SQLiteParser.NameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCount_function(SQLiteParser.Count_functionContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitAnd_keyword(SQLiteParser.And_keywordContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}

	@Override public Object visitOr_keyword(SQLiteParser.Or_keywordContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;		
	}

	@Override public Object visitAnd_or(SQLiteParser.And_orContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;		
	}
	
	@Override public Object visitNot_keyword(SQLiteParser.Not_keywordContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;		
	}

	@Override public Object visitIn_keyword(SQLiteParser.In_keywordContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;		
	}

	@Override public Object visitLike_keyword(SQLiteParser.Like_keywordContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;		
	}	

	@Override public Object visitDistinct_keyword(SQLiteParser.Distinct_keywordContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitFunction_name(SQLiteParser.Function_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitDatabase_name(SQLiteParser.Database_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitTable_name(SQLiteParser.Table_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitNew_table_name(SQLiteParser.New_table_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitColumn_name(SQLiteParser.Column_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitCollation_name(SQLiteParser.Collation_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitForeign_table(SQLiteParser.Foreign_tableContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitIndex_name(SQLiteParser.Index_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitTrigger_name(SQLiteParser.Trigger_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
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
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitPragma_name(SQLiteParser.Pragma_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitSavepoint_name(SQLiteParser.Savepoint_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitTable_alias(SQLiteParser.Table_aliasContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitTransaction_name(SQLiteParser.Transaction_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
	@Override public Object visitAny_name(SQLiteParser.Any_nameContext ctx)
	{
		addToTree(ctx);
		visitChildren(ctx);
		return null;
	}
		
	private class TreeNode
	{
		ParserRuleContext self;
		TreeNode parent;
		List<TreeNode> children = new ArrayList<TreeNode>();
	}

}
