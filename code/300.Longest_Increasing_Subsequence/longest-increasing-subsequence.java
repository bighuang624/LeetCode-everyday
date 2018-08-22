// Source : https://leetcode.com/problems/longest-increasing-subsequence/
// Author : Kyon Huang
// Date   : 2018-08-22

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int[] arr = new int[nums.length+1];
        int ans = 1;
        arr[1] = 1;
        for(int i = 2; i <= nums.length; i++) {
            arr[i] = 1;
            for(int j = 1; j < i; j++) 
                if(nums[i-1] > nums[j-1])
                    arr[i] = Math.max(arr[i], arr[j]+1);
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }
}