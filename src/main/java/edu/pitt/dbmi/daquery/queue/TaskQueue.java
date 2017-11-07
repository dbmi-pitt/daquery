package edu.pitt.dbmi.daquery.queue;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;

public class TaskQueue
{
	private static Hashtable<String, Task> tasksById = new Hashtable<String, Task>();
	private static LinkedList<Task> waitingQueue = new LinkedList<Task>();
	private static List<TaskRunner> runningQueue = new ArrayList<TaskRunner>();
	
	public synchronized void addTask(Task task) throws DaqueryException
	{
		if(task == null || task.getQueueId() == null) throw new DaqueryException("Trying to queue a null task or a task without a queue id");
		if(tasksById.containsKey(task.getQueueId())) throw new DaqueryException("Task " + task.getQueueId() + " is already queued or running.");
		tasksById.put(task.getQueueId(), task);
		waitingQueue.add(task);
		task.setStatus(TaskStatus.IN_QUEUE);
		runNext();
	}
	
	public synchronized void taskFinished(TaskRunner runner)
	{
		runningQueue.remove(runner);
		runner.task.setStatus(TaskStatus.FINISHED);
		tasksById.remove(runner.task.getQueueId());
		runNext();
	}
	
	public synchronized int queueLength()
	{
		return(tasksById.size());
	}
	//this method must remain private and can
	//only be called from synchronized methods in
	//this class, but cannot be synchronized itself
	//because it is called from sychronized methods
	private void runNext()
	{
		if(runningQueue.size() < AppProperties.getTaskQueueMaxLength() && waitingQueue.size() > 0)
		{
			Task task = waitingQueue.poll();
			TaskRunner runner = new TaskRunner(task, this);
			runningQueue.add(runner);
			task.setStatus(TaskStatus.RUNNING);
			((Thread)runner).start();
		}
	}
	
	private class TaskRunner extends Thread implements Runnable
	{
		Task task = null;
		TaskQueue queue = null;
		TaskRunner(Task task, TaskQueue queue)
		{
			this.task = task;
			this.queue = queue;
		}
		
		@Override
		public void run()
		{
			task.startup();
			task.execute();
			task.shutdown();
			queue.taskFinished(this);
		}
	}
}
