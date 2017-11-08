package edu.pitt.dbmi.daqueryws.test.domain;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.domain.DataSource;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.SASDataSource;


public class SASDataSourceTest {

	private static String networkname = "SASDataSourceTest_Network";
	private static String datasourcename = "TestSASDataSource";
	
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
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
		
	}
	
    @Test
    public void testCreateAndAddToNetwork() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Network n = NetworkDAO.queryNetworkByName(networkname);
			SASDataSource ds = new SASDataSource();
			ds.setName(datasourcename);
			ds.setDatasetLocation("/sasdatasetlocation");
			Set<Network> networklist = new HashSet<Network>();
			networklist.add(n);
			ds.setNetworks(networklist);
			
			Set<DataSource> newSources = new HashSet<DataSource>();
			newSources.add(ds);
			n.setDataSources(newSources);
			
			session.getTransaction().begin();
			session.persist(ds);
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
			session.createQuery("delete from SQLDataSource where name = :sourcename")
				.setParameter("sourcename", datasourcename)
				.executeUpdate();
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
