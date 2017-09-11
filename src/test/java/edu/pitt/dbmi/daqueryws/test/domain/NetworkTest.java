package edu.pitt.dbmi.daqueryws.test.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.pitt.dbmi.daquery.domain.Network;

public class NetworkTest {
	
	public static void main(String[] args) {
		Network nw = new Network();
		nw.setName("PaTH");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby");
		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(nw);
//		em.getTransaction().commit();
//		em.close();
		Network network = em.find(Network.class, 1L);
		System.out.println(network.toString());
		System.out.println(network.toJson());
		em.close();
	}
}
