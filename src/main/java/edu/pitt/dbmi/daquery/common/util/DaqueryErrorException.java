package edu.pitt.dbmi.daquery.common.util;

import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;

public class DaqueryErrorException extends Exception
{
	private static final long serialVersionUID = 7848782438293l;
	private ErrorInfo errorInfo = null;
	public DaqueryErrorException()
	{
		super();
	}
	public DaqueryErrorException(String message)
	{
		super(message);
	}
	public DaqueryErrorException(String message, Throwable cause)
	{
		super(message, cause);
	}
	public DaqueryErrorException(ErrorInfo eInfo)
	{
		super();
		this.errorInfo = eInfo;
	}
	public DaqueryErrorException(String message, ErrorInfo eInfo)
	{
		super(message);
		this.errorInfo = eInfo;
	}
	public DaqueryErrorException(String message, Throwable cause, ErrorInfo eInfo)
	{
		super(message, cause);
		this.errorInfo = eInfo;
	}
	public ErrorInfo getErrorInfo()
	{
		return(errorInfo);
	}
}