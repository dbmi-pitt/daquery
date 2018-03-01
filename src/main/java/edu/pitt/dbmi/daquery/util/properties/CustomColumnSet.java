package edu.pitt.dbmi.daquery.util.properties;
import java.util.*;

import javax.xml.bind.annotation.*;

public class CustomColumnSet {
	@XmlElement(name="field")
	public List<Field> fields = new ArrayList<>();
}
