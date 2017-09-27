// Source : https://leetcode.com/problems/hamming-distance/
// Author : Kyon Huang
// Date   : 2017-09-27

// 第一思路，非最佳解法

class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y,
        result = 0,
        i = 32;
        while(z != 0) {
            
            if(Math.pow(2, i) <= z) {
                result++;
                z -= Math.pow(2, i);
            }
            i--;
        }
        return result;
    }
    
}