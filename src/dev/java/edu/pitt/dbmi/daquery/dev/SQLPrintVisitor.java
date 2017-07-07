package edu.pitt.dbmi.daquery.dev;

import edu.pitt.dbmi.daquery.sql.parser.SqlAbstractVisitor;
import edu.pitt.dbmi.daquery.sql.parser.TreeNode;

public class SQLPrintVisitor extends SqlAbstractVisitor
{
	protected void handleNode(TreeNode node){}
	
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
}
