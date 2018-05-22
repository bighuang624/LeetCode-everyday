// Source : https://leetcode.com/problems/h-index-ii/
// Author : Kyon Huang
// Date   : 2018-05-22

class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int lo = 0, hi = len - 1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (citations[mid] == len - mid)
                return len - mid;
            else if (citations[mid] < len - mid)
                lo = mid + 1;
            else 
                //(citations[mid] > len-mid), mid qualified as a hIndex,
                // but we have to continue to search for a higher one.
                hi = mid - 1;
        }
        return len - lo;
    }
}