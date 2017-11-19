package edu.pitt.dbmi.daquery.sql.domain;

import java.sql.Connection;

public class DBSchema
{
	private DBType flavor;
	private String name;
	
	public String getName()
	{
		return(name);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getSchemaName()
	{
		String rVal = name;
		if(flavor.equals(DBType.SQL_SERVER))
			rVal = rVal + ".dbo";
		return(rVal);
	}		
	
	public void setDBType(DBType type)
	{
		flavor = type;
	}
	public DBType getDBType()
	{
		return(flavor);
	}
}
