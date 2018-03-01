package edu.pitt.dbmi.daquery.util.properties;

import java.io.FileNotFoundException;

public class PropfileException extends FileNotFoundException 
{
	private static final long serialVersionUID = 2892824234l;
	
	public static final int FILE_NOT_FOUND = 1;
	public static final int FILE_UNREADABLE = 2;
	public static final int UNKNOWN_ERROR = 3;
	public static final int XML_ERROR = 4;
	private int type;
	public PropfileException(String description, int type)
	{
		super(description);
		this.type = type;
	}
	public int getType()
	{
		return(type);
	}
}
