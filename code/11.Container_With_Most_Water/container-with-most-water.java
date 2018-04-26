// Source : https://leetcode.com/problems/container-with-most-water/
// Author : Kyon Huang
// Date   : 2018-04-26

class Solution {
    public int maxArea(int[] height) {
        int result = -1;
        int i = 0;
        int j = height.length-1;
        while(i < j) {
            if(height[i] < height[j])
                result = Math.max(result, height[i++] * (j-i));
            else
                result = Math.max(result, height[j--] * (j-i));
        }
        return result;
    }
}