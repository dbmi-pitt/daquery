package edu.pitt.dbmi.daquery.common.util;

public class StringHelper
{
	public static void main(String [] args)
	{
		String val = "\\\"here\\\"";
		System.out.println(val);
		System.out.println(unEscapeQuotes(val));
	}
	public static boolean isEmpty(String val)
	{
		if(val == null) return(true);
		return(val.trim().equals(""));
	}
	
	public static String unEscapeQuotes(String val)
	{
		if(val == null)
			return(null);
		String rVal = val.replace("\\\"", "\"");
		return(rVal);
	}
}
