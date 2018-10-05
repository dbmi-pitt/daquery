package edu.pitt.dbmi.daquery.sql;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.sql.parser.TreeNode;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Column_aliasContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Column_nameContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Distinct_keywordContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_columnContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_column_exprContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_count_functionContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Table_nameContext;

public class AggregateSQLAnalyzer extends SQLAnalyzer
{
	
	private boolean countFound = false;
	private boolean firstResultFound = false;
	private String aggregateColumnName = null;
	private String aggregateTableName = null;
	private boolean aggregateDistinct = false;
	
	
	public static void main(String [] args)
	{
		AggregateSQLAnalyzer a = new AggregateSQLAnalyzer("select count(patid) adsd from VITAL, (select adf from adfa) asd where patid like 'PIT100_' or patid like 'PIT101_' union select adf from adsfadf;");
		if(a.isRejected())
		{
			System.out.println("Rejected!!!");
			System.out.println("\t" + a.getRejectionMessage());
		}
		else
			System.out.println(a.convertToValuesSql());
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

			if(node.children.size() == 0)
			{
				setRejection("Invalid query, does not return an aggregate result.");
				return;
			}
				
			TreeNode firstCtxNode = node.children.get(0);
			ParserRuleContext firstCtx = firstCtxNode.self;
			ParserRuleContext columnExpr = null;

			//aggregate functions must start with a select count(...)
			if(firstCtx instanceof Result_count_functionContext)
			{
				countFound = true;
				if(firstCtxNode.children.size() == 0)
					setRejection("Aggregate select count function contains no arguments or contains a star.  Only a single column name is supported.");
				else if(firstCtxNode.children.size() > 3)
					setRejection("Aggregate select count functions can only count a single field.");
				else if(firstCtxNode.children.size() == 3)
				{
					if(! ((firstCtxNode.children.get(0).self instanceof Distinct_keywordContext) &&
						  (firstCtxNode.children.get(1).self instanceof Result_column_exprContext) &&
						  (firstCtxNode.children.get(2).self instanceof Column_aliasContext)
					  ))
						setRejection("Invalid aggregte count function modifier.");
					else
					{
						aggregateDistinct = true;
						columnExpr = firstCtxNode.children.get(1).self;
					}
				}
				else if(firstCtxNode.children.size() == 2)
				{
					if((firstCtxNode.children.get(0).self instanceof Distinct_keywordContext))
					{
						aggregateDistinct = true;
						columnExpr = firstCtxNode.children.get(1).self;
					}
					else if((firstCtxNode.children.get(0).self instanceof Result_column_exprContext) && (firstCtxNode.children.get(1).self instanceof Column_aliasContext))
					{ 
					    columnExpr = firstCtxNode.children.get(0).self;	  
					}
					else
						setRejection("Invalid aggregte count function modifier.");

					
					
				}
				else //only one argument in count function
					columnExpr  = firstCtxNode.children.get(0).self;

				if(! isRejected())
				{				
					//we only aggregate for a single db column
					if( columnExpr instanceof Result_column_exprContext)
					{
						Result_column_exprContext dbColContext = (Result_column_exprContext) columnExpr;
						int nChildren = dbColContext.children.size();
						for(int i = 0; i < nChildren; i++)
						{
							ParseTree child = dbColContext.children.get(i);
							if(child instanceof Column_nameContext)
								aggregateColumnName = child.getText();
							else if(child instanceof Table_nameContext)
								aggregateTableName = child.getText();
						}
					}
					else
						setRejection("Aggregate count function con only contain a single column as an argument");
				}
				
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
	
	public String getAaggregateColumnName(){return(aggregateColumnName );}
	public String getAggregateTableName(){return(aggregateTableName);}
	public boolean isAggregateDistinct(){return(aggregateDistinct);}
	
	/**
	 * Convert the original aggregate sql to return the values that are being counted
	 * 
	 * @return The SQL that will return the values or null if it can't be created.
	 */
	public String convertToValuesSql()
	{
		if(isRejected()) return(null);
		if(StringHelper.isEmpty(aggregateColumnName)) return(null);
		
		//HACK- for now, hard code PATID- this needs to be tied to the current DataModel
		//only allow queries that are aggregating over patients to be converted to download
		if(! (aggregateColumnName.trim().toUpperCase().equals("PATID"))) return(null);
		
		String rSQL = baseSQL.trim();
		rSQL = rSQL.replaceFirst("(?i)select\\s+count\\(.*?\\)", "");
		String selectClause = "select ";
		//if(aggregateDistinct) selectClause = selectClause + "distinct ";
		//always use a distinct query so patients aren't duplicated
		selectClause = selectClause + "distinct ";
		if(!StringHelper.isEmpty(aggregateTableName)) selectClause = selectClause + aggregateTableName + ".";
		selectClause = selectClause + aggregateColumnName;
		rSQL = selectClause + " " + rSQL.trim();
		return(rSQL);
	}
}
