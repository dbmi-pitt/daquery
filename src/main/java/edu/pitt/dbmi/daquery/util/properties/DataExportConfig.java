package edu.pitt.dbmi.daquery.util.properties;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

import java.io.StringReader;
import java.util.*;

@XmlRootElement(name = "dataExportConfig")
public class DataExportConfig {;
	@XmlElement(name="outputFile")
	public List<OutputFile> outputFiles = new ArrayList<>();
	@XmlElement(name="pageSize")
	public int pageSize;
}
