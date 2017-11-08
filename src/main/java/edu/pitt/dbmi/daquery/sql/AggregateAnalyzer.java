package edu.pitt.dbmi.daquery.sql;

import java.util.List;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;

import edu.pitt.dbmi.daquery.sql.parser.SqlAbstractVisitor;
import edu.pitt.dbmi.daquery.sql.parser.TreeNode;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteLexer;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Count_functionContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.DbColumnExprContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Distinct_keywordContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_columnContext;

public class AggregateAnalyzer extends SqlAbstractVisitor
{
	private boolean firstResultFound = false;
	private String rejectMessage = null;
	private boolean rejected = false;
	private boolean countFound = false;
	
	private boolean debug = true;
	
	public boolean isRejected(){return(rejected);}
	public String getRejectionMessage(){return(rejectMessage);}
	
	protected void handleNode(TreeNode node){}

	private void analyzeTree()
	{
		analyzeNode(topNode, 1);
		if(! countFound)
			setRejection("This query does not select a single counted field.");
	}
	
	public AggregateAnalyzer(String sql)
	{
		CharStream charStream = CharStreams.fromString(sql);
        SQLiteLexer lexer = new SQLiteLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());
        visit(parser.sql_stmt_list());
        analyzeTree();
	}
	
	private void analyzeNode(TreeNode node, int level)
	{
		
		if(debug)
		{
			if(node == null || node.self == null)
			{
				System.out.println("null");
			}
			else
			{
				for(int i = 1; i < level; i++)
					System.out.print("    ");
				
				String cName = node.self.getClass().getSimpleName();
				System.out.println(cName + ":  " + node.self.getText());
			}
		}		
		
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
		
		if(! rejected)
		{
			int nextLevel = level + 1;
			for(TreeNode n : node.children)
				analyzeNode(n, nextLevel);
		}		
	}
	
	private void setRejection(String message)
	{
		rejectMessage = message;
		rejected = true;
	}
	
	private int countType(List<TreeNode> vals, Class<?> type)
	{
		int count = 0;
		
		for(TreeNode node : vals)
			if(type.isInstance(node.self)) count++;
		
		return(count);
	}
}
