package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;

public class SelectStatement extends AbstractElement implements ColumnProvider, SQLElement
{
	private String alias;
	private List<Column> columns = new ArrayList<Column>();
	private List<ColumnProvider> columnProviders = new ArrayList<ColumnProvider>();
	
	public String getAlias(){return alias;}
	public void setAlias(String alias){this.alias = alias;}

	@Override
	public List<ReturnColumn> getReturnColumns(DataModel dm)
	{
		List<ReturnColumn> rCols = new ArrayList<ReturnColumn>();
		for(Column col : columns)
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
		children.add(child);
		if(child instanceof Column) addColumn((Column) child);
		if(child instanceof ColumnProvider) addProvider((ColumnProvider) child);
	}
	@Override
	public boolean matchesName(String name)
	{
		if(StringHelper.isEmpty(name)) return(false);
		if(StringHelper.isEmpty(alias)) return(false);
		return(StringHelper.equalIgnoreCase(name, alias));
	}
	
	public void addColumn(Column column)
	{
		columns.add(column);
	}
	public List<Column> getColumns(){return(columns);}
	public void addProvider(ColumnProvider prov)
	{
		columnProviders.add(prov);
	}
	
}

