class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
      for(int i=0;i<nums.length-1;i++)
      {
          if(nums[i]==0&&nums[i+1]!=0)
          {
              
                  nums[i - count] = nums[i+1];
                  nums[i+1] = 0;
              
             
          }
          else if(nums[i]==0&&nums[i+1]==0)
          {
              count++;
          }
      }
        
    }
}