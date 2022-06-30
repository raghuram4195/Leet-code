class Solution {
    public int longestOnes(int[] arr, int k) {
            // TODO: Write your code here
    int start =0;
    int res=0;
    int n = arr.length;
    int kk=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]==0)
        kk++;

      if(kk>k)
      {
        if(arr[start]==0)
          kk--;
        start++;
      }
      res = Math.max(res,i-start+1);
    }
    return res;
    }
}