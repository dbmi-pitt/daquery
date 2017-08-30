package edu.pitt.dbmi.daquery.common.util;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationProperties
{
	private static Logger log = Logger.getLogger(ApplicationProperties.class.getName());
	private static Properties props = null;
	
	public static Properties getProps()
	{
		if(props == null)
		{
			InputStream is = ApplicationProperties.class.getResourceAsStream("/application.properties");
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
