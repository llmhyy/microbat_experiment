/**
 * 
 */
package exp.concurrency.case3;

/**
 * @author knightsong
 * exp.concurrency.case3.Simple
 */
public class Simple {
	private static ThreadGroup group = null;
	public static void startThreadTasks() throws InterruptedException {
		RunnableCase rc1=new RunnableCase("thread1");
		Thread thread1 = new Thread(rc1);
		
		RunnableCase rc2=new RunnableCase("thread2");
		Thread thread2 = new Thread(rc2);
		/*
		 * step 1. The number of activated threads is doubled to prevent dynamic threads 
		 * from being generated during enumeration
		 * step 2. Get all threads under the root thread group, the actualSize returned 
		 * is the final number of threads
		 * step 3.Copy the valid value in slackThreads to atualThreads
		 */
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				 group = Thread.currentThread().getThreadGroup();
		        System.out.println("group name:"+group.getName());
		        
		        //step 1
		        int slackSize = group.activeCount() * 2;
		        Thread[] slackThreads = new Thread[slackSize];
		        //step 2
		        int actualSize = group.enumerate(slackThreads);
		        Thread[] atualThreads = new Thread[actualSize];	
		        //step 3
		        System.arraycopy(slackThreads, 0, atualThreads, 0, actualSize);
		        System.out.println("Threads size is " + atualThreads.length);
		        for (Thread thread : atualThreads) {
		            System.out.println("Thread name : " + thread.getName());
		        }
				
			}
		});
		thread1.start();
		thread2.start();		
		thread3.start();
	} 

}
