package edu.pitt.dbmi.daqueryws.test.domain;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.dao.RoleDAO;
import io.restassured.RestAssured;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class RoleTest {

	private static String username = "RoleTest_User";
	private static String email = "roletester@dummyaccounts.com";
	private static String password = "dummy";
	private static String realname = "Role Tester, Esq.";
	
    @BeforeClass
    public static void setupBeforeClass() {
     	//create a dummy user account for use in the RoleTests
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			DaqueryUser u = new DaqueryUser();
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

    

	@Test
	public void testAssignRole()
	{
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
			DaqueryUser u = DaqueryUserDAO.authenticate(email, password);
			Role r = RoleDAO.queryRoleByName("admin");
			List<Role> roles = new ArrayList<Role>();
			roles.add(r);
			u.setRoles(roles);			
			session.getTransaction().begin();
			session.update(u);
			session.getTransaction().commit();
			
			assertTrue(DaqueryUserDAO.hasRole(u.getId(), "admin"));
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (session != null) 
				session.close();
		}
		
	}
	
}
