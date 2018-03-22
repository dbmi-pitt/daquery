package edu.pitt.dbmi.daquery.sql.domain;

public class Field implements Term, QuerySegment
{
	protected String name;
	protected boolean count = false;
	protected boolean distinct = false;
	
	public String getName()
	{
		return name;
	}
	public void setName(String nme)
	{
		this.name = nme;
	}
	
	@Override
	public String getTerm()
	{
		String rVal = name;
		if(count)
		{
			if(distinct)
				rVal = "distinct " + rVal;
			rVal = "count(" + rVal + ")";
		}
		return(rVal);
	}

	@Override
	public boolean check()
	{
		return(true);
	}

	@Override
	public boolean isCount()
	{
		return(count);
	}
	@Override
	public void setCount(boolean cnt)
	{
		count = cnt;
	}
	
	@Override
	public boolean isDistinct()
	{
		return(distinct);
	}
	@Override
	public void setDistinct(boolean dist)
	{
		distinct = dist;
	}
}
