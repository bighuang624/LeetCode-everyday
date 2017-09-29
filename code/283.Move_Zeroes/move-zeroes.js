// Source : https://leetcode.com/problems/move-zeroes/
// Author : Kyon Huang
// Date   : 2017-09-29

// 第一思路，非最优解法

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let i = 0,
        j = 0;
    
    while(j !== nums.length - 1) {
        while(nums[i] !== 0 && i < nums.length - 1)
            i++;
        if(i === nums.length - 1)
           return;
        j = i + 1;
        while(nums[j] === 0 && j !== nums.length - 1)
            j++;
        nums[i] = nums[j];
        nums[j] = 0;
    }
};