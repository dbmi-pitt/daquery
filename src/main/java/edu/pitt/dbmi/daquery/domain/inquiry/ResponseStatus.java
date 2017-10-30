package edu.pitt.dbmi.daquery.domain.inquiry;

public enum ResponseStatus
{
	APPROVED(TYPES.APPROVED), DENIED(TYPES.DENIED), PENDING(TYPES.PENDING);
	
	ResponseStatus(String val)
	{
		this.val = val;
	}

	String val = null;
	
	@Override
	public String toString()
	{
		return(val);
	}
	
	public static class TYPES
	{
		public static final String APPROVED = "APPROVED";
		public static final String DENIED = "DENIED";
		public static final String PENDING = "PENDING";
	} 
}
