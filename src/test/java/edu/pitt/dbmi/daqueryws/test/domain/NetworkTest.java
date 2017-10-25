package edu.pitt.dbmi.daqueryws.test.domain;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.dao.HibernateConfiguration;

import edu.pitt.dbmi.daquery.domain.Network;

public class NetworkTest {
	
	public static void main(String[] args) {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			Network nw = new Network();
			nw.setName("PaTH");
			
			Query qry = session.getNamedQuery(Network.FIND_BY_ID);
			qry.setParameter("id", 1L);
			
			Network network = (Network)qry.uniqueResult();
			System.out.println(network.toString());
			System.out.println(network.toJson());
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}
}
