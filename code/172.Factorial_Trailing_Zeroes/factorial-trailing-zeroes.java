// Source : https://leetcode.com/problems/factorial-trailing-zeroes/
// Author : Kyon Huang
// Date   : 2018-01-14

class Solution {
    public int trailingZeroes(int n) {
        int result = 0;
        while(n >= 5) {
            n /= 5;
            result += n;
        }
        return result;
    }
}