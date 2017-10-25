package edu.pitt.dbmi.daquery.domain;


public enum SourceType
{	
	SQL(TYPES.SQL_VAL), SAS(TYPES.SAS_VAL), R(TYPES.R_VAL), BASE(TYPES.BASE_VAL);

	int intValue = 0;
	SourceType(int val)
	{
		intValue = val;
	}
	
	SourceType(String val)
	{
		intValue = Integer.parseInt(val);
	}
	
	public int getValue()
	{
		return(intValue);
	}
	
	public static SourceType fromInt(int val)
	{
		for(SourceType st : values())
		{
			if(val == st.intValue)
				return(st);
		}
		return(null);
	}
	
	public static class TYPES
	{
		public static final String SQL_VAL = "1";
		public static final String SAS_VAL = "2";
		public static final String R_VAL = "3";
		public static final String BASE_VAL = "4";
	}
}
