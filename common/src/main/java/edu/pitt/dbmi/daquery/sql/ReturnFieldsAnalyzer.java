package edu.pitt.dbmi.daquery.sql;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.hibernate.annotations.common.util.StringHelper;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.sql.domain.Column;
import edu.pitt.dbmi.daquery.sql.domain.ColumnProvider;
import edu.pitt.dbmi.daquery.sql.domain.CompoundSelect;
import edu.pitt.dbmi.daquery.sql.domain.DeIdTag;
import edu.pitt.dbmi.daquery.sql.domain.FinalWithSelect;
import edu.pitt.dbmi.daquery.sql.domain.Function;
import edu.pitt.dbmi.daquery.sql.domain.SQLElement;
import edu.pitt.dbmi.daquery.sql.domain.Select;
import edu.pitt.dbmi.daquery.sql.domain.SelectStatement;
import edu.pitt.dbmi.daquery.sql.domain.Table;
import edu.pitt.dbmi.daquery.sql.domain.TableColumn;
import edu.pitt.dbmi.daquery.sql.domain.WithSelect;
import edu.pitt.dbmi.daquery.sql.parser.TreeNode;
import edu.pitt.dbmi.daquery.sql.parser.generated.SQLiteParser.*;
import edu.pitt.dbmi.daquery.update.db.DBUpdate151;

public class ReturnFieldsAnalyzer extends SQLAnalyzer
{

	private List<String> warnings = new ArrayList<String>();
	private DataModel model = null;
	private Select topElement = null;
	private List<ReturnColumn> returnColumns = null;
	private String saveWithName = null;
	
