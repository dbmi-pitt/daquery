package edu.pitt.dbmi.daquery.common.domain;


public enum SiteStatus {
	CONNECTED(1, "CONNECTED"), PENDING(2, "PENDING"), DENIED(3, "DENIED"), NOT_CONNECTED(4, "NOT_CONNECTED");
	
	int intValue = 0;
	String strVal = null;
	SiteStatus(int val, String tVal)
	{
		intValue = val;
		strVal = tVal;
	}
	
	public int getValue()
	{
		return(intValue);
	}
	
	public static SiteStatus fromInt(int val)
	{
		for(SiteStatus st : values())
		{
			if(val == st.intValue)
				return(st);
		}
		return(null);
	}
	
	public String toString()
	{
		return(strVal);
	}
}