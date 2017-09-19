// Source : https://leetcode.com/problems/search-insert-position/
// Author : Kyon Huang
// Date   : 2017-09-17

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}