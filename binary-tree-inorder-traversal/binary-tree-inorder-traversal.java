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
     static List<Integer> res = new ArrayList<Integer>();
    public static void fun(TreeNode root)
    {
        
        if(root==null)
            return;
        
        fun(root.left);
        res.add(root.val);
        fun(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        res.clear();
        fun(root);
        return res;
    }
}