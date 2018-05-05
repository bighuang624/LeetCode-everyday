// Source : https://leetcode.com/problems/range-addition-ii/
// Author : Kyon Huang
// Date   : 2018-05-05

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minHeight = m;
        int minWidth = n;
        for(int[] arr : ops) {
            minHeight = Math.min(minHeight, arr[0]);
            minWidth = Math.min(minWidth, arr[1]);
        }
        return minHeight * minWidth;
    }
}