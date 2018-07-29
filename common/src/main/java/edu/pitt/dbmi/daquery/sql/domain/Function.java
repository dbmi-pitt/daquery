package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

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
}