	public static void main(String [] args)
	{
		InputStream is = DBUpdate151.class.getResourceAsStream("/data-modelCDM-4.1.json");
		DataModel dm = JSONHelper.fromJson(is, DataModel.class);
		//simple
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select count(distinct patid) as adsd from VITAL where patid like 'PIT100_' or patid like 'PIT101_';");
		
		
		
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select XYZ from ABCD, (select nyj from ieu);");
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select XYZ from ABCD;", dm);
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select vital.patid<IDENTIFIABLE isId=true dateshift on tbl.dsfield obfuscate=true> adsd, selst.somefield, myfunc(lmno.abc, pq.def)<IDENTIFIABLE isId=true dateshift on tb22.dsfield222 obfuscate=true>  as mfun from VITAL, (select somefield, otherfield from adfa) selst where patid like 'PIT100_' or patid like 'PIT101_';");
		//ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer("select sex, count(blech1), avg(gigi) from glorg, demographic group by avg(blech2) order by count(blech3)", dm);
		/*String withTest = "WITH PAT_LIST AS "
				+ "(SELECT DISTINCT patid as ppii FROM DIAGNOSIS WHERE "
				+ "    DX LIKE '250%' OR DX LIKE 'E08.%' OR DX LIKE 'E09.%' OR DX LIKE 'E10.%' OR DX LIKE 'E11.%' OR DX LIKE 'E13.%' OR DX IN ('E08', 'E09', 'E10', 'E11', 'E13')), "
				+ " PAT_CNT AS (SELECT COUNT(*) as n_patients_dx FROM PAT_LIST), "
				+ " PAT_NO_LAB_CNT AS (SELECT COUNT(DISTINCT PATID) as n_patients_no_lab FROM PAT_LIST WHERE PATID NOT IN (SELECT patid FROM LAB_RESULT_CM WHERE LAB_LOINC = '4548-4')), "
				+ " RESULT_CNT AS (SELECT COUNT(RESULT_NUM) as results, "
				+ "   COUNT(*) as total FROM LAB_RESULT_CM WHERE PATID IN (SELECT patid FROM PAT_LIST) AND LAB_LOINC = '4548-4'), "
				+ "ANALYSIS AS (SELECT ROUND(AVG(result_num), 1) as mean, "
				+ "COUNT(DISTINCT PATID) as n_patients_labs, "
				+ "AVG(PAT_CNT.n_patients_dx) as n_patients_dx, "
				+ "AVG(PAT_NO_LAB_CNT.n_patients_no_lab) as n_patients_no_lab, "
				+ "AVG(RESULT_CNT.results) as n_results, "
				+ "AVG(RESULT_CNT.total) as total FROM LAB_RESULT_CM, "
				+ "PAT_CNT, "
				+ "PAT_NO_LAB_CNT, "
				+ "RESULT_CNT "
				+ "   WHERE PATID IN (SELECT patid FROM PAT_LIST) AND LAB_LOINC = '4548-4' AND RESULT_NUM IS NOT NULL) "
				+ "SELECT mean, "
				+ "n_patients_dx, "
				+ "n_patients_labs, "
				+ "n_patients_no_lab, "
				+ "(n_patients_dx - n_patients_no_lab - n_patients_labs) as n_patients_null_lab, "
				+ "n_results, "
				+ "ROUND((1 - (n_results / total)) * 100, 2) as pct_null, PPII FROM ANALYSIS, PAT_LIST; ";
		*/
		//String withTest = "WITH PAT_LIST AS (SELECT DISTINCT patid FROM DIAGNOSIS WHERE DX LIKE '250%'), PAT_CNT AS (SELECT COUNT(*) as n_patients_dx FROM PAT_LIST) select n_patients_dx from PAT_CNT";
		//String funcTest = "SELECT ROUND(1+2, 1, xyx, AVG(X, ddd, FNC(abc))) as mean from blech"; //, COUNT(DISTINCT PATID) as n_patients_labs, AVG(PAT_CNT.n_patients_dx) as n_patients_dx, AVG(PAT_NO_LAB_CNT.n_patients_no_lab) as n_patients_no_lab, AVG(RESULT_CNT.results) as n_results, AVG(RESULT_CNT.total) as total FROM LAB_RESULT_CM, PAT_CNT, PAT_NO_LAB_CNT, RESULT_CNT WHERE PATID IN (SELECT patid FROM PAT_LIST) AND LAB_LOINC = '4548-4' AND RESULT_NUM IS NOT NULL";
		//String funcTest = "SELECT COUN(ABC - 1, J, ZIM(Z, BLIM(X))) as mean  from blech"; //, COUNT(DISTINCT PATID) as n_patients_labs, AVG(PAT_CNT.n_patients_dx) as n_patients_dx, AVG(PAT_NO_LAB_CNT.n_patients_no_lab) as n_patients_no_lab, AVG(RESULT_CNT.results) as n_results, AVG(RESULT_CNT.total) as total FROM LAB_RESULT_CM, PAT_CNT, PAT_NO_LAB_CNT, RESULT_CNT WHERE PATID IN (SELECT patid FROM PAT_LIST) AND LAB_LOINC = '4548-4' AND RESULT_NUM IS NOT NULL";
		//String exprTest = "SELECT (a - (b/3) + 1 - (X *2/3 + (4-y))), abc from blech";
		String compTest = "select count(abc)<NOTIDENTIFIABLE> from (Select count(xyz) from def union select hij from mlm minus select abc from xyz) as subq";
		ReturnFieldsAnalyzer a = new ReturnFieldsAnalyzer(compTest, dm);
		System.out.println(a.topElement);
//<IDENTIFIABLE isId=true/false dateShift ON tbl.field obfuscate=true/false>
		
		for(ReturnColumn rc :a.getReturnColumns())
			System.out.println(getDisplayColumnInfo(rc));
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
	
	
	private static String getDisplayColumnInfo(ReturnColumn rc)
	{
		String rVal;
		String name = rc.column.getDisplayName();
		DeIdTag tag = rc.deidTag;
		if(tag == null)
		{
			rVal = "++++++++" + name + ": WARNING: column does not have any de-identification information.</font></b>";
		}
		else
		{
			if(tag.isBirthdate())
				rVal = name + "will be deidentified as a birth day";
			else if(tag.isDateShift())
				rVal = name + "will be deidentified by date shifting";
			else if(tag.isId())
				rVal = name + "will be deidentified by creating a serial id";
			else if(tag.isZipCode())
				rVal = name + "will be deidentifed by converting to a three digit zip";
			else if(tag.isPhi())
			{
				rVal = "------" + name + ": WARNING: column is marked as phi, but contains no information about deidentification.</font></b>";
			}
			else
				rVal = name + "will not be deidentifed.";
		}
		return rVal;
	}
	
	public Select getTopSelect(){return(topElement);}
	public List<ReturnColumn> getReturnColumns()
	{
		if(returnColumns == null)
		{
			ColumnProvider select = getTopSelect();
			returnColumns = select.getReturnColumns(model);
		}
		return(returnColumns);
	}
	
	
	public boolean hasWarnings()
	{
		return(warnings.size() > 0);
	}
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
		
			int rcCount = 0;
			for(ReturnColumn rc : getReturnColumns())
			{
				rcCount++;
				if(rc.multipleMatchingReferences)
					this.addWarning("Unable to resolve PHI information for " + rc.column.getDisplayName() + " because it is ambiguously defined.");
				else if(rc.deidTag == null)
					this.addWarning("PHI information about returned column " + rc.column.getDisplayName() + " cannot be resolved.");
				else if(rc.deidTag.isTaggedAsNotIdentifiable())
					this.addWarning("The returned column " + rc.column.getDisplayName() + " is tagged as not being identifying data. Please confirm this before sending or approving this query.");
/*				else if(!rc.deidTag.isPhi())
					this.addWarning("Column " + rc.column.getDisplayName() + " is marked as not identifiable."); */
			}
			if(this.getTopSelect() != null && rcCount == 1 && getTopSelect().getCountFunctionTotal() != null && getTopSelect().getCountFunctionTotal() == 1)
				this.addWarning("The single returned count cannot be resolved to an aggregatable field.  The results will need to be approved by the site(s) before being returned.");
			
		}
	}
	
	private void analyzeAggregateTree()
	{
		analyzeNode(topNode, 1, null);
	}	
	
	private void analyzeNode(TreeNode node, int level, SQLElement parentElement)
	{
		
		if(censoredStatements.containsKey(node.self.getClass()))
			setRejection(censoredStatements.get(node.self.getClass()) + " statements are not allowed.");
		
/*		String nodeStr = "null";
		String parStr = "null";
		if(node != null && node.self != null)
			nodeStr = node.self.getClass().getSimpleName();
		if(parentElement != null)
			parStr = parentElement.getClass().getSimpleName();
		
		System.out.println("+++" + level + "\t" + nodeStr + "\t" + parStr);
*/		
		if(node.self instanceof Select_coreContext)
		{
			if(!( parentElement != null && (parentElement instanceof FinalWithSelect)))
			{
				SelectStatement newSel = new SelectStatement();
				parentElement = setParentChild(parentElement, newSel);
				if(saveWithName != null)
				{
					newSel.setAlias(saveWithName);
					saveWithName = null;
				}
				if(topElement == null) topElement = newSel;
							
				//System.out.print(Integer.toString(level) + ": ");
				//System.out.println("select_core");
			}
		}
		
		if(node.self instanceof With_select_stmtContext)
		{
			WithSelect newSel = new WithSelect();
			parentElement = setParentChild(parentElement, newSel);
			if(topElement == null) topElement = newSel;
		}
		if(node.self instanceof Final_with_select_stmtContext)
		{
			FinalWithSelect ss = new FinalWithSelect();
			if(parentElement != null && parentElement instanceof WithSelect)
				parentElement = setParentChild(parentElement, ss);
		}
		if(node.self instanceof With_nameContext)
		{
			saveWithName = node.self.getText();
		}
		if(node.self instanceof Compound_select_stmtContext)
		{
			CompoundSelect compSel = new CompoundSelect();
			parentElement = setParentChild(parentElement, compSel);
			if(topElement == null) topElement = compSel;
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

		if(node.self instanceof Result_count_functionContext || node.self instanceof Any_result_functionContext || (node.self instanceof Any_result_column_exprContext && parentElement instanceof SelectStatement))
		{
			Function func = new Function();
			func.setCallDescriptor(node.self.getText());
			if(node.self instanceof Result_count_functionContext && parentElement instanceof Select)
				((Select)parentElement).incrementCountFunctionTotal();
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
//			if(parentElement != null)
//				System.out.println(parentElement.getClass().getSimpleName() + ":" + node.self.getText());
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
		
		if(node.self instanceof Not_identifiable_propContext)
		{
			if(parentElement instanceof DeIdTag)
			{
				((DeIdTag) parentElement).setTaggedAsNotIdentifiable(true);
			}
		}
		
		if(node.self instanceof Is_zip_propContext)
		{
			if(parentElement instanceof DeIdTag)
			{
				((DeIdTag) parentElement).setZipCode(true);
			}
		}
		
		if(node.self instanceof Table_aliasContext)
		{
			if(parentElement != null && parentElement instanceof Select)
			{
				((Select) parentElement).setRecentChildAlias(node.self.getText());
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
//			if(parentElement instanceof DeIdTag)
//				System.out.println("here");
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
