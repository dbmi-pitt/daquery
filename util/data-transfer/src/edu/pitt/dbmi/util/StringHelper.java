package edu.pitt.dbmi.util;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringHelper
{
	public static boolean startsWithIgnoreCase(String val, String match)
	{
		if(StringHelper.isEmpty(val) || StringHelper.isEmpty(match))
			return(false);
		else
			return(val.toUpperCase().startsWith(match.toUpperCase()));
	}
	
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
		System.out.println(replaceInFilename("A?A%A\\A/A(A)A;A&A'A.A:A|A\"A"));
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
	
	/** find the matching type of the string
	 * Looks for boolean, int, String - in that order,
	 * returns null if the type can't be determined
	 * @param val
	 * @return
	 */
	private static String [] booleanVals = {"yes", "no", "true", "false"};
	public static Class<?> myType(String val)
	{
		if(isEmpty(val)) return(null);
		String chkVal = val.trim();
		if(isBoolean(chkVal))
			return(Boolean.class);
		else if(isInt(val))
			return(Integer.class);
		else
			return(String.class);
	}
	
	public static Boolean toBool(String val)
	{
		if(! isBoolean(val)) return(null);
		String chkVal = val.trim().toLowerCase();
		if(chkVal.equals("yes") || chkVal.equals("true")) return(true);
		return(false);
	}
	
	public static boolean isBoolean(String val)
	{
		if(isEmpty(val)) return(false);
		String chkVal = val.trim();
		return(equalIgnoreCase(chkVal, booleanVals));
	}
	public static boolean isInt(String val)
	{
		if(isEmpty(val)) return(false);
		try{Integer.parseInt(val);}
		catch(NumberFormatException nfe){return(false);}
		return(true);
		
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

	public static String escapeSQLSingleQuote(String val)
	{
		if(val == null) return(null);
		return(val.replace("'","''"));
			
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
	
	/**
	 * Compare against a list of values, if any value in the list matches
	 * return true
	 */
	public static boolean equalIgnoreCase(String val, String [] compares)
	{
		for(String comp : compares)
		{
			if(equalIgnoreCase(val, comp)) return(true);
		}
		return(false);
	}
	
	/**
	 * Replace invalid (or not suggested) filename characters with an underscore
	 */
	public static String replaceInFilename(String val)
	{
		if(StringHelper.isEmpty(val)) return(val);
		return(val.replaceAll("[/ \\\\?%*:|\"<>.'&();]", "_"));		
	}
	
	public static String capitalize(String val)
	{
		if(isBlank(val)) return(val);
		String toVal = val.trim();
		return toVal.substring(0,1).toUpperCase() + toVal.substring(1).toLowerCase();
	}
}
