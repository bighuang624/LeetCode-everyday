// Source : https://leetcode.com/problems/merge-sorted-array/
// Author : Kyon Huang
// Date   : 2017-10-25

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int nums1Len = m-1;
        int nums2Len = n-1;
        for(int totalLen = m+n-1; totalLen >= 0; totalLen--) {
            if(nums1Len >= 0 && nums2Len >= 0)
                if(nums1[nums1Len] > nums2[nums2Len])
                    nums1[totalLen] = nums1[nums1Len--];
                else
                    nums1[totalLen] = nums2[nums2Len--];
            else if(nums1Len < 0)
                nums1[totalLen] = nums2[nums2Len--];
            else
                nums1[totalLen] = nums1[nums1Len--];
        }
    }
}