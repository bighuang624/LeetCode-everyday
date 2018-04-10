// Source : https://leetcode.com/problems/largest-triangle-area/
// Author : Kyon Huang
// Date   : 2018-04-10

class Solution {
    public double largestTriangleArea(int[][] p) {
        double res = 0;
        for (int[] i: p)
            for (int[] j: p)
                for (int[] k: p)
            res = Math.max(res, 0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1]- j[0] * i[1] - k[0] * j[1] - i[0] * k[1]));
        return res;
    }
}