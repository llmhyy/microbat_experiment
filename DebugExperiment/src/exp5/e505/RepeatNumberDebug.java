/**
 * 
 */
package exp5.e505;


/**
 * @author knightsong
 *
 */
public class RepeatNumberDebug {
	public static void main(String[] args) {
	//	testcase1
	//in：	[2, 3, 1, 0, 2, 5, 3]
	//	2 or 3 	
	RepeatNumber rn =new RepeatNumber();
	int[] a= {2, 3, 1, 0, 2, 5, 3} ;
	int res=rn.findRepeatNumber(a);
	if(res==2 || res==3) {
		System.out.print(true);
	}else {
		System.out.print(false);
	}
	}
}
