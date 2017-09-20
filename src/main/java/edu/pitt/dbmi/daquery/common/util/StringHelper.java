package edu.pitt.dbmi.daquery.common.util;

public class StringHelper
{
	public static boolean isEmpty(String val)
	{
		if(val == null) return(true);
		return(val.trim().equals(""));
	}
}
