class Solution {
    public int removeDuplicates(int[] arr) {
    
    if(arr.length==1)
      return 1;
    int start=arr[0];
    int check=0;
    int res=0;
    int n = arr.length;
        int k=1;
    // for(int i=1;i<n+1;i++)
    // {
    // i=k;
        int i=1;
        while(i<n)
        {
      if(arr[i-1]==arr[i])
      {
          for(int j=i;j<n-1;j++)
          {
              
              arr[j] = arr[j+1];
              
          }
          n--;
          // for(int kk: arr)
          //     System.out.print(kk + ",");
          // System.out.println(n + "nnnn");
          
      }
        else
            i++;
        
    }
    return n; 
    }
}