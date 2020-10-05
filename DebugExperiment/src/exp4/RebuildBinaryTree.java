/**
 * 
 */
package exp4;

import java.util.HashMap;

/**
 * @author knightsong
 * LeetCode Sword Point Offer 07. Rebuild Binary Tree
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 *
 */
public class RebuildBinaryTree {
	HashMap<Integer, Integer> inorderdexMap=new HashMap<>();
	int pre[];
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		for(int i=0;i<preorder.length;i++) {
			inorderdexMap.put(inorder[i], i);
		}
		this.pre=preorder;
		return recursive(0,0,pre.length-1);
	}
	
	public TreeNode recursive(int rootIndex,int leftIndex,int rightIndex) {
	if (leftIndex>rightIndex) {
		return null;
	}
		TreeNode root =new TreeNode(pre[rootIndex]);
		int idx=inorderdexMap.get(pre[rootIndex]);
		root.left=recursive(rootIndex+1, leftIndex, idx-1);
		/**@FC
		 * Array out of bounds in recursive convenience
		 * root.right=recursive(rootIndex+(idx-leftIndex)+1,idx+1,rightIndex);
		 */	
		root.right=recursive(rootIndex+2, idx+1, rightIndex);
		return root;
		
	}
}
