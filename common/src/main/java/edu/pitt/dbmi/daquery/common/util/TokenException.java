package edu.pitt.dbmi.daquery.common.util;
import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;

public class TokenException extends Exception {

    
	private static final long serialVersionUID = 896413921742353740L;

	private ErrorInfo errorInfo = null;
	
	public TokenException()
	{
		super();
	}
	public TokenException(String message)
	{
		super(message);
	}
	public TokenException(String message, Throwable cause)
	{
		super(message, cause);
	}
	public TokenException(ErrorInfo eInfo)
	{
		super(eInfo.getDisplayMessage());
		this.errorInfo = eInfo;
	}
	public TokenException(String message, ErrorInfo eInfo)
	{
		super(message);
		this.errorInfo = eInfo;
	}
	public TokenException(String message, Throwable cause, ErrorInfo eInfo)
	{
		super(message, cause);
		this.errorInfo = eInfo;
	}
	public ErrorInfo getErrorInfo()
	{
		return(errorInfo);
	}

}

