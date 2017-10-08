// Source : https://leetcode.com/problems/missing-number/
// Author : Kyon Huang
// Date   : 2017-10-08
 
/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let len = nums.length + 1;
    let result;
    for(let i = 0; i < len; i++) {
        result ^= i;
    }
    nums.forEach((num) => {
       result ^= num; 
    });
    return result;
}; 
