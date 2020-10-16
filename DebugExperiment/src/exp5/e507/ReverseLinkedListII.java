/**
 * 
 */
package exp5.e507;


/**
 * @author knightsong
 *
 */
public class ReverseLinkedListII {
//	public ListNode reverseBetween(ListNode head, int m, int n) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode pre = dummy;
//        for(int i = 1; i < m; i++){
//            pre = pre.next;
//        }
//        head = pre.next;
//        for(int i = m; i < n; i++){
//            ListNode tmp = head.next;
//            head.next = tmp.next;
//            tmp.next = pre.next;
//            pre.next = tmp;
//        }
//        return dummy.next;
//    }
//public ListNode reverseBetween(ListNode head, int m, int n) {
//  ListNode dummy = new ListNode(0);
//  dummy.next = head;
//  ListNode pre = dummy;
//  for(int i = 1; i < m; i++){
//      pre = pre.next;
//  }
//  head = pre.next;
//  for(int i = m; i < n; i++){
//      ListNode tmp = head.next;
//      head.next = tmp.next;
//      tmp.next = head;
//      pre.next = tmp;
//  }
//  return dummy.next;
//}
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null) {
			return head;
		}
        ListNode pre=head;
		ListNode cur=null;
		for(int i=1;i<m-1;i++) {
			pre=pre.next;
		}
		cur=pre.next;
		for(int j=m;j<n;j++) {
			ListNode tmp=cur.next;
			cur.next=tmp.next;
			tmp.next=pre.next;
			pre.next=tmp;			
		}
		return head;

	}
}
