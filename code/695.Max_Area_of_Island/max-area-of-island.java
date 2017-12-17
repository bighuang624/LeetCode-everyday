// Source : https://leetcode.com/problems/max-area-of-island/
// Author : Kyon Huang
// Date   : 2017-12-17

class Solution {
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[i].length; j++)
                if(grid[i][j] > 0)
                    maxArea = Math.max(maxArea, cal(grid, i, j));
        return maxArea;
    }
    
    private int cal(int[][] grid, int i, int j) {
        if(grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + (i>0 ? cal(grid, i-1, j) : 0) + (i<grid.length-1 ? cal(grid, i+1, j) : 0) 
                + (j<grid[i].length-1 ? cal(grid, i, j+1) : 0) + (j>0 ? cal(grid, i, j-1) : 0);
        }
        return 0;
    }
}