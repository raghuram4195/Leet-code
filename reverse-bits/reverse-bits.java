public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        str = String.format("%"+32+"S",str).replace(' ','0');
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        str = sb.toString();
        System.out.println(str);
        long res=0;
        for(int i=0;i<32;i++)
        {
            res = res + (long)(Integer.parseInt(String.valueOf(str.charAt(32 - i -1))) * Math.pow((long)2,i));
          System.out.println(res);
        }
        // if(str.charAt(31)=='1'){
        //     System.out.println("11111");
        //     return (int)res+1;
        // }
        // else
        return (int)res;
    }
}