/**
 * 
 */
package exp5.e501;

import java.util.Stack;

/**
 * @author knightsong
 * Sword Point Offer 09. Use two stacks to implement queues
 */
public class CQueue {
	Stack<Integer> stack1;
	Stack<Integer> stack2;
	int size;
	public CQueue() {
		this.stack1=new Stack<>();
		this.stack2=new Stack<>();
		this.size=0;
	}
	
	public void appendTail(int value) {
		stack1.push(value);
		size++;
	}
	
	public int deleteHead() {
		/**@FC
		 * missing code 
		 * if(size==0) return -1;
		 */		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		size--;
		return stack2.pop();
	} 
}
