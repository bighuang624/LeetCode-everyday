// Source : https://leetcode.com/problems/longest-continuous-increasing-subsequence/
// Author : Kyon Huang
// Date   : 2018-02-18

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            int len = 1;
            while(i < nums.length-1 && nums[i] < nums[i+1]) {
                len++;
                i++;
            }
            result = Math.max(result, len);
        }
        return result;
    }
}