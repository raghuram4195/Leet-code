class Solution {
    public boolean isAnagram(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        if(lens!=lent)
            return false;
        
        HashMap<Character,Integer> hms = new HashMap<>();
        HashMap<Character,Integer> hmt = new HashMap<>();
        for(int i=0;i<lens;i++)
        {
            char c = s.charAt(i);
            if(hms.containsKey(c))
            {
                int temp = hms.get(c) + 1;
                hms.put(c,temp);
            }
            else
                hms.put(c,1);
            
            c = t.charAt(i);
            if(hmt.containsKey(c))
            {
                int temp = hmt.get(c) + 1;
                hmt.put(c,temp);
            }
            else
                hmt.put(c,1);
        }
        if(hms.equals(hmt))
            return true;
        else
            return false;
    }
}