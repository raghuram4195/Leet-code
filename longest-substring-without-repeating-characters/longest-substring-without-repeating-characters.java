class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character,Integer> st = new HashMap<>();
        int res = 0;
        int start = 0;
        int last = 0;
        for(int i=0;i<n;i++)
        {
            if(st.containsKey(s.charAt(i)))
            {
                int temp = last - start + 1;
                if(temp>res)
                    res = temp;
                i = st.get(s.charAt(i));
                
                
                start = i+1;
                last  = i+1;
                st.clear();
                // st.put(s.charAt(i+1),i+1);
            }
            else
            {
                st.put(s.charAt(i),i);
                last = i;
                
            }
            //System.out.println(start + "hh" + last + "hh" + i);
                             int temp = last - start + 1;
                if(temp>res)
                    res = temp;   
        }
        return res;
    }
}