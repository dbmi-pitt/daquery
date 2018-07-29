package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;

public class SelectStatement extends AbstractElement implements ColumnProvider, SQLElement
{
	private String alias;
	private List<Column> columns = new ArrayList<Column>();
	private List<ColumnProvider> columnProviders = new ArrayList<ColumnProvider>();
	
	public String getAlias(){return alias;}
	public void setAlias(String alias){this.alias = alias;}

	public ReturnColumn resolveColumn(Column col)
	{
		
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

