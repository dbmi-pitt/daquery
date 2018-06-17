package edu.pitt.dbmi.daquery.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C3P0Properties
{
	private static Logger log = Logger.getLogger(C3P0Properties.class.getName());
	private static List<String> propertyNames = null;
	private static File propFile = null;
	
	public static List<String> getPropertyNames() throws DaqueryException
	{
		if(propertyNames == null)
		{
			BufferedReader reader = null;
			try
			{
				File f = getPropertyFile();
				propertyNames = new ArrayList<String>();
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
			catch(IOException ioex){throw new DaqueryException("Error while reading from jdbc/hibernate property file.", ioex);}
			catch(Throwable t){throw new DaqueryException("Unexpected Error while reading from jdbc/hibernate property file.", t);}
			finally
			{
				if(reader != null)
				{
					try{reader.close();}
					catch(IOException iox){log.log(Level.WARNING, "Error while trying to close jdbc/hibernate property file. ", iox);}
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
			String filePath = confDir + "jdbc.connection.properties";
			propFile = new File(filePath);
			if(! (propFile.exists() && propFile.canRead()))
			{
				throw new DaqueryException("Cannot read jdbc properties file at " + filePath);
			}
		}
		return(propFile);
	}
}
