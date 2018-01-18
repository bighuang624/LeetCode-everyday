// Source : https://leetcode.com/problems/palindrome-number/
// Author : Kyon Huang
// Date   : 2018-01-18

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int y = x;
        int reverse = 0;
        while(y != 0) {
            reverse = reverse * 10 + y % 10;
            y /= 10;
        }
        return reverse == x;
    }
}