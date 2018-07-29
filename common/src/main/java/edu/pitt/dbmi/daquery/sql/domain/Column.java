package edu.pitt.dbmi.daquery.sql.domain;

public interface Column
{
	public DeIdTag getDeIdTag();
	public void setDeIdTag(DeIdTag tag);
	public String getAlias();
	public void setAlias(String alias);
	public String getName();
	public void setName(String name);
	public String getDisplayName();
}
