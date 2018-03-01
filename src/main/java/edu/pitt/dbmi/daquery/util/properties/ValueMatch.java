package edu.pitt.dbmi.daquery.util.properties;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

public class ValueMatch {
	@XmlAttribute
	public String field;
	@XmlAttribute
	public String pattern;
	@XmlElement(name="modifierColumn")
	public List<ModifierColumn> modifierColumns = new ArrayList<>();
	
}
