package edu.pitt.dbmi.daquery.sql.domain;


public class CompoundSelect extends SelectStatement implements ColumnProvider, SQLElement
{
	@Override public void addChild(SQLElement child)
	{
		children.add(child);
		if(child instanceof Column) addColumn((Column) child);
		if(child instanceof ColumnProvider) addProvider((ColumnProvider) child);
	}
}

