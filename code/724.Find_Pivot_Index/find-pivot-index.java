// Source : https://leetcode.com/problems/find-pivot-index/
// Author : Kyon Huang
// Date   : 2017-11-16

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for(int num : nums)
            sum += num;
        for(int i = 0, len = nums.length; i < len; i++) {
            if(leftSum * 2 + nums[i] == sum)
                return i;
            else
                leftSum += nums[i];
        }
        return -1;
    }
}