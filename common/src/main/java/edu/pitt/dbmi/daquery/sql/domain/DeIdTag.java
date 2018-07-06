package edu.pitt.dbmi.daquery.sql.domain;

public class DeIdTag extends AbstractElement implements SQLElement
{
	private boolean isIdField = false;
	private boolean obfuscate = false;
	private String dateShiftOnFieldName = null;
	private String dateShiftOnTableName = null;
	private String dateShiftOnDBName = null;
	
	//used only by parser to keep track of a tag that contains a date shift property
	private boolean foundDateShift = false;
	
	public boolean isId(){return(isIdField);}
	public void setId(boolean isId){isIdField = isId;}
	
	public boolean isObfuscate(){return(obfuscate);}
	public void setObfuscate(boolean obfuscate){ this.obfuscate = obfuscate; }
	
	public boolean isDateShift(){return(dateShiftOnFieldName != null);}
	
	public String getDateShiftFieldName(){return(dateShiftOnFieldName);}
	public void setDateShiftFieldName(String name){dateShiftOnFieldName = name;}
	
	public String getDateShiftTableName(){return(dateShiftOnTableName);}
	public void setDateShiftTableName(String name){dateShiftOnTableName = name;}
	
	public String getDateShiftDBName(){return(dateShiftOnDBName);}
	public void setDateShiftDBName(String name){dateShiftOnDBName = name;}
	
	public boolean foundDateShift(){return(foundDateShift);}
	public void setFoundDateShift(boolean shift){foundDateShift = shift;}
}
