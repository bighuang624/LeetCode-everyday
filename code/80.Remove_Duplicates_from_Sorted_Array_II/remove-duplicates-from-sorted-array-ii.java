// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Author : Kyon Huang
// Date   : 2018-08-02

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int num : nums)
            if(i < 2 || num > nums[i-2])
                nums[i++] = num;
        return i;
    }
}