package edu.pitt.dbmi.daquery.sql.domain;

import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class DeIdTag extends AbstractElement implements SQLElement
{
	private boolean phi = false;
	private boolean isIdField = false;
	private boolean obfuscate = false;
	private String dateShiftTrackByName = null;  //this could be a field name or alias
	private String dateShiftTrackByTableName = null;
	private String dateShiftTrackByDBName = null;
	private boolean dateField = false;
	private boolean birthDate = false;
	
	//used only by parser to keep track of a tag that contains a date shift property
	private boolean foundDateShift = false;
	
	public boolean isPhi(){return(phi);}
	public void setPhi(boolean isPHI){phi = isPHI;}
	
	public boolean isId(){return(isIdField);}
	public void setId(boolean isId){isIdField = isId;}
	
	public boolean isObfuscate(){return(obfuscate);}
	public void setObfuscate(boolean obfuscate){ this.obfuscate = obfuscate; }
	
	public boolean isDateShift(){return(! StringHelper.isEmpty(dateShiftTrackByName));}
	
	public String getDateShiftTrackByName(){return(dateShiftTrackByName);}
	public void setDateShiftTrackByName(String name){dateShiftTrackByName = name;}
	
	public String getDateShiftTrackByTableName(){return(dateShiftTrackByTableName);}
	public void setDateShiftTrackByTableName(String name){dateShiftTrackByTableName = name;}
	
	public String getDateShiftTrackByDBName(){return(dateShiftTrackByDBName);}
	public void setDateShiftTrackByDBName(String name){dateShiftTrackByDBName = name;}
	
	public boolean foundDateShift(){return(foundDateShift);}
	public void setFoundDateShift(boolean shift){foundDateShift = shift;}
	
	public boolean isDateField(){return(dateField);}
	public void setDateField(boolean dteField){dateField = dteField;}
	
	public boolean isBirthdate(){return(birthDate);}
	public void setBirthdate(boolean isBdate){birthDate = isBdate;}
}
