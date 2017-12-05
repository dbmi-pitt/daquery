package edu.pitt.dbmi.daquery.dev;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.dev.util.PrivateProps;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.EncryptionType;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.RequestDirection;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.dao.RoleDAO;

/**
 * Populate the database with some dev data in a Hibernatey kind of way..
 *
 */
public class PopulateDevData
{
	public static void main(String [] args) throws Exception
	{
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
//		AppProperties.setDevHomeDir("/home/devuser/dq-data");
/*		assembleRequest();
		Session s = HibernateConfiguration.openSession();
		Query q = s.createQuery("select r from DaqueryRequest r");
		List<DaqueryRequest> reqs = q.list();
		for(DaqueryRequest req : reqs)
			System.out.println(req.getId()); */
		
/*		assembleNetworkAndInquiry();
		Session s = HibernateConfiguration.openSession();
		Query q = s.createQuery("select i from Inquiry i");
		List<Inquiry> inqs = q.list();
		for(Inquiry inq : inqs)
		{
			System.out.println(inq.getId());
			Network net = inq.getNetwork();
			System.out.println(net.getName());
			System.out.println(net.getIncomingQuerySites().size());
		} */
		
/*		DaqueryUser tu = createTestUser();
		save(tu);
		
		NetAndSite ns = createNetAndSiteData();
		save(ns.net);
		
		AppProperties.setDBProperty(SiteDAO.LOCAL_SITE_ID_PROP_NAME, ns.localSite.getSiteId());
		
		System.out.println("Test user id: " + tu.getId());
		//assembleOutgoingRequest(); */
		
		DaqueryRequest r = assembleOutgoingRequest();
		System.out.println("Request Id = : " + r.getRequestId());
		System.out.println("Network Id = : " + r.getNetwork().getNetworkId());
		System.out.println("From Site Id = : " + r.getRequestSite().getSiteId());
		System.exit(0);
	}
	
	public static DaqueryRequest assembleOutgoingRequest() throws DaqueryException, Exception
	{
		NetAndSite nas = createNetAndSiteData();
		Network net = nas.net;
		String localSiteId = nas.localSite.getSiteId();
		AppProperties.setDBProperty(SiteDAO.LOCAL_SITE_ID_PROP_NAME, localSiteId);
		DaqueryUser user = createTestUser();
		save(net.getDataModel());
		save(net);
		save(user);
		Inquiry inq = createInquiryData(user);
		inq.setNetwork(net);
		inq.setAggregate(true);
		save(inq);
		save(net);
		DaqueryRequest req = createOutgoingRequest(inq, user, nas.localSite);
		req.setNetwork(net);
		save(req);
		return(req);
	}
	
	private static void assembleNetworkAndInquiry() throws Exception
	{
		Network net = createNetAndSiteData().net;
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
		
		DaqueryRequest req = new DaqueryRequest(true);
		req.setDirectionEnum(RequestDirection.OUT);
		req.setInquiry(inquiry);
		req.setRequester(requester);
		req.setRequestSite(requestSite);
		req.setSentTimestamp(new Date());
		return(req);
	}

	public static DaqueryRequest createFullOutgoingRequest() throws Exception
	{
		DaqueryUser author = PopulateDevData.createTestUser();
		Inquiry inquiry = PopulateDevData.createInquiryData(author);
		Site requestSite = PopulateDevData.createNetAndSiteData().net.getOutgoingQuerySites().iterator().next();
		return(PopulateDevData.createOutgoingRequest(inquiry, author, requestSite));
	}
	private static Inquiry createInquiryData(DaqueryUser author)
	{
		SQLQuery sqlQ = new SQLQuery(true);
		sqlQ.setVersion(1);
		sqlQ.setAuthor(author);
		sqlQ.setSqlDialectEnum(SQLDialect.ORACLE);
		sqlQ.setCode("select count(patid) from demographic;");
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
	private static DaqueryUser createTestUser() throws Exception
	{
		DaqueryUser user = new DaqueryUser();
		user.setEmail("tester@somewhere.com");
		user.setRealName("Test User");
		user.setStatusEnum(UserStatus.ACTIVE);
		user.setUsername("tester");
		List<Role> roles = new ArrayList<Role>();
		Role role = RoleDAO.queryRoleByName("aggregate_querier");
		roles.add(role);
		user.setRoles(roles);
		List<DaqueryUser> users = new ArrayList<DaqueryUser>();
		users.add(user);
		role.setUsers(users);
		return(user);
	}
	private static NetAndSite createNetAndSiteData()
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
		
//		Site bsiteIn = new Site("jajasioujaiojaijf","shirey@pitt.edu","no key for now..",EncryptionType.NONE,"bill-dev","20b23b5c-61ad-44eb-8eef-886adcced18e",SiteStatus.CONNECTED,"http://localhost:8080/");	
//		Site dsiteIn = new Site("wuiowujwoiuwrwer","del20@pitt.edu","no key for now..",EncryptionType.NONE,"desheng-dev","bcfdd450-3dd8-4ced-9599-c65de7c9f115",SiteStatus.CONNECTED,"http://del20-dt.univ.pitt.edu:8080/");				
		Set<Site> sitesIn = new HashSet<Site>();
		sitesIn.add(bsiteOut);
		sitesIn.add(dsiteOut);
		net.setIncomingQuerySites(sitesIn);
		
		DataModel dm = new DataModel(true);
		dm.setName("CDM");
		dm.setDescription("The PCORI Common Data Model");
		
		SQLDataSource sqlDS = new SQLDataSource("dev cdm data set",dbURL,dbPassword,dbUsername);
		sqlDS.setDriverClass("oracle.jdbc.driver.OracleDriver");
		Set<DataSource> dataSources = new HashSet<DataSource>();
		dataSources.add(sqlDS);
		dm.setDataSources(dataSources);
		sqlDS.setDataModel(dm);
		net.setDataModel(dm);
		
		NetAndSite ns = new NetAndSite();
		ns.net = net;
		ns.localSite = bsiteOut;
		
		return(ns);
		
	}
	
	private static class NetAndSite
	{
		Network net;
		Site localSite;
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
