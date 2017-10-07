// Source : https://leetcode.com/problems/ransom-note/
// Author : Kyon Huang
// Date   : 2017-10-07

// 第一思路，非最佳方案

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha = new int[26];
        for(char c: magazine.toCharArray()) {
            alpha[c - 'a']++;
        }
        
        for(char c: ransomNote.toCharArray()) {
            alpha[c - 'a']--;
        }
        
        for(int i: alpha) {
            if(i < 0)
                return false;
        }
        
        return true;
    }
}