package edu.pitt.dbmi.daquery.update.db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import edu.pitt.dbmi.daquery.common.util.ApplicationPropertiesFile;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.3f, ddlFile="db-update-v1.3.ddl")
public class DBUpdate2 implements DBUpdater
{
	@Override
	public void updateData(Connection conn) throws Exception {
		
		InputStream is = ApplicationPropertiesFile.class.getResourceAsStream("/edu/pitt/dbmi/daquery/update/db/cdm-export-conf-v1.3.xml");
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
