package edu.pitt.dbmi.daquery.util.properties;
import javax.xml.bind.annotation.*;

public class CustomField {
	@XmlAttribute
	public String name;
	
	public CustomValue customValue = new CustomValue();
}
