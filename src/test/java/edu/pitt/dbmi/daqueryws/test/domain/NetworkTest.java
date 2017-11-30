package edu.pitt.dbmi.daqueryws.test.domain;

import org.hibernate.Session;

import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;



public class NetworkTest {
	
	private static String networkname = "SiteTest_Network";
	private static String datamodel = "TestModel";
	
	
    @Test
    public void testCreate() {
		//create a new network for testing
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network n = new Network();
			n.setName(networkname);	
			session.getTransaction().begin();
			session.persist(n);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			fail("Unexpected exception");
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
			session.getTransaction().begin();
			session.update(n);
			session.getTransaction().commit();
		} catch (Throwable e) {
			e.printStackTrace(System.out);
			fail("Unexpected exception");
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
		} catch (Throwable e) {
			e.printStackTrace(System.out);
			fail("Unexpected exception");
		} finally {
			if (session != null) 
				session.close();
		}
    	
    }

    
}
