class Solution {
    
    /* 
    1 2 2 3 4 4 5 5 
    c=ar[0]
    for(1,l-1)
    {
    if(c==ar[i])
        remove(i);
    }
    */
    
    public static void remove(int[] nums, int i,int res)
    {
        for(int k=i;k<nums.length-1-res;k++)
        {
          //  System.out.println("remove fun i  hhhhhh"+nums[i]+" nums.length"+(nums.length-1));
            //System.out.println("remove fun i+1 "+nums[i+1]);
            nums[k] = nums[k+1];
              //          System.out.println("remove fun i "+nums[i]);
            //System.out.println("remove fun i+1 "+nums[i+1]);
        }
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return  0;
        int check = nums[0];
        int res =0;
        int i=0;
for(i=1;i<nums.length-res;i++)
{
    if(check==nums[i])
    {
     //   System.out.println(nums[i]);
        remove(nums,i,res);
        res++;
        i--;
    }
    else
    {
        check = nums[i];
    }
}
        return i;
    }
}