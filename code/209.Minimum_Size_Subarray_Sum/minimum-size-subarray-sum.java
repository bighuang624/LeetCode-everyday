// Source : https://leetcode.com/problems/minimum-size-subarray-sum/
// Author : Kyon Huang
// Date   : 2018-08-14

// 非最佳解法

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int i = 0, j = 0, sum = 0, res = Integer.MAX_VALUE;
        while(i < nums.length) {
            sum += nums[i++];
            
            while(sum >= s) {
                res = Math.min(res, i-j);
                sum -= nums[j++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
      
}
