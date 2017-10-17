// Source : https://leetcode.com/problems/number-complement/
// Author : Kyon Huang
// Date   : 2017-10-17

class Solution {
    public int findComplement(int num) {
        int i = 0;
        int j = 0;
        
        while (i < num) {
            i += Math.pow(2, j);
            j++;
        }
        
        return i - num;
    }
}