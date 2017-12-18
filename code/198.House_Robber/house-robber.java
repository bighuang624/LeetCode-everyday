// Source : https://leetcode.com/problems/house-robber/
// Author : Kyon Huang
// Date   : 2017-12-18

// 第一思路，非最佳方案

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] d = new int[n];
        if(n == 0)
            return 0;
        for(int i = 0; i < n; i++)
            fill(d, nums, i);
        return d[n-1];
    }
    
    private void fill(int[] d, int[] nums, int i) {
        if(i == 0)
            d[i] = nums[0];
        else if(i == 1)
            d[i] = Math.max(nums[0], nums[1]);
        else
            d[i] = Math.max(d[i-2]+nums[i], d[i-1]);
    }
}