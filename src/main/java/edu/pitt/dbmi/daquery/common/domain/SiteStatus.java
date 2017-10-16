package edu.pitt.dbmi.daquery.common.domain;


public enum SiteStatus {
	CONNECTED(1), PENDING(2), DENIED(3), NOT_CONNECTED(4);
	
	int intValue = 0;
	SiteStatus(int val)
	{
		intValue = val;
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
}