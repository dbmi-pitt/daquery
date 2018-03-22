package edu.pitt.dbmi.daquery.central.util;

public class DaqueryCentralException extends Exception
{
	private static final long serialVersionUID = 292945202094l;
	public DaqueryCentralException()
	{
		super();
	}
	public DaqueryCentralException(String message)
	{
		super(message);
	}
	public DaqueryCentralException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
