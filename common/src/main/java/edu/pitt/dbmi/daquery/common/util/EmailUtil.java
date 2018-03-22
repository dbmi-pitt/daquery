package edu.pitt.dbmi.daquery.common.util;

import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.common.domain.DecodedErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.EmailContents;
import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;

public class EmailUtil
{
	public static void main(String [] args) throws Exception
	{
		AppProperties.setDevHomeDir("/home/devuser/daquery-data");
		EmailContents ec = new EmailContents();
		ec.subject = "tester";
		ec.message = "hello<br //><br //>&nbsp;&nbsp;&nbsp;&nbsp;<b>hola</b> eh?";
		ec.toAddresses.add("shirey@pitt.edu");
		sendEmail(ec);
	}
	
	public static void sendEmail(EmailContents contents) throws DaqueryException, DaqueryErrorException
	{
		Response resp = WSConnectionUtil.centralServerPostJSON("send-mail", contents);
		if(resp.getStatus() != 200)
		{
			DecodedErrorInfo info = ResponseHelper.decodeErrorResponse(resp);
			if(info != null)
			{
				if(info.getErrorInfo() != null)
				{
					throw new DaqueryErrorException(info.getErrorInfo());
				}
				else if(! StringHelper.isEmpty(info.getErrorMessage()))
				{
					throw new DaqueryErrorException(info.getErrorMessage());
				}
			}
			else
			{
				ErrorInfo ei = new ErrorInfo();
				ei.setDisplayMessage("An error occured while sending an email.");
				ei.setLongMessage("The central server responded with a status code of " + resp.getStatus() + " on sending an email.");
			}
		}
	}
}
