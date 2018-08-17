// Source : https://leetcode.com/problems/guess-number-higher-or-lower-ii/
// Author : Kyon Huang
// Date   : 2018-08-17

class Solution {
    public int getMoneyAmount(int n) {
        int[][] table = new int[n+1][n+1];
        return DP(table, 1, n);
    }
    
    public int DP(int[][] table, int start, int end) {
        if(start >= end)
            return 0;
        if(table[start][end] != 0)
            return table[start][end];
        int res = Integer.MAX_VALUE;
        for(int i = start; i <= end; i++) {
            int sum = i + Math.max(DP(table, i+1, end), DP(table, start, i-1));
            res = Math.min(sum, res);
        }
        table[start][end] = res;
        return res;
    }
}