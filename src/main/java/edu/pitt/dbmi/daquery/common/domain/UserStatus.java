package edu.pitt.dbmi.daquery.common.domain;


public enum UserStatus {
	ACTIVE(1), DISABLED(2), PWD_EXPIRED(3);
	
	int intValue = 0;
	UserStatus(int val)
	{
		intValue = val;
	}
	
	public int getValue()
	{
		return(intValue);
	}
	
	public static UserStatus fromInt(int val)
	{
		for(UserStatus st : values())
		{
			if(val == st.intValue)
				return(st);
		}
		return(null);
	}
}