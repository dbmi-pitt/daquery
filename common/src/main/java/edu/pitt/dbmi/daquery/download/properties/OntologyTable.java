package edu.pitt.dbmi.daquery.download.properties;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

public class OntologyTable {
	@XmlAttribute
	public String name;
	@XmlAttribute
	public boolean addUnit;
	@XmlAttribute
	public String unitName;
	@XmlElement(name="include")
	public List<String> includes = new ArrayList<>();
	@XmlElement(name="exclude")
	public List<String> excludes = new ArrayList<>();
	@XmlElement(name="modifierColumn")
	public List<ModifierColumn> modifierColumns = new ArrayList<>();
	public CustomField customField = new CustomField();
}
