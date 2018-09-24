// Source : https://leetcode.com/problems/flood-fill/
// Author : Kyon Huang
// Date   : 2018-09-24

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if(oldColor != newColor)
            DFS(image, sr, sc, oldColor, newColor);
        return image;
    }
    
    public void DFS(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if(sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length && image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            DFS(image, sr+1, sc, oldColor, newColor);
            DFS(image, sr-1, sc, oldColor, newColor);
            DFS(image, sr, sc+1, oldColor, newColor);
            DFS(image, sr, sc-1, oldColor, newColor);
        }
    }
}