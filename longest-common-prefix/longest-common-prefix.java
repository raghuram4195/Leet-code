class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String res = "";
        int min =Integer.MAX_VALUE;
        int index=0;
        
        for(int i=0;i<strs.length;i++)
        {
            if(min>strs[i].length())
            {
                min = strs[i].length();
                index = i;
                
            }
            
        }
        for(int i=0;i<min;i++)
        {
            char c = strs[index].charAt(i);
            for(int j=0;j<strs.length;j++)
            {
                if(c==strs[j].charAt(i))
                {
                    
                }
                else
                    return res;
            }
            res = res + String.valueOf(c);
        }
        return res;
    }
}