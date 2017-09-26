// Source : https://leetcode.com/problems/length-of-last-word/
// Author : Kyon Huang
// Date   : 2017-09-26

// 第一思路，非最优解法

/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    if(s == 0)  return 0;
    let arr = s.split(/\s+/);
    return (arr[arr.length-1].length === 0) ? arr[arr.length-2].length : arr[arr.length-1].length;
};