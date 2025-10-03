class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int max=Integer.MIN_VALUE;
        int min=prices[0];
        for(int i:prices)
        {
            if(i<min)
                min=i;
            else
                max=Math.max(i-min,max);
        }
        return max;
    }
}