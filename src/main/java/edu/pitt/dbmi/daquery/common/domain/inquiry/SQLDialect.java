package edu.pitt.dbmi.daquery.common.domain.inquiry;

public enum SQLDialect
{
	SQL_SERVER(TYPES.SQL_SERVER), ORACLE(TYPES.ORACLE), ANSI(TYPES.ANSI);
	
	String val;
	SQLDialect(String v)
	{
		val = v;
	}
	
	public static class TYPES
	{
		public static final String SQL_SERVER = "SQL_SERVER";
		public static final String ORACLE = "ORACLE";
		public static final String ANSI = "ANSI";
	}	
}
