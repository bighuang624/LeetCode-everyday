// Source : https://leetcode.com/problems/min-cost-climbing-stairs/
// Author : Kyon Huang
// Date   : 2017-12-20

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int m = 0, n = 0, k = 0;
        for(int i = 2; i <= len; i++) {
            k = Math.min(m+cost[i-2], n+cost[i-1]);
            m = n;
            n = k;
        }
        return k;
    }
}