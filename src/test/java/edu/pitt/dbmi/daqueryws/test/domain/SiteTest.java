package edu.pitt.dbmi.daqueryws.test.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Site;

public class SiteTest {

	public static void main(String[] args) {
		Site s = new Site();
		s.setName("PITT");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby");
		EntityManager em = emf.createEntityManager();
		Long network_id = 401L;
		Network nw = em.find(Network.class, network_id);
		s.setNetwork(nw);
		
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}

}
