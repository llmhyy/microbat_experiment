/**
 * 
 */
package exp5.e506;

import java.util.Stack;

/**
 * @author knightsong
 *71. Simplify the path
 */
public class SimplifyThePath {
	
	 public String simplifyPath(String path) {
		 String[] items =path.split("/");
		 Stack<String> stack =new Stack<>();
		 for(int i=0;i<items.length;i++) {
			 if (items[i].equals("..") && stack.size()!=0) {
				stack.pop();
			} 
			 if (!items[i].equals("..") && !items[i].equals(".")) {
				stack.push(items[i]);
			}
		 }
		 StringBuilder sb=new StringBuilder();
		 for(int j=0;j<stack.size();j++) {
			 sb.append("/").append(stack.get(j));
		 }
		return stack.size()==0?"/":sb.toString();   
	    }
}
