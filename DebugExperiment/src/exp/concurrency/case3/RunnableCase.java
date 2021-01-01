/**
 * 
 */
package exp.concurrency.case3;

/**
 * @author knightsong
 *
 */
public class RunnableCase implements Runnable {
	private String id;

	public RunnableCase(String id) {
		this.id=id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(id+"running");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
