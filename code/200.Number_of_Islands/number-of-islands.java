// Source : https://leetcode.com/problems/number-of-islands/
// Author : Kyon Huang
// Date   : 2018-04-24

class Solution {
    public int numIslands(char[][] grid) {
        int num = 0;
        for(int i = 0; i < grid.length; i++) 
            for(int j = 0; j < grid[0].length; j++) 
                if(grid[i][j] == '1') {
                    num++;
                    DFS(grid, i, j);
                }

        return num;
    }
    
    private void DFS(char[][] grid, int x, int y) {
        if(grid[x][y] == '1') {
            grid[x][y] = '0';
            if(x > 0)
                DFS(grid, x-1, y);
            if(y > 0)
                DFS(grid, x, y-1);
            if(y < grid[0].length-1)
                DFS(grid, x, y+1);
            if(x < grid.length-1)
                DFS(grid, x+1, y);
        }
    }
}