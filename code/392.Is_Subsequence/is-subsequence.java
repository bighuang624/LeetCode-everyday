// Source : https://leetcode.com/problems/is-subsequence/
// Author : Kyon Huang
// Date   : 2018-04-16

class Solution {
    public boolean isSubsequence(String s, String t) {
        int pre = -1;
        for(char ch : s.toCharArray()) {
            if(t.indexOf(ch, pre+1) <= pre)
                return false;
            pre = t.indexOf(ch, pre+1);
        }
        return true;
    }
}