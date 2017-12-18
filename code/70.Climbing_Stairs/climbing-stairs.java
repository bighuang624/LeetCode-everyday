// Source : https://leetcode.com/problems/climbing-stairs/
// Author : Kyon Huang
// Date   : 2017-12-18

class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        for(int i = 1; i < n+1; i++)
            fill(i, arr);
        return arr[n];
    }
    
    private void fill(int n, int[] arr) {
        if(n == 1)
            arr[n] = 1;
        else if(n == 2)
            arr[n] = 2;
        else
            arr[n] = arr[n-1] + arr[n-2];
    }
}