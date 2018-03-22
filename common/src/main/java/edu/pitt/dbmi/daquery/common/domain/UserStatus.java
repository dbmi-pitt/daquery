package edu.pitt.dbmi.daquery.common.domain;


public enum UserStatus {
	ACTIVE("ACTIVE"), DISABLED("DISABLED"), PWD_EXPIRED("PWD_EXPIRED");
	
	String value = null;
	UserStatus(String val)
	{
		value = val;
	}
	
	@Override
	public String toString()
	{
		return(value);
	}
}