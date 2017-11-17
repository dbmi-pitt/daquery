package edu.pitt.dbmi.daquery.queue;

import edu.pitt.dbmi.daquery.common.util.DaqueryException;

public interface Task
{
	public String getQueueId();
	public boolean isRunning();
	
	/**
	 * Measurement of progress.
	 *  
	 * @return 0 - 100.  0 is just started 100 is finished.
	 *         a negative value indicates that progress cannont
	 *         be furnished.
	 */
	public int getProgress();
	public boolean isQueued();
	public void startup() throws DaqueryException;
	public void execute() throws DaqueryException;
	public void shutdown() throws DaqueryException;
	public void errorState(ErrorPeriod period, Throwable cause);
	public TaskStatus getStatus();
	public void setStatus(TaskStatus status);
	
	public enum ErrorPeriod
	{
		STARTUP, EXECUTE, SHUTDOWN
	}
}
