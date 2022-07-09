class Solution {

    public List<Integer> findAnagrams(String str, String pattern) {
        List<Integer> lt = new ArrayList<Integer>();
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
            int start=0;
    int n = str.length();
    int k = pattern.length();
    for(int i=0;i<k;i++)
    {
        if(hm2.containsKey(pattern.charAt(i)))
            hm2.put(pattern.charAt(i),hm2.get(pattern.charAt(i))+1);
        else
            hm2.put(pattern.charAt(i),1); 
    }
   
    for(int i=0;i<n;i++)
    {
    
        if(hm.containsKey(str.charAt(i)))
            hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
        else
            hm.put(str.charAt(i),1);
        if(i==k-1&&hm.equals(hm2))
        {
            
          lt.add(start);  
        }
            
      if(i>=k)
      {
        if(hm.get(str.charAt(start))==1)
             hm.remove(str.charAt(start));
          else
             hm.put(str.charAt(start),hm.get(str.charAt(start))-1);
        start++;
        if(hm.equals(hm2))
        {
          lt.add(start);
        }

       

          
      }
    }
    return lt;
    }
}