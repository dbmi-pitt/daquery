package edu.pitt.dbmi.daquery.queue;

import java.util.Hashtable;

import org.hibernate.internal.util.StringHelper;

import edu.pitt.dbmi.daquery.common.util.DaqueryException;

public class QueueManager
{
	private static Hashtable<String, TaskQueue> queues = new Hashtable<String, TaskQueue>(); 
	public synchronized static TaskQueue getNamedQueue(String queueName)
	{
		if(StringHelper.isEmpty(queueName))
			return(null);

		String key = keyValue(queueName);
		if(!queues.containsKey(key))
			queues.put(key, new TaskQueue(queueName));

		return(queues.get(key));
	}

/*	public synchronized static TaskQueue addQueue(String queueName, int maxRunLength) throws DaqueryException
	{
		if(StringHelper.isEmpty(queueName))
			throw new DaqueryException("Queue name must not be blank.");
		
		String key = keyValue(queueName);
		
		if(queues.containsKey(key))
			throw new DaqueryException("Task queue with name " + queueName + " already exists.");
	
		if(maxRunLength <= 0)
			throw new DaqueryException("Task queue max run size must be greter than zero.");
		
		TaskQueue q = new TaskQueue(queueName, maxRunLength);
		queues.put(key, q);
		return(q);
	} */

	public synchronized static boolean containsQueue(String queueName)
	{
		if(StringHelper.isEmpty(queueName)) return(false);
		return(queues.containsKey(keyValue(queueName)));
	}

	private static String keyValue(String val)
	{
		if(val == null) return(null);
		
		return(val.toLowerCase().trim());
	}
}
