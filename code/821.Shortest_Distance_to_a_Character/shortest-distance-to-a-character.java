// Source : https://leetcode.com/problems/shortest-distance-to-a-character/
// Author : Kyon Huang
// Date   : 2018-05-07

class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        int preIndex = 0;
        for(; preIndex < S.length() && S.charAt(preIndex) != C; preIndex++)
            result[preIndex] = Integer.MAX_VALUE;
        for(int i = preIndex; i < S.length(); i++) {
            if(S.charAt(i) == C)
                preIndex = i;
            result[i] = i - preIndex;
        }
        for(int i = preIndex; i >= 0; i--) {
            if(S.charAt(i) == C)
                preIndex = i;
            result[i] = Math.min(result[i], preIndex - i);
        }
        return result;
    }
}