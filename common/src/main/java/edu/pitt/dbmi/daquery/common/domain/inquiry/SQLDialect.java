package edu.pitt.dbmi.daquery.common.domain.inquiry;

import org.hibernate.internal.util.StringHelper;

public enum SQLDialect
{
	SQL_SERVER(TYPES.SQL_SERVER), ORACLE(TYPES.ORACLE), ANSI(TYPES.ANSI);
	
	String val;
	SQLDialect(String v)
	{
		val = v;	
	}
	
	public static SQLDialect fromString(String val)
	{
		if(StringHelper.isEmpty(val)) return null;
		String valChk = val.toUpperCase().trim();
		for(SQLDialect s : SQL_SERVER.getDeclaringClass().getEnumConstants())
		{
			if(s.val.equals(valChk))
				return(s);
		}
		return(null);
	}
	
	public static class TYPES
	{
		public static final String SQL_SERVER = "SQL_SERVER";
		public static final String ORACLE = "ORACLE";
		public static final String ANSI = "ANSI";
	}
}
