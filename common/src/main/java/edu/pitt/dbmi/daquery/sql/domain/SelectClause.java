package edu.pitt.dbmi.daquery.sql.domain;

public abstract class SelectClause implements QuerySegment
{
	protected boolean distinct = false;
	
	public abstract String getClause() throws SQLConversionError;
	
	public boolean isDistinct()
	{
		return(distinct);
	}
	public void setDistinct(boolean val)
	{
		distinct = val;
	}
}
