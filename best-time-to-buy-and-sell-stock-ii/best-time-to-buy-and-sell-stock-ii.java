class Solution {
    /*
    if inc buy first and sll at last
    if dec return 0;
    
    */
    public static boolean desc(int[] prices)
    {
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
                return false;
        }
        return true;
    }
    public static boolean inc(int[] prices)
    {
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]>prices[i+1])
                return false;
        }
        return true;   
    }
    public int maxProfit(int[] prices) {
        if(desc(prices))
            return 0;
        if(inc(prices))
            return prices[prices.length-1] - prices[0];
        int res=0;
        int buy=-1;
        int sold=0;
        for(int i=0;i<prices.length;i++)
        {
            if(( i==prices.length-1 && (buy!=-1) )||(buy!=-1&&prices[i]>buy&&prices[i]>prices[i+1] ))
            {
            res = res + (prices[i]-buy);
            buy = -1;
            }
            else if(buy==-1&&i<prices.length-1&&prices[i]<prices[i+1])
                buy = prices[i];
        }
        return res;
    }
}