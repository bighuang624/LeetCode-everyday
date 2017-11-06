// Source : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Author : Kyon Huang
// Date   : 2017-11-05

// 第一思路，非最佳方案

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList();
        boolean[] hasAppeared = new boolean[n+1];
        for(int num : nums) {
            if(!hasAppeared[num])
                hasAppeared[num] = true;
        }
        
        for(int i = 1; i <= n; i++)
            if(!hasAppeared[i])
                list.add(i);
        
        return list;
    }
}