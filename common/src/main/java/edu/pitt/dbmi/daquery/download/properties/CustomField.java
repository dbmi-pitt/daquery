package edu.pitt.dbmi.daquery.download.properties;
import javax.xml.bind.annotation.*;

public class CustomField {
	@XmlAttribute
	public String name;
	
	public CustomValue customValue = new CustomValue();
}
