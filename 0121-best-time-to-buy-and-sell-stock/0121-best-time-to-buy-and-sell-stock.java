class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int profit=0;
        int min=prices[0];
      for(int i=0;i<prices.length;i++){
        profit=prices[i]-min;
        maxprofit=Math.max(profit,maxprofit);
        min=Math.min(min,prices[i]);
        }
      
      return maxprofit;
    }
}