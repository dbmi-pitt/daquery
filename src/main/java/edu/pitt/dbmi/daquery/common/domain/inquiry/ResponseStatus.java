package edu.pitt.dbmi.daquery.common.domain.inquiry;

public enum ResponseStatus
{
	APPROVED(TYPES.APPROVED),
	DENIED(TYPES.DENIED),
	PENDING(TYPES.PENDING),
	QUEUED(TYPES.QUEUED),
	EXECUTING(TYPES.EXECUTING),
	COMPLETED(TYPES.COMPLETED),
	ERROR(TYPES.ERROR),
	ABANDONED(TYPES.ABANDONED);
	
	ResponseStatus(String val)
	{
		this.val = val;
	}

	String val = null;
	
	public boolean isQueuedOrRunning()
	{
		return(this.equals(QUEUED) || this.equals(EXECUTING));
	}
	
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
		public static final String QUEUED = "QUEUED";
		public static final String EXECUTING = "EXECUTING";
		public static final String ERROR = "ERROR";
		public static final String COMPLETED = "COMPLETED";
		public static final String ABANDONED = "ABANDONED";
	} 
}
