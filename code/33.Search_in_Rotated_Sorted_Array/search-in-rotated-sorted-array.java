// Source : https://leetcode.com/problems/search-in-rotated-sorted-array/
// Author : Kyon Huang
// Date   : 2018-01-21

class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return -1;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) 
                return mid;

            if (nums[lo] <= nums[mid]) {
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return nums[lo] == target ? lo : -1;
    }
}