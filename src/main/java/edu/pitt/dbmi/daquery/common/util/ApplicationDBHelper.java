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
	private static Logger log = Logger.getLogger(ApplicationDBHelper.class.getName());
	
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
		return("jdbc:derby:" + PropertiesHelper.getDBDir());
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
	
	public static boolean executeDDL(InputStream in)
	{
		Connection conn = null;
	    Scanner s = new Scanner(in);
	    s.useDelimiter("(;(\r)?\n)|((\r)?\n)?(--)?.*(--(\r)?\n)");
	    Statement st = null;
	    try
	    {
	    	conn = getConnection();
	        st = conn.createStatement();
	        while (s.hasNext())
	        {
	            String line = s.next();
	            if (line.startsWith("/*!") && line.endsWith("*/"))
	            {
	                int i = line.indexOf(' ');
	                line = line.substring(i + 1, line.length() - " */".length());
	            }

	            if (line.trim().length() > 0)
	            {
	            	String l2 = line.trim();
	            	if(l2.endsWith(";"))
	            		l2 = l2.substring(0, l2.length() - 1);
	                st.execute(l2);
	            }
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
	    	if(s != null)
	    		s.close();
	        closeConnection(conn, st, null);
	    }
	}
}
