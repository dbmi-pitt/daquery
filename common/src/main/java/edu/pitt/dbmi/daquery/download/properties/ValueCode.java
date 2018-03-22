package edu.pitt.dbmi.daquery.download.properties;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

public class ValueCode {
	@XmlAttribute
	public String outputValue;
	@XmlValue
	public String code;
}
