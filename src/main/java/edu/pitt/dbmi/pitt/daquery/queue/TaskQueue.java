package edu.pitt.dbmi.pitt.daquery.queue;

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
	private static List<Task> runningQueue = new ArrayList<Task>();
	
	public static synchronized void addTask(Task task) throws DaqueryException
	{
		if(task == null || task.getQueueId() == null) throw new DaqueryException("Trying to queue a null task or a task without a queue id");
		if(tasksById.containsKey(task.getQueueId())) throw new DaqueryException("Task " + task.getQueueId() + " is already queued or running.");
		tasksById.put(task.getQueueId(), task);
		waitingQueue.add(task);
		task.setStatus(TaskStatus.IN_QUEUE);
		runNext();
	}
	
	public static synchronized void taskFinished(String taskId)
	{
		Task task = tasksById.get(taskId);
		runningQueue.remove(task);
		task.setStatus(TaskStatus.FINISHED);
		tasksById.remove(taskId);
		runNext();
	}
	
	public static synchronized int queueLength()
	{
		return(tasksById.size());
	}
	//this method must remain private and can
	//only be called from synchronized methods in
	//this class, but cannot be synchronized itself
	//because it is called from sychronized methods
	private static void runNext()
	{
		if(runningQueue.size() < AppProperties.getTaskQueueMaxLength() && waitingQueue.size() > 0)
		{
			Task task = waitingQueue.poll();
			runningQueue.add(task);
			task.setStatus(TaskStatus.RUNNING);
			((Thread)task).start();
		}
	}
}
