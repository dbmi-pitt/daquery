package edu.pitt.dbmi.pitt.daquery.queue;

public interface Task extends Runnable
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
	public void execute();
	public TaskStatus getStatus();
	public void setStatus(TaskStatus status);
}
