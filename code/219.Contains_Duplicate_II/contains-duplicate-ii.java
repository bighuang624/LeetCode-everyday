// Source : https://leetcode.com/problems/contains-duplicate-ii/
// Author : Kyon Huang
// Date   : 2017-10-30

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
 
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0, len = nums.length; i < len; i++) {
            // 以值为 key，以 index 为 value
            // 若 key 已存在，计算 index 与 value 的差来判断是否返回 true，并更新 index
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k)
                    return true;
                else
                    map.replace(nums[i], i);
            }
            // 若 key 不存在，存入
            else
                map.put(nums[i], i); 
        }
        
        return false;
    }
}