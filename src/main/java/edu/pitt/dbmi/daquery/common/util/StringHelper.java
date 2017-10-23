package edu.pitt.dbmi.daquery.common.util;

import java.io.File;

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
	
	public static boolean anyAreEmpty(String [] vals)
	{
		if(vals == null) return(true);
		for(String val : vals)
		{
			if(isEmpty(val)) return(true);
		}
		return(false);
	}
	
	public static String unEscapeQuotes(String val)
	{
		if(val == null)
			return(null);
		String rVal = val.replace("\\\"", "\"");
		return(rVal);
	}
	
	public static String ensureTrailingSlash(String path)
	{
		if(path == null) return(null);
		String tPath = path.trim();
		if(! tPath.endsWith(File.separator))
		{
			tPath = tPath + File.separator;
		}
		return(tPath);
	}
}
