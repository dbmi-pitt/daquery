package edu.pitt.dbmi.daquery.dev;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.queue.AbstractTask;
import edu.pitt.dbmi.daquery.queue.QueueManager;
import edu.pitt.dbmi.daquery.queue.Task;
import edu.pitt.dbmi.daquery.queue.TaskQueue;

public class TaskQueueTest
{
	private static final String QUEUE_NAME = "my-queue";
	
	public static void main(String [] args) throws Exception
	{
		TaskQueue queue = QueueManager.getNamedQueue(QUEUE_NAME);
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		runTasks(1, 10, queue);
		Thread.sleep(60*1000);
		System.out.println("---------Middle queue length: " + queue.queueLength());
		runTasks(11, 20, queue);
		while(queue.queueLength() > 0)
			Thread.sleep(2000);
		System.exit(0);
	}
	private static void runTasks(int startN, int stopN, TaskQueue queue)
	{
		for(int n = startN; n <= stopN; n++)
		{
			loadTask(n, queue);
		}
	}
	
	private static Task loadTask(int ident, TaskQueue queue)
	{
		MyTask task = new MyTask(ident);
		try{queue.addTask(task);}
		catch(DaqueryException ex)
		{
			System.err.println("Failed to load task " + ident + "\n" + ex.getMessage());
			ex.printStackTrace();				
		}
		return(task);
	}
	private static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss:SSS");
	static class MyTask extends AbstractTask
	{
		
		int id;
		public MyTask(int id)
		{
			this.id = id;
			setQueueId(Integer.toString(id));
		}

		@Override
		public int getProgress() {
			return -1;
		}

		private String now()
		{
			return(timeFormat.format(new Date()));
		}
		
		private void wasteTime(int seconds)
		{
			try{Thread.sleep(seconds * 1000);}
			catch(Throwable t)
			{
				System.err.println("Task " + id + " failed during sleep.");
				t.printStackTrace();
			}
		}
		
		@Override
		public void execute() {
			
			System.out.println(now() + ": Task " + id + " executing");
			int timeToWaste = 21 - id;
			if(id == 20) timeToWaste = 60;
			wasteTime(timeToWaste);
			
		}
		
		@Override
		public void startup() {
			System.out.println(now() + ": Task " + id + " started, queue length " + QueueManager.getNamedQueue(QUEUE_NAME).queueLength());
		}
		
		@Override
		public void shutdown()
		{
			System.out.println(now() + ": Task " + id + " finished");
		}
		
		
	}
}
