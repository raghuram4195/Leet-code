class Solution {
    public int hammingDistance(int x, int y) {
        String str1 = Integer.toBinaryString(x);
        String str2 = Integer.toBinaryString(y);
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 >= len2)
        {
            str2 = String.format("%"+(len1)+"S",str2).replace(' ','0');
        }
        else
        {
            str1 = String.format("%"+(len2)+"S",str1).replace(' ','0');
        }
        len1 = str1.length();
         len2 = str2.length();
        int res =0;
        for(int i=0;i<len1;i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                res++;
            }
        }
        return res;
        
        
    }
}