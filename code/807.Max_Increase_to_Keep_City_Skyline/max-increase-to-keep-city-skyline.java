// Source : https://leetcode.com/problems/max-increase-to-keep-city-skyline/
// Author : Kyon Huang
// Date   : 2018-04-18

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[][] limit = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < grid[0].length; j++) 
                max = Math.max(max, grid[i][j]);
            for(int j = 0; j < grid[0].length; j++) 
                limit[i][j] = max;
        }
        for(int i = 0; i < grid[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < grid.length; j++) 
                max = Math.max(max, grid[j][i]);
            for(int j = 0; j < grid.length; j++) 
                limit[j][i] = Math.min(max, limit[j][i]);
        }
        int result = 0;
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[0].length; j++) 
                result += (limit[i][j] - grid[i][j]);
        return result;
    }
}