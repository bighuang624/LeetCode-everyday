// Source : https://leetcode.com/problems/island-perimeter/
// Author : Kyon Huang
// Date   : 2017-12-18

class Solution {
    public int islandPerimeter(int[][] grid) {
        int lands = 0;
        int neighbor = 0;
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[0].length; j++)
                if(grid[i][j] == 1) {
                    lands++;
                    if(j < grid[0].length-1 && grid[i][j+1] == 1)
                        neighbor++;
                    if(i < grid.length-1 && grid[i+1][j] == 1)
                        neighbor++;
                }     
        
        return 4 * lands - 2 * neighbor;
    }
}