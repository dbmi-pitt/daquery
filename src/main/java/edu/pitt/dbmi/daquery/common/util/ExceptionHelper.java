package edu.pitt.dbmi.daquery.common.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionHelper
{
	public static String toString(Throwable t, boolean recursCauses)
	{
		String rVal = null;
		StringWriter sWriter = new StringWriter();
		PrintWriter pWriter = new PrintWriter(sWriter);
		t.printStackTrace(pWriter);
		rVal = sWriter.toString();
		if(recursCauses && t.getCause() != null)
			rVal = rVal + "\n" + toString(t.getCause(), true);
		return(rVal);
	}
}
