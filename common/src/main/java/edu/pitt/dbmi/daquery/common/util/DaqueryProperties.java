package edu.pitt.dbmi.daquery.common.util;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="daqueryProperties")
public class DaqueryProperties {
	public DaqueryCentralProperties daqueryCentralProps = new DaqueryCentralProperties();
}
