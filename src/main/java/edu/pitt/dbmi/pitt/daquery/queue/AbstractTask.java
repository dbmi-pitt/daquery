package edu.pitt.dbmi.pitt.daquery.queue;

public abstract class AbstractTask implements Task {

	protected String queueId;
	private boolean running = false;
	private boolean queued = false;
	private TaskStatus status = null;
	
	@Override
	public String getQueueId() {return(queueId);}
	public void setQueueId(String id){queueId = id;}
	
	@Override
	public boolean isRunning() {return(running);}
	public void setRunning(boolean isRunning){running = isRunning;}
	
	@Override
	public boolean isQueued() {return(queued);}
	public void setQueued(boolean inQueue){queued = inQueue;}

	public TaskStatus getStatus(){return(status);}
	public void setStatus(TaskStatus stat){status = stat;}

}
