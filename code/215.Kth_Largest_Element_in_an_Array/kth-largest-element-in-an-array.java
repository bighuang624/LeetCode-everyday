// Source : https://leetcode.com/problems/kth-largest-element-in-an-array/
// Author : Kyon Huang
// Date   : 2018-04-27

// 第一思路，非最佳解法

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}