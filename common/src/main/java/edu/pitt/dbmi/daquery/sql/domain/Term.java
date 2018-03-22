package edu.pitt.dbmi.daquery.sql.domain;

public interface Term extends QuerySegment
{
	public String getTerm();
	public String getName();
	public void setName(String name);
	public boolean isCount();
	public void setCount(boolean cnt);
	public boolean isDistinct();
	public void setDistinct(boolean dist);
}
