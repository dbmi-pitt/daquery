package edu.pitt.dbmi.daquery.common.util;

import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBException;

public class DaqueryCentralPropertyFile extends DaqueryXMLPropertyFile {
	
	private static Logger log = Logger.getLogger(DaqueryCentralPropertyFile.class.getName());
	
	private static String propFilename = null;
	private static DaqueryCentralPropertyFile inst = null;
	private static boolean setupError = false;
	
	private DaqueryCentralPropertyFile() throws JAXBException, PropfileException {
		super(propFilename);
	}
	
	public static DaqueryCentralPropertyFile instance() throws FileNotFoundException
	{
		if(setupError)
			throw new FileNotFoundException("Unable to find a valid shrine-plus.xml in a Tomcat configuration directory.");
		else if(inst == null)
		{
			try
			{
				AppProperties.setDevHomeDir("C:\\Users\\del20");
				propFilename = AppProperties.getHomeDirectory() + "daquery.xml";
				inst = new DaqueryCentralPropertyFile();
			}
			catch(Throwable t)
			{
				setupError = true;
				log.log(Level.SEVERE, "Cannot find a valid shrine-plus.xml file in a Tomcat configuration directory.", t);
				throw new FileNotFoundException();
			}
		}
		return(inst);
	}
	
	private DaqueryCentralProperties getProperties()
	{
		return(inst.getProps().daqueryCentralProperties);
	}
	
	public EmailConfig getEmailConfiguration()
	{
		return(getProperties().emailConfig);
	}
}
