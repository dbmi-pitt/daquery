package edu.pitt.dbmi.daquery.common.domain;

public class DecodedErrorInfo
{
	private ErrorInfo errorInfo = null;
	private String errorMessage;
	
	public DecodedErrorInfo(ErrorInfo info, String errMessage)
	{
		errorInfo = info;
		errorMessage = errMessage;
	}
	
	public ErrorInfo getErrorInfo(){return(errorInfo);}
	public void setErrorInfo(ErrorInfo info){errorInfo = info;}
	
	public String getErrorMessage(){return(errorMessage);}
	public void setErrorMessage(String msg){errorMessage = msg;}
}
