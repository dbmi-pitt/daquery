package edu.pitt.dbmi.daquery.central.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.dev.util.CreateCDMModelInfo;
import edu.pitt.dbmi.daquery.common.dev.util.PrivateProps;
import edu.pitt.dbmi.daquery.common.domain.ConnectionDirection;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteConnection;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class CreateProdNetwork
{
	private static Properties privateProps =  PrivateProps.getProps();
	
	public static List<Network> createPathtNetwork() throws DaqueryException, Throwable
	{
		Properties props = PrivateProps.getProps();
		Site pittSite = constructSite("Pitt");
		Site jhuSite = constructSite("JHU");
		Site psuSite = constructSite("PSU");
		Site templeSite = constructSite("Temple");
		Site geisSite = constructSite("Geisinger");
		Site utahSite = constructSite("Utah");

		DataModel modelA = CreateCDMModelInfo.makeModel(props.getProperty("cdm.url"),
													   props.getProperty("cdm.username"),
													   props.getProperty("cdm.password"), "CDM-31");


		Network allNet = new Network(true);
		SiteConnection oConnPitt = new SiteConnection(pittSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection oConnJHU = new SiteConnection(jhuSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection oConnPSU = new SiteConnection(psuSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection oConnGeis = new SiteConnection(geisSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection oConnUtah = new SiteConnection(utahSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection oConnTemple = new SiteConnection(templeSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		allNet.getSiteConnections().add(oConnPitt);
		allNet.getSiteConnections().add(oConnJHU);
		allNet.getSiteConnections().add(oConnPSU);		
		allNet.getSiteConnections().add(oConnGeis);		
		allNet.getSiteConnections().add(oConnUtah);
		allNet.getSiteConnections().add(oConnTemple);
		allNet.setDataModel(modelA);
		allNet.setName("PaTH");

		save(allNet);

		List<Network> nets = new ArrayList<Network>();
		nets.add(allNet);
		return(nets);
	}
	
	private static Site constructSite(String siteName)
	{
		Site site = new Site(true);
		site.setName(siteName);
		String lSiteName = siteName.trim().toLowerCase();
		site.setAccessKey(privateProps.getProperty(lSiteName + ".key"));
		site.setTempKey(true);
		site.setUrl(privateProps.getProperty(lSiteName+".url"));
		site.setAdminEmail(privateProps.getProperty(lSiteName + ".admin.email"));
		return(site);
	}
	
	private static void save(Object obj) throws Throwable
	{
		Session session = null;
		Transaction t = null;
		try
		{
			session = HibernateConfiguration.openSession();
			t = session.beginTransaction();
			session.saveOrUpdate(obj);
			t.commit();
		}
		catch(Throwable tr)
		{
			if(t != null) t.rollback();
			tr.printStackTrace();
			throw tr;
		}
		finally
		{
			if(session != null) session.close();
		}
	}		
}
