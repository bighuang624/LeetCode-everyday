// Source : https://leetcode.com/problems/repeated-string-match/
// Author : Kyon Huang
// Date   : 2017-10-16

// 第一思路，非最佳方案

class Solution {
    public int repeatedStringMatch(String A, String B) {
        int minTimes = B.length() / A.length();
        int maxTimes = (B.length() - 2) / A.length() + 2;
        for(int i = minTimes; i <= maxTimes; i++) {
            if(getnA(i, A).contains(B))
                return i;
        }
        return -1;
    }
    
    private String getnA(int i, String A) {
        String nA = "";
        for(int j = 0; j < i; j++) {
            nA += A;
        }
        return nA;
    }
}