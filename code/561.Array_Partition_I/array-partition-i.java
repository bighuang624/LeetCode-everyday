// Source : https://leetcode.com/problems/array-partition-i/
// Author : Kyon Huang
// Date   : 2017-10-17

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}