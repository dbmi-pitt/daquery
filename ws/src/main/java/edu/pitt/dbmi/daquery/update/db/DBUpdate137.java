package edu.pitt.dbmi.daquery.update.db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.ApplicationDBHelper;
import edu.pitt.dbmi.daquery.common.util.ApplicationPropertiesFile;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.37f)
public class DBUpdate137 implements DBUpdater
{
	public static void main(String [] args) throws Exception
	{
		Connection conn = null;
		try
		{
			AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
			//AppProperties.setDevHomeDir("/home/devuser/daquery-data");
			DBUpdate137 update = new DBUpdate137();
			conn = ApplicationDBHelper.getConnection();
			update.updateData(conn);
		}
		catch(Throwable t)
		{
			throw t;
		}
		finally
		{
			if(conn != null) conn.close();
		}
	}
	@Override
	public void updateData(Connection conn) throws Exception {
		
		InputStream is = ApplicationPropertiesFile.class.getResourceAsStream("/edu/pitt/dbmi/daquery/update/db/cdm-export-conf-v1.37.xml");
		Scanner inputScanner = new Scanner(is);
		String exportXML = "";
		while(inputScanner.hasNextLine())
			exportXML = exportXML + inputScanner.nextLine() + "\n";
		inputScanner.close();
		
		//for all data models add the export xml for CDM
		Statement st = conn.createStatement();
		st.executeUpdate("update DATA_MODEL set DATA_EXPORT_CONf = '" + exportXML + "'");
		conn.commit();
	}
}
