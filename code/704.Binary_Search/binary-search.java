// Source : https://leetcode.com/problems/binary-search/
// Author : Kyon Huang
// Date   : 2018-09-01

class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return -1;
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = (end - start) / 2 + start;
            if(nums[mid] < target) 
                start = mid+1;
            else if(nums[mid] > target)
                end = mid-1;
            else
                return mid;
        }
        return -1;
    }
}