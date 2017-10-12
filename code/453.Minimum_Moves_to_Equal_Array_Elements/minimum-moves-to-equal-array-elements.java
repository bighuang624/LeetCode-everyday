// Source : https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
// Author : Kyon Huang
// Date   : 2017-10-12

class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int i: nums) {
            min = Math.min(i, min);
        }
        int times = 0;
        for(int i: nums) {
            times += i - min;
        }
        return times;
    }
}