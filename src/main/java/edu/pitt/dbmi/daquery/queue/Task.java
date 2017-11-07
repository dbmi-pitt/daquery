package edu.pitt.dbmi.daquery.queue;

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
	public void startup();
	public void execute();
	public void shutdown();
	public TaskStatus getStatus();
	public void setStatus(TaskStatus status);
}
