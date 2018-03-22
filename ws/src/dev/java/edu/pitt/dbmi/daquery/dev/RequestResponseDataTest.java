package edu.pitt.dbmi.daquery.dev;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDownload;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class RequestResponseDataTest
{
	public static void main(String [] args)
	{
		Session s = null;
		try
		{
			AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
			SQLDownload sd = new SQLDownload(true);
			sd.setCode("22222222ABCD blech");
			sd.setInquiryDescription("222222la la la");
			
			s = HibernateConfiguration.openSession();
			Transaction t = s.beginTransaction();
			s.save(sd);
			t.commit();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		finally
		{
			if(s != null) s.close();
		}
		
	}
}
