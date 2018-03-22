package edu.pitt.dbmi.daquery.common.auth;

public class TokenInvalidException extends Exception
{
	private static final long serialVersionUID = 3387298234234234l;
	
	public TokenInvalidException(){}
	
	public TokenInvalidException(String message)
	{
		super(message);
	}

	public TokenInvalidException(String message, Throwable cause)
	{
		super(message, cause);
	}	
}
