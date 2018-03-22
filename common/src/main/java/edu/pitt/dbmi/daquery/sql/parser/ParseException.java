package edu.pitt.dbmi.daquery.sql.parser;

public class ParseException extends Exception
{
	private static final long serialVersionUID = 29292782924223423l;
	
	public ParseException(String description)
	{
		super(description);
	}
	public ParseException(String description, Throwable cause)
	{
		super(description, cause);
	}
	public ParseException(Throwable cause)
	{
		super(cause);
	}
}
