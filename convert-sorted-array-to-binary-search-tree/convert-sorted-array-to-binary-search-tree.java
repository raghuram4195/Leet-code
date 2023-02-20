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
    static TreeNode root;
    public static TreeNode cc(int[] nums, int start, int end)
    {
        if(start>end)
            return null;
        TreeNode node = new TreeNode();
        int mid = (start + end)/2;
        node.val = nums[mid];
        node.left = cc(nums,start,mid-1);
        node.right = cc(nums,mid+1,end);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode res = cc(nums,0,nums.length-1);
        return res;
    }
}