package edu.pitt.dbmi.daquery.common.domain;

public enum EncryptionType
{
	PRVT_PUBLIC(1), SHRINE(2), NONE(3);
	
	int intValue = 0;
	EncryptionType(int val)
	{
		intValue = val;
	}
	
	public int getValue()
	{
		return(intValue);
	}
	
	public static EncryptionType fromInt(int val)
	{
		for(EncryptionType st : values())
		{
			if(val == st.intValue)
				return(st);
		}
		return(null);
	}
}