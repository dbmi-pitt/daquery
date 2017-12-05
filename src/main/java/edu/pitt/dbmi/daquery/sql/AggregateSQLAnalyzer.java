package edu.pitt.dbmi.daquery.sql;

import org.antlr.v4.runtime.ParserRuleContext;

import edu.pitt.dbmi.daquery.sql.parser.TreeNode;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Count_functionContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.DbColumnExprContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Distinct_keywordContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_columnContext;

public class AggregateSQLAnalyzer extends SQLAnalyzer
{
	
	private boolean countFound = false;
	private boolean firstResultFound = false;
	
	public static void main(String [] args)
	{
		AggregateSQLAnalyzer a = new AggregateSQLAnalyzer("select count(patid) from demographic");
		
	}
	
	public AggregateSQLAnalyzer(String sql)
	{
		super(sql);
		if(!this.isRejected())
			analyzeAggregateTree();
	}
	
	private void analyzeAggregateTree()
	{
		analyzeNode(topNode, 1);
		if(! countFound)
			setRejection("This query does not select a single counted field.");
	}	
	
	private void analyzeNode(TreeNode node, int level)
	{

		if(node.self instanceof Result_columnContext && !firstResultFound )
		{
			firstResultFound = true;
			int resultCount = countType(node.parent.children, Result_columnContext.class); 
			if( resultCount > 1)
				setRejection("Aggregate selects can only return a single result.  This SQL returns " + resultCount);

			TreeNode firstCtxNode = node.children.get(0);
			ParserRuleContext firstCtx = firstCtxNode.self;
			ParserRuleContext columnExpr = null;

			if(firstCtx instanceof Count_functionContext)
			{
				countFound = true;
				if(firstCtxNode.children.size() == 0)
					setRejection("Aggregate select count function contains no arguments");
				else if(firstCtxNode.children.size() > 2)
					setRejection("Aggregate select count functions can only count a single field.");
				else if(firstCtxNode.children.size() == 2)
				{
					if(! (firstCtxNode.children.get(0).self instanceof Distinct_keywordContext))
						setRejection("Aggregte count function modifiers can only be of type \"distinct\"");
					
					columnExpr = firstCtxNode.children.get(1).self;
				}
				else //only one argument in count function
					columnExpr  = firstCtxNode.children.get(0).self;
				
				
				if( ! (columnExpr instanceof DbColumnExprContext))
					setRejection("Aggregate count function con only contain a single column as an argument");

				//TODO: check that columnExpr is allowable aggregate field
			}
		}
		
		if(! isRejected())
		{
			int nextLevel = level + 1;
			for(TreeNode n : node.children)
				analyzeNode(n, nextLevel);
		}		
	}
	
}
