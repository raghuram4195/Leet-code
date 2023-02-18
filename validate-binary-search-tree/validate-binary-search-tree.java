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
    static ArrayList<Integer> lt = new ArrayList<>();
    public static void inorder(TreeNode root)
    {
        if(root == null)
            return;
        inorder(root.left);
        lt.add(root.val);
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        lt.clear();
        inorder(root);
        for(int i = 0; i < lt.size() - 1; i++)
        {
            if(lt.get(i) < lt.get(i+1))
            {
                continue;
            }
            else
                return false;
        }
        return true;
    }
}