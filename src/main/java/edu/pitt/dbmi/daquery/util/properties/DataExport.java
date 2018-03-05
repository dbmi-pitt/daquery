package edu.pitt.dbmi.daquery.util.properties;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class DataExport {
	public DataExportConfig dataModel = new DataExportConfig();
	
	//private final static Logger logger = Logger.getLogger(DataExport.class.getName());
	
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
