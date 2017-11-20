package edu.pitt.dbmi.daqueryws.test.domain;

import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class SQLDataSourceTest {

	private static String networkname = "SQLDataSourceTest_Network";
	private static String datasourcename = "SQLTestDataSource";
	private static String connectionurl = "jdbc:oracle:thin:@//server-a.dept.university.edu:1521/OracleSID";
	private static String username = "datasourceusername";
	private static String password = "datasourcepassword";
	private static long datasourceid = -1;
	
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
    public void testCreateAndAddToModel() {
		Session session = null;
		try {
	    	session = HibernateConfiguration.openSession();
	    	Network n = NetworkDAO.queryNetworkByName(networkname);
			SQLDataSource ds = new SQLDataSource();
			ds.setName(datasourcename);
			ds.setPassword(password);
			ds.setUsername(username);
			ds.setConnectionUrl(connectionurl);
			
			Set<DataSource> newSources = new HashSet<DataSource>();
			newSources.add(ds);

	    	DataModel dModel = new DataModel(true);
	    	dModel.setName("test-model");
	    	dModel.setDataSources(newSources);

	    	DataAttribute da1 = new DataAttribute();
	    	da1.setDataModel(dModel);
	    	da1.setEntityName("ENTITY");
	    	da1.setFieldName("FieldA");
	    	da1.setPhi(false);
	    	
	    	DataAttribute da2 = new DataAttribute();
	    	da2.setDataModel(dModel);
	    	da2.setEntityName("ENTITY");
	    	da2.setFieldName("FieldB");
	    	da2.setPhi(true);
	    	
	    	Set<DataAttribute> attributes = new HashSet<DataAttribute>();
	    	attributes.add(da1);
	    	attributes.add(da2);
	    	
	    	dModel.setAttributes(attributes);			
			ds.setDataModel(dModel);
			
			session.getTransaction().begin();
			session.persist(dModel);
			session.update(n);
			session.getTransaction().commit();
			
			datasourceid = ds.getId();
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
			session.createQuery("delete from SQLDataSource where id = :datasourceid")
				.setParameter("datasourceid", datasourceid)
				.executeUpdate();
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
