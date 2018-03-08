// Source : https://leetcode.com/problems/search-for-a-range/
// Author : Kyon Huang
// Date   : 2018-03-08

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = binaryFind(nums, target);
        int[] result = new int[]{-1, -1};
        if(start == nums.length || nums[start] != target)
            return result;
        
        int end = binaryFind(nums, target+1)-1;
        result[0] = start;
        result[1] = end;
        return result;
    }
    
    private int binaryFind(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while(start < end) {
            int middle = (end - start) / 2 + start;
            if(nums[middle] < target)
                start = middle + 1;
            else
                end = middle;
        }
        return start;
    }
}