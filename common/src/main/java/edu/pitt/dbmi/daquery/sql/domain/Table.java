package edu.pitt.dbmi.daquery.sql.domain;

import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class Table extends AbstractElement implements ColumnProvider, SQLElement
{
	private String name;
	private String dbName;
	private String alias;

	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public String getAlias(){return alias;}
	public void setAlias(String alias){this.alias = alias;}

	public String getDBName(){return(dbName);}
	public void setDBName(String name){dbName = name;}
	
	@Override
	public boolean matchesName(String name)
	{
		if(StringHelper.isEmpty(name)) return(false);
		if(StringHelper.isEmpty(this.name) && StringHelper.isEmpty(alias)) return(false);
		return(StringHelper.equalIgnoreCase(this.name, name) || StringHelper.equalIgnoreCase(name, alias));
	}
}
