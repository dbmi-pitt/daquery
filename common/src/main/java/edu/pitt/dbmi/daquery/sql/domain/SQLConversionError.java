package edu.pitt.dbmi.daquery.sql.domain;

public class SQLConversionError extends Exception
{
	public SQLConversionError(String message)
	{
		super(message);
	}
  	public SQLConversionError(String message, Throwable cause)
  	{
  		super(message, cause);
  	}
}
