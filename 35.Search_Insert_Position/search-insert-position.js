// Source : https://leetcode.com/problems/search-insert-position/
// Author : Kyon Huang
// Date   : 2017-09-17

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    var start = 0,
        end = nums.length - 1;
    
    while(start <= end) {
        let mid = (start + end) / 2;
        if(nums[mid] < target) {
             start = mid + 1;
        } 
        else if(nums[mid] > target){
            end = mid - 1;
        }
        else
            return mid;
    }

    return start
};