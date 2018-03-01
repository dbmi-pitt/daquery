package edu.pitt.dbmi.daquery.util.properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.pitt.dbmi.daquery.common.util.AppProperties;

public class DataExportPropertyFile {
	private static Log log = LogFactory.getLog(DataExportPropertyFile.class);
	
	private static String propFilename = null;
	private static DataExportPropertyFile inst = null;
	private static boolean setupError = false;
	private String propFileName = null;
	private DataExport props = null;
	private File propFile = null;
	
	private DataExportPropertyFile(String pathToPropertyFile) throws JAXBException, PropfileException {
		propFileName = pathToPropertyFile;
		openPropertyFile(pathToPropertyFile);
	}
	
	public static DataExportPropertyFile instance() throws FileNotFoundException {
		if(setupError)
			throw new FileNotFoundException("Unable to find a valid path-export.xml in a JBoss configuration directory.");
		else if(inst == null) {
			try {
				propFilename =  AppProperties.getHomeDirectory() + "/conf/daquery-dataexport.xml";
				inst = new DataExportPropertyFile(propFilename);
			} catch(JAXBException jbe) {
				setupError = true;
				log.error("Error initiating JAXB library.", jbe);
				throw new FileNotFoundException("Error initiating JAXB library");
			} catch(PropfileException pfe) {
				setupError = true;
				log.error("Error opening property file.", pfe);
				throw pfe;
			} catch(Throwable t) {
				setupError = true;
				log.error("Cannot find a valid path-export.xml file in a JBoss configuration directory.", t);
				throw new FileNotFoundException();
			}
		}
		return(inst);
	}
	
	public void openPropertyFile(String pathToFile) throws PropfileException {
		propFile = new File(pathToFile);
		if(propFile == null) {
			throw new PropfileException("Failed to create a pointer to property file. " + pathToFile, PropfileException.UNKNOWN_ERROR);
		} else if(! propFile.exists()) {
			throw new PropfileException("File does not exist. " + pathToFile, PropfileException.FILE_NOT_FOUND);
		} else if(! propFile.canRead()) {
			throw new PropfileException("File cannot be read. " + pathToFile, PropfileException.FILE_UNREADABLE);
		}
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(DataExport.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			props = (DataExport) jaxbUnmarshaller.unmarshal(propFile);
		} catch(JAXBException je) {
			throw new PropfileException("Error reading XML property file.  Possibly the XML is not formated correctly.", PropfileException.XML_ERROR);
		}
	}

	public DataExport getProps() {
		return props;
	}
}
