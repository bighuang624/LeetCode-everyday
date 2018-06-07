// Source : https://leetcode.com/problems/longest-palindrome/
// Author : Kyon Huang
// Date   : 2018-06-07

class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[60];
        for(char ch : s.toCharArray())
            arr[ch - 'A']++;
        int result = 0;
        boolean hasOdd = false;
        for(int num : arr) {
            result += num;
            if(num % 2 == 1 && hasOdd)
                result--;
            if(num % 2 == 1)
                hasOdd = true;
        }
        return result;
    }
}