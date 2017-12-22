// Source : https://leetcode.com/problems/range-sum-query-immutable/
// Author : Kyon Huang
// Date   : 2017-12-22

class NumArray {
    int[] sums;
    
    public NumArray(int[] nums) {
        sums = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }
    
    public int sumRange(int i, int j) {
        return (i > 0) ? sums[j] - sums[i-1] : sums[j] ;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */