// Source : https://leetcode.com/problems/missing-number/
// Author : Kyon Huang
// Date   : 2017-10-08

// 第一思路，非最佳方案

class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        boolean[] arr = new boolean[len+1];
        for(int i = 0; i < len; i++) {
            arr[nums[i]] = true;
        }
        for(int i = 0; i < len+1; i++) {
            if(!arr[i])
                return i;
        }
        return 0;
    }
}