package edu.pitt.dbmi.daquery.sql.parser;

public class ParseError extends Error
{
	private static final long serialVersionUID = 29292924908234l;
	
	public ParseError(String description)
	{
		super(description);
	}
	
	public ParseError(String description, Throwable t)
	{
		super(description, t);
	}
}
