class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> lt = new HashSet<>();
        
         Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            
            int target = 0 - nums[i];
            // if(i!=0)
            // {
            //     if(nums[i]==nums[i-1])
            //         continue;
            // }

            int left = i+1;
            int right =nums.length-1;
            while(left<right)
            {
                int tts = nums[i]+nums[left]+nums[right];
                if(tts>0)
                    right--;
                else if(tts<0)
                    left++;
                
                else 
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    
                    lt.add(temp);
                    left++;
                    right--;
                }

            }
            
        }
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> kk:lt)
            res.add(kk);
        return res;
    }
}