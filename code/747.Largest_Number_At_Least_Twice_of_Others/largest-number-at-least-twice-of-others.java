// Source : https://leetcode.com/problems/largest-number-at-least-twice-of-others/
// Author : Kyon Huang
// Date   : 2018-01-13

class Solution {
    public int dominantIndex(int[] nums) {
        int biggest = nums[0];
        int second = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > biggest) {
                index = i;
                second = biggest;
                biggest = nums[i];
            }
            else if(biggest > nums[i] && nums[i] > second)
                second = nums[i];
        }
        return (biggest >= second * 2) ? index : -1;
    }
}