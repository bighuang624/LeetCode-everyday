// Source : https://leetcode.com/problems/reverse-string/
// Author : Kyon Huang
// Date   : 2017-11-03

class Solution {
    public String reverseString(String s) {
        char[] input = s.toCharArray();
        if(input.length == 0)
            return "";
        for(int i = 0, len = input.length; i < len/2; i++) {
            char temp = input[i];
            input[i] = input[len-1-i];
            input[len-1-i] = temp;
        }
        return String.valueOf(input);
    }
}