// Source : https://leetcode.com/problems/longest-harmonious-subsequence/
// Author : Kyon Huang
// Date   : 2018-04-12

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length;) {  // 注意这里不能有 i++
            int cur = nums[i];
            int num = 0;
            for(; i < nums.length && nums[i] == cur; i++)
                num++;
            if(i < nums.length && nums[i] == cur+1) {
                for(int j = i; j < nums.length && nums[j] == cur+1; j++)
                    num++;
                result = Math.max(result, num);
            }
        }
        return result;
    }
}
