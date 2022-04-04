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
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> temp;
    public static int height(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int l = height(root.left);
        int r = height(root.right);
        return l>r ? l+1 : r+1;
    }
    public static void fun(TreeNode root,int l){
        if(root==null)
            return ;
        
        if(l==0)
            temp.add(root.val);
        if(l>0)
        {
        fun(root.left,l-1);
        fun(root.right,l-1);
        }
    }
        public static void fun2(TreeNode root,int l){
        if(root==null)
            return ;
        
        if(l==0)
            temp.add(root.val);
        if(l>0)
        {
        fun2(root.right,l-1);
        fun2(root.left,l-1);
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        res.clear();
       
        int h =  height(root);
        for(int i=0;i<h;i++)
        {
            temp=new ArrayList<Integer>();
            if(i%2==0)
            {
              fun(root,i);  
            }
            else
                fun2(root,i);
            

            
            res.add(temp);
        }
        return res;
    }
}