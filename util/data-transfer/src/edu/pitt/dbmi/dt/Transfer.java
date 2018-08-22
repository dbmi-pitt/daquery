package edu.pitt.dbmi.dt;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import edu.pitt.dbmi.util.StringHelper;

public class Transfer
{
	private static String TO_URL;
	private static String TO_USERNAME;
	private static String TO_PASSWORD;
	private static String TO_DRIVER;

	private static String FROM_URL;
	private static String FROM_USERNAME;
	private static String FROM_PASSWORD;
	private static String FROM_DRIVER;
	
	public static void main(String [] args)
	{
		transfer();
	}
	
	public static void transfer()
	{
		TO_URL = DTProps.getProperty("to.url");
		TO_USERNAME = DTProps.getProperty("to.username");
		TO_PASSWORD = DTProps.getProperty("to.password");
		TO_DRIVER = DTProps.getProperty("to.jdbc.class");
		
		FROM_URL = DTProps.getProperty("from.url");
		FROM_USERNAME = DTProps.getProperty("from.username");
		FROM_PASSWORD = DTProps.getProperty("from.password");
		FROM_DRIVER = DTProps.getProperty("from.jdbc.class");
		
		Connection toConn = null;
		Connection fromConn = null;
		String insertSQL = null;
		try
		{
			Class.forName(TO_DRIVER);
			Class.forName(FROM_DRIVER);
            toConn = DriverManager.getConnection(TO_URL, TO_USERNAME, TO_PASSWORD);
            fromConn = DriverManager.getConnection(FROM_URL, FROM_USERNAME, FROM_PASSWORD);
            String [] tablesAry = DTProps.getProperty("from.included.tables").split(",");
            List<String> tables = new ArrayList<String>();
            for(int i = 0; i < tablesAry.length; i++)
            	tables.add(tablesAry[i].trim().toUpperCase());
            
            Hashtable<String, Hashtable<String, String>> fromColumnsByTableAndType = new Hashtable<String, Hashtable<String, String>>();
			DatabaseMetaData md = fromConn.getMetaData();
			ResultSet rs = md.getColumns(null, "%" + FROM_USERNAME.trim().toUpperCase() + "%", "%", "%");
			List<String> excludedTables = new ArrayList<String>();
			while (rs.next())
			{
				String tableName = rs.getString("TABLE_NAME").trim().toUpperCase();
				if(tables.contains(tableName))
				{
					String columnName = rs.getString("COLUMN_NAME").trim().toUpperCase();
					String type = rs.getString("TYPE_NAME").trim().toUpperCase();
					if(! fromColumnsByTableAndType.containsKey(tableName))
						fromColumnsByTableAndType.put(tableName, new Hashtable<String, String>());
					Hashtable<String, String> columns = fromColumnsByTableAndType.get(tableName);
					columns.put(columnName, type);
				}
				else
				{
					if(! excludedTables.contains(tableName))
					{
						excludedTables.add(tableName);
						System.err.println("!!!!TABLE NOT IN INCLUDE LIST IN PROPERTY FILE!!!!!" + tableName);
					}
				}
			}
			String defaultWhere = DTProps.getProperty("default.where");
            for(String table : tables)
            {
            	System.out.println("Starting export of " + table);
            	Statement stat = fromConn.createStatement();
            	Statement toStat = toConn.createStatement();
            	Hashtable<String, String> columns = fromColumnsByTableAndType.get(table);
            	String comma = "";
            	boolean first = true;

            	String columnsSql = "";
            	for(String column : columns.keySet())
            	{
            		columnsSql = columnsSql + comma + column;
            		if(first){comma = ", ";	first = false;}
            	}
            	
            	String select = DTProps.getProperty(table.trim().toLowerCase() + "_select");
            	if(StringHelper.isBlank(select))
            		select = "select * from " + table + " where " + defaultWhere;
            	ResultSet valLine = stat.executeQuery(select);            	
            	while(valLine.next())
            	{
            		first = true;
            		comma = "";
                	String valuesSql = "";
                	for(String column : columns.keySet())
                	{
                		String cType = columns.get(column);
                		Object dbValue;
                		if(cType.equals("DATE"))
                			dbValue = valLine.getDate(column);
                		else
                			dbValue = valLine.getString(column);
                		String value = convertValue(cType, dbValue);
                		valuesSql = valuesSql + comma + value;
                		if(first){comma = ", ";	first = false;}
                	}
                	
                	insertSQL = "INSERT INTO " + table + " (" + columnsSql + ") VALUES " + "(" + valuesSql + ")";
                	//System.out.println(insertSQL);
                	toStat.executeUpdate(insertSQL);
            	}
            	stat.close();
            	toConn.commit();
            	toStat.close();
            }
		}
		catch(Throwable t)
		{
			System.err.println(insertSQL);
			t.printStackTrace(System.err);
			System.exit(1);
		}
		finally
		{
			try{if(toConn != null) toConn.close();}catch(Throwable t){System.err.println("Error closing TO Connection"); t.printStackTrace(System.err);}
			try{if(fromConn != null) fromConn.close();}catch(Throwable t){System.err.println("Error closing FROM Connection"); t.printStackTrace(System.err);}
		}		
	}
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static String convertValue(String type, Object value)
	{
		if(value == null) return("null");
		if(type.equals("DATE"))
			return("'" + dateFormat.format((Date) value) + "'");
		else if(type.equals("NUMBER"))
			return(value.toString());
		else if(type.equals("FLOAT"))
			return(value.toString());
		else if(type.startsWith("VARCHAR"))
			return("'" + StringHelper.escapeSQLSingleQuote(value.toString()) + "'");
		else if(type.startsWith("TIMESTAMP"))
			return("'" + value + "'");
		else
		{
			System.err.println("WARNING: UNKNOWN DATA TYPE: " + type);
			return("'" +  StringHelper.escapeSQLSingleQuote(value.toString()) + "'");
		}
	}
}
