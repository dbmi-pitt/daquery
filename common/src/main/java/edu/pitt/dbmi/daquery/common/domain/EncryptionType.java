package edu.pitt.dbmi.daquery.common.domain;

public enum EncryptionType
{
	PRIVATE_PUBLIC("PRIVATE_PUBLIC"), SHRINE("SHRINE"), NONE("NONE");
	
	String val = null;
	EncryptionType(String val)
	{
		this.val = val;
	}
	
	public String toString()
	{
		return(val);
	}
	

}