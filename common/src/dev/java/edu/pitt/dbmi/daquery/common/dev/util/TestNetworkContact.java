package edu.pitt.dbmi.daquery.common.dev.util;

import java.io.File;
import java.net.SocketException;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;

public class TestNetworkContact {
	public static void main(String [] args) throws Exception {
		AppProperties.setDevHomeDir("C:\\Users\\del20");
		try {
			Network n = NetworkDAO.getNetworkById("69fb4043-4de4-4763-b205-80e99c564730");
			DaqueryUser u = DaqueryUserDAO.getUserByNameOrId("admin");
			
			NetworkDAO.addContactToNetwork(n, u);
			//NetworkDAO.removeContactToNetwork(n, u);
			
		} catch (DaqueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
