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
    static String str="";
    public static String check(TreeNode root)
    {
        if(root==null){
            
            return str;
        }
        str = str + "(";
        str = str + String.valueOf(root.val);
        if(root.left==null && root.right!=null)
            str = str + "()";
        check(root.left);
        
        check(root.right);
        str = str + ")";
        return str.substring(1,str.length()-1);
    }
    public String tree2str(TreeNode root) {
        str="";
        String res = check(root);
        System.out.println(res);
        return res;
    }
}