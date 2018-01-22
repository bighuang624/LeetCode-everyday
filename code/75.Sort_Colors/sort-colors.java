// Source : https://leetcode.com/problems/sort-colors/
// Author : Kyon Huang
// Date   : 2018-01-11

// 非最佳方案

class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        for(int num : nums) {
            if(num == 0)
                zero++;
            else if(num == 1)
                one++;
        }
        for(int i = 0; i < nums.length; i++) {
            if(zero != 0) {
                nums[i] = 0;
                zero--;
            }
            else if(one != 0) {
                nums[i] = 1;
                one--;
            }
            else
                nums[i] = 2;
        }
    }
}