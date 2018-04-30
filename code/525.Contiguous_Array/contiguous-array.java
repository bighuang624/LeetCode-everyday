// Source : https://leetcode.com/problems/contiguous-array/
// Author : Kyon Huang
// Date   : 2018-04-28

class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] prefix = new int[nums.length+1];
        map.put(0, 0);
        for(int i = 1; i <= nums.length; i++) {
            prefix[i] = prefix[i-1] + (nums[i-1] == 0 ? -1 : 1);
            if(map.containsKey(prefix[i]))
                max = Math.max(max, i - map.get(prefix[i]));
            else
                map.put(prefix[i], i);
        }
        return max;
    }
}