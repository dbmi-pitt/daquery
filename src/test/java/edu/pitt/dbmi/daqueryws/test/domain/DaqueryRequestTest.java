package edu.pitt.dbmi.daqueryws.test.domain;

import java.util.Date;
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
import edu.pitt.dbmi.daquery.domain.DataSource;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.domain.inquiry.RequestDirection;


public class DaqueryRequestTest {

	private static String networkname = "DaqueryRequestTest_Network";
	private static String inrequestname = "In Request Name";
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
	
	//DaqueryUser data elements
	private static String daqueryusername = "DaqueryRequestTest_User";
	private static String email = "daqueryusertester@dummyaccounts.com";
	private static String daquerypassword = "dummy";
	private static String realname = "Daquery Tester, Esq.";
	
	@BeforeClass
	public static void setupBeforeClass() {
    	AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		//create a new network for testing
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network n = new Network();
			n.setName(networkname);			
			session.getTransaction().begin();
			session.persist(n);
			session.getTransaction().commit();
			
			Site s = new Site();
			s.setName(sitename);
			s.setAdmin_email(adminemail);
			s.setNetwork(n);
			session.getTransaction().begin();
			session.persist(s);
			session.update(n);
			session.getTransaction().commit();
			
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
	    	Network n = NetworkDAO.queryNetworkByName(networkname);
	    	Site s = SiteDAO.querySiteByName(sitename);
	    	DaqueryUser u = DaqueryUserDAO.queryUserByUsername(daqueryusername);
/*	    	DaqueryRequest dr = new DaqueryRequest();
			dr.setRequestId(inrequestname);
			dr.setDirectionEnum(RequestDirection.IN);
			dr.setRequester(u);
			dr.setRequestSite(s);
			Date timestamp = new Date();
			dr.setSentTimestamp(timestamp);
			
			Set<DaqueryRequest> newRequests = new HashSet<DaqueryRequest>();
			newRequests.add(dr);
			n.setIncomingRequests(newRequests); */
			
			session.getTransaction().begin();
//			session.persist(dr);
			session.update(n);
			session.getTransaction().commit();
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
			session.createQuery("delete from Site where name = :sitename")
				.setParameter("sitename", sitename)
				.executeUpdate();
			session.createQuery("delete from Network where name = :networkname")
				.setParameter("networkname", networkname)
				.executeUpdate();
			session.createQuery("delete from DaqueryUser where username = :username")
				.setParameter("username", username)
				.executeUpdate();
			session.createQuery("delete from DaqueryRequest where id = :requestid")
				.setParameter("requestid", inrequestname)
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
