class Solution {
    public int reverse(int x) {
        int check =1;
        if(x>0)
            check=1;
        else
        {
            check=-1;
            x = x*-1;
        }
        long res=0;
        
        while(x>0)
        {
            int temp = x%10;
            res = res*10+temp;
            x=x/10;
        }
        if((res*check)<-2147483648 | (res*check)>2147483647)
            return 0;
        else
            return (int)res*check;
    }
}