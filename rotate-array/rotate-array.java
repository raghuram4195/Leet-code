class Solution {
    public void rotate(int[] nums, int k) {
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           System.out.println("i is "+i+" ff is "+ (nums.length + k + i)%nums.length);
            res[(nums.length + k + i)%nums.length] = nums[i];
            
        }
        for(int i=0;i<nums.length;i++)
            nums[i] = res[i];
        
        
        
        
    }
}