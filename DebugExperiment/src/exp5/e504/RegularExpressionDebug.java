/**
 * 
 */
package exp5.e504;


/**
 * @author knightsong
 *
 */
public class RegularExpressionDebug {
	public static void main(String[] args) {
		RegularExpression re =new RegularExpression();
//testcase1
//in:
//s = "aa"
//p = "a"
//out: false
		String s="aa"; 
		String p="a";
		System.out.println(re.isMatch(s, p)==false);
		//testcase2
		//in:
//			"aa"
//			"a*"
		//out true
			String s1="aa"; 
			String p1="a*";
			System.out.println(re.isMatch(s1, p1)==true);
	}

}
