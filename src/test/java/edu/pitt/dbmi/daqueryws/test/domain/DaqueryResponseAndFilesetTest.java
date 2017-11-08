package edu.pitt.dbmi.daqueryws.test.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.dao.SiteDAO;
import edu.pitt.dbmi.daquery.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.domain.inquiry.Fileset;
import edu.pitt.dbmi.daquery.domain.inquiry.RequestDirection;
import edu.pitt.dbmi.daquery.domain.inquiry.ResponseStatus;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLQuery;


public class DaqueryResponseAndFilesetTest {

	private static String networkname = "DaqueryResponseAndFilesetTest_Network";
	private static String networkUUID = "";
	private static String inrequestname = "In Request Name DaqueryResponseAndFilesetTest";
	private static String inrequestUUID = "";
	private static String outrequestname = "Out Request Name DaqueryResponseAndFilesetTest";
	private static String connectionurl = "jdbc:oracle:thin:@//server-a.dept.university.edu:1521/OracleSID";
	private static String username = "datasourceusername";
	private static String password = "datasourcepassword";

	//site data elements
	private static String sitename = "DaqueryResponseAndFilesetTestSite";
	private static String siteurl = "http://DaqueryRequestTestURL.com";
	private static String adminemail = "TestSiteAdmin@email.com";
	private static String accesskey = "TestSiteAccessKey";
	private static String commenckey = "TestSiteCommEncKey";
	private static String commenctype = "TestSitecommEncType";
	private static String siteUUID = "";
	
	//DaqueryUser data elements
	private static String daqueryusername = "DaqueryResponseAndFilesetTest_User";
	private static String email = "daqueryuserresponsetester@dummyaccounts.com";
	private static String daquerypassword = "dummy";
	private static String realname = "Daquery Tester, Esq.";
	private static String userUUID = "";
	
	//SQLQuery data elements
	private static String inquiryname = "DaqueryResponseAndFilesetTestSQLQuery";
	private static String inquirydesc = "Description of test inquiry";
	private static String inquirySQLcode = "SELECT * FROM table X";
	private static String inquiryUUID = "";
	
	//DaqueryResponse data elements
	private static String responsename = "DaqueryResponseAndFilesetTest Name";
	private static long responseid = -1;
	private static String responsevalue = "test response Value";
	
	//Fileset data elements
	private static String filesetpath = "/home/noplace/like/home/";
	private static long filesetid = -1;
	
	
	@BeforeClass
	public static void setupBeforeClass() {
    	AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		//create a new network for testing
    	//NOTE: you must create the site in this method to ensure the site is 
    	//created before the tests are run
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network n = new Network(true);
			n.setName(networkname);			
			session.getTransaction().begin();
			session.persist(n);
			session.getTransaction().commit();
			
			networkUUID = n.getNetworkId();
			
			Site s = new Site(true);
			s.setName(sitename);
			s.setAdmin_email(adminemail);
			s.setNetwork(n);
			session.getTransaction().begin();
			session.persist(s);
			session.update(n);
			session.getTransaction().commit();
			
			siteUUID = s.getSiteId();
			
			DaqueryUser u = new DaqueryUser();
			u.setUsername(username);
			u.setEmail(email);
			u.setPassword(password);
			u.setRealName(realname);
			u.setStatus("ACTIVE");
			
			session.getTransaction().begin();
			session.persist(u);
			session.getTransaction().commit();
			
			userUUID = u.getId();
			
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
		
	}
	

    
    @Test
    public void testCreateResponseAndFileset() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network n = NetworkDAO.queryNetwork(networkUUID);
			Site s = SiteDAO.querySiteByID(siteUUID);
			DaqueryUser u = DaqueryUserDAO.queryUserByID(userUUID);

	    	DaqueryRequest dr = new DaqueryRequest(true);
			dr.setDirectionEnum(RequestDirection.OUT);
			dr.setRequester(u);
			dr.setRequestSite(s);
			dr.setNetwork(n);
			Date timestamp = new Date();
			dr.setSentTimestamp(timestamp);
			
			SQLQuery q = new SQLQuery(true);
			q.setAuthor(u);
			q.setCode(inquirySQLcode);
			q.setDataType("B positive");
			q.setNetwork(n);
			q.setSqlDialectEnum(SQLDialect.ANSI);
			Set<DaqueryRequest> drset = new HashSet<DaqueryRequest>();
			drset.add(dr);
			q.setRequests(drset);
			
			session.getTransaction().begin();
			session.update(s);
			session.persist(dr);
			session.persist(q);
			session.getTransaction().commit();
			inrequestUUID = dr.getRequestId();
			inquiryUUID = q.getInquiryId();

			
			DaqueryResponse resp = new DaqueryResponse();
			resp.setResponder(u);
			resp.setReplyTimestamp(DateTime.now().toDate());
			resp.setRequest(dr);
			resp.setSite(s);
			resp.setStatusEnum(ResponseStatus.COMPLETED);
			resp.setValue(responsevalue);
			
			Fileset fs = new Fileset();
			Set<String> fp = new HashSet<String>();
			fp.add(filesetpath);
			fs.setFilepaths(fp);

			session.getTransaction().begin();
			session.update(dr);
			session.persist(fs);
			session.persist(resp);
			session.getTransaction().commit();
			
			responseid = resp.getId();
			filesetid = fs.getId();
			
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}
    
    @AfterClass
    public static void tearDownAfterClass() {
    	//delete the dummy user account used in the RoleTests
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			session.getTransaction().begin();
			session.createQuery("delete from Fileset where id = :filesetid")
				.setParameter("filesetid", filesetid)
				.executeUpdate();
			session.createQuery("delete from DaqueryRequest where requestId = :requestid")
				.setParameter("requestid", inrequestUUID)
				.executeUpdate();
			session.createQuery("delete from DaqueryResponse where id = :responseid")
				.setParameter("responseid", responseid)
				.executeUpdate();
			session.createQuery("delete from SQLQuery where inquiryId = :inquiryid")
				.setParameter("inquiryid", inquiryUUID)
				.executeUpdate();
			session.createQuery("delete from DaqueryUser where id = :userUUID")
				.setParameter("userUUID", userUUID)
				.executeUpdate();
			session.createQuery("delete from Site where siteId = :siteUUID")
				.setParameter("siteUUID", siteUUID)
				.executeUpdate();
			session.createQuery("delete from Network where networkId = :networkUUID")
				.setParameter("networkUUID", networkUUID)
				.executeUpdate();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
    	
    }

    
}
