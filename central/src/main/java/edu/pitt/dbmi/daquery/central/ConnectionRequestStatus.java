package edu.pitt.dbmi.daquery.central;

public enum ConnectionRequestStatus {
	PENDING("PENDING"), APPROVED("APPROVED"), DENIED("DENIED");
	
	String value = null;
	ConnectionRequestStatus(String val)
	{
		value = val;
	}
	
	@Override
	public String toString()
	{
		return(value);
	}
}
