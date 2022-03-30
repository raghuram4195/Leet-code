class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        List<Integer> lt =Arrays.stream(nums).boxed().collect(Collectors.toList()); 
        
        int[] res = new int[2];
       for(i=0;i<nums.length;i++)
        {
            int temp = target-nums[i];
            lt.set(i,-987);
            System.out.println();
            if(lt.contains(temp))
            {
                res[0] = i;
                
                res[1] = lt.indexOf(temp);
System.out.println(res[1]);
                    return res;
                
            }
            
        }
        return res;
    }
}