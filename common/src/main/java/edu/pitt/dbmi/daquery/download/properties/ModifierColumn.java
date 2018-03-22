package edu.pitt.dbmi.daquery.download.properties;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

public class ModifierColumn {
	@XmlAttribute
	public String name;
	@XmlAttribute
	public String type;
	@XmlAttribute
	public String modifierCD;
	@XmlAttribute
	public boolean addUnit;
	@XmlAttribute
	public String unitName;
	
	@XmlElement(name="valueCode")
	public List<ValueCode> valueCodes = new ArrayList<>();
}
