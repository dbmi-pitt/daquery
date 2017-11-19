package edu.pitt.dbmi.daquery.domain.inquiry;

public enum InquiryType
{	
	SQL_QUERY(TYPES.SQL_VAL), SAS_INQUIRY(TYPES.SAS_VAL), R_INQUIRY(TYPES.R_VAL);
	
	String val = null;
	
	InquiryType(String val)
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
		public static final String SQL_VAL = "SQL_QUERY";
		public static final String SAS_VAL = "SAS_INQUIRY";
		public static final String R_VAL = "R_INQUIRY";
	}
}