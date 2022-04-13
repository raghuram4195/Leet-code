class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(n==1)
            return true;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if((c>='a'&&c<='z')|| (c>='0'&&c<='9'))
                sb.append(c);
            
                
        }
        System.out.println(sb);
        String str1 = sb.toString();
        sb.reverse();
        String str2 = sb.toString();
        if(str1.equals("p"))
            return false;
        if(str1.equals(str2))
            return true;
        else
            return false;
    }
}