package edu.pitt.dbmi.daquery.download.properties;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

public class ConceptColumn {
	@XmlAttribute
	public String conceptCD;
	@XmlAttribute
	public String name;
	@XmlAttribute
	public boolean addUnit;
	@XmlAttribute
	public String unitName;
	@XmlAttribute
	public String type;
	
	@XmlElement(name="modifierColumn")
	public List<ModifierColumn> modifierColumns = new ArrayList<>();
	
	@XmlElement(name="valueCode")
	public List<ValueCode> valueCodes = new ArrayList<>();
}
