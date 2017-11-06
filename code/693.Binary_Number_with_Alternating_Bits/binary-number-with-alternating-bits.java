// Source : https://leetcode.com/problems/binary-number-with-alternating-bits/
// Author : Kyon Huang
// Date   : 2017-11-06

class Solution {
    public boolean hasAlternatingBits(int n) {
        long k = 1;
        long j = n;
        while(k < j) 
            k = 2*k + (k % 2 == 0 ? 1 : 0);
        return k==j;
    }
}