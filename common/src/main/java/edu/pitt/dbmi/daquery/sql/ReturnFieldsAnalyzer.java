package edu.pitt.dbmi.daquery.sql;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.hibernate.annotations.common.util.StringHelper;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.sql.domain.Column;
import edu.pitt.dbmi.daquery.sql.domain.DeIdTag;
import edu.pitt.dbmi.daquery.sql.domain.Function;
import edu.pitt.dbmi.daquery.sql.domain.SQLElement;
import edu.pitt.dbmi.daquery.sql.domain.SelectStatement;
import edu.pitt.dbmi.daquery.sql.domain.Table;
import edu.pitt.dbmi.daquery.sql.domain.TableColumn;
import edu.pitt.dbmi.daquery.sql.parser.TreeNode;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Alter_table_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Analyze_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Any_result_functionContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Attach_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Begin_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Column_aliasContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Column_nameContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Commit_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Create_index_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Create_table_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Create_trigger_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Create_view_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Create_virtual_table_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Database_nameContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Date_shift_field_propContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Deid_tagContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Delete_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Delete_stmt_limitedContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Detach_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Drop_index_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Drop_table_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Drop_trigger_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Drop_view_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.From_table_specContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Function_nameContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Id_field_propContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Insert_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Is_birthdate_propContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Is_zip_propContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Obfuscate_field_propContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Pragma_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Reindex_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Release_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_columnContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_column_exprContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Result_count_functionContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Rollback_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Savepoint_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Select_coreContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Select_setContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Table_nameContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Tracking_column_exprContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Update_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Update_stmt_limitedContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.Vacuum_stmtContext;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.With_select_stmtContext;
import edu.pitt.dbmi.daquery.update.db.DBUpdate151;

public class ReturnFieldsAnalyzer extends SQLAnalyzer
{

	private List<String> warnings = new ArrayList<String>();
	private DataModel model = null;
	private SQLElement topElement = null;
	private List<ReturnColumn> returnColumns = null;
	
	public static void main(String [] args)
	{
		InputStream is = DBUpdate151.class.getResourceAsStream("/data-modelCDM-3.1.json");
		DataModel dm = JSONHelper.fromJson(is, DataModel.class);
		//simple
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select count(distinct patid) as adsd from VITAL where patid like 'PIT100_' or patid like 'PIT101_';");
		
		
		
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select XYZ from ABCD, (select nyj from ieu);");
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select XYZ from ABCD;");
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select vital.patid<IDENTIFIABLE isId=true dateshift on tbl.dsfield obfuscate=true> adsd, selst.somefield, myfunc(lmno.abc, pq.def)<IDENTIFIABLE isId=true dateshift on tb22.dsfield222 obfuscate=true>  as mfun from VITAL, (select somefield, otherfield from adfa) selst where patid like 'PIT100_' or patid like 'PIT101_';");
		ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select sex, count(blech1), avg(gigi) from glorg, demographic group by avg(blech2) order by count(blech3)", dm);
		System.out.println(a.topElement);
//<IDENTIFIABLE isId=true/false dateShift ON tbl.field obfuscate=true/false>
		
		if(a.hasWarnings())
		{
			System.out.println("WARNING:");
			System.out.println("\t" + a.getWarnings());
		}
		if(a.isRejected())
		{
			System.out.println("REJECTED!");
			System.out.println("\t" + a.getRejectionMessage());
		}
	}
	
	
	
	public SelectStatement getTopSelect(){return((SelectStatement) topElement);}
	public List<ReturnColumn> getReturnColumns()
	{
		if(returnColumns == null)
		{
			SelectStatement select = getTopSelect();
			returnColumns = select.getReturnColumns(model);
		}
		return(returnColumns);
	}
	
	
	public boolean hasWarnings(){return(warnings.size() > 0);}
	private void addWarning(String warning){warnings.add(warning);}
	public String getWarnings()
	{
		String warns = "";
		String eol = "";
		boolean first = true;
		for(String warn : warnings)
		{
			warns = warns + eol + warn;
			if(first)
			{
				first = false;
				eol = "\n";
			}
		}
		return(warns);
	}
	public List<String> getWarningList(){return(warnings);}
	public ReturnFieldsAnalyzer(String sql, DataModel model)
	{
		super(sql);
		this.model = model;
		if(!this.isRejected())
		{
			analyzeAggregateTree();
		
			for(ReturnColumn rc : getReturnColumns())
			{
				if(rc.multipleMatchingReferences)
					this.addWarning("Unable to resolve PHI information for " + rc.column.getDisplayName() + " because it is ambiguously defined.");
				else if(rc.deidTag == null)
					this.addWarning("PHI information about returned column " + rc.column.getDisplayName() + " cannot be resolved.");
/*				else if(!rc.deidTag.isPhi())
					this.addWarning("Column " + rc.column.getDisplayName() + " is marked as not identifiable."); */
				
			}
		}
	}
	
