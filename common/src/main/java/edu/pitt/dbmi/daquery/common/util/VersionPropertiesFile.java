package edu.pitt.dbmi.daquery.common.util;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VersionPropertiesFile
{
	private static Logger log = Logger.getLogger(VersionPropertiesFile.class.getName());
	private static Properties props = null;
	
	public static Properties getPropertiesFromFile()
	{
		if(props == null)
		{
			InputStream is = ApplicationPropertiesFile.class.getResourceAsStream("/build.version");
			props = new Properties();
			try{props.load(is);}
			catch(Throwable t)
			{
				log.log(Level.SEVERE, "Unable to load build.version", t);
			}
		}
		return(props);
	}
}
