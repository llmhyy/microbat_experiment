/**
 * 
 */
package exp4;

/**
 * @author knightsong
 *
 */
public class RebuildBinaryTreeDebug {

	public static void main(String[] args) {
		//testcase1
		int[] pre = { 3, 9, 20, 15, 7 };
		int[] order = { 9, 3, 15, 20, 7 };
		RebuildBinaryTree bTree = new RebuildBinaryTree();
		TreeNode simpleTree= bTree.buildTree(pre, order);
		TreeNode originTree=new TreeNode(3);
		originTree.left=new TreeNode(9);
		originTree.right=new TreeNode(20);
		originTree.right.left=new TreeNode(15);
		originTree.right.right=new TreeNode(7);
		System.out.println(isSameTree(simpleTree,originTree));
//		testcase2
		int[] pre1 = { 1,2 };
		int[] order1 = { 1,2 };
		TreeNode simpleTree1= bTree.buildTree(pre1, order1);
		TreeNode originTree1=new TreeNode(1);
		originTree.left=new TreeNode(2);
		System.out.println(isSameTree(simpleTree1,originTree1));
		
	}

	// Judge two tree whether same
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