	private void analyzeAggregateTree()
	{
		analyzeNode(topNode, 1, null);
	}	
	
	private void analyzeNode(TreeNode node, int level, SQLElement parentElement)
	{
		if(censoredStatements.containsKey(node.self.getClass()))
			addWarning(censoredStatements.get(node.self.getClass()) + " statements are not allowed.");
		
		String nodeStr = "null";
		String parStr = "null";
		if(node != null && node.self != null)
			nodeStr = node.self.getClass().getSimpleName();
		if(parentElement != null)
			parStr = parentElement.getClass().getSimpleName();
		
		System.out.println("+++" + level + "\t" + nodeStr + "\t" + parStr);

		if(node.self instanceof Select_coreContext)
		{
			SelectStatement newSel = new SelectStatement();
			parentElement = setParentChild(parentElement, newSel);
			if(topElement == null) topElement = newSel;
						
			System.out.print(Integer.toString(level) + ": ");
			System.out.println("select_core");			
		}
		if(node.self instanceof Result_columnContext)
		{
			String nodeTxt = node.self.getText();
			if( (! StringHelper.isEmpty(nodeTxt)) && nodeTxt.trim().endsWith("*"))
			{
				setRejection("Wildcard selects are not allowed.");
			}
		}
		if(node.self instanceof Result_column_exprContext)
		{
			System.out.println(node.self.getText());
			if(! (parentElement instanceof DeIdTag || parentElement instanceof Function))
			{
				TableColumn col = new TableColumn();
				parentElement = setParentChild(parentElement, col);
			}
		}
		if(node.self instanceof Tracking_column_exprContext)
		{
			
		}
		
		if(node.self instanceof Is_birthdate_propContext)
		{
			if(parentElement instanceof DeIdTag)
				((DeIdTag)parentElement).setBirthdate(true);
		}

		if(node.self instanceof Result_count_functionContext || node.self instanceof Any_result_functionContext)
		{
			Function func = new Function();
			func.setCallDescriptor(node.self.getText());
			parentElement = setParentChild(parentElement, func);
		}
		if(node.self instanceof From_table_specContext)
		{
			Table table = new Table();
			parentElement = setParentChild(parentElement, table);
		}
		if(node.self instanceof Database_nameContext)
		{
			if(isColumn(parentElement)) ((TableColumn) parentElement).setDBName(node.self.getText());
			if(parentElement instanceof Table) ((Table) parentElement).setDBName(node.self.getText());
			if(parentElement instanceof DeIdTag && ((DeIdTag) parentElement).foundDateShift()) ((DeIdTag) parentElement).setDateShiftTrackByDBName(node.self.getText());
		}
		if(node.self instanceof Table_nameContext)
		{
			if(isColumn(parentElement)) ((TableColumn) parentElement).setTableName(node.self.getText());
			if(parentElement instanceof Table) ((Table) parentElement).setName(node.self.getText());
			if(parentElement instanceof DeIdTag && ((DeIdTag) parentElement).foundDateShift()) ((DeIdTag) parentElement).setDateShiftTrackByTableName(node.self.getText());
		}
		if(node.self instanceof Column_nameContext)
		{
			if(parentElement != null)
				System.out.println(parentElement.getClass().getSimpleName() + ":" + node.self.getText());
			if(isColumn(parentElement)) ((TableColumn) parentElement).setName(node.self.getText());
			if(parentElement instanceof DeIdTag && ((DeIdTag) parentElement).foundDateShift()) ((DeIdTag) parentElement).setDateShiftTrackByName(node.self.getText());
		}
		if(node.self instanceof Column_aliasContext)
		{
			if(isColumn(parentElement)) ((TableColumn) parentElement).setAlias(node.self.getText());
			if(parentElement instanceof Function) ((Function) parentElement).setAlias(node.self.getText());
			if(parentElement instanceof Table) ((Table) parentElement).setAlias(node.self.getText());
		}
		if(node.self instanceof Function_nameContext)
		{
			if(parentElement instanceof Function) ((Function) parentElement).setName(node.self.getText());
		}
		
		//deid tags must be returned from top level (most outer) select database columns or functions
		if(node.self instanceof Deid_tagContext)
		{
			if(parentElement == null || ! (parentElement instanceof Column))
			{
				this.addWarning("Deidentification tags not associated with returned values are ignored.");
			}
			else if(parentElement.getParent() == null || 
					! (parentElement.getParent() instanceof SelectStatement) ||
					  parentElement.getParent().getParent() != null
					)
			{
				this.addWarning("Deidentification tags not associated with returned values will be ignored.");
			}
			else
			{
				DeIdTag tag = new DeIdTag();
				String fullText = node.self.getText();
				if((! StringHelper.isEmpty(fullText)) && fullText.toUpperCase().contains("NOTIDENTIFIABLE") )
					tag.setPhi(false);
				else
					tag.setPhi(true);
				parentElement = setParentChild(parentElement, tag);
			}
		}
		
		if(node.self instanceof Id_field_propContext)
		{
			if(parentElement instanceof DeIdTag)
			{
				Boolean isId = parseTrueFalseProp(node.self.getText());
				if(isId == null)
				{
					addWarning("DEID Tag is not parsable: " + node.self.getText());
				}
				else
				{
					((DeIdTag) parentElement).setId(isId);
					//((DeIdTag) parentElement).setPhi(isId);
				}
			}
		}
		
		if(node.self instanceof Date_shift_field_propContext)
		{
			if(parentElement instanceof DeIdTag)
			{
				((DeIdTag) parentElement).setFoundDateShift(true);
				((DeIdTag) parentElement).setDateShift(true);
			}
		}
		
		if(node.self instanceof Is_zip_propContext)
		{
			if(parentElement instanceof DeIdTag)
			{
				((DeIdTag) parentElement).setZipCode(true);
			}
		}
		
		
		if(node.self instanceof Obfuscate_field_propContext)
		{
			if(parentElement instanceof DeIdTag)
			{
				String obfTxt = node.self.getText();
				if(obfTxt.contains("="))
				{
					Boolean obf = parseTrueFalseProp(node.self.getText());
					if(obf == null)
					{
						addWarning("DEID Tag obfuscate property is not parsable: " + node.self.getText());
					}
					else
						((DeIdTag) parentElement).setObfuscate(obf);
				}
				else
					((DeIdTag) parentElement).setObfuscate(true);
			}			
		}
		
		if(! isRejected())
		{
			if(parentElement instanceof DeIdTag)
				System.out.println("here");
			int nextLevel = level + 1;
			for(TreeNode n : node.children)
			{
				analyzeNode(n, nextLevel, parentElement);
			}
		}		

	}
	
