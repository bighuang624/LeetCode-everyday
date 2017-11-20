// Source : https://leetcode.com/problems/number-of-segments-in-a-string/
// Author : Kyon Huang
// Date   : 2017-11-20

/**
 * @param {string} s
 * @return {number}
 */
var countSegments = function(s) {
    if(s.trim().length === 0)    // 除去""、" "
        return 0;
    let arr = s.trim().split(/\s+/);
    return arr.length;
};
