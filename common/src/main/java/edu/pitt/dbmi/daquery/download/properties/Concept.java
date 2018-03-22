package edu.pitt.dbmi.daquery.download.properties;

import java.util.*;

public class Concept {
	public String code;
	public String name;
	public int columnIndex;
	public boolean addUnit;
	public String type;
	public Hashtable<String, Modifier> modifiers = new Hashtable<>();
	public Hashtable<String, String> options = new Hashtable<>();
	
	public Concept(String code, String name, int columnIndex, boolean addUnit, String type){
		this.code = code;
		this.name = name;
		this.columnIndex = columnIndex;
		this.addUnit = addUnit;
		this.type = type;
	}
	
	public Concept(String code, String name, int columnIndex, boolean addUnit, String type, List<ValueCode> valueCodes){
		this.code = code;
		this.name = name;
		this.columnIndex = columnIndex;
		this.addUnit = addUnit;
		this.type = type;
		for(ValueCode vc : valueCodes){
			options.put(vc.code, vc.outputValue);
		}
	}
}
