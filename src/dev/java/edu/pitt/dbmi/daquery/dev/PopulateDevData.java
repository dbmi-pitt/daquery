package edu.pitt.dbmi.daquery.dev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.EncryptionType;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;
import edu.pitt.dbmi.daquery.domain.*;

/**
 * Populate the database with some dev data in a Hibernatey kind of way..
 *
 */
public class PopulateDevData
{
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		String dbURL = PrivateProps.getProps().getProperty("cdm.url");
		String dbUsername = PrivateProps.getProps().getProperty("cdm.username");
		String dbPassword = PrivateProps.getProps().getProperty("cdm.password");
		
		if(StringHelper.anyAreEmpty(new String[]{dbURL, dbUsername, dbPassword}))
		{
			System.err.println("database url, username and password must be specified in private-data.props");
			System.exit(1);
		}
		
		Network net = new Network();
		net.setData_model("cdm");
		net.setName("dbmi-dev");
		net.setNetwork_Id("abcd-efgh-ijkm-nopq");

		Site bsiteOut = new Site("jajasioujaiojaijf","shirey@pitt.edu","no key for now..",EncryptionType.NONE,"bill-dev","20b23b5c-61ad-44eb-8eef-886adcced18e",SiteStatus.CONNECTED,"http://localhost:8080/");	
		Site dsiteOut = new Site("jaoijafojafasdf","del20@pitt.edu","no key for now..",EncryptionType.NONE,"desheng-dev","bcfdd450-3dd8-4ced-9599-c65de7c9f115",SiteStatus.CONNECTED,"http://del20-dt.univ.pitt.edu:8080/");		
		Site csiteOut = new Site("wueroiqwerwer","chb69@pitt.edu","no key for now..",EncryptionType.NONE,"chuck-dev","0f2378ec-d9ce-489a-b338-c8f82e567f40",SiteStatus.CONNECTED,"http://borromeo-lp.dbmi.pitt.edu:8080/");
		Set<Site> sitesOut = new HashSet<Site>();
		sitesOut.add(bsiteOut);
		sitesOut.add(dsiteOut);
		sitesOut.add(csiteOut);
		net.setOutgoingQuerySites(sitesOut);
		
		Site bsiteIn = new Site("jajasioujaiojaijf","shirey@pitt.edu","no key for now..",EncryptionType.NONE,"bill-dev","20b23b5c-61ad-44eb-8eef-886adcced18e",SiteStatus.CONNECTED,"http://localhost:8080/");	
		Site dsiteIn = new Site("wuiowujwoiuwrwer","del20@pitt.edu","no key for now..",EncryptionType.NONE,"desheng-dev","bcfdd450-3dd8-4ced-9599-c65de7c9f115",SiteStatus.CONNECTED,"http://del20-dt.univ.pitt.edu:8080/");				
		Set<Site> sitesIn = new HashSet<Site>();
		sitesIn.add(bsiteIn);
		sitesIn.add(dsiteIn);
		net.setIncomingQuerySites(sitesIn);
		
		SQLDataSource sqlDS = new SQLDataSource("dev cdm data set",dbURL,dbPassword,dbUsername);
		Set<DataSource> dataSources = new HashSet<DataSource>();
		dataSources.add(sqlDS);
		net.setDataSources(dataSources);
		
		Session session = null;
		Transaction t = null;
		int exitCode = 0;
		try
		{
			session = HibernateConfiguration.openSession();
			t = session.beginTransaction();
			session.save(net);
			t.commit();
		}
		catch(Throwable tr)
		{
			if(t != null) t.rollback();
			tr.printStackTrace();
			exitCode = 1;
		}
		finally
		{
			if(session != null) session.close();
			System.exit(exitCode);
		}
		
	}
	

}
