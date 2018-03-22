package edu.pitt.dbmi.daquery.download.properties;
import java.util.*;

import javax.xml.bind.annotation.*;

import edu.pitt.dbmi.daquery.download.properties.Field;

public class CustomColumnSet {
	@XmlElement(name="field")
	public List<Field> fields = new ArrayList<>();
}
