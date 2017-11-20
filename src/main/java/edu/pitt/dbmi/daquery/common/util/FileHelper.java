package edu.pitt.dbmi.daquery.common.util;

import java.io.InputStream;

public class FileHelper
{
	public static InputStream streamFromBaseResource(String filename)
	{
		InputStream is = ApplicationPropertiesFile.class.getResourceAsStream("/" + filename);
		return(is);
	}
}
