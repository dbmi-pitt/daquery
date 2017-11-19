package edu.pitt.dbmi.daquery.domain.inquiry;

public enum RequestDirection
{
	IN(TYPES.IN),
	OUT(TYPES.OUT);
	
	String val = null;
	
	RequestDirection(String val)
	{
		this.val = val;
	}
	
	@Override
	public String toString()
	{
		return(val);
	}
	
	public static class TYPES
	{
		public static final String IN = "IN";
		public static final String OUT = "OUT";
	}
}
