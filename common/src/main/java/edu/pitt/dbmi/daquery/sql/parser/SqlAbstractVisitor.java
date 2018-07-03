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
}

