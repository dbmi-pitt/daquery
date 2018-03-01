package edu.pitt.dbmi.daquery.util.properties;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

public class ValueCode {
	@XmlAttribute
	public String outputValue;
	@XmlValue
	public String code;
}
