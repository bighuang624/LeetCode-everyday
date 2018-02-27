// Source : https://leetcode.com/problems/next-permutation/
// Author : Kyon Huang
// Date   : 2018-02-27

public class Solution {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1])
            i--;
                
        if(i >= 0) {
            int j = i+1;
            while(j < nums.length && nums[i] < nums[j])
                j++;
            exchange(nums, i, j-1);
        }
                
        i++; 
        for(int k = nums.length-1 ; i < k; i++, k--)
            exchange(nums, i, k);
    }
            
    private static void exchange(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}