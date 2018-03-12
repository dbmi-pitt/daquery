package edu.pitt.dbmi.daquery.common.util;

import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.common.domain.DecodedErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.EmailContents;
import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;

public class EmailUtil
{
	public static void sendEmail(EmailContents contents) throws DaqueryException, DaqueryErrorException
	{
		Response resp = WSConnectionUtil.centralServerPost("send-mail", contents, null, null);
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
