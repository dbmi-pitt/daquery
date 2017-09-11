package edu.pitt.dbmi.daquery.util;


public enum UserStatus {
	ACTIVE(1), DELETED(2), SUSPENDED(3), CHANGE_PWD(4);
	
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