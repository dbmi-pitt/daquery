package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

public class QueryInfo extends DaqueryObject
{
	private static final long serialVersionUID = 92782723234l;
	
	@Expose private String type = null;  //AGGREGATE or TABLE_EXPORT
	@Expose private boolean warnings = false;
	@Expose private boolean rejected = false;
	@Expose private String rejectionMessage = null;
	@Expose private List<String> warningMessages = new ArrayList<String>();
	@Expose private List<String> returnList = new ArrayList<String>();
	@Expose private boolean deidUnresolved = false;
	
	public String getType(){return(type);}
	public void setType(String val){type = val;}
	
	public boolean hasWarnings(){return(warnings);}
	public void setWarnings(boolean val){warnings = val;}
	
	public boolean isRejected(){return(rejected);}
	public void setRejected(boolean val){rejected = val;}
	
	public String getRejectionMessage(){return(rejectionMessage);}
	public void setRejectionMessage(String val){rejectionMessage = val;}
	
	public List<String> getWarningMessages(){return(warningMessages);}
	public void setWarningMessages(List<String> vals){warningMessages = vals;}
	public void addWarningMessage(String message){warningMessages.add(message);}
	
	public List<String> getReturnList(){return(returnList);}
	public void setReturnList(List<String> vals){returnList = vals;}
	public void addReturnVal(String val){returnList.add(val);}
	
	public boolean isDeidUnresolved(){return(deidUnresolved);}
	public void setDeidUnresolved(boolean val){deidUnresolved = val;}
}
