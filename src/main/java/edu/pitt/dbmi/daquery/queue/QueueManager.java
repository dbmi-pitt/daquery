package edu.pitt.dbmi.daquery.queue;

import java.util.Hashtable;

import org.hibernate.internal.util.StringHelper;

public class QueueManager
{
	private static Hashtable<String, TaskQueue> queues = new Hashtable<String, TaskQueue>(); 
	public synchronized static TaskQueue getNamedQueue(String queueName)
	{
		if(StringHelper.isEmpty(queueName))
			return(null);

		String key = queueName.toLowerCase().trim();
		if(!queues.containsKey(key))
			queues.put(key, new TaskQueue());

		return(queues.get(key));
	}
	
}
