// Source : https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
// Author : Kyon Huang
// Date   : 2018-01-08

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int steps = 0;
        int i = 0;
        while(i < nums.length/2) {
            steps += (nums[nums.length-1-i] - nums[i]);
            i++;
        }
        return steps;
    }
}