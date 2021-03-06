// Source : https://leetcode.com/problems/two-sum/
// Author : Kyon Huang
// Date   : 2017-09-16

// 第一思路，非最优解法

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for(let i = 0; i < nums.length; i++) 
        for(let j = i + 1; j < nums.length; j++)
            if(nums[i] + nums[j] === target)
                return [i, j]
};
