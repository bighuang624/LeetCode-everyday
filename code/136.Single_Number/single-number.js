// Source : https://leetcode.com/problems/single-number/
// Author : Kyon Huang
// Date   : 2017-09-28

/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let result = 0,
        len = nums.length;
    
    for(let i = 0; i < len; i++) {
        result ^= nums[i];
    }
    
    return result;
};
