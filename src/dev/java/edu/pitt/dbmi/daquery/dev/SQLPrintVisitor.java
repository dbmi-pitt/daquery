package edu.pitt.dbmi.daquery.dev;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import edu.pitt.dbmi.daquery.sql.parser.SqlAbstractVisitor;

public class SQLPrintVisitor extends SqlAbstractVisitor
{
	private TreeNode topNode = null;
	private Hashtable<ParserRuleContext, TreeNode> nodes = new Hashtable<ParserRuleContext, TreeNode>();
	
	protected void addToTree(ParserRuleContext ctx)
	{
		ParserRuleContext parentCTX = ctx.getParent();
		String cName = ctx.getClass().getSimpleName();
		if(parentCTX == null && topNode != null)
		{
			System.err.println("ERROR: Two top level nodes found second node is: " + cName);
			System.exit(1);
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
	
	private class TreeNode
	{
		ParserRuleContext self;
		TreeNode parent;
		List<TreeNode> children = new ArrayList<TreeNode>();
	}
}
