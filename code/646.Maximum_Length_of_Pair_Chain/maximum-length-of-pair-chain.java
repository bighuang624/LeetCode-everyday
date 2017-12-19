// Source : https://leetcode.com/problems/maximum-length-of-pair-chain/
// Author : Kyon Huang
// Date   : 2017-12-19

// 第一思路，非最佳解法

class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int len = pairs.length;
        int[] arr = new int[len];
        int l = 1;
        for(int i = 0; i < len; i++) {
            arr[i] = 1;
            for(int j = 0; j < i; j++)
                if(pairs[j][1] < pairs[i][0] && arr[j] + 1 > arr[i])
                    arr[i] = arr[j] + 1;
            if(arr[i] > l)
                l = arr[i];
        }
        return l;
    }
}