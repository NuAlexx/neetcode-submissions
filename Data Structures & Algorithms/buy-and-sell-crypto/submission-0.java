class Solution {
    private int maxProfitOfTheStocks(int[] prices, int n){
        int currentProfit = 0, maxProfit = 0;
         int left = 0, right = 1;

            while(right < n){
                if(prices[right] > prices[left]){
                    currentProfit = prices[right] - prices[left];

                    if(currentProfit > maxProfit){
                        maxProfit = currentProfit;
                    }
                }else if(prices[left] > prices[right]){
                    left = right;
                }
                right++;
            }
         return maxProfit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;

        return maxProfitOfTheStocks(prices, n);
    }
}
