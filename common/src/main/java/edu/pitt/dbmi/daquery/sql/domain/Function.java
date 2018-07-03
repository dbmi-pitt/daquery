package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

public class Function extends AbstractColumn implements SQLElement, Column
{
	private String name;
	private List<TableColumn> arguments = new ArrayList<TableColumn>();
	private String alias;
	
	public String getName(){return(name);}
	public void setName(String name){this.name = name;}
	
	public List<TableColumn> getArguments(){return(arguments);}
	public void addArgument(TableColumn arg){arguments.add(arg);}
	
	public String getAlias(){return(alias);}
	public void setAlias(String name){alias = name;}
		
	@Override public void addChild(SQLElement element)
	{
		super.addChild(element);
		if(element instanceof TableColumn) addArgument((TableColumn) element);
	}
}
