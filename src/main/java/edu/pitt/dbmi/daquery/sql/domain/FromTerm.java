package edu.pitt.dbmi.daquery.sql.domain;

public abstract class FromTerm implements QuerySegment
{
	private String alias = null;
	
	public abstract String getTerm();
	
	public String getAlias()
	{
		return(alias);
	}
	public void setAlias(String al)
	{
		this.alias = al;
	}
	
}
