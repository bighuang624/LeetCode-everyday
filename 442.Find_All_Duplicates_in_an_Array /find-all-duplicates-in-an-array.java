// Source : https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Author : Kyon Huang
// Date   : 2017-09-19

// 第一思路，非最优解法

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List list = new ArrayList<Integer>();
        int len = nums.length;
        int[] arr = new int[len+1];
        for(int i = 0; i < len; i++) {
            arr[nums[i]]++;
        }
        for(int i = 1; i <= len; i++) {
            if(arr[i] > 1) {
                list.add(i);
            }
        }
        return list;
    }
}