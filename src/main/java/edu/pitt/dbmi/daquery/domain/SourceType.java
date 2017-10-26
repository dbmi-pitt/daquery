package edu.pitt.dbmi.daquery.domain;


public enum SourceType
{	
	SQL(TYPES.SQL_VAL), SAS(TYPES.SAS_VAL), R(TYPES.R_VAL), BASE(TYPES.BASE_VAL);
	
	String val = null;
	
	SourceType(String val)
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
		public static final String SQL_VAL = "SQL";
		public static final String SAS_VAL = "SAS";
		public static final String R_VAL = "R";
		public static final String BASE_VAL = "BASE";
	}
}
