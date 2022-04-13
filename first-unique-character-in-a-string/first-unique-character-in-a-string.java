class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(hm.containsKey(c))
            {
                int temp = hm.get(c) + 1;
                hm.put(c,temp);
            }
            else
                hm.put(c,1);
        }
        for(char c: hm.keySet())
        {
            if(hm.get(c)==1)
            {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}