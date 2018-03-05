package edu.pitt.dbmi.daquery.util.properties;
import java.util.*;

import javax.xml.bind.annotation.*;

public class OutputFile {
	@XmlAttribute
	public String name;
	@XmlAttribute
	public String type;
	@XmlAttribute
	public String source;
	@XmlAttribute
	public String pivotLevel;
	@XmlAttribute
	public String distinct;
	@XmlElement(name="defaultValue")
	public List<DefaultValue> defaultValues = new ArrayList<>();
	@XmlElement(name="idColumn")
	public String idColumn = new String();
	@XmlElement(name="custom-column-set")
	public CustomColumnSet custom_column_set = new CustomColumnSet();
	@XmlElement(name="valueMatch")
	public ValueMatch valueMatch;
	@XmlElement(name="ontologyTable")
	public List<OntologyTable> ontologyTables = new ArrayList<>();
	@XmlElement(name="conceptColumn")
	public List<ConceptColumn> conceptColumns = new ArrayList<>();
}
