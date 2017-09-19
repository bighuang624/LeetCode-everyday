// Source : https://leetcode.com/problems/single-element-in-a-sorted-array/
// Author : Kyon Huang
// Date   : 2017-09-18

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length,
            start = 0,
            end = len / 2;
        
        while(start < end) {
            int mid = (start + end) / 2;
            if(nums[2 * mid] != nums[2 * mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        return nums[2 * start];
    }
}