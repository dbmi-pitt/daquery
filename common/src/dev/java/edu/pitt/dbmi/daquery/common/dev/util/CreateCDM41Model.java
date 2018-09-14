package edu.pitt.dbmi.daquery.common.dev.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
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
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.DataExportConfig;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;

public class CreateCDM41Model
{
	private static final String CDM_CONN_URL = "jdbc:oracle:thin:@dbmi-db-prod-02.dbmi.pitt.edu:1521:dbmi11";
	private static final String CDM_SCHEMA_NAME = "cdm_41_etl";
	private static final String CDM_PASSWORD = "dbmi72etl";
	
	public static void main(String [] args) throws Exception
	{
		//AppProperties.setDevHomeDir("/home/devuser/daquery-data");
		//AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		DataModel dm = createModel(CDM_CONN_URL, CDM_SCHEMA_NAME, CDM_PASSWORD, "CDM");
		dumpModelToJSON(dm);
		//System.out.println(importModel());
	}

	private static Long importModel() throws IOException, DaqueryException
	{
		InputStream is = CreateCDM41Model.class.getResourceAsStream("/data-modelCDM-4.1.json");
		DataModel dm = JSONHelper.fromJson(is, DataModel.class);
		//dm.setId(null);
		Session sess = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			Transaction t = sess.beginTransaction();
			sess.save(dm);
			t.commit();
			return(dm.getId());
		}
		catch(Throwable tr)
		{
			throw new DaqueryException("Error while saving data model.", tr);
		}
		finally
		{
			if(sess != null) sess.close();
		}		
		
	}	
	public static void dumpModelToJSON(DataModel dm) throws DaqueryException
	{
/*		Session sess = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			Query q = sess.createQuery("select m from DataModel m");
			List<DataModel> models = q.list();
			int i = 0;
			for(DataModel dm : models)
			{ */
		try
		{
				FileWriter fw = new FileWriter(new File("/home/devuser/data-model" + dm.getName() + ".json"));
				fw.write(dm.toJson());
				fw.close();
/*			} */

		}
		catch(Throwable tr)
		{
			throw new DaqueryException("Error while saving model.", tr);
		}
/*		finally
		{
			if(sess != null) sess.close();
		} */		
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
	private static final String [] TABLES_TO_EXCLUDE = {"REDCAP_ANSWER_MAPPING", "REDCAP_EVENT_MAPPING", "REDCAP_PATIENT_MAPPING", "RUCA_MAPPING"};
	private static final String [] FIELDS_TO_EXCLUDE = {"ENCOUNTER.RAW_PAYER_NAME_PRIMARY", "ENCOUNTER.RAW_PAYER_NAME_SECONDARY"};
	private static boolean inExcludeLists(String tableName, String fieldName)
	{
		String tName = tableName.toUpperCase().trim();
		String fName = tName + "." + fieldName.toUpperCase().trim();
		for(String tbl : TABLES_TO_EXCLUDE)
			if(tbl.equals(tName)) return(true);
		for(String field : FIELDS_TO_EXCLUDE)
			if(field.equals(fName)) return(true);
		
		return(false);
	}
	private static DataModel createModel(String cdmConnUrl, String cdmSchemaName, String cdmPassword, String modelName) throws DaqueryException
	{
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(cdmConnUrl, cdmSchemaName, cdmPassword);
			
			DataModel dm = new DataModel(true);
			dm.setName("CDM-4.1");
			dm.setDescription("PCORI Common Data Model Version 4.1");
			DataExportConfig dec = dm.getCDM41ExportConfigFromFile();
			System.out.println(dec.getCasesPerFile());
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
				String tableName = rs.getString("TABLE_NAME");
				String fName = rs.getString("COLUMN_NAME");
				if(! inExcludeLists(tableName, fName)  )
				{
					DataAttribute da = new DataAttribute();
					da.setDataModel(dm);
					da.setEntityName(tableName);
					da.setFieldName(fName);
					String fType = rs.getString("TYPE_NAME");
					da.setAggregatable(false);
					da.setFieldType(fType);
					da.setPhi(false);
					if(fType.trim().toUpperCase().equals("DATE"))
					{
						da.setPhi(true);
						da.setDateField(true);
					}
					String fieldName = da.getFieldName().toUpperCase().trim();
					if(fieldName.equals("BIRTH_DATE"))
					{
						da.setPhi(true);
						da.setBirthDate(true);
						da.setDateField(true);
					}
					if(fieldName.endsWith("ID") || fieldName.contains("_ID_"))							
					{
						da.setAggregatable(true);
						da.setIdentifier(true);
						da.setIdentiferName(da.getFieldName().toUpperCase());
						da.setPhi(true);
					}
					if(fieldName.equals("ZIP_CODE"))
					{
						da.setZipCode(true);
						da.setPhi(true);
					}
					attribs.add(da);
				}
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
