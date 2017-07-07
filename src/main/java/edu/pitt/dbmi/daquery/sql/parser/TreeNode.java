package edu.pitt.dbmi.daquery.sql.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class TreeNode
{
	public ParserRuleContext self;
	public TreeNode parent;
	public List<TreeNode> children = new ArrayList<TreeNode>();
}
