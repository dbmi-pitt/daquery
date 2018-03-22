package edu.pitt.dbmi.daquery.common.domain;


public enum SiteStatus {
	CONNECTED("CONNECTED"), PENDING("PENDING"), DENIED("DENIED"), NOT_CONNECTED("NOT_CONNECTED");
	
	String strVal = null;
	SiteStatus(String tVal)
	{
		strVal = tVal;
	}
	
	public String toString()
	{
		return(strVal);
	}
}