// Source : https://leetcode.com/problems/license-key-formatting/
// Author : Kyon Huang
// Date   : 2017-12-24

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String s = S.toUpperCase();
        int len = 0;
        for(char ch : s.toCharArray())
            if(ch != '-')
                len++;
        int k = len % K;
        if(k == 0)
            k = K;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch == '-')
                continue;
            if(k == 0) {
                sb.append("-");
                k = K;
            }
            sb.append(ch);
            k--;
        }
        return sb.toString();
    }
}