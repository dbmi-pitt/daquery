package edu.pitt.dbmi.daquery.dev;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.EncryptionType;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.domain.*;
import edu.pitt.dbmi.daquery.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.domain.inquiry.RequestDirection;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLQuery;

/**
 * Populate the database with some dev data in a Hibernatey kind of way..
 *
 */
public class PopulateDevData
{
	public static void main(String [] args) throws Exception
	{
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
/*		assembleRequest();
		Session s = HibernateConfiguration.openSession();
		Query q = s.createQuery("select r from DaqueryRequest r");
		List<DaqueryRequest> reqs = q.list();
		for(DaqueryRequest req : reqs)
			System.out.println(req.getId()); */
		
		assembleNetworkAndInquiry();
		Session s = HibernateConfiguration.openSession();
		Query q = s.createQuery("select i from Inquiry i");
		List<Inquiry> inqs = q.list();
		for(Inquiry inq : inqs)
		{
			System.out.println(inq.getId());
			Network net = inq.getNetwork();
			System.out.println(net.getName());
			System.out.println(net.getIncomingQuerySites().size());
		}
		
		System.exit(0);
	}
	
	private static void assembleRequest()
	{
		Network net = createNetAndSiteData();
		DaqueryUser user = createTestUser();
		save(net);
		save(user);
		Inquiry inq = createInquiryData(user);
		save(inq);
		save(net);
		DaqueryRequest req = createOutgoingRequest(inq, user, net.getOutgoingQuerySites().iterator().next());
		req.setNetwork(net);
		save(req);
	}
	
	private static void assembleNetworkAndInquiry()
	{
		Network net = createNetAndSiteData();
		DaqueryUser user = createTestUser();
		save(net);
		save(user);
		Inquiry inq = createInquiryData(user);
		inq.setAuthor(user);
		inq.setNetwork(net);
		save(inq);
		
	}
	
	private static DaqueryRequest createOutgoingRequest(Inquiry inquiry, DaqueryUser requester, Site requestSite)
	{
		
		DaqueryRequest req = new DaqueryRequest();
		req.setDirectionEnum(RequestDirection.OUT);
		req.setInquiry(inquiry);
		req.setRequester(requester);
		req.setRequestSite(requestSite);
		req.setSentTimestamp(new Date());
		return(req);
	}

	public static DaqueryRequest createFullOutgoingRequest()
	{
		DaqueryUser author = PopulateDevData.createTestUser();
		Inquiry inquiry = PopulateDevData.createInquiryData(author);
		Site requestSite = PopulateDevData.createNetAndSiteData().getOutgoingQuerySites().iterator().next();
		return(PopulateDevData.createOutgoingRequest(inquiry, author, requestSite));
	}
	private static Inquiry createInquiryData(DaqueryUser author)
	{
		SQLQuery sqlQ = new SQLQuery();
		sqlQ.setVersion(1);
		sqlQ.setAuthor(author);
		sqlQ.setSqlDialectEnum(SQLDialect.ORACLE);
		sqlQ.setCode("some test sql goes here");
		return(sqlQ);
		
		
/*		

		try
		{
			session = HibernateConfiguration.openSession();
			t = session.beginTransaction();
			session.save(user);
			String uid = user.getId();
			t.commit();
			session.close();

			session = HibernateConfiguration.openSession();
			t = session.beginTransaction();
			DaqueryUser u2 = (DaqueryUser) session.get(DaqueryUser.class, uid);
			sqlQ.setAuthor(u2);
			session.save(sqlQ);
			t.commit();
			return(0);
		}
		catch(Throwable tr)
		{
			if(t != null) t.rollback();
			tr.printStackTrace();
			return(1);
		}
		finally
		{
			if(session != null) session.close();
		} */
	}
	private static DaqueryUser createTestUser()
	{
		DaqueryUser user = new DaqueryUser();
		user.setEmail("tester@somewhere.com");
		user.setRealName("Test User");
		user.setStatusEnum(UserStatus.ACTIVE);
		user.setUsername("tester");
		return(user);
	}
	private static Network createNetAndSiteData()
	{
		String dbURL = PrivateProps.getProps().getProperty("cdm.url");
		String dbUsername = PrivateProps.getProps().getProperty("cdm.username");
		String dbPassword = PrivateProps.getProps().getProperty("cdm.password");
		
		if(StringHelper.anyAreEmpty(new String[]{dbURL, dbUsername, dbPassword}))
		{
			System.err.println("database url, username and password must be specified in private-data.props");
			System.exit(1);
		}
		
		Network net = new Network();
		net.setName("dbmi-dev");
		net.setNetworkId("abcd-efgh-ijkm-nopq");

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
		
/*		SQLDataSource sqlDS = new SQLDataSource("dev cdm data set",dbURL,dbPassword,dbUsername);
		Set<DataSource> dataSources = new HashSet<DataSource>();
		dataSources.add(sqlDS);
		net.setDataSources(dataSources); */
		
		return(net);
		
	}
	
	private static void save(Object obj)
	{
		Session session = null;
		Transaction t = null;
		int exitCode = 0;
		try
		{
			session = HibernateConfiguration.openSession();
			t = session.beginTransaction();
			session.saveOrUpdate(obj);
			t.commit();
		}
		catch(Throwable tr)
		{
			if(t != null) t.rollback();
			tr.printStackTrace();
		}
		finally
		{
			if(session != null) session.close();
		}
	}
}
