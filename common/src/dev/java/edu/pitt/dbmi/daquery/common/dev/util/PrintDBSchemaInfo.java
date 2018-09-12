package edu.pitt.dbmi.daquery.common.dev.util;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.pitt.dbmi.daquery.common.domain.DataAttribute;

public class PrintDBSchemaInfo
{
	private static final String CDM_CONN_URL = "jdbc:oracle:thin:@dbmi-db-dev-02.dbmi.pitt.edu:1521:dbmi09";
	private static final String CDM_SCHEMA_NAME = "pcori_etl_31";
	private static final String CDM_PASSWORD = "password";
	private static final String DUMP_FILE = "/home/devuser/cdm3.1.info";
	
	public static void main(String [] args)
	{
		dumpSchemaInfo();
	}
	
	private static void dumpSchemaInfo()
	{
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(CDM_CONN_URL, CDM_SCHEMA_NAME, CDM_PASSWORD);
			DatabaseMetaData md = conn.getMetaData();
			ResultSet rs = md.getColumns(null, "%" + CDM_SCHEMA_NAME.trim().toUpperCase() + "%", "%", "%");
			List<String> allColumns = new ArrayList<String>();
			while (rs.next())
			{
				String col = rs.getString("TABLE_NAME") + "." + rs.getString("COLUMN_NAME") + ":" + rs.getString("TYPE_NAME");
				allColumns.add(col);
			}
			Collections.sort(allColumns);
			FileWriter writer = new FileWriter(new File(DUMP_FILE));
			for(String col : allColumns)
			{
				writer.write( col + "\n");
			}
			writer.close();
		}
		catch(Throwable t){t.printStackTrace(System.err);}
		finally
		{
			if(conn != null) try{conn.close();}catch(SQLException se){}
		}
	}
}
