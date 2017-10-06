// Source : https://leetcode.com/problems/power-of-two/
// Author : Kyon Huang
// Date   : 2017-10-06

class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n-1)) == 0);
    }
}