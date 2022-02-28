class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<String>();
        if(nums.length==0)
            return str;
int i=0;
        int j=0;
        for(i=0;i<nums.length;i++)
        {
            int k=i;
            for(k=i;k<nums.length-1;k++)
            {
                if(nums[k]+1!=nums[k+1])
                    break;
            }
            if(i!=k)
            {
                str.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[k]));
            }
            else if(i==k)
            {
                str.add(String.valueOf(nums[i]));
            }
            i=k;
        }
        return str;
    }
}