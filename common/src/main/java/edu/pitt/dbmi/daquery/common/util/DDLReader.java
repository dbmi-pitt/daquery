package edu.pitt.dbmi.daquery.common.util;

import java.io.InputStream;
import java.util.Scanner;

public class DDLReader {

	public static final String DDL_VERSION_MATCH = "(?i)<!--\\s*daquery.data.version\\s*=\\s*.*";
	public static final String DDL_VERSION_REPLACE = "(?i)<!--\\s*daquery.data.version\\s*=\\s*"; 
	
	public static Float getVerion(String resourceFileName) throws DaqueryException
	{
		InputStream is = FileHelper.streamFromBaseResource(resourceFileName);
        Scanner inputScanner = new Scanner(is);
        inputScanner.useDelimiter(ApplicationDBHelper.DDL_SCANNER_PATTERN);
		return(getVersion(inputScanner));
	}
	public static Float getVersion(Scanner ddlFile) throws DaqueryException
	{
		Float version = null;
		Float secondaryVersion = null;
        while (ddlFile.hasNext())
        {
            String line = ddlFile.next();

            if (line.trim().length() > 0)
            {
            	String l2 = line.trim();
            	if(version == null && l2.matches(DDL_VERSION_MATCH))
            	{
            		String v = l2.replaceFirst(DDL_VERSION_REPLACE, "");
            		try{version = Float.parseFloat(v.trim());}
            		catch(Throwable t)
            		{
            			throw new DaqueryException("Couldn't convert specified version number " + v + " in ddl file to a float", t);
            		}
            		return(version);
            	}
            	else if(l2.startsWith("#include"))
            	{
            		String includeFile = l2.substring(8).trim();
            		InputStream is = FileHelper.streamFromBaseResource(includeFile);
            	    Scanner inputScanner = new Scanner(is);
            	    inputScanner.useDelimiter(ApplicationDBHelper.DDL_SCANNER_PATTERN);
            	    secondaryVersion = getVersion(inputScanner);
            	}
            }
        }
        return(secondaryVersion);
	}
}
