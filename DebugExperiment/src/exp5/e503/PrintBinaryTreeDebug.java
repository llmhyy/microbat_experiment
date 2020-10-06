/**
 * 
 */
package exp5.e503;


/**
 * @author knightsong
 *
 */
public class PrintBinaryTreeDebug {
	public static void main(String[] args) {
		PrintBinaryTree pTree=new PrintBinaryTree();
//testcase1 
//in:
//	    3
//	    / \
//	   9  20
//	     /  \
//	    15   7
//out: [3,9,20,15,7]
		TreeNode tb=new TreeNode(3);
		tb.left=new TreeNode(9);
		tb.right=new TreeNode(20);
		tb.right.left=new TreeNode(15);
		tb.right.right=new TreeNode(7);
		int[] res=pTree.levelOrder(tb);
		int[] origin= {3,9,20,15,7};
		System.out.println(judge(res,origin));
//testcase2
//		in:[]
//		out:[]
		TreeNode tb1=null;
		int[] res1=pTree.levelOrder(tb1);
		int[] origin1=new int[0];
		System.out.println(judge(res1,origin1));
	}
	public static boolean judge(int[] res,int[] origin) {
		for(int i=0;i<res.length;i++) {
			if (res[i]!=origin[i]) {
				return false;
			}
		}
		return true;
	}
}
