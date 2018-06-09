// Source : https://leetcode.com/problems/magic-squares-in-grid/
// Author : Kyon Huang
// Date   : 2018-06-09

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length-2; i++)
            for(int j = 0; j < grid[0].length-2; j++)
                if(isMagicSquare(grid, j, i))
                    result++;
        return result;
    }
    
    private boolean isMagicSquare(int[][] grid, int y, int x) {
        for(int i = x; i < x+3; i++)
            for(int j = y; j < y+3; j++)
                if(grid[i][j] > 9 || grid[i][j] < 0 || ((i != x+1 || j != y+1) && grid[i][j] == 5))
                    return false;
        if(grid[x+1][y+1] != 5)
            return false;
        if(grid[x][y] + grid[x][y+1] + grid[x][y+2] != 15 || grid[x+1][y] + grid[x+1][y+2] != 10 || grid[x+2][y] + grid[x+2][y+1] + grid[x+2][y+2] != 15)
            return false;
        if(grid[x][y] + grid[x+1][y] + grid[x+2][y] != 15 || grid[x][y+1] + grid[x+2][y+1] != 10 || grid[x][y+2] + grid[x+1][y+2] + grid[x+2][y+2] != 15)
            return false;
        if(grid[x][y] + grid[x+2][y+2] != 10 || grid[x+2][y] + grid[x][y+2] != 10)
            return false;
        return true;
    }
}