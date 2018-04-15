// Source : https://leetcode.com/problems/rotate-string/
// Author : Kyon Huang
// Date   : 2018-04-15

class Solution {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A+A).contains(B);
    }
}