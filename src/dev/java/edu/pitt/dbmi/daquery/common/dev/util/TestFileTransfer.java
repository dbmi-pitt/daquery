package edu.pitt.dbmi.daquery.common.dev.util;

import java.io.File;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.Site;
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
			//File localFileAndPath = new File("/home/devuser/jars.tar.gz");
			File localFileAndPath = new File("/home/devuser/big");
			WSConnectionUtil.sendFileToSite(localFileAndPath, "tester.out.big", localSite);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
}
