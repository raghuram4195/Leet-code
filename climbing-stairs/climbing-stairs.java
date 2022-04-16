class Solution {
    
    public int feb(int n,int[] arr)
    {
        if(n<=3)
            return n;
        else if(arr[n-1]!=0)
        {
            return arr[n-1];
        }
        else{
                    int temp = feb(n-1,arr) + feb(n-2,arr);
                    arr[n-1] = temp;
            return temp;
        }
        
   
        
        
    }
    public int climbStairs(int n) {
         int[] arr = new int[n];
        arr[0] = 0;
        
        return feb(n,arr);
    }
}