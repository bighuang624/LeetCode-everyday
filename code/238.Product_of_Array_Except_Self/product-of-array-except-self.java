// Source : https://leetcode.com/problems/product-of-array-except-self/
// Author : Kyon Huang
// Date   : 2018-02-13

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++)
            result[i] = result[i-1] * nums[i-1];
        int right = 1;
        for(int j = nums.length-2; j >= 0; j--) {
            right *= nums[j+1];
            result[j] *= right;
        }
        return result;
    }
}