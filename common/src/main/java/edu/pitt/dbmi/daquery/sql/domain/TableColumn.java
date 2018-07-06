package edu.pitt.dbmi.daquery.sql.domain;

import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class TableColumn extends AbstractColumn implements SQLElement, Column
{
	private String name;
	private String dbName;
	private String tableName;
	private String alias;
	
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public String getAlias(){return alias;}
	public void setAlias(String alias){this.alias = alias;}

	public void setDBName(String name){dbName = name;}
	public String getDBName(){return(dbName);}
	
	public void setTableName(String name){tableName = name;}
	public String getTableName(){return(tableName);}
	
	public boolean matchesName(String name)
	{
		if(StringHelper.isEmpty(name)) return(false);
		if(StringHelper.isEmpty(this.name) && StringHelper.isEmpty(alias)) return(false);
		return(StringHelper.equalIgnoreCase(this.name, name) || StringHelper.equalIgnoreCase(name, alias));
	}
}
