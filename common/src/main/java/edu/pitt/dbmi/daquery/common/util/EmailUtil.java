package edu.pitt.dbmi.daquery.common.util;

import java.util.Date;

import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DecodedErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.EmailContents;
import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;

public class EmailUtil
{
	public static void main(String [] args) throws Exception
	{
		AppProperties.setDevHomeDir("/home/devuser/daquery-data");
		EmailContents ec = new EmailContents();
		ec.subject = "tester22";
		ec.message = "hello<br //><br //>&nbsp;&nbsp;&nbsp;&nbsp;<b>hola</b> eh?";
		ec.toAddresses.add("shirey@pitt.edu");
		ec.toAddresses.add("schmoo@gmail.com");
		ec.ccAddresses.add("bill.shirey@gmail.com");
		sendEmail(ec);
	}
	
	/**
	 * Return a standardized string for use as the header in emails.
	 * @param networkName- the name of the network that caused the email to be sent
	 * @param siteName- the name of the site that caused the email to be sent
	 * @param queryName- the name of the query that caused the email to be sent
	 * @return- an HTML formatted string for use in the email message body
	 */
	public static String generateEmailHeader(String networkName, String siteName, String queryName) 
	{
		String retString = "";
		Date date = new Date();
		String dt = StringHelper.displayDateFormat(date);
		if (networkName != null && !networkName.isEmpty())
			retString += "&nbsp;&nbsp;&nbsp;&nbsp;<b>Network Name:</b>&nbsp;" + networkName + "<br //>";
		if (siteName != null && !siteName.isEmpty())
			retString += "&nbsp;&nbsp;&nbsp;&nbsp;<b>Site Name:</b>&nbsp;" + siteName + "<br //>";
		retString += "&nbsp;&nbsp;&nbsp;&nbsp;<b>Date:</b>&nbsp;" + dt + "<br //>";
		if (queryName != null && !queryName.isEmpty())
			retString += "&nbsp;&nbsp;&nbsp;&nbsp;<b>Query Name:</b>&nbsp;" + queryName + "<br //>";
/*		if (userName != null && !userName.isEmpty()) {
			retString += "&nbsp;&nbsp;&nbsp;&nbsp;<b>User Name:</b>&nbsp;" + userName;
			//add the user's email in parentheses if set
			if (userEmail != null && !userEmail.isEmpty())
				retString += "(" + userEmail + ")"; }*/
		retString += "<br //>";
		
		return retString;
		
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
