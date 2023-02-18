/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public static boolean cust(TreeNode left, TreeNode right)
    {
        if(left==null && right==null)
            return true;
        if((left==null && right!=null) || (left!=null && right == null))
            return false;
        if(left.val!=right.val)
            return false;
        return cust(left.right,right.left) && cust(left.left,right.right);
        
    }
    public boolean isSymmetric(TreeNode root) {


        return cust(root.left,root.right);
    }
}