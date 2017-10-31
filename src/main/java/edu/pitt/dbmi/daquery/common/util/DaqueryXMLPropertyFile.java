package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public abstract class DaqueryXMLPropertyFile {
	protected DaqueryXMLPropertyFile(String pathToPropertyFile) throws JAXBException, PropfileException {
		propFileName = pathToPropertyFile;
		openPropertyFile(pathToPropertyFile);
	}
	
	private String propFileName = null;
	private DaqueryProperties props = null;
	private File propFile = null;
	public String getPropertyFileName()
	{
		return(propFileName);
	}
	
	
	public boolean exists()
	{
		return(propFile.exists());
	}
	public boolean isReadable()
	{
		return(propFile.canRead());
	}
	
	public void openPropertyFile(String pathToFile) throws PropfileException
	{
			propFile = new File(pathToFile);
			if(propFile == null)
			{
				throw new PropfileException("Failed to create a pointer to property file. " + pathToFile, PropfileException.UNKNOWN_ERROR);
			}
			else if(! propFile.exists())
			{
				throw new PropfileException("File does not exist. " + pathToFile, PropfileException.FILE_NOT_FOUND);
			}
			else if(! propFile.canRead())
			{
				throw new PropfileException("File cannot be read. " + pathToFile, PropfileException.FILE_UNREADABLE);
			}
			try
			{
				JAXBContext jaxbContext = JAXBContext.newInstance(DaqueryCentralProperties.class);
		
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				props = (DaqueryProperties) jaxbUnmarshaller.unmarshal(propFile);
			}
			catch(JAXBException je)
			{
				throw new PropfileException("Error reading XML property file.  Possibly the XML is not formated correctly.", PropfileException.XML_ERROR);
			}
	}

	protected DaqueryProperties getProps()
	{
		return(props);
	}
	
}
