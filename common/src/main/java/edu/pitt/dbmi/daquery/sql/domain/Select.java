package edu.pitt.dbmi.daquery.sql.domain;

public interface Select extends ColumnProvider, SQLElement
{
	public void setRecentChildAlias(String name);
	public void incrementCountFunctionTotal();
	public Integer getCountFunctionTotal();
}
