package edu.pitt.dbmi.daquery.common.util;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import edu.pitt.dbmi.daquery.download.properties.OutputFile;

@XmlRootElement(name = "dataExportConfig")
public class DataExportConfig
{
	private static final int defaultCasesPerFile = 70000;
	
	@XmlElement(name="outputFile")
	public List<OutputFile> outputFiles = new ArrayList<>();
	@XmlAttribute(name="cases-per-file")
	public Integer casesPerFile = null;
	
	public int getCasesPerFile()
	{
		if(casesPerFile == null || casesPerFile.intValue() <= 0) return(defaultCasesPerFile);
		return(casesPerFile.intValue());
	}
}
