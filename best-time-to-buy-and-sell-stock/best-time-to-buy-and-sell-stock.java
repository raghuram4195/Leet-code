class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int minst = prices[0];
        int profit = Integer.MIN_VALUE;
        for(int i : prices)
        {
             profit = Math.max(profit,i - minst);
            minst = Math.min(i,minst);
           
        }
        return profit;
    }
}