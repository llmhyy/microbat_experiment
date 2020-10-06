/**
 * 
 */
package exp5.e503;

import java.util.*;

/**
 * @author knightsong
 *Sword Finger Offer 32-I. Print binary tree from top to bottom
 */
public class PrintBinaryTree {
    public int[] levelOrder(TreeNode root) {
    	/**@FC
    	 * Missing code if(root==null) return new int[0];
    	 */      
        List<Integer> ans =new ArrayList<>();
        int[] res;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            TreeNode node = que.poll();
             ans.add(node.val);
             if(node.left!=null) que.add(node.left);
             if(node.right!=null) que.add(node.right);
        }
        res =new int[ans.size()];
        for(int i = 0;i < ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
