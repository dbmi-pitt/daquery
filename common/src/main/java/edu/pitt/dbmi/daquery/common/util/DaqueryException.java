package edu.pitt.dbmi.daquery.common.util;

public class DaqueryException extends Exception
{
	private static final long serialVersionUID = 35345342342344l;
	public DaqueryException()
	{
		super();
	}
	public DaqueryException(String message)
	{
		super(message);
	}
	public DaqueryException(String message, Throwable cause)
	{
		super(message, cause);
	}
}