/**
 * 
 */
package exp.concurrency.case1;

/**
 * @author knightsong
 *
 */
public class DiningPhilosophersDebug {
	public static void main(String[] args) {
		Fork fork = new Fork();
		new Philosopher("0", fork,2).start();
		new Philosopher("1", fork,2).start();
		new Philosopher("2", fork,2).start();
		new Philosopher("3", fork,2).start();
		new Philosopher("4", fork,2).start();
    }
}
