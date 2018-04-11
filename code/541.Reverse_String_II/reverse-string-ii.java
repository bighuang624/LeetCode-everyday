// Source : https://leetcode.com/problems/reverse-string-ii/
// Author : Kyon Huang
// Date   : 2018-04-11

class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(; i < s.length() - 2*k; i+= 2 * k) {
            sb.append(reverse(s.substring(i, i+k)));
            sb.append(s.substring(i+k, i+2*k));
        }

        if(i + k > s.length())
            sb.append(reverse(s.substring(i, s.length())));
        else {
            sb.append(reverse(s.substring(i, i+k)));
            sb.append(s.substring(i+k, s.length()));
        }
        
        return sb.toString();
    }
    
    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}