// Source : https://leetcode.com/problems/unique-binary-search-trees/
// Author : Kyon Huang
// Date   : 2018-08-01

class Solution {
    public int numTrees(int n) {
        if(n == 0 || n == 1)
            return 1;
        int[] arr = new int[n+1];
        arr[1] = arr[0] = 1;
        for(int i = 2; i <= n; i++) 
            for(int j = 1; j <= i; j++)
                arr[i] += arr[j-1] * arr[i-j];
        return arr[n];
    }
}