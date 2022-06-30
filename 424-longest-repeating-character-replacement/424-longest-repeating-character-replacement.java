class Solution {
    public int characterReplacement(String str, int k) {
        int start=0;
    int n=str.length();
    char[] arr = new char[n];
    int max=Integer.MIN_VALUE;
    int res =0;
    char kk =' ';
    arr = str.toCharArray();
    HashMap<Character,Integer> mp = new HashMap<>();
    int maxx=0;
    for(int i=0;i<n;i++)
    {
      if(mp.containsKey(arr[i]))
        mp.put(arr[i],mp.get(arr[i]) +1);
      else
        mp.put(arr[i],1);

      max = Math.max(max, mp.get(arr[i]));

      if(i-start+1 - max>k)
      {
        if(mp.get(arr[start])!=1)
          mp.put(arr[start],mp.get(arr[start] )-1);
        else
          mp.remove(arr[start]);

        start++;
      }
      res = Math.max(res,i-start+1);
    }

    return res;
    }
}