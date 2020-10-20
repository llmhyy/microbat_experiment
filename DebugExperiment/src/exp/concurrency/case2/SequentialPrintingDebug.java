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
        SequentialPrinting printABC = new SequentialPrinting(1);
        new Thread(printABC::printA).start();
        new Thread(printABC::printB).start();
        new Thread(printABC::printC).start();
    }
}
