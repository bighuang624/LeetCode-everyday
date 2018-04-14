// Source : https://leetcode.com/problems/valid-perfect-square/
// Author : Kyon Huang
// Date   : 2018-04-14

class Solution {
    public boolean isPerfectSquare(int num) {
        long i = num;
        while(i * i > num) 
            i = (i + num / i) >>> 1;
        return i * i == num;
    }
}