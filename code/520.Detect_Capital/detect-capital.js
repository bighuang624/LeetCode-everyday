// Source : https://leetcode.com/problems/detect-capital/
// Author : Kyon Huang
// Date   : 2017-09-30

// 第一思路，非最优解法

/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {
    if(word === word.toUpperCase() || word === word.toLowerCase() || (word[0] === word[0].toUpperCase() && word.slice(1) === word.slice(1).toLowerCase()))     return true;
    return false;        
};