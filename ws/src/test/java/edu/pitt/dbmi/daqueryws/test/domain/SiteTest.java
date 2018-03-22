package edu.pitt.dbmi.daqueryws.test.domain;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.dev.util.CreateCDMModelInfo;
import edu.pitt.dbmi.daquery.common.dev.util.PrivateProps;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.EncryptionType;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class SiteTest {

	private static String networkname = "SiteTest_Network";
	private static String sitename = "TestSite";

	private static String sitenameWithSpaces = "Site, Test Site";
	private static String sitenameWithNumbers = "Test-Site-OU812";
	private static String sitenameLettersOnly = "shrine-dev01";
	private static String siteurl = "http://TestURL.com";
	private static String adminemail = "TestSiteAdmin@email.com";
	private static String accesskey = "TestSiteAccessKey";
	private static String commenckey = "TestSiteCommEncKey";
	private static String networkUUID = "";
	
	private static String site1UUID = "";
	private static String site2UUID = "";
	private static String site3UUID = "";
	private static String site4UUID = "";
	
	@BeforeClass
	public static void setupBeforeClass() {
		
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
 		//create a new network for testing
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network n = new Network(true);
			n.setName(networkname);			
			session.getTransaction().begin();
			session.persist(n);
			session.getTransaction().commit();
			
			Site s1 = new Site(true);
			s1.setName(sitename);
			s1.setUrl(siteurl);
			s1.setAdminEmail(adminemail);
			s1.setStatusValue(SiteStatus.PENDING);
			s1.setAccessKey(accesskey);
			s1.setComEncKey(commenckey);
			s1.setCommTypeValue(EncryptionType.NONE);

			Site s2 = new Site(true);
			s2.setName(sitenameWithSpaces);
			s2.setUrl(siteurl);
			s2.setAdminEmail(adminemail);
			s2.setStatusValue(SiteStatus.PENDING);
			s2.setAccessKey(accesskey);
			s2.setComEncKey(commenckey);
			s2.setCommTypeValue(EncryptionType.NONE);

			Site s3 = new Site(true);
			s3.setName(sitenameWithNumbers);
			s3.setUrl(siteurl);
			s3.setAdminEmail(adminemail);
			s3.setStatusValue(SiteStatus.PENDING);
			s3.setAccessKey(accesskey);
			s3.setComEncKey(commenckey);
			s3.setCommTypeValue(EncryptionType.NONE);

			Site s4 = new Site(true);
			s4.setName(sitenameLettersOnly);
			s4.setUrl(siteurl);
			s4.setAdminEmail(adminemail);
			s4.setStatusValue(SiteStatus.PENDING);
			s4.setAccessKey(accesskey);
			s4.setComEncKey(commenckey);
			s4.setCommTypeValue(EncryptionType.NONE);
			
			Set<Site> newSites = new HashSet<Site>();
			newSites.add(s1);
			newSites.add(s2);
			newSites.add(s3);
			newSites.add(s4);
			n.setIncomingQuerySites(newSites);
			
			session.getTransaction().begin();
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
			session.persist(s4);
			session.update(n);
			session.getTransaction().commit();
			
			networkUUID = n.getNetworkId();
			site1UUID = s1.getSiteId();
			site2UUID = s2.getSiteId();
			site3UUID = s3.getSiteId();
			site4UUID = s4.getSiteId();
			
			createShrineTestNetworks();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
		
	}

	
	//create a set of Shrine SSL connections
	public static void createShrineTestNetworks()
	{
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();

			Network allNet = new Network("69fb4043-4de4-4763-b205-80e99c564730");
		
			allNet.setName("Test-SSL-Network");			
			session.getTransaction().begin();
			session.persist(allNet);
			session.getTransaction().commit();
	    	
			Site bSite = new Site("81590cc9-9bcd-470e-bc10-065080996842");
			bSite.setName("testdev02");
			bSite.setAccessKey("abc123");
			bSite.setTempKey(true);
			bSite.setUrl("http://130.49.213.163:6443/");
			bSite.setAdminEmail("shirey@pitt.edu");
		
			Site cSite = new Site("74059b65-056d-43a8-a705-b606c452ff71");
			cSite.setName("testdev03");
			cSite.setAccessKey("123abc");
			cSite.setTempKey(true);
			cSite.setUrl("http://130.49.213.164:6443/");
			cSite.setAdminEmail("chuck.borromeo@pitt.edu");		
		
			Site dSite = new Site("05b6db4d-a543-4ff6-8b9c-664b6153a104");
			dSite.setName("shrine-dev03");
			dSite.setAccessKey("xyz789");
			dSite.setTempKey(true);
			dSite.setUrl("http://130.49.213.165:6443/");
			dSite.setAdminEmail("del20@pitt.edu");

		
			session.getTransaction().begin();
			session.persist(bSite);
			session.persist(cSite);
			session.persist(dSite);
			session.update(allNet);
			session.getTransaction().commit();
		} catch (Exception e) {
			 e.printStackTrace();
		}


	}
	
    @Test
    public void testSiteQueryByNameLettersOnly() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Site s = SiteDAO.querySiteByName(sitenameLettersOnly);
			assertTrue(s != null);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    @Test
    public void testSiteQueryByNameWithSpaces() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Site s = SiteDAO.querySiteByName(sitenameWithSpaces);
			assertTrue(s != null);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    @Test
    public void testSiteQueryByNameWithNumbers() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Site s = SiteDAO.querySiteByName(sitenameWithNumbers);
			assertTrue(s != null);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    @Test
    public void testSSLSites() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Site s = SiteDAO.querySiteByName("testdev03");
			assertTrue(s != null);
	    	Site s1 = SiteDAO.querySiteByName("testdev02");
			assertTrue(s1 != null);
	    	Site s2 = SiteDAO.querySiteByName("shrine-dev03");
			assertTrue(s2 != null);
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
	    	Site s = SiteDAO.querySiteByID(site1UUID);
	    	s.setStatusValue(SiteStatus.CONNECTED);
			session.getTransaction().begin();
			session.update(s);
			session.getTransaction().commit();
	    	Site s1 = SiteDAO.querySiteByID(site1UUID);
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
	    	Site s = SiteDAO.querySiteByID(site1UUID);
	    	s.setStatusValue(SiteStatus.PENDING);
			session.getTransaction().begin();
			session.update(s);
			session.getTransaction().commit();
	    	Site s1 = SiteDAO.querySiteByID(site1UUID);
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
	    	Site s = SiteDAO.querySiteByID(site1UUID);
	    	s.setStatusValue(SiteStatus.DENIED);
			session.getTransaction().begin();
			session.update(s);
			session.getTransaction().commit();
	    	Site s1 = SiteDAO.querySiteByID(site1UUID);
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
	    	Site s = SiteDAO.querySiteByID(site1UUID);
	    	s.setStatusValue(SiteStatus.NOT_CONNECTED);
			session.getTransaction().begin();
			session.update(s);
			session.getTransaction().commit();
	    	Site s1 = SiteDAO.querySiteByID(site1UUID);
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
				.setParameter("siteUUID", site1UUID)
				.executeUpdate();
			session.createQuery("delete from Site where siteId = :siteUUID")
				.setParameter("siteUUID", site2UUID)
				.executeUpdate();
			session.createQuery("delete from Site where siteId = :siteUUID")
				.setParameter("siteUUID", site3UUID)
				.executeUpdate();
			session.createQuery("delete from Site where siteId = :siteUUID")
				.setParameter("siteUUID", site4UUID)
				.executeUpdate();
			session.createQuery("delete from Network where networkId = :networkUUID")
				.setParameter("networkUUID", networkUUID)
				.executeUpdate();
			
			session.createQuery("delete from Site where name = :siteUUID")
			.setParameter("siteUUID", "testdev03")
			.executeUpdate();
		session.createQuery("delete from Site where name = :siteUUID")
			.setParameter("siteUUID", "testdev02")
			.executeUpdate();
		session.createQuery("delete from Site where name = :siteUUID")
			.setParameter("siteUUID", "shrine-dev03")
			.executeUpdate();
		session.createQuery("delete from Network where name = :networkUUID")
			.setParameter("networkUUID", "Test-SSL-Network")
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
