class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 0; 
        int buy = 0;
        int sell = 1;
        int profit = 0;
        while(sell < prices.length){
            if(prices[buy] < prices[sell] ){
                if(prices[sell] - prices[buy] > profit){
                    profit = prices[sell] - prices[buy];
                }
            }
            else{
                buy = sell;
            }
            sell++;
        }
        return profit;
    }
}
