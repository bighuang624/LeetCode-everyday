// Source : https://leetcode.com/problems/plus-one/
// Author : Kyon Huang
// Date   : 2018-01-22

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[len+1];
        result[0] = 1;
        for(int j = 1; j <= len; j++)
            result[j] = 0;
        return result;
    }
}