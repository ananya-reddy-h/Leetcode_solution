class Solution {
    public int maxProfit(int[] prices) {
        int profit1=0;
        int buy= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
      if (buy<prices[i]){
        int profit= prices[i]-buy;
        profit1=Math.max(profit1,profit);
      }
      else{
        buy=prices[i];
      }  
    }
    return profit1;
    }
}