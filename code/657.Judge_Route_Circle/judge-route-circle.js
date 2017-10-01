// Source : https://leetcode.com/problems/judge-route-circle/
// Author : Kyon Huang
// Date   : 2017-10-01

/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let x = 0,
        y = 0;
    moves.split('').forEach(function(elem) {
        switch(elem) {
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            case 'U':
                y++;
                break;
            case 'D':
                y--;
                break;
        }
    });
            
    if(x === 0 && y === 0)
        return true;
    return false;
};
