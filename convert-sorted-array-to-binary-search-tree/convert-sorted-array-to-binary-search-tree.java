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
    public static TreeNode getNode(int[] nums, int start, int end)
    {
        if(start > end)
            return null;
        int mid = start + end;
        mid = mid / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = getNode(nums,start,mid-1);
        node.right = getNode(nums,mid+1,end);
        
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return getNode(nums,0,nums.length-1);
    }
}