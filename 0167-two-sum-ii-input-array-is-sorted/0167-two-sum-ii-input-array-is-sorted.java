class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
       
        
        int[] res = new int[2];
//        for(i=0;i<nums.length-1;i++)
//         {
//            for(int j=i+1;j<nums.length;j++)
//            {
//                if(nums[i]+nums[j]==target)
//                {
//                    res[0]=i+1;
//                    res[1] = j+1;
//                    return res;
//                }
//                if(nums[i]+nums[j]>target)
//                    break;
//            }
            
//         }
        int left = 0;
        int right = nums.length - 1;
        while(left<right){
            int target2= nums[left] + nums[right];
            if(target==target2)
            {
                res[0]=left+1;
                res[1] = right+1;
                return res;
            }
            else if(target>target2)
            {
                left++;
            }
            else
                right--;
        }
        return res;
    }
}