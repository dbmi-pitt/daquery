package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;

public class WithSelect extends AbstractElement implements ColumnProvider, SQLElement
{
	private SelectStatement select = null;
	private List<ColumnProvider> columnProviders = new ArrayList<ColumnProvider>();
	
	private static final List<Column> EMPTY_COL_LIST = new ArrayList<Column>();
	private static final List<ReturnColumn> EMPTY_RCOL_LIST = new ArrayList<ReturnColumn>();
		
	@Override
	public List<ReturnColumn> getReturnColumns(DataModel dm)
	{
		if(select == null) return(EMPTY_RCOL_LIST);
		List<ReturnColumn> rCols = new ArrayList<ReturnColumn>();
		for(Column col : select.getColumns())
		{
			ReturnColumn rc = resolveColumn(col, dm);
			rCols.add(rc);
		}
		return(rCols);
	}
	
	private List<DeIdTag> getDeidInfo(Column col, ColumnProvider provider, DataModel dm)
	{
		List<DeIdTag> tags = new ArrayList<DeIdTag>();
		List<ReturnColumn> cols = provider.getReturnColumns(dm);
		for(ReturnColumn rc : cols)
		{
			if(rc.column.matchesName(col.getName()) && rc.deidTag != null)
				tags.add(rc.deidTag);
		}
		return(tags);
	}
	
	private ReturnColumn resolveColumn(Column col, DataModel dm)
	{
		ReturnColumn rc = new ReturnColumn();
		rc.column = col;

		if(col.getDeIdTag() != null && isValidDeidTag(col.getDeIdTag()))
		{
			rc.deidTag = col.getDeIdTag();	
		}
		else if(col instanceof TableColumn)
		{
			List<DeIdTag> tags = new ArrayList<DeIdTag>();
			//first check to see if the table name resolves an included table or sub-select, either could be aliased 
			if(! StringHelper.isBlank(((TableColumn) col).getTableName()))
			{
				String testName = ((TableColumn) col).getTableName().trim().toUpperCase();
				for(ColumnProvider cp : columnProviders)
				{
					if(cp.matchesName(testName));
					{
						tags.addAll(getDeidInfo(col, cp, dm));
					}
				}
			}
			//otherwise if a table name isn't specified, look to see if there is
			//a single match for the field name in an included table or sub-queries' included table 
			else
			{
				for(ColumnProvider cp : columnProviders)
				{
					tags.addAll(getDeidInfo(col, cp, dm));
				}
			}
			if(tags.size() == 1)
				rc.deidTag = tags.get(0);
			else if(tags.size() > 1)
				rc.multipleMatchingReferences = true;
		}
		return(rc);
	}
	
	//resolves to deid info given that col is a TableColumn AND both table name and field name are provided
/*	private DeIdTag resolveColumnPhiInfo(Column col, DataModel dm)
	{
		DeIdTag tag = null;
		int idx = 0;
		
		while(tag == null && idx < columnProviders.size())
		{
			ColumnProvider provider = columnProviders.get(idx++);
			tag = provider.resolveColumnPhiInfo(col, dm);
		}
		return(tag);
	} */
	
	private boolean isValidDeidTag(DeIdTag tag)
	{
		return(tag.isDateShift() || tag.isId() || tag.isObfuscate() || ! tag.isPhi());
	}
	
	@Override public void addChild(SQLElement child)
	{
		if(child instanceof Column) addColumn((Column) child);
		if(child instanceof FinalWithSelect)
			this.select = (SelectStatement) child;
		else
		{
			children.add(child);
			if(child instanceof ColumnProvider) addProvider((ColumnProvider) child);
		}
	}
	@Override
	public boolean matchesName(String name)
	{
		if(StringHelper.isEmpty(name)) return(false);
		if(select == null || StringHelper.isEmpty(select.getAlias())) return(false);
		return(StringHelper.equalIgnoreCase(name, select.getAlias()));
	}
	
	public void addColumn(Column column)
	{
		if(select != null) select.addColumn(column);
	}
	public List<Column> getColumns()
	{
		if(select == null) return(EMPTY_COL_LIST);
		return(select.getColumns());
	}
	public void addProvider(ColumnProvider prov)
	{
		columnProviders.add(prov);
	}
	
	public String getAlias()
	{
		if(select == null) return(null);
		return(select.getAlias());
	}
	public void setAlias(String al)
	{
		if(select != null)
			select.setAlias(al);
	}
}

