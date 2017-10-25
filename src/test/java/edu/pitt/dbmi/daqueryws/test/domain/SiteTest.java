package edu.pitt.dbmi.daqueryws.test.domain;

import edu.pitt.dbmi.daquery.domain.Site;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;


public class SiteTest {

	public static void main(String[] args) {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Site s = new Site();
			s.setName("PITT");
			
			Long network_id = 401L;
			//Network nw = em.find(Network.class, network_id);
			//s.setNetwork(nw);
			
			session.getTransaction().begin();
			session.persist(s);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

}
