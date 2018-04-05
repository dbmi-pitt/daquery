package edu.pitt.dbmi.daquery.central.util;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import edu.pitt.dbmi.daquery.common.util.DaqueryCentralPropertyFile;
import edu.pitt.dbmi.daquery.common.util.EmailConfig;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class EmailHelper {
	public void sendMail(String subject, String message, List<String> toAddresses, List<String> ccAddresses) throws MessagingException, FileNotFoundException{
		
		EmailConfig emailConf = DaqueryCentralPropertyFile.instance().getEmailConfiguration();
		postMail(subject,  /*subject*/
				 message, /*message*/
				 toAddresses, /* to: address */
				 ccAddresses,
				 emailConf.username,  /* smtp username */
				 emailConf.password, /* smtp password */
				 emailConf.fromAddress, /* from address */
				 emailConf.smtpServer, /* smtp server */
				 emailConf.smtpPort, /* smtp port */
				 StringHelper.stringToBool(emailConf.useTLS),  /* use TLS */
				 StringHelper.stringToBool(emailConf.useSSL)); /* use SSL */
	}
	
	public void postMail(String subject, String message, List<String> toAddresses, List<String> ccAddresses, String username, String password, String fromAddress, String smtpServer, String port, boolean useTLS, boolean useSSL) throws MessagingException {
      	
    	message =  message + "</body></html>";
    	
    	Properties props = new Properties();
    	props.put("mail.smtp.user", username);
    	props.put("mail.smtp.host", smtpServer);
    	props.put("mail.smtp.port", port);
    	props.put("mail.smtp.starttls.enable",useTLS ? "true" : "false");
    	props.put("mail.smtp.auth", "true");
    	if(useSSL)
    	{
	    	props.put("mail.smtp.socketFactory.port", port);
	    	props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	    	props.put("mail.smtp.socketFactory.fallback", "false");
    	}

//    	SecurityManager security = System.getSecurityManager();

    	Authenticator auth = new SMTPAuthenticator(username, password);
    	Session session = Session.getInstance(props, auth);
//    	session.setDebug(true);

    	MimeMessage msg = new MimeMessage(session);
    	msg.setContent(message, "text/html");
    	msg.setSubject(subject);
    	msg.setFrom(new InternetAddress(fromAddress));
    	for(String toAddress : toAddresses)
    		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
    	if(ccAddresses != null)
    	{
	    	for(String ccAddress : ccAddresses)
	    		msg.addRecipient(Message.RecipientType.CC, new InternetAddress(ccAddress));
    	}
    	Transport.send(msg);
	}

	private class SMTPAuthenticator extends javax.mail.Authenticator {
		String username;
		String password;
		SMTPAuthenticator(String username, String password)
		{
			this.username = username;
			this.password = password;
		}
	    public PasswordAuthentication getPasswordAuthentication()
	    {
	    	return new PasswordAuthentication(username, password);
	    }
	}
}
