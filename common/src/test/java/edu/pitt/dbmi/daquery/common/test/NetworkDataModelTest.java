package edu.pitt.dbmi.daquery.common.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

import org.junit.Test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.junit.Assert;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.domain.ConnectionDirection;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SiteConnection;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.sql.ReturnFieldsAnalyzer;

public class NetworkDataModelTest
{
	@Test
	public void testCreate(){
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53/");
		Session s = null;
		try {
			s = HibernateConfiguration.openSession();
			s.getTransaction().begin();
			DataModel dataModel = new DataModel(true);
			Network network;
			int dmCount = 0;
			
			network = NetworkDAO.getAllNetworks().get(0);
			dmCount = network.getDataModels().size();
			network.getDataModels().add(dataModel);
			s.saveOrUpdate(network);
    		s.getTransaction().commit();
    		
    		Network network1 = NetworkDAO.getNetworkById(network.getNetworkId());
    		
			assertEquals("data model must be increase by 1", dmCount + 1, network.getDataModels().size());
			
			s.getTransaction().begin();
			network.getDataModels().remove(dataModel);
			s.saveOrUpdate(network);
			s.getTransaction().commit();
				
		} catch (DaqueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(s != null) s.close();
		}
	}
	
	@Test
	public void testRead(){
	}
	
	@Test
	public void testUpdate(){
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53/");
		Session s = null;
		try {
			s = HibernateConfiguration.openSession();
			s.getTransaction().begin();
			
			Network network = NetworkDAO.getAllNetworks().get(0);
			DataModel dm = network.getDataModels().iterator().next();
			
			String name = dm.getName();
			dm.setName("SomethingElse");
			s.saveOrUpdate(dm);
    		s.getTransaction().commit();
			
			assertEquals("data model name must be equals to 'SomethingElse'", "SomethingElse", dm.getName());
			
			s.getTransaction().begin();
			dm.setName(name);
			s.saveOrUpdate(dm);
    		s.getTransaction().commit();
				
		} catch (DaqueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(s != null) s.close();
		}
	}
	
	@Test
	public void testDelete(){
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53/");
		Session s = null;
		try {
			s = HibernateConfiguration.openSession();
			s.getTransaction().begin();
			DataModel dataModel = new DataModel(true);
			Network network;
			int dmCount = 0;
			
			network = NetworkDAO.getAllNetworks().get(0);
			network.getDataModels().add(dataModel);
			s.saveOrUpdate(network);
    		s.getTransaction().commit();
    		
    		dmCount = network.getDataModels().size();
			
			s.getTransaction().begin();
			network.getDataModels().remove(dataModel);
			s.saveOrUpdate(network);
			s.getTransaction().commit();
			
			assertEquals("data model must be decrease by 1", dmCount - 1, network.getDataModels().size());
				
		} catch (DaqueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(s != null) s.close();
		}
	}
	
}
