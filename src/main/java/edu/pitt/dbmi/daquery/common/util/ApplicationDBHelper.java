package edu.pitt.dbmi.daquery.common.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ApplicationDBHelper
{
	public static void main(String [] args)
	{
		InputStream is = FileHelper.streamFromBaseResource("daquery.ddl");
	    Scanner inputScanner = new Scanner(is);
	    inputScanner.useDelimiter("(;(\r)?\n)|((\r)?\n)?(--)?.*(--(\r)?\n)|(-->(\r)?\n)");
	    while(inputScanner.hasNext())
    	{
	    	String val = inputScanner.next();
	    	if(val.matches("(?i)<!--\\s*daquery.data.version\\s*=\\s*.*"))
	    		System.out.println("true");
	    	System.out.println(val);
    	}
		
	}
	
	private static Logger log = Logger.getLogger(ApplicationDBHelper.class.getName());

	public static final String DDL_SCANNER_PATTERN = "(;(\r)?\n)|((\r)?\n)?(--)?.*(--(\r)?\n)|(-->(\r)?\n)";
	
	private static ComboPooledDataSource dataSource = null;
	public static Connection getConnection()
	{
		if(dataSource == null)
		{
			try
			{
				dataSource = new ComboPooledDataSource();
				dataSource.setDriverClass( "org.apache.derby.jdbc.EmbeddedDriver" ); //loads the jdbc driver
				dataSource.setJdbcUrl( getDBURL() );
			}
			catch(Throwable t)
			{
				log.log(Level.SEVERE, "Unable to create a data source" , t);
			}
		}
		
		Connection rVal = null;
		if(dataSource != null)
		{
			try{rVal = dataSource.getConnection();}
			catch(Throwable t)
			{
				log.log(Level.SEVERE, "Unable to obtain a data connection.", t);
			}
		}

		return(rVal);
	}
	
	public static String getDBURL() throws Exception
	{
		return("jdbc:derby:" + AppProperties.getDBDir());
	}
	
	public static void printResult(ResultSet rs)
	{
		try
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1) System.out.print(",  ");
			        	String columnValue = rs.getString(i);
			        	System.out.print(columnValue + " " + rsmd.getColumnName(i));
			       	}
				System.out.println("");
			}
		}
		catch(Throwable t)
		{
			System.err.println("Error while printing a result set.");
			t.printStackTrace();
		}
	}
	public static int getTableCount()
	{
		Connection conn = null;
		try
		{
			conn = ApplicationDBHelper.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select count(*) from sys.systables where upper(tabletype) != 'S'");
			if(rs.next())
				return(rs.getInt(1));
			else
				return(0);
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An error occured while trying to get the application database table count.", t);
			return(-1);
		}
		finally
		{
			closeConnection(conn, null, null);
		}	
	}
	
	public static void closeConnection(Connection conn, Statement s, ResultSet rs)
	{
		try
		{
			if(conn != null)
				conn.close();
			if(s != null)
				s.close();
			if(rs != null)
				rs.close();
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "An error occurred while trying to close a connect, statement or result set", t);
		}	
	}
	
	public static boolean createTables(InputStream input)
	{
		Connection dbConn = null;
	    Scanner inputScanner = new Scanner(input);
	    inputScanner.useDelimiter(DDL_SCANNER_PATTERN);
	    Statement dbSt1 = null;
	    Statement dbSt2 = null;
	    Statement dbSt3 = null;
	    try
	    {
	    	dbConn = getConnection();
	    	dbSt1 = dbConn.createStatement();
	    	dbSt2 = dbConn.createStatement();
	    	dbSt3 = dbConn.createStatement();
	        Float dbVersion = executeDDL(dbSt1, inputScanner);
	        dbConn.commit();
	        if(dbVersion != null)
	        {
	        	Float currentVersion = null;
	        	ResultSet rs = dbSt2.executeQuery("select * from property where name = 'db.version'");
	        	String strVer = null;
	        	float v = -1.0f;
	        	if(rs.next())
	        	{
	        		strVer = rs.getString("value");
	        		v = Float.parseFloat(strVer);
	        		currentVersion = new Float(v);	        	
	        	}
				
				
				if(currentVersion == null || currentVersion.floatValue() < 0.0f)
				{
					dbSt3.executeUpdate("insert into property (name, value) values ('db.version', '" + dbVersion + "')");
				}
				else //otherwise update
				{
					dbSt3.executeUpdate("update property set value = '" + dbVersion + "' where name = 'db.version'");
				}
				dbConn.commit();
	        }
	        return(true);
	    }
	    catch(Throwable t)
	    {
	    	log.log(Level.SEVERE, "An error occurred while trying to import a DDL file.", t);
	    	return(false);
	    }
	    finally
	    {
	    	if(inputScanner != null)
	    		inputScanner.close();
	        closeConnection(dbConn, dbSt1, null);
	        closeConnection(null, dbSt2, null);
	        closeConnection(null, dbSt3, null);
	    }
	}
	
	/**
	 * Execute a ddl file if a line in the file is found like <!-- version=xx.xx -> extract the 
	 * version number and pass it back as a float. 
	 * 
	 * @param dbStat
	 * @param ddlScanner
	 * @return
	 * @throws DaqueryException
	 */
	public static Float executeDDL(Statement dbStat, Scanner ddlScanner) throws DaqueryException
	{
		Float version = null;
        while (ddlScanner.hasNext())
        {
            String line = ddlScanner.next();
            if (line.startsWith("/*!") && line.endsWith("*/"))
            {
                int i = line.indexOf(' ');
                line = line.substring(i + 1, line.length() - " */".length());
            }

            if (line.trim().length() > 0)
            {
            	String l2 = line.trim();
            	if(version == null && l2.matches("(?i)<!--\\s*daquery.data.version\\s*=\\s*.*"))
            	{
            		String v = l2.replaceFirst("(?i)<!--\\s*daquery.data.version\\s*=\\s*", "");
            		try{version = Float.parseFloat(v.trim());}
            		catch(Throwable t)
            		{
            			log.log(Level.SEVERE, "Couldn't convert specified version number " + v + " in ddl file to a float", t);
            		}
            	}
            	else if(l2.startsWith("#include"))
            	{
            		String includeFile = l2.substring(8).trim();
            		InputStream is = FileHelper.streamFromBaseResource(includeFile);
            	    Scanner inputScanner = new Scanner(is);
            	    inputScanner.useDelimiter(DDL_SCANNER_PATTERN);
            	    Float incVers = executeDDL(dbStat, inputScanner);
            	    if(version == null) version = incVers;
            	}
            	else
            	{
	            	if(l2.endsWith(";"))
	            		l2 = l2.substring(0, l2.length() - 1);
	                try{dbStat.execute(l2);}
	                catch(Throwable t)
	                {
	                	System.err.println("Error executing the following DDL \n" + l2); t.printStackTrace();
	                	log.log(Level.SEVERE, "Error while executing ddl\n" + l2, t);
	                	throw new DaqueryException("Error executing the following DDL \n" + l2);  //Eclipse reports a resource leak here, but this isn't true it is handled in the finally clause below
	                }
            	}
            }
        }
        return(version);
	}
}
