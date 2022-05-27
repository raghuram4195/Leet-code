class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        
        int n = s.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = mp.get(s.charAt(i));
        }
        int res = 0;
        int temp=0;
        for(int i=n-1;i>=0;i--)
        {
            if(i>0&&arr[i]>arr[i-1])
            {
                res = res + arr[i] - arr[i-1];
                i--;
            }
            else
            {
                res = res + arr[i];
            }
        }
        return res;
    }
}