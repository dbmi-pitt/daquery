package edu.pitt.dbmi.daquery.util;

import java.util.Hashtable;
import java.util.List;

import edu.pitt.dbmi.daquery.util.properties.ValueCode;

public class Modifier {
	public String code;
	public String name;
	public boolean addUnit;
	public int columnIndex;
	public Hashtable<String, String> options = new Hashtable<>();
	
	public Modifier(String code, String name, int columnIndex, boolean addUnit){
		this.code = code;
		this.name = name;
		this.columnIndex = columnIndex;
		this.addUnit = addUnit;
	}
	
	public Modifier(String code, String name, int columnIndex, boolean addUnit, List<ValueCode> valueCodes){
		this.code = code;
		this.name = name;
		this.columnIndex = columnIndex;
		this.addUnit = addUnit;
		for(ValueCode vc : valueCodes){
			options.put(vc.code, vc.outputValue);
		}
	}
}
