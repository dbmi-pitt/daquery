package edu.pitt.dbmi.daqueryws.test.domain;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.domain.EncryptionType;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Site;

public class NetworkTest {
	
	private static String networkname = "SiteTest_Network";
	private static String datamodel = "TestModel";
	
	@BeforeClass
	public static void setupBeforeClass() {
    	AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");		
	}
	
    @Test
    public void testCreate() {
		//create a new network for testing
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network n = new Network();
			n.setName(networkname);	
			n.setData_model(datamodel);
			session.getTransaction().begin();
			session.persist(n);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    
    @Test
    public void testUpdate() {
		//create a new network for testing
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network n = NetworkDAO.queryNetworkByName(networkname);
			n.setData_model(datamodel + "2");
			session.getTransaction().begin();
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
			session.createQuery("delete from Network where name = :networkname")
			.setParameter("networkname", networkname)
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
