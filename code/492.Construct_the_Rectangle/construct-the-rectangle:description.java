// Source : https://leetcode.com/problems/construct-the-rectangle/description/
// Author : Kyon Huang
// Date   : 2017-11-18

class Solution {
    public int[] constructRectangle(int area) {
        int width = (int)Math.sqrt(area);
        while(area % width != 0)
            width--;
        int length = area / width;
        return new int[]{length, width};
    }
}