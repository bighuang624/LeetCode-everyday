// Source : https://leetcode.com/problems/maximum-subarray/
// Author : Kyon Huang
// Date   : 2017-12-21

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        result[0] = nums[0];
        int max = nums[0];
        
        for(int i = 1; i < len; i++) {
            result[i] = (result[i-1] > 0) ? result[i-1] + nums[i] : nums[i];
            max = Math.max(result[i], max);
        }
        return max;
    }
}