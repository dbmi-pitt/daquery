package edu.pitt.dbmi.daquery.sql.domain;

import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class TableColumn extends AbstractColumn implements SQLElement, Column
{
	private String dbName;
	private String tableName;
	
	public void setDBName(String name){dbName = name;}
	public String getDBName(){return(dbName);}
	
	public void setTableName(String name){tableName = name;}
	public String getTableName(){return(tableName);}
	
	public boolean matchesName(String name)
	{
		if(StringHelper.isEmpty(name)) return(false);
		if(StringHelper.isEmpty(this.name) && StringHelper.isEmpty(alias)) return(false);
		if(StringHelper.isEmpty(alias))
			return(StringHelper.equalIgnoreCase(this.name, name));
		else
			return(StringHelper.equalIgnoreCase(name, alias));
	}
	
	@Override public String getDisplayName()
	{
		String rName = null;
		if(!StringHelper.isEmpty(alias))
			rName = alias;
		else if(!StringHelper.isEmpty(name))
		{
			rName = name;
			if(!StringHelper.isEmpty(tableName))
				rName = tableName + "." + rName;
		}
		return(rName);
	}
}
