// Source : https://leetcode.com/problems/power-of-three/
// Author : Kyon Huang
// Date   : 2017-10-11

class Solution {
    public boolean isPowerOfThree(int n) {
        int Max3PowerInt = 1162261467; // 3^19, 3^20 = 3486784401 > MaxInt32
        int MaxInt32 = 2147483647; // 2^31 - 1
        if (n <= 0 || n > Max3PowerInt) return false;
        return Max3PowerInt % n == 0;
    }
};