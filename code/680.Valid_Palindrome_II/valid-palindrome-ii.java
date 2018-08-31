// Source : https://leetcode.com/problems/valid-palindrome-ii/
// Author : Kyon Huang
// Date   : 2018-08-31

class Solution {
    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length()-1, false);
    }
    
    private boolean validPalindrome(String s, int start, int end, boolean hasDelete) {
        while(start <= end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }
            else if(hasDelete)
                return false;
            else 
                return validPalindrome(s, start+1, end, true) || validPalindrome(s, start, end-1, true);
        }
        return true;
    }
}