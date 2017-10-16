package edu.pitt.dbmi.daquery.common.util;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationPropertiesFile
{
	private static Logger log = Logger.getLogger(ApplicationPropertiesFile.class.getName());
	private static Properties props = null;
	
	public static Properties getPropertiesFromFile()
	{
		if(props == null)
		{
			InputStream is = ApplicationPropertiesFile.class.getResourceAsStream("/application.properties");
			props = new Properties();
			try{props.load(is);}
			catch(Throwable t)
			{
				log.log(Level.SEVERE, "Unable to load application.properties", t);
			}
		}
		return(props);
	}
}
