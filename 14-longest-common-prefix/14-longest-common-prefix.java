class Solution {
    public String longestCommonPrefix(String[] strs) {
       int min = Integer.MAX_VALUE;
        String res="";
        for(int i=0;i<strs.length;i++)
        {
            if(min>strs[i].length())
                min = strs[i].length();
        }
        if(min==0)
            return "";
        for(int i=0;i<min;i++)
        {
            char check = strs[0].charAt(i); 
            for(int j=0;j<strs.length;j++)
            {
                if(check==strs[j].charAt(i))
                    continue;
                else
                    return res;
            }
            res = res + String.valueOf(check);
        }
        return res;
            
    }
}