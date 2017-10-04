// Source : https://leetcode.com/problems/power-of-four/
// Author : Kyon Huang
// Date   : 2017-10-04

// 第一思路，非最佳解法

class Solution {
    
    public int getPower(int j, int i) {
        long result = 1;
        while(i != 0) {
            result *= j;
            i--;
        }
        return (int)result;
    }

    public boolean isPowerOfFour(int num) {
        for(int i = 0; i < 16; i++) {
            if (getPower(4, i) == num) 
                return true;
        }
        return false;
    }
}