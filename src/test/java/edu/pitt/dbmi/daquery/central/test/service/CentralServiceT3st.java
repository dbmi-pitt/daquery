package edu.pitt.dbmi.daquery.central.test.service;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.logging.Level;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.pitt.dbmi.daquery.central.util.DBHelper;
import edu.pitt.dbmi.daquery.central.util.DaqueryCentralException;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;


public class CentralServiceT3st {

	public static void main(String[] args) {
		AppProperties.setDevHomeDir("/opt/shrine/tomcat");
		try {
			List<Site> siteList = SiteDAO.queryAllSites();
			ListIterator<Site> itr = siteList.listIterator();
			while (itr.hasNext()) 
			{
				Site s = itr.next();
				System.out.println("Found site:" + s.toJson());
				
			}
			t3stAuthenticateSite();  
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//@BeforeClass
	public static void setupBeforeClass() {
		
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		try {
			//AppProperties.setDBProperty("db.name","daquery-centraldb");
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}	
	
	//@Test
	public static void t3stAuthenticateSite() throws DaqueryException {
		String siteNameOrKey = "dev-zero-three";
		String key = "vKZoNo9bOIop3s9W81ZKGyxl";
		if(StringHelper.isEmpty(siteNameOrKey) || StringHelper.isEmpty(key))
			assertTrue(1==0);
		
		if(! DBHelper.authenticateSite(siteNameOrKey, key))
			assertTrue(1==0);
		else
			System.out.println("Found: " + siteNameOrKey);
/*
		Map<String, Object> additionalVals = null;
		
		try
		{
			Site site = SiteDAO.getSiteByNameOrId(siteNameOrKey);
			if(site.isTempKey())
			{
				String newKey = DBHelper.getNewSiteKey(siteNameOrKey);

				if (newKey == null)
					throw new DaqueryCentralException(
							"An unknown error while trying to generate a new site key. Check the central server log files for more information.");
							
				additionalVals = new HashMap<String, Object>();
				additionalVals.put("new-site-key", newKey);
				additionalVals.put("site-id", site.getSiteId());
				additionalVals.put("site-url", site.getUrl());
			}
			return(ResponseHelper.getTokenResponse(200, null, siteNameOrKey, site.getSiteId(), additionalVals));	
		}
*/	}
	
	//@Test
	public void t3stGetSite() {
		try {
/*			Site site = DBHelper.getSite("chuck-dev");
			assertTrue(site != null);
			Site site1 = DBHelper.getSite("dev03");
			assertTrue(site1 != null);
			Site site2 = DBHelper.getSite("dev02");
			assertTrue(site2 != null);
*/		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
