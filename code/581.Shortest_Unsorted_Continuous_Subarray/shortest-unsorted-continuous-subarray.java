// Source : https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
// Author : Kyon Huang
// Date   : 2018-01-02

public int findUnsortedSubarray(int[] A) {
    int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
    for (int i = 1; i < n; i++) {
      max = Math.max(max, A[i]);
      min = Math.min(min, A[n-1-i]);
      if (A[i] < max) end = i;
      if (A[n-1-i] > min) beg = n-1-i;
    }
    return end - beg + 1;
}