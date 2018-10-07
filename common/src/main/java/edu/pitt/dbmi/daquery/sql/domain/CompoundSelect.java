package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;

public class CompoundSelect extends SelectStatement implements ColumnProvider, SQLElement
{
	@Override public void addChild(SQLElement child)
	{
		children.add(child);
		if(child instanceof Column) addColumn((Column) child);
		if(child instanceof ColumnProvider) addProvider((ColumnProvider) child);
	}
	@Override
	public List<ReturnColumn> getReturnColumns(DataModel dm)
	{
		List<ReturnColumn> rCols = new ArrayList<ReturnColumn>();
		for(ColumnProvider cp : columnProviders)
		{
			rCols.addAll(cp.getReturnColumns(dm));
		}
		return(rCols);
	}	
}

