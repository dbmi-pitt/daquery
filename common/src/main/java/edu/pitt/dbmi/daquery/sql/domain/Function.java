package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class Function extends AbstractColumn implements SQLElement, Column
{
	private List<TableColumn> arguments = new ArrayList<TableColumn>();
	
	public List<TableColumn> getArguments(){return(arguments);}
	public void addArgument(TableColumn arg){arguments.add(arg);}
		
	@Override public void addChild(SQLElement element)
	{
		super.addChild(element);
		if(element instanceof TableColumn) addArgument((TableColumn) element);
	}
	
	@Override public boolean matchesName(String name)
	{
		if(StringHelper.isEmpty(name)) return(false);
		if(StringHelper.isEmpty(alias)) return(false);
		return(StringHelper.equalIgnoreCase(name, alias));
	}
}
