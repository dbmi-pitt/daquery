package edu.pitt.dbmi.daquery.common.domain;


public enum ConnectionDirection {
	INCOMING("INCOMING"), OUTGOING("OUTGOING");
	
	String strVal = null;
	ConnectionDirection(String tVal)
	{
		strVal = tVal;
	}
	
	public String toString()
	{
		return(strVal);
	}
}