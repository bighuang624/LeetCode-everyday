// Source : https://leetcode.com/problems/reshape-the-matrix/
// Author : Kyon Huang
// Date   : 2018-01-31

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int height = nums.length;
        int length = nums[0].length;
        if(r * c != height * length)
            return nums;
        int[][] result = new int[r][c];
        for(int i = 0; i < height * length; i++)
            result[i/c][i%c] = nums[i/length][i%length];
        return result;
    }
}