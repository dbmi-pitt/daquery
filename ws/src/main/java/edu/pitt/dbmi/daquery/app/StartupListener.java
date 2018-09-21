package edu.pitt.dbmi.daquery.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.update.UpdateDBForVersion;

public class StartupListener implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			if(AppProperties.getDBProperty("update_status") != null && AppProperties.getDBProperty("update_status").equals("updating")){
				File f  = new File(AppProperties.getHomeDirectory() + "/temp/daquery_update/daquery_update/daquery-update-error.log");
				BufferedReader br = new BufferedReader(new FileReader(f)); 
				
				String st;
				StringBuilder sb = new StringBuilder();
				boolean updateSuccessfully = false;
				while((st = br.readLine()) != null){
					sb.append(st);
					if(st.equals("Update Completed Successfully")){
						updateSuccessfully = true;
						break;
					}
				}
				
				if(updateSuccessfully){
					UpdateDBForVersion.updateDB();
					AppProperties.setDBProperty("update_status", "updated");
					AppProperties.setDBProperty("update_message", "Update Completed Successfully");
				} else {
					AppProperties.setDBProperty("update_status", "failed");
					AppProperties.setDBProperty("update_message", sb.toString());
				}
				
			}
		} catch (DaqueryException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
