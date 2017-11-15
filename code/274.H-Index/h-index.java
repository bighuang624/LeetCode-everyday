// Source : https://leetcode.com/problems/h-index/
// Author : Kyon Huang
// Date   : 2017-11-15

// 第一思路，非最佳方案

class Solution {
    public int hIndex(int[] citations) {
        if(citations.length == 0 || citations == null)
            return 0;
        Arrays.sort(citations);
        int len = citations.length;
        int i = 0;
        while(i < len) {
            if(len-i <= citations[i])
                break;
            i++;
        }

        return len-i;
    }
}