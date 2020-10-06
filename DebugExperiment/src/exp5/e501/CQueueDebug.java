/**
 * 
 */
package exp5.e501;

/**
 * @author knightsong
 *
 */
public class CQueueDebug {

	/**
	 * Last_update knightsong Oct 6, 2020 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
//		testcase1
//		  in：
//	      ["CQueue","appendTail","deleteHead","deleteHead"]
//	      [[],[3],[],[]]
//		  out：[null,null,3,-1]
		String[] testcase1= {"CQueue","appendTail","deleteHead","deleteHead"};
		int[] data1= {0,3,0,0};
		String out1="nullnull3-1";
//		testcase2
//		in：
//		["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
//		[[],[],[5],[2],[],[]]
//		out：[null,-1,null,null,5,2]	
		String[] testcase2= {"CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"};
		int[] data2= {0,0,5,2,0,0};
		String out2="null-1nullnull52";
		System.out.println(op(testcase1, data1).equals(out1));
		System.out.println(op(testcase2, data2).equals(out2));		
	}
	public static String op(String[] testcase,int[] data) {
		CQueue cQueue=new CQueue();
		StringBuilder sb=new StringBuilder("null");
		int a=0;
		for(int i=1;i<testcase.length;i++) {
			if (testcase[i].equals("deleteHead")) {
			sb.append(cQueue.deleteHead());
			}else if(testcase[i].equals("appendTail")) {
				cQueue.appendTail(data[i]);
				sb.append("null");
			}
		}		
		return sb.toString();
	}

}
