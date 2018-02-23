// Source : https://leetcode.com/problems/max-chunks-to-make-sorted/
// Author : Kyon Huang
// Date   : 2018-02-23

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int result = 0;
        for(int left = 0; left < arr.length;) {
            int right = arr[left];
            for(; left <= right; i++) 
                right = Math.max(right, arr[left]);
            result++;
        }
        return result;
    }
}