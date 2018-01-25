// Source : https://leetcode.com/problems/longest-uncommon-subsequence-i/
// Author : Kyon Huang
// Date   : 2018-01-25

class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}