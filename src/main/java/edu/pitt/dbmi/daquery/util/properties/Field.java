package edu.pitt.dbmi.daquery.util.properties;
import java.util.*;

import javax.xml.bind.annotation.*;


public class Field {
	@XmlAttribute
	public String name;
	@XmlAttribute
	public String colName;
	@XmlAttribute
	public String deid;
}
