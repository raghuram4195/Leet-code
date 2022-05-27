class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        int temp = n % 10;
        if(temp == 1 || temp == 3 || temp == 9 || temp == 7)
        {
            while(n!=0)
            {
                                if(n==1)
                    return true;
                if(n%3!=0)
                    return false;
                n = n /3;

            }
            return true;
        }
        else
        {
            return false;
        }
       
    }
}