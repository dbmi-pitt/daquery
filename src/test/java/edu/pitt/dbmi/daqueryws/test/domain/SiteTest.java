package edu.pitt.dbmi.daqueryws.test.domain;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.domain.EncryptionType;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.dao.SiteDAO;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Site;


public class SiteTest {

	private static String networkname = "SiteTest_Network";
	private static String sitename = "TestSite";
	private static String siteurl = "http://TestURL.com";
	private static String adminemail = "TestSiteAdmin@email.com";
	private static String accesskey = "TestSiteAccessKey";
	private static String commenckey = "TestSiteCommEncKey";
	private static String siteUUID = "";
	private static String networkUUID = "";
	
	@BeforeClass
	public static void setupBeforeClass() {
 		//create a new network for testing
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network n = new Network(true);
			n.setName(networkname);			
			session.getTransaction().begin();
			session.persist(n);
			session.getTransaction().commit();
			Site s = new Site(true);
			s.setName(sitename);
			s.setUrl(siteurl);
			s.setAdmin_email(adminemail);
			s.setStatusValue(SiteStatus.PENDING);
			s.setAccessKey(accesskey);
			s.setComEncKey(commenckey);
			s.setCommTypeValue(EncryptionType.NONE);
			
			Set<Site> newSites = new HashSet<Site>();
			newSites.add(s);
			n.setIncomingQuerySites(newSites);
			
			session.getTransaction().begin();
			session.persist(s);
			session.update(n);
			session.getTransaction().commit();
			
			networkUUID = n.getNetworkId();
			siteUUID = s.getSiteId();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
		
	}
	
    
    @Test
    public void testSiteConnected() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Site s = SiteDAO.querySiteByID(siteUUID);
	    	s.setStatusValue(SiteStatus.CONNECTED);
			session.getTransaction().begin();
			session.update(s);
			session.getTransaction().commit();
	    	Site s1 = SiteDAO.querySiteByID(siteUUID);
			assertTrue(s1.getStatusValue() == SiteStatus.CONNECTED);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    @Test
    public void testSitePending() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Site s = SiteDAO.querySiteByID(siteUUID);
	    	s.setStatusValue(SiteStatus.PENDING);
			session.getTransaction().begin();
			session.update(s);
			session.getTransaction().commit();
	    	Site s1 = SiteDAO.querySiteByID(siteUUID);
			assertTrue(s1.getStatusValue() == SiteStatus.PENDING);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}
 
    
    @Test
    public void testSiteDenied() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Site s = SiteDAO.querySiteByID(siteUUID);
	    	s.setStatusValue(SiteStatus.DENIED);
			session.getTransaction().begin();
			session.update(s);
			session.getTransaction().commit();
	    	Site s1 = SiteDAO.querySiteByID(siteUUID);
			assertTrue(s1.getStatusValue() == SiteStatus.DENIED);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    @Test
    public void testSiteNotConnected() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Site s = SiteDAO.querySiteByID(siteUUID);
	    	s.setStatusValue(SiteStatus.NOT_CONNECTED);
			session.getTransaction().begin();
			session.update(s);
			session.getTransaction().commit();
	    	Site s1 = SiteDAO.querySiteByID(siteUUID);
			assertTrue(s1.getStatusValue() == SiteStatus.NOT_CONNECTED);
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
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
    	
    }

    
}
