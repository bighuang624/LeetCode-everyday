// Source : https://leetcode.com/problems/isomorphic-strings/
// Author : Kyon Huang
// Date   : 2018-05-17

class Solution {
    public boolean isIsomorphic(String s, String t) {
        for(int i = 0; i < s.length(); i++)
            if(value(i, s) != value(i, t)) 
                return false;
        return true;
    }
    
    private int value(int pos, String source) {
        char c = source.charAt(pos);
        int index = source.indexOf(c);
        if(index < pos) 
            return index;
        return pos;
    }
}