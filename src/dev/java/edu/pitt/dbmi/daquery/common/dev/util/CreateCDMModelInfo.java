package edu.pitt.dbmi.daquery.common.dev.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class CreateCDMModelInfo
{
	private static final String CDM_CONN_URL = "jdbc:oracle:thin:@dbmi-db-dev-01.dbmi.pitt.edu:1521:dbmi02";
	private static final String CDM_SCHEMA_NAME = "pcori_etl_31";
	private static final String CDM_PASSWORD = "password";
	
	public static void main(String [] args) throws DaqueryException
	{
		AppProperties.setDevHomeDir("/Users/bill/dq-data");
		makeModel(CDM_CONN_URL, CDM_SCHEMA_NAME, CDM_PASSWORD, "CDM");
	}
	
	public static DataModel makeModel(String cdmConnUrl, String cdmSchemaName, String cdmPassword, String modelName) throws DaqueryException
	{
		Session sess = null;
		Transaction t = null;
		try
		{
			DataModel dm = createModel(cdmConnUrl, cdmSchemaName, cdmPassword, modelName);
			sess = HibernateConfiguration.openSession();
			t = sess.beginTransaction();
			sess.save(dm);
			t.commit();
			return(dm);
		}
		catch(Throwable tr)
		{
			if(t != null) t.rollback();
			throw new DaqueryException("Error while saving model.", tr);
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
	private static DataModel createModel(String cdmConnUrl, String cdmSchemaName, String cdmPassword, String modelName) throws DaqueryException
	{
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(cdmConnUrl, cdmSchemaName, cdmPassword);
			
			DataModel dm = new DataModel(true);
			dm.setName("CDM");
			dm.setDescription("PCORI Common Data Model");
			SQLDataSource ds = new SQLDataSource();
			ds.setName(modelName);
			ds.setDataModel(dm);
			Set<DataSource> src = new HashSet<DataSource>();
			src.add(ds);
			dm.setDataSources(src);
			Set<DataAttribute> attribs = new HashSet<DataAttribute>();
			DatabaseMetaData md = conn.getMetaData();
			ResultSet rs = md.getColumns(null, "%" + cdmSchemaName.trim().toUpperCase() + "%", "%", "%");
			while (rs.next())
			{
				DataAttribute da = new DataAttribute();
				da.setAggregatable(false);
				da.setDataModel(dm);
				da.setEntityName(rs.getString("TABLE_NAME"));
				da.setFieldName(rs.getString("COLUMN_NAME"));
				String fType = rs.getString("TYPE_NAME");
				da.setFieldType(fType);
				if(fType.trim().toUpperCase().equals("DATE"))
					da.setPhi(true);
				else
					da.setPhi(false);
				attribs.add(da);
			}
			dm.setAttributes(attribs);
			return(dm);
		}
		catch(Throwable t)
		{
			DaqueryException de = new DaqueryException("Error while getting and saving CDM model info", t);
			throw(de);
		}
		finally
		{
			try{if(conn != null) conn.close();}
			catch(Throwable t){System.err.println("Error closing connection."); t.printStackTrace();}
			
		}
	}
}
