package edu.pitt.dbmi.daquery.dev;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.ConnectionDirection;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteConnection;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class ConnectionTest
{
	public static void main(String [] args)
	{
		AppProperties.setDevHomeDir("/Users/bill/daquery-data/");
		//createInitialNetwork();
		//saveAnotherPendingConnection();
		updatePendingConnection();
	}
	private static void updatePendingConnection()
	{
		Session s = null;
		try
		{
			Network net1 = NetworkDAO.getNetworkById("net1");
			Site site1 = SiteDAO.getSiteByUUID("site1");
			SiteConnection conn = net1.findOutgoingSite("site1");
			conn.setStatusValue(SiteStatus.CONNECTED);
			s = HibernateConfiguration.openSession();
			s.beginTransaction();
			s.saveOrUpdate(conn);
			//s.saveOrUpdate(net1);
			s.getTransaction().commit();
			
		}
		catch(Throwable t){t.printStackTrace(System.err);}
		finally{if(s != null) s.close();}
	}
	private static void saveAnotherPendingConnection()
	{
		Session s = null;
		try
		{
			Network net1 = NetworkDAO.getNetworkById("net1");
			Site site1 = SiteDAO.getSiteByUUID("site1");
			SiteConnection conn2 = new SiteConnection();
			conn2.setSite(site1);
			conn2.setDirectionValue(ConnectionDirection.OUTGOING);
			conn2.setStatusValue(SiteStatus.PENDING);
			conn2.setNetwork(net1);
			net1.getSiteConnections().add(conn2);
			s = HibernateConfiguration.openSession();
			s.beginTransaction();
			s.saveOrUpdate(conn2);
/*			Site outgoingSite = null;
			for(SiteConnection c : net1.getSiteConnections())
			{
				if(c.getDirectionValue().equals(ConnectionDirection.OUTGOING))
					outgoingSite = c.getSite(); 
			}
			for(SiteConnection c : net1.getSiteConnections())
				if(c.getDirectionValue().equals(ConnectionDirection.INCOMING))
					c.setSite(outgoingSite);
			s.merge(net1);*/
			s.getTransaction().commit();
		}
		catch(Throwable t)
		{
			t.printStackTrace(System.err);
		}
		finally
		{
			if(s != null) s.close();
		}
	}
	private static void createInitialNetwork()
	{
		Network net = new Network("net1");
		net.setName("Network1");
		Site site1 = new Site("site1");
		site1.setName("Site1");
		SiteConnection conn1 = new SiteConnection();
		conn1.setSite(site1);
		conn1.setNetwork(net);
		conn1.setDirectionValue(ConnectionDirection.INCOMING);
		conn1.setStatusValue(SiteStatus.CONNECTED);
		net.getSiteConnections().add(conn1);
		Session sess = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			sess.beginTransaction();
			sess.saveOrUpdate(conn1);			
			sess.saveOrUpdate(net);
			sess.getTransaction().commit();
		}
		catch(Throwable t)
		{
			t.printStackTrace(System.err);
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
}
