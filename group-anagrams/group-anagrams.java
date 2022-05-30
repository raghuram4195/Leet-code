class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lt = new ArrayList<>();
        List<String> temp2;
        String[] strarr = new String[strs.length];
        int[] ck = new int[strs.length];
        for(int i=0;i<strs.length;i++)
        {
            char[] temp1 = new char[strs[i].length()];
            temp1 = strs[i].toCharArray();
            Arrays.sort(temp1);
            strarr[i] = new String(temp1);
        }
        for(int i=0;i<strs.length;i++)
        {
            temp2 = new ArrayList<>();
            if(ck[i]==4)
                continue;
            temp2.add(strs[i]);
            for(int j=i+1;j<strs.length;j++)
            {
                if(strarr[i].equals(strarr[j]) && ck[j]!=4)
                {
                    temp2.add(strs[j]);
                    ck[j] = 4;
                }
            }
            lt.add(temp2);
        }
        return lt;
    }
}