// Source : https://leetcode.com/problems/arranging-coins/
// Author : Kyon Huang
// Date   : 2017-09-23

// 第一思路，非最优解法

/**
 * @param {number} n
 * @return {number}
 */
var getRow = function(i) {
    return (1+i)*i/2;
}

var arrangeCoins = function(n) {
    let i = 0;
    while(getRow(i+1) <= n){
        i++;
    }
    return i;
};

