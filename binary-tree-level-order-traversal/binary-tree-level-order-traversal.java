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
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public static int getHeight(TreeNode root)
    {
        if(root == null)
            return 0;
        int left=0;
        int right=0;
        if(root.left!=null)
            left = getHeight(root.left);
        if(root.right!=null)
            right = getHeight(root.right);
        return ( (left>right)? left : right )+1;
    }
    public static void cust(TreeNode root, int level, List<Integer> list)
    {
        if(root==null)
            return;
        if(level == 0)
            list.add(root.val);
        if(level>0)
        {
            cust(root.left, level-1, list);
            cust(root.right, level-1, list);
        }
        
    }
    public static List gh(TreeNode root, int level, List<Integer> list)
    {
        cust(root,level,list);
        return list;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height  = getHeight(root);
        for(int i=0;i<height;i++)
        {
            res.add( gh(root,i,new ArrayList<>()) );
        }
        return res;
    }
}