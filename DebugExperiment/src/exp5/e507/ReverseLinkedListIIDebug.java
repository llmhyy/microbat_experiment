/**
 * exp5.e507.ReverseLinkedListIIDebug
 */
package exp5.e507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author knightsong
 *
 */
public class ReverseLinkedListIIDebug {
	public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
      
            ListNode head = stringToListNode("[1,2,3,4,5]");
            ListNode ret = new ReverseLinkedListII().reverseBetween(head, 2, 4); 
            String out = listNodeToString(ret);          
            System.out.println(out.equals("[1, 4, 3, 2, 5]"));
            
            ListNode head1 = stringToListNode("[3,5]");
            ListNode ret1 = new ReverseLinkedListII().reverseBetween(head1, 1, 2); 
            String out1 = listNodeToString(ret1);          
            System.out.println(out1.equals("[5, 3]"));
        
    }
}
