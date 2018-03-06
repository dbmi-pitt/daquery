package edu.pitt.dbmi.daquery.download.properties;
import javax.xml.bind.annotation.*;

public class CustomValue {
	@XmlAttribute
	public String code;
	@XmlAttribute
	public String sql;
	@XmlAttribute
	public String description;
}
