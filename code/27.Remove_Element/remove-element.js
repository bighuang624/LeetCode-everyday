// Source : https://leetcode.com/problems/remove-element/
// Author : Kyon Huang
// Date   : 2017-09-22


/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let i = 0,
        j = 0,
        len = nums.length;
   
    while(j !== len) {
        if(nums[j] !== val) {
            nums[i++] = nums[j];
        }
        j++;
    }   
    
    return i;
};