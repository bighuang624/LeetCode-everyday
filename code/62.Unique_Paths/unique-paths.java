// Source : https://leetcode.com/problems/unique-paths/
// Author : Kyon Huang
// Date   : 2018-02-24

class Solution {
    public int uniquePaths(int m, int n) {
        int[] paths = new int[n];
        for(int i = 0; i < n; i++)
            paths[i] = 1;
        for(int t = 1; t < m; t++)
            for(int i = 1; i < n; i++)
                paths[i] += paths[i-1];
        return paths[n-1];
    }
}