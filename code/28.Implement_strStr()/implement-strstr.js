// Source : https://leetcode.com/problems/implement-strstr/
// Author : Kyon Huang
// Date   : 2017-09-22

/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {    
    if(needle === '')  return 0;
    
    let i = 0, j = 0;
    
    while(j !== haystack.length) {
        if(needle[i] === haystack[j])  i++;
        else {
            j -= i;
            i = 0;
        }
        j++;
        if(i === needle.length)  return j - i;
    }
    
    return -1;
};