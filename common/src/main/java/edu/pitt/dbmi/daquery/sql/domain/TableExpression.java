package edu.pitt.dbmi.daquery.sql.domain;

public class TableExpression implements FromExpression {

	private String tableName;
	private String alias = null;
	
	public String getTableName()
	{
		return(tableName);
	}
	public void setTableName(String name)
	{
		this.tableName = name;
	}
	
	public String getAlias()
	{
		return(alias);
	}
	public void setAlias(String name)
	{
		alias = name;
	}
	
	@Override
	public boolean check() throws SQLConversionError {
		return(true);
	}

	@Override
	public String getExpression(DBSchema schema)
	{
		String rVal = schema.getSchemaName() + "." + tableName;
		if(alias != null)
			rVal = rVal + " as " + alias;
		return(rVal);
	}

}
