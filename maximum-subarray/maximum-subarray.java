class Solution {
    public int maxSubArray(int[] nums) {
        int cur =0;
        int p =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(cur<0)
                cur=0;
            cur = cur + nums[i];
            p = Math.max(p,cur);
        }
        return p;
    }
}