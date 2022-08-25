import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        List<Integer> lt = new ArrayList<>();
       
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                
            }
            else
            {
                lt.add(nums[i]);
                count++;
            }
        }
        System.out.println(lt);
        int[] kk = lt.stream().mapToInt(i -> i).toArray();
        for(int i=0;i<kk.length;i++)
        {
            nums[i]=kk[i];
        }
        return count;
    }
}