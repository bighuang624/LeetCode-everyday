// Source : https://leetcode.com/problems/arithmetic-slices/
// Author : Kyon Huang
// Date   : 2018-01-26

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int cur = 0, result = 0;
        for(int i = 2; i < A.length; i++) {
            if(A[i-1] - A[i-2] == A[i] - A[i-1]) {
                cur++;
                result += cur;
            } else
                cur = 0;
        }
        return result;
    }
}