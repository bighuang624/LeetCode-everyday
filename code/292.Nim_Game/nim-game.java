// Source : https://leetcode.com/problems/nim-game/
// Author : Kyon Huang
// Date   : 2017-10-03

class Solution {
    public boolean canWinNim(int n) {
        return n%4 == 1 || n%4 == 2 || n%4 == 3;
    }
}