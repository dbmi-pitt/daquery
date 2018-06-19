package edu.pitt.dbmi.daquery.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Properties
{
	private static Logger log = Logger.getLogger(C3P0Properties.class.getName());
	private static List<String> propertyNames = null;
	private static File propFile = null;
	private static Properties props = null;

	public static void setProperties(ComboPooledDataSource cpds)
	{
		try
		{
			for(String name : getPropertyNames())
			{
				System.out.println(name);
				if(StringHelper.startsWithIgnoreCase(name, "c3p0."))
				{
					String value = null;
					String propertyName = name.substring(5);
					try
					{
						value = C3P0Properties.getProperty(name);
						ReflectionHelper.setValue(cpds, ComboPooledDataSource.class, propertyName, value);
					}
					catch (InvocationTargetException | IllegalAccessException | IllegalArgumentException | DaqueryException e)
					{
						log.log(Level.SEVERE, "Unable to set c3p0 property " + name + " with value " + value, e);
					}
				}
			}
		}
		catch(DaqueryException e)
		{
			log.log(Level.SEVERE, "Error while accessiong c3p0 properties file.  c3p0 properties not set.", e);
		}		
	}
	
	public static String getProperty(String name) throws DaqueryException
	{
		return getProperties().getProperty(name, "");
	}
	
	public static boolean fileExists() throws DaqueryException
	{
		File f = getPropertyFile();
		return(f != null && f.exists());
	}
	public static Properties getProperties() throws DaqueryException
	{
		if(props == null)
		{
			props = new Properties();
			try{
				File f = getPropertyFile();
				FileInputStream is = new FileInputStream(f);			
				props.load(is);
			}
			catch(DaqueryException de){throw de;}
			catch(FileNotFoundException fnfe){throw new DaqueryException("Could not find jdbc/hibernate/3p0 properties file.", fnfe);}
			catch(Throwable t){
				String msg = "Unexpected error while acquiring c3po properties file";
				log.log(Level.SEVERE, msg, t);
				throw new DaqueryException(msg, t);
			}
		}
		return(props);
	}
	
	public static List<String> getPropertyNames() throws DaqueryException
	{
		if(propertyNames == null)
		{
			BufferedReader reader = null;
			try
			{
				propertyNames = new ArrayList<String>();
				File f = getPropertyFile();
				FileInputStream is = new FileInputStream(f);
				reader = new BufferedReader(new InputStreamReader(is));
				String line = null;
				while ((line = reader.readLine()) != null)
				{
					String tLine = line.trim();
					if(!(tLine.startsWith("#") || tLine.startsWith("#")) && tLine.contains("="))
					{
						int x = tLine.indexOf("=");
						String name = tLine.substring(0, x);
						if(! StringHelper.isEmpty(name))
							propertyNames.add(name);
					}
				}
			}
			catch(DaqueryException ex){throw ex;}
			catch(IOException ioex){throw new DaqueryException("Error while reading from c3p0 properties file.", ioex);}
			catch(Throwable t){throw new DaqueryException("Unexpected Error while reading from c3p0 properties file.", t);}
			finally
			{
				if(reader != null)
				{
					try{reader.close();}
					catch(IOException iox){log.log(Level.WARNING, "Error while trying to close c3p0 propertis file. ", iox);}
				}
			}
		}
		return(propertyNames);
	}

	private static File getPropertyFile() throws DaqueryException
	{
		if(propFile == null)
		{
			String confDir = AppProperties.getConfDirectory();
			String filePath = confDir + "daquery.c3p0.properties";
			propFile = new File(filePath);
		}
		return(propFile);
	}
}
