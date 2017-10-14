// Source : https://leetcode.com/problems/ugly-number/
// Author : Kyon Huang
// Date   : 2017-10-14

class Solution {
    public boolean isUgly(int num) {
        if(num <= 0)
            return false;
        while(num % 2 == 0)
            num /= 2;
        while(num % 3 == 0)
            num /= 3;
        while(num % 5 == 0)
            num /= 5;
        return (num == 1);
    }
}