/**
 * 
 */
package exp.concurrency.case2;


/**
 * @author knightsong
 *
 */
public class SequentialPrintingDebug {
	
    public static void main(String[] args) {
        final SequentialPrinting printABC = new SequentialPrinting(1);
        new Thread(new Runnable() {
			@Override
			public void run() {
				printABC.printA();
			}
        	
        }).start();
        
        new Thread(new Runnable() {
			@Override
			public void run() {
				printABC.printB();
			}
        	
        }).start();
        
        new Thread(new Runnable() {
			@Override
			public void run() {
				printABC.printB();
			}
        	
        }).start();
    }
}
