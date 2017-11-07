package edu.pitt.dbmi.daquery.sql;

import org.antlr.v4.runtime.ParserRuleContext;

import edu.pitt.dbmi.daquery.sql.parser.SqlAbstractVisitor;
import edu.pitt.dbmi.daquery.sql.parser.TreeNode;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Count_functionContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.DbColumnExprContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Distinct_keywordContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_columnContext;

public class AggregateAnalyzer extends SqlAbstractVisitor
{
	private boolean firstResultFound = false;
	private String rejectMessage = null;
	private boolean rejected = false;
	
	protected void handleNode(TreeNode node)
	{
		
	}

	public void analyzeTree()
	{
		analyzeNode(topNode, 1);
	}
	
	private void analyzeNode(TreeNode node, int level)
	{
		if(node.self instanceof Result_columnContext && !firstResultFound )
		{
			firstResultFound = true;
			if(node.children.size()  > 1)
			{
				rejectMessage = "Aggregate selects can only return a single result.  This SQL returns " + node.children.size();
				rejected = true;
				return;
			}
			TreeNode firstCtxNode = node.children.get(0);
			ParserRuleContext firstCtx = firstCtxNode.self;
			ParserRuleContext columnExpr = null;
			if(firstCtx instanceof Count_functionContext)
			{
				if(firstCtx.children.size() == 0)
				{
					rejectMessage = "Aggregate select count function contains no arguments";
					rejected = true;
					return;
				}
				else if(firstCtx.children.size() > 2)
				{
					rejectMessage = "Aggregate select count functions can only count a single field.";
					rejected = true;
					return;
				}
				else if(firstCtx.children.size() == 2)
				{
					if(! (firstCtxNode.children.get(0).self instanceof Distinct_keywordContext))
					{
						rejectMessage = "Aggregte count function modifiers can only be of type \"distinct\"";
						rejected = true;
						return;
					}
					columnExpr = firstCtxNode.children.get(1).self;
				}
				else //only one argument in count function
				{
					columnExpr  = firstCtxNode.children.get(0).self;
				}
				if( ! (columnExpr instanceof DbColumnExprContext))
				{
					rejectMessage = "Aggregate count function con only contain a single column as an argument";
					rejected = true;
					return;
				}
				//TODO: check that columnExpr is allowable aggregate field
			}
			else
			{
				rejectMessage = "Aggregate selects can only return counts via a single count function.";
				rejected = true;
				return;
			}
		}
		if(node == null || node.self == null)
		{
			System.out.println("null");
			return;
		}
		String cName = node.self.getClass().getSimpleName();
		System.out.println(cName + ":  " + node.self.getText());
		int nextLevel = level + 1;
		for(TreeNode n : node.children)
			analyzeNode(n, nextLevel);
	}
}
