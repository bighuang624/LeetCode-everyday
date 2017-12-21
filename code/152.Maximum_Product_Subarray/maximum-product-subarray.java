// Source : https://leetcode.com/problems/maximum-product-subarray/
// Author : Kyon Huang
// Date   : 2017-12-21

class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int Imax = nums[0];
        int Imin = nums[0];
        int max = nums[0];
        
        for(int i = 1; i < len; i++) {
            if(nums[i] > 0) {
                Imax = Math.max(Imax * nums[i], nums[i]);
                Imin = Math.min(Imin * nums[i], nums[i]);
            } else {
                int temp = Imax;
                Imax = Math.max(Imin * nums[i], nums[i]);
                Imin = Math.min(temp * nums[i], nums[i]);
            }   
            max = Math.max(Imax, max);
        }
        
        return max;
    }
}