// Source : https://leetcode.com/problems/rectangle-area/
// Author : Kyon Huang
// Date   : 2018-08-28

class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        return getSingleArea(A, B, C, D) + getSingleArea(E, F, G, H) - getBothArea(A, B, C, D, E, F, G, H);
    }
    
    private int getSingleArea(int A, int B, int C, int D) {
        return (C - A) * (D - B);
    }
    
    private int getBothArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E), right = Math.max(Math.min(C,G), left);
        int bottom = Math.max(B, F), top = Math.max(Math.min(D,H), bottom);
        return (right - left) * (top - bottom);
    }
}