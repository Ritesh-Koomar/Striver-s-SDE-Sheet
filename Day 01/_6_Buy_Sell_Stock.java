class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int i = 0;
        for(int j = i+1;j<prices.length;j++)
        {
            int d = prices[j] - prices[i];
            maxProf = Math.max(maxProf, d);
            if(d < 0)
            {
                i = j; 
            }
        }
        return maxProf;
    }
}
