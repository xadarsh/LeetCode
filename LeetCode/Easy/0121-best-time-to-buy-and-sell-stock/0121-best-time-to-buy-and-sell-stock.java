class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int max_profit=0,buy=prices[0];
        for(int i=1;i<len;i++)
        {
            int current=prices[i]-buy;
            if(current<0)
            {
                buy=prices[i];
                //max_profit=0;
            }
            else
            {
                if(current>max_profit)
                    max_profit=current;

            }
        }
        return max_profit;
    }
}