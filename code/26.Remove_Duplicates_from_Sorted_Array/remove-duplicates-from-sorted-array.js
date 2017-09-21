// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Author : Kyon Huang
// Date   : 2017-09-21

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if(nums.length !== 0) {
        let i = 0,
            j = 0,
            len = nums.length;
            
        while(j !== len - 1) {
            if(nums[i] !== nums[++j]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
    return 0;
};