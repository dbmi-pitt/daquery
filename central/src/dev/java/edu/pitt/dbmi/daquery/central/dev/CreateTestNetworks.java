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

public class CreateTestNetworks
{	
	public static List<Network> createLocalDevTestNetwork() throws DaqueryException
	{
		Properties props = PrivateProps.getProps();
		
		Site bSite = new Site("20b23b5c-61ad-44eb-8eef-886adcced18e");
		bSite.setName("bill-dev");
		bSite.setAccessKey("abc123");
		bSite.setTempKey(true);
		bSite.setUrl("http://localhost:8080/");
		bSite.setAdminEmail("shirey@pitt.edu");
		
		Site cSite = new Site("0f2378ec-d9ce-489a-b338-c8f82e567f40");
		cSite.setName("chuck-dev");
		cSite.setAccessKey("123abc");
		cSite.setTempKey(true);
		cSite.setUrl("http://borromeo-lp.dbmi.pitt.edu:8080/");
		cSite.setAdminEmail("chuck.borromeo@pitt.edu");		
		
		Site dSite = new Site("bcfdd450-3dd8-4ced-9599-c65de7c9f115");
		dSite.setName("desheng-dev");
		dSite.setAccessKey("xyz789");
		dSite.setTempKey(true);
		dSite.setUrl("http://del20-d5.univ.pitt.edu:8080/");
		dSite.setAdminEmail("del20@pitt.edu");

		DataModel modelA = CreateCDMModelInfo.makeModel(props.getProperty("cdm.url"),
													   props.getProperty("cdm.username"),
													   props.getProperty("cdm.password"), "CDM-ALL");
		DataModel modelDC = CreateCDMModelInfo.makeModel(props.getProperty("cdm.url"),
													   props.getProperty("cdm.username"),
													   props.getProperty("cdm.password"), "CDM-DC");
		DataModel modelCB = CreateCDMModelInfo.makeModel(props.getProperty("cdm.url"),
													   props.getProperty("cdm.username"),
													   props.getProperty("cdm.password"), "CDM-CB");
		DataModel modelDB = CreateCDMModelInfo.makeModel(props.getProperty("cdm.url"),
													   props.getProperty("cdm.username"),
													   props.getProperty("cdm.password"), "CDM-DB");
		
		
		Network allNet = new Network("fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823");
		SiteConnection oConnB = new SiteConnection(bSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection oConnD = new SiteConnection(dSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection oConnC = new SiteConnection(cSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		allNet.getSiteConnections().add(oConnB);
		allNet.getSiteConnections().add(oConnD);
		allNet.getSiteConnections().add(oConnC);		
		allNet.setDataModel(modelA);
		allNet.setName("Local-All-Net");
		
		Network dcNet = new Network("1169eae7-79ed-41e6-bb62-c86167aef92f");
		SiteConnection o2ConnD = new SiteConnection(dSite, dcNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection o2ConnC = new SiteConnection(cSite, dcNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		dcNet.getSiteConnections().add(o2ConnD);
		dcNet.getSiteConnections().add(o2ConnC);
		dcNet.setDataModel(modelDC);
		dcNet.setName("D-C Net");
		
		Network cbNet = new Network("9dc38074-a153-4183-a36f-2b64cf75c13c");
		SiteConnection o3ConnC = new SiteConnection(cSite, cbNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection o3ConnB = new SiteConnection(bSite, cbNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		cbNet.getSiteConnections().add(o3ConnC);
		cbNet.getSiteConnections().add(o3ConnB);
		cbNet.setDataModel(modelCB);
		cbNet.setName("C-B Net");
		
		Network dbNet = new Network("afff8323-176c-4cb0-9d2c-cccc03fff101");
		SiteConnection o4ConnD = new SiteConnection(dSite, dbNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection o4ConnB = new SiteConnection(bSite, dbNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		dbNet.getSiteConnections().add(o4ConnD);
		dbNet.getSiteConnections().add(o4ConnB);
		dbNet.setDataModel(modelDB);
		dbNet.setName("D-B Net");
		
		save(allNet);
		save(dcNet);
		save(cbNet);
		save(dbNet);
		
		List<Network> nets = new ArrayList<Network>();
		nets.add(allNet);
		nets.add(dcNet);
		nets.add(cbNet);
		nets.add(dbNet);
		return(nets);
	}
	
	//create a set of Shrine SSL connections
	public static List<Network> createSSLTestNetwork() throws DaqueryException
	{
		Properties props = PrivateProps.getProps();
		                       
		Site bSite = new Site("81590cc9-9bcd-470e-bc10-065080996842");
		bSite.setName("dev02");
		bSite.setAccessKey("abc123");
		bSite.setTempKey(true);
		bSite.setUrl("https://130.49.213.163:6443/");
		bSite.setAdminEmail("shirey@pitt.edu");
		
		Site cSite = new Site("74059b65-056d-43a8-a705-b606c452ff71");
		cSite.setName("dev03");
		cSite.setAccessKey("abc123");
		cSite.setTempKey(true);
		cSite.setUrl("https://130.49.213.164:6443/");
		cSite.setAdminEmail("chuck.borromeo@pitt.edu");		
		
		Site dSite = new Site("05b6db4d-a543-4ff6-8b9c-664b6153a104");
		dSite.setName("shrine-dev01");
		dSite.setAccessKey("abc123");
		dSite.setTempKey(true);
		dSite.setUrl("https://130.49.213.165:6443/");
		dSite.setAdminEmail("del20@pitt.edu");

		DataModel modelA = CreateCDMModelInfo.makeModel(props.getProperty("cdm.url"),
													   props.getProperty("cdm.username"),
													   props.getProperty("cdm.password"), "CDM-SHRINE");
		
		
		Network allNet = new Network("69fb4043-4de4-4763-b205-80e99c564730");
		SiteConnection o5ConnB = new SiteConnection(bSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection o5ConnD = new SiteConnection(dSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection o5ConnC = new SiteConnection(cSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		allNet.getSiteConnections().add(o5ConnB);
		allNet.getSiteConnections().add(o5ConnD);
		allNet.getSiteConnections().add(o5ConnC);
		allNet.setDataModel(modelA);
		allNet.setName("DEV-ALL-SSL");
		
		save(allNet);
		
		List<Network> nets = new ArrayList<Network>();
		nets.add(allNet);
		return(nets);
	}

	//create a set of Shrine non-encrypted connections
	//careful- the site UUIDs/names are the same as createSSLTestNetwork
	public static List<Network> createTestNetwork() throws DaqueryException
	{
		Properties props = PrivateProps.getProps();
                     
		Site bSite = new Site("81590cc9-9bcd-470e-bc10-065080996842");
		bSite.setName("dev02");
		bSite.setAccessKey("abc123");
		bSite.setTempKey(true);
		bSite.setUrl("http://130.49.213.163:6060/");
		bSite.setAdminEmail("shirey@pitt.edu");

		Site cSite = new Site("74059b65-056d-43a8-a705-b606c452ff71");
		cSite.setName("dev03");
		cSite.setAccessKey("abc123");
		cSite.setTempKey(true);
		cSite.setUrl("http://130.49.213.164:6060/");
		cSite.setAdminEmail("shirey@pitt.edu");		

		Site dSite = new Site("05b6db4d-a543-4ff6-8b9c-664b6153a104");
		dSite.setName("dev01");
		dSite.setAccessKey("abc123");
		dSite.setTempKey(true);
		dSite.setUrl("http://130.49.213.165:6060/");
		dSite.setAdminEmail("shirey@pitt.edu");

		DataModel modelA = CreateCDMModelInfo.makeModel(props.getProperty("cdm.url"),
													   props.getProperty("cdm.username"),
													   props.getProperty("cdm.password"), "CDM-SHRINE");
		

		Network allNet = new Network("69fb4043-4de4-4763-b205-80e99c564730");
		SiteConnection o5ConnB = new SiteConnection(bSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection o5ConnD = new SiteConnection(dSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		SiteConnection o5ConnC = new SiteConnection(cSite, allNet, SiteStatus.CONNECTED, ConnectionDirection.OUTGOING);
		allNet.getSiteConnections().add(o5ConnB);
		allNet.getSiteConnections().add(o5ConnD);
		allNet.getSiteConnections().add(o5ConnC);
		allNet.setDataModel(modelA);
		allNet.setName("DEV-ALL");
		
		save(allNet);
		
		List<Network> nets = new ArrayList<Network>();
		nets.add(allNet);
		return(nets);
	}
	
	
	private static void save(Object obj)
	{
		Session session = null;
		Transaction t = null;
		int exitCode = 0;
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
		}
		finally
		{
			if(session != null) session.close();
		}
	}	
	
/*
 * 
insert into site (id, name, access_key, tempkey, site_url, admin_email, email_access) values 
('20b23b5c-61ad-44eb-8eef-886adcced18e', 'bill-dev', 'abc123', true, 'http://shirey-dt-032.dbmi.pitt.edu:8080/', 'shirey@pitt.edu', true);
('0f2378ec-d9ce-489a-b338-c8f82e567f40', 'chuck-dev', '123abc', true, 'http://borromeo-lp.dbmi.pitt.edu:8080/', 'chuck.borromeo@pitt.edu', true);
('bcfdd450-3dd8-4ced-9599-c65de7c9f115', 'desheng-dev', 'xyz789', true, 'http://del20-dt.univ.pitt.edu:8080/', 'del20@pitt.edu', true);

insert into network(name, id, data_model) values
('devALL','fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823','cdm');
('devDandC','1169eae7-79ed-41e6-bb62-c86167aef92f','cdm');
('devCandB','9dc38074-a153-4183-a36f-2b64cf75c13c','cdm');
('devDandB','afff8323-176c-4cb0-9d2c-cccc03fff101','cdm');

insert into network_membership(id, site_id, network_id) values
(1,'20b23b5c-61ad-44eb-8eef-886adcced18e','fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823');
(2,'0f2378ec-d9ce-489a-b338-c8f82e567f40','fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823');
(3,'bcfdd450-3dd8-4ced-9599-c65de7c9f115','fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823');
(4,'0f2378ec-d9ce-489a-b338-c8f82e567f40','1169eae7-79ed-41e6-bb62-c86167aef92f');
(5,'bcfdd450-3dd8-4ced-9599-c65de7c9f115','1169eae7-79ed-41e6-bb62-c86167aef92f');
(6,'20b23b5c-61ad-44eb-8eef-886adcced18e','9dc38074-a153-4183-a36f-2b64cf75c13c');
(7,'0f2378ec-d9ce-489a-b338-c8f82e567f40','9dc38074-a153-4183-a36f-2b64cf75c13c');
(8,'20b23b5c-61ad-44eb-8eef-886adcced18e','afff8323-176c-4cb0-9d2c-cccc03fff101');
(9,'bcfdd450-3dd8-4ced-9599-c65de7c9f115','afff8323-176c-4cb0-9d2c-cccc03fff101');


 * 
 */
	
	
	
}
