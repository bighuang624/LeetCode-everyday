// Source : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Author : Kyon Huang
// Date   : 2017-12-27

// 第一思路，非最佳解法

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int sum = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > min) {
                sum += prices[i] - min;
                min = prices[i];
            }
            else if(prices[i] < min)
                min = prices[i];
        }
        return sum;
    }
}