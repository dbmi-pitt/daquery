package edu.pitt.dbmi.daquery.sql;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import edu.pitt.dbmi.daquery.sql.parser.SqlAbstractVisitor;
import edu.pitt.dbmi.daquery.sql.parser.TreeNode;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteLexer;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Count_functionContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.DbColumnExprContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Distinct_keywordContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.End_of_selectContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_columnContext;

public class SQLAnalyzer extends SqlAbstractVisitor
{
	
	private static Logger logger = Logger.getLogger(SQLAnalyzer.class.getName());
	
	private String rejectMessage = null;
	private boolean rejected = false;
	private int statementCount = 0;
	
	private boolean debug = true;
	
	public boolean isRejected(){return(rejected);}
	public String getRejectionMessage(){return(rejectMessage);}
	
	protected void handleNode(TreeNode node){}

	private void analyzeTree()
	{
		analyzeNode(topNode, 1);
		if(statementCount > 1)
		{
			setRejection("Only one select is allowed.  This query contains " + statementCount);
		}
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
			
			if(node.self instanceof End_of_selectContext) statementCount++;
		}
		
		if(! rejected)
		{
			int nextLevel = level + 1;
			for(TreeNode n : node.children)
				analyzeNode(n, nextLevel);
		}		
	}
	public SQLAnalyzer(String sql)
	{
		try
		{
			CharStream charStream = CharStreams.fromString(sql);
	        SQLiteLexer lexer = new SQLiteLexer(charStream);
	        TokenStream tokens = new CommonTokenStream(lexer);
	        SQLiteParser parser = new SQLiteParser(tokens);
	        parser.setErrorHandler(new BailErrorStrategy());
	        visit(parser.sql_stmt_list());
	        analyzeTree();
		}
		catch(ParseCancellationException pce)
		{
			Throwable cause = pce.getCause();
			if(cause instanceof NoViableAltException)
			{
				NoViableAltException nvae = (NoViableAltException) cause;
				rejectMessage = "Syntax error \"" + nvae.getOffendingToken().getText() + "\" at position "+ nvae.getOffendingToken().getCharPositionInLine();
			}
			else
			{
				rejectMessage = "Parse cancelled for unknown reason.  Check local logs for additional information.";
				logger.log(Level.SEVERE, "Parse cancelled for an unknown reason while parsing " + sql, pce);
			}
			rejected = true;
		}
		catch(Throwable t)
		{
			rejectMessage = "Unknown parse error.  Check local logs for additional information.";
			logger.log(Level.SEVERE, "Unknown parse error while parsing " + sql, t);
			rejected = true;
		}
	}
	
	
	protected void setRejection(String message)
	{
		rejectMessage = message;
		rejected = true;
	}
	
	protected int countType(List<TreeNode> vals, Class<?> type)
	{
		int count = 0;
		
		for(TreeNode node : vals)
			if(type.isInstance(node.self)) count++;
		
		return(count);
	}
}
