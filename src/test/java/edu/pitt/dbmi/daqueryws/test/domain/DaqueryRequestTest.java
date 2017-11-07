package edu.pitt.dbmi.daqueryws.test.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
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
import edu.pitt.dbmi.daquery.domain.inquiry.RequestDirection;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLQuery;


public class DaqueryRequestTest {

	private static String networkname = "DaqueryRequestTest_Network";
	private static String networkUUID = "";
	private static String inrequestname = "In Request Name";
	private static String inrequestUUID = "";
	private static String outrequestname = "Out Request Name";
	private static String connectionurl = "jdbc:oracle:thin:@//server-a.dept.university.edu:1521/OracleSID";
	private static String username = "datasourceusername";
	private static String password = "datasourcepassword";

	//site data elements
	private static String sitename = "DaqueryRequestTestSite";
	private static String siteurl = "http://DaqueryRequestTestURL.com";
	private static String adminemail = "TestSiteAdmin@email.com";
	private static String accesskey = "TestSiteAccessKey";
	private static String commenckey = "TestSiteCommEncKey";
	private static String commenctype = "TestSitecommEncType";
	private static String siteUUID = "";
	
	//DaqueryUser data elements
	private static String daqueryusername = "DaqueryRequestTest_User";
	private static String email = "daqueryusertester@dummyaccounts.com";
	private static String daquerypassword = "dummy";
	private static String realname = "Daquery Tester, Esq.";
	
	//SQLQuery data elements
	private static String inquiryname = "DaqueryRequestTestSQLQuery";
	private static String inquirydesc = "Description of test inquiry";
	private static String inquirySQLcode = "SELECT * FROM table X";
	private static String inquiryUUID = "";
	
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
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
		
	}
	
    @Test
    public void testCreateIncomingAndAddToNetwork() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Network n = NetworkDAO.queryNetwork(networkUUID);
	    	Site s = SiteDAO.querySiteByID(siteUUID);
	    	DaqueryUser u = DaqueryUserDAO.queryUserByUsername(daqueryusername);
	    	DaqueryRequest dr = new DaqueryRequest(true);
			dr.setRequestId(inrequestname);
			dr.setDirectionEnum(RequestDirection.IN);
			dr.setRequester(u);
			dr.setRequestSite(s);
			dr.setNetwork(n);
			Date timestamp = new Date();
			dr.setSentTimestamp(timestamp);
			
			session.getTransaction().begin();
			session.update(s);
			session.persist(dr);
			session.getTransaction().commit();
			inrequestUUID = dr.getRequestId();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    
    @Test
    public void testCreateOutgoingAndAddToNetwork() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Network n = NetworkDAO.queryNetwork(networkUUID);
	    	Site s = SiteDAO.querySiteByID(siteUUID);
	    	DaqueryUser u = DaqueryUserDAO.queryUserByUsername(daqueryusername);
	    	DaqueryRequest dr = new DaqueryRequest(true);
			dr.setRequestId(inrequestname);
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
			session.createQuery("delete from Site where siteId = :siteUUID")
				.setParameter("siteUUID", siteUUID)
				.executeUpdate();
			session.createQuery("delete from Network where networkId = :networkUUID")
				.setParameter("networkUUID", networkUUID)
				.executeUpdate();
			session.createQuery("delete from DaqueryUser where username = :username")
				.setParameter("username", username)
				.executeUpdate();
			session.createQuery("delete from DaqueryRequest where requestId = :requestid")
				.setParameter("requestid", inrequestUUID)
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
