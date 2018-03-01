package edu.pitt.dbmi.daquery.util.properties;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Level;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.rest.RequestEndpoint;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.*;
import java.util.logging.Logger;


public class DataExport {
	public DataExportConfig dataModel = new DataExportConfig();
	
	private final static Logger logger = Logger.getLogger(DataExport.class.getName());
	
	public DataExport(String dataExportConf) throws PropfileException {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(DataExportConfig.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(dataExportConf);
			this.dataModel = (DataExportConfig) jaxbUnmarshaller.unmarshal(reader);
		} catch(JAXBException je) {
			throw new PropfileException("Error reading XML property string.  Possibly the XML is not formated correctly.", PropfileException.XML_ERROR);
		}
	}
}
