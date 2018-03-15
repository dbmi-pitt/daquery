package edu.pitt.dbmi.daquery.common.dev.util;

import java.io.File;
import java.net.SocketException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;

public class TestFileTransfer
{
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("/home/devuser/daquery-data");
		Session sess = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			Site localSite = SiteDAO.getLocalSite();
			//File localFileAndPath = new File("/Users/bill/big");
			File localFileAndPath = new File("/home/devuser/big");
			WSConnectionUtil.sendFileToSite(localFileAndPath, "big.out", localSite, "testdir");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			if(t instanceof SocketException ||
				(t.getCause() != null && t.getCause() instanceof SocketException) ||
				(t.getCause() != null && t.getCause().getCause() != null && t.getCause().getCause() instanceof SocketException))
				   System.out.println("Connection to site lost during file transfer.");
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
}
