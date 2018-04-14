// Source : https://leetcode.com/problems/number-of-1-bits/
// Author : Kyon Huang
// Date   : 2018-04-14

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        while(n != 0) {
            result += n & 1;
            n = n >>> 1;
        }
        return result;
    }
}