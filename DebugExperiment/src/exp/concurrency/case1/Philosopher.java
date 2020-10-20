/**
 * 
 */
package exp.concurrency.case1;

/**
 * @author knightsong
 *
 */

class Philosopher extends Thread {
	private String name;
	private Fork fork;
	private int num;

	public Philosopher(String name, Fork fork, int num) {
		super(name);
		this.name = name;
		this.fork = fork;
		this.num = num;
	}

	public void run() {
		int i = 0;
		while (i<num) {
			thinking();
			fork.takeFork();
			eating();
			fork.putFork();
			++i;
		}
	}

	public void eating() {
		System.out.println("I am Eating:" + name);
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void thinking() {
		System.out.println("I am Thinking:" + name);
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
