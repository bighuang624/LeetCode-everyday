// Source : https://leetcode.com/problems/k-diff-pairs-in-an-array/
// Author : Kyon Huang
// Date   : 2018-01-15

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            int key = (int)entry.getKey();
            if (k == 0 && map.get(key) > 1) 
                result++;
            if (k != 0 && map.containsKey(key - k))
                result++;
        }
        return result;
    }
}