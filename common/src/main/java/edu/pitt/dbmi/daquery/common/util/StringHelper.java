package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringHelper
{
	public static String stackToString(Throwable t)
	{
		StringWriter sWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(sWriter);
		t.printStackTrace(writer);
		String trace = sWriter.toString();
		if(trace.length() > 10000) trace = trace.substring(0, 9999);
		return(trace);
	}
	
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
	
	public static boolean isBlank(String val)
	{
		return(isEmpty(val));
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

	public static String escapeBackslashes(String val)
	{
		if(val == null)
			return(null);
		String rVal = val.replace("\\", "\\\\");
		return(rVal);
	}

	public static String ensureTrailingSlashURL(String path)
	{
		if(path == null) return(null);
		String tPath = path.trim();
		if(! tPath.endsWith("/"))
		{
			tPath = tPath + "/";
		}
		return(tPath);
	}

	public static String ensureTrailingSlashFile(String path)
	{
		if(path == null) return(null);
		String tPath = path.trim();
		if(! tPath.endsWith(File.separator))
		{
			tPath = tPath + File.separator;
		}
		return(tPath);
	}	
	public static boolean stringToBool(String val)
	{
		if(isBlank(val))
			return(false);
		String yn = val.trim().toUpperCase();
		if(yn.equals("YES") || yn.equals("TRUE"))
			return(true);
		else
			return(false);
	}
	public static String usernameFromEmail(String email)
	{
		if(isEmpty(email)) return(email);
		String rVal = email.trim();
		int atPos = rVal.indexOf("@");
		if(atPos > 0)
			rVal = rVal.substring(0, atPos);
		return(rVal);
	}
	public static SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd_kk-mm-ss");
	public static String formatDate(Date dte)
	{
		if(dte == null) return(null);
		return dateTimeFormat.format(dte);
	}
	public static boolean equalIgnoreCase(String val1, String val2)
	{
		if(val1 == null && val2 == null) return(true);
		if(val1 == null || val2 == null) return(false);
		if(isEmpty(val1) && isEmpty(val2)) return(true);
		if(isEmpty(val1) || isEmpty(val2)) return(false);
		
		return(val1.toUpperCase().trim().equals(val2.toUpperCase().trim()));
		
	}
}
