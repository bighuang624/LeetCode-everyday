// Source : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Author : Kyon Huang
// Date   : 2017-10-08

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int maxPro = 0;
        int minPrice = prices[0];
        for(int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        
        return maxPro;
    }
}