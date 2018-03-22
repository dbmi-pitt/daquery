package edu.pitt.dbmi.daquery.common.domain;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.util.ExceptionHelper;

public class ErrorInfo extends DaqueryObject
{
	private static final long serialVersionUID = 9038388393843434l;
	public static final String ERROR_INFO_TYPE_VERSION = "ErrorInfoTypev1";
	
	@Expose
	public String displayMessage;
	
	@Expose
	public String longMessage;
	
	@Expose
	public String stackTrace;
	
	@Expose
	public DaqueryResponse response;
	
	@Expose
	public String type = ERROR_INFO_TYPE_VERSION;
	
	public ErrorInfo(){}
	
	public ErrorInfo(String displayMessage)
	{
		setDisplayMessage(displayMessage);
	}
	
	public ErrorInfo(String message, String longMessage, Throwable cause)
	{
		setDisplayMessage(message);
		setLongMessage(longMessage);
		setStackTraceWithThrowable(cause);
	}
	
	public String getDisplayMessage(){return(displayMessage);}
	public void setDisplayMessage(String msg){displayMessage = msg;}
	
	public String getLongMessage(){return(longMessage);}
	public void setLongMessage(String msg){longMessage = msg;}
	
	public String getStackTrace(){return(stackTrace);}
	public void setStackTrace(String trace){stackTrace = trace;}
	public void setStackTraceWithThrowable(Throwable t)
	{
		if(t != null)
			stackTrace = ExceptionHelper.toString(t, true);
		else
			stackTrace = null;
	}
	
	public DaqueryResponse getResponse(){return(response);}
	public void setResponse(DaqueryResponse resp){response = resp;}

}