	private static Boolean parseTrueFalseProp(String prop)
	{
		if(StringHelper.isEmpty(prop)) return(null);
		int eqLoc = prop.indexOf('=');
		if(eqLoc <=0 || eqLoc >= prop.length()) return(null);
		String tf = prop.substring(eqLoc + 1).trim().toUpperCase();
		if(tf.equals("FALSE")) return(new Boolean(false));
		if(tf.endsWith("TRUE")) return(new Boolean(true));
		return(null);
	}
	
	private boolean isColumn(SQLElement element)
	{
		return(element instanceof TableColumn);
	}
	
	
	private SQLElement setParentChild(SQLElement parent, SQLElement child)
	{
		if(parent != null) parent.addChild(child);
		child.setParent(parent);
		return(child);
	}
	
	private static Hashtable<Class<?>, String> censoredStatements = new Hashtable<Class<?>, String>();
	static
	{
		censoredStatements.put(Select_setContext.class, "Select set (UNION/INTERSECT/MINUS/EXCEPT)");
		censoredStatements.put(With_select_stmtContext.class, "With");
		censoredStatements.put(Alter_table_stmtContext.class, "Alter Table");
		censoredStatements.put(Analyze_stmtContext.class, "Analyze");
		censoredStatements.put(Attach_stmtContext.class, "Attach");
		censoredStatements.put(Begin_stmtContext.class, "Begin");
		censoredStatements.put(Commit_stmtContext.class, "Commit");
		censoredStatements.put(Create_index_stmtContext.class, "Create Index");
		censoredStatements.put(Create_table_stmtContext.class, "Create Table");
		censoredStatements.put(Create_trigger_stmtContext.class, "Create Trigger");
		censoredStatements.put(Create_view_stmtContext.class, "Create View");
		censoredStatements.put(Create_virtual_table_stmtContext.class, "Create Virtual Table");
		censoredStatements.put(Delete_stmtContext.class, "Delete");
		censoredStatements.put(Delete_stmt_limitedContext.class, "Delete");
		censoredStatements.put(Detach_stmtContext.class, "Detach");
		censoredStatements.put(Drop_index_stmtContext.class, "Drop Index");
		censoredStatements.put(Drop_table_stmtContext.class, "Drop Table");
		censoredStatements.put(Drop_trigger_stmtContext.class, "Drop Trigger");
		censoredStatements.put(Drop_view_stmtContext.class, "Drop View");
		censoredStatements.put(Insert_stmtContext.class, "Insert");
		censoredStatements.put(Pragma_stmtContext.class, "Pragma");
		censoredStatements.put(Reindex_stmtContext.class, "Reindex");
		censoredStatements.put(Release_stmtContext.class, "Release");
		censoredStatements.put(Rollback_stmtContext.class, "Rollback");
		censoredStatements.put(Savepoint_stmtContext.class, "Savepoint");
		censoredStatements.put(Update_stmtContext.class, "Update");
		censoredStatements.put(Update_stmt_limitedContext.class, "Update");
		censoredStatements.put(Vacuum_stmtContext.class, "Vacuum");

	}
	
	
}
