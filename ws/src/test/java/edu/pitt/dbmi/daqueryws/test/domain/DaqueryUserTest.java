package edu.pitt.dbmi.daqueryws.test.domain;

import static org.junit.Assert.assertTrue;

import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;

public class DaqueryUserTest {
	
	private static String username = "DaqueryUserTest_User";
	private static String email = "daqueryusertester@dummyaccounts.com";
	private static String password = "dummy";
	private static String realname = "Daquery Tester, Esq.";
	
	@BeforeClass
	public static void setupBeforeClass() {
    	//create a new user account for the other tests to use
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			DaqueryUser u = new DaqueryUser(true);
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
    public void testUpdateChangePassword() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	DaqueryUser u = DaqueryUserDAO.queryUserByUsername(username);
	    	//1-2-3-4-5? That's the stupidest combination I've ever heard of in my life! 
	    	//That's the kinda thing an idiot would have on his luggage!
	    	u.setPassword("12345");
			session.getTransaction().begin();
			session.update(u);
			session.getTransaction().commit();
			DaqueryUser u2 = DaqueryUserDAO.authenticate(email, "12345");
			assertTrue(u2 != null);
			//reset password so other tests work
	    	u.setPassword(password);
			session.getTransaction().begin();
			session.update(u);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    @Test
    public void testUserActive() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	DaqueryUser u = DaqueryUserDAO.queryUserByUsername(username);
	    	u.setStatus("ACTIVE");
			session.getTransaction().begin();
			session.update(u);
			session.getTransaction().commit();			
			assertTrue(DaqueryUserDAO.isUserValid(u.getId()));
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}
    
    @Test
    public void testUserPasswordExpired() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	DaqueryUser u = DaqueryUserDAO.queryUserByUsername(username);
	    	u.setStatus("PWD_EXPIRED");
			session.getTransaction().begin();
			session.update(u);
			session.getTransaction().commit();			
			assertTrue(DaqueryUserDAO.expiredPassword(u.getId()));
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
	}

    @Test
    public void testUserDisabled() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	DaqueryUser u = DaqueryUserDAO.queryUserByUsername(username);
	    	u.setStatus("DISABLED");
			session.getTransaction().begin();
			session.update(u);
			session.getTransaction().commit();			
			assertTrue(DaqueryUserDAO.accountDisabled(u.getId()));
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
			session.createQuery("delete from DaqueryUser where username = :username")
			.setParameter("username", username)
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
