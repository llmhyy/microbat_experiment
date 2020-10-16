/**
 * 
 */
package exp5.e506;

/**
 * @author knightsong
 *exp5.e506.SimplifyThePathDebug
 */
public class SimplifyThePathDebug {
	public static void main(String[] args) {
		SimplifyThePath sPath=new SimplifyThePath();
		//pass
		System.out.println(sPath.simplifyPath("/../").equals("/"));
		//exceptional result
		System.out.println(sPath.simplifyPath("/home/").equals("/home"));
	}
}
