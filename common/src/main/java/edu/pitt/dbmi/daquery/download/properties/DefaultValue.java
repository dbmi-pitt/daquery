package edu.pitt.dbmi.daquery.download.properties;
import java.util.*;

import javax.xml.bind.annotation.XmlAttribute;

public class DefaultValue {
	@XmlAttribute
	public String column;
	@XmlAttribute
	public String name;
	@XmlAttribute
	public Boolean suppress;
}