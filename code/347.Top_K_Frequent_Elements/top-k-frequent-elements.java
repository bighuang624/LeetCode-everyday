// Source : https://leetcode.com/problems/top-k-frequent-elements/
// Author : Kyon Huang
// Date   : 2018-02-21

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] lists = new ArrayList[nums.length+1];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0)+1);
        for(int key : map.keySet()) {
            if(lists[map.get(key)] == null)
                lists[map.get(key)] = new ArrayList<Integer>();
            lists[map.get(key)].add(key);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = nums.length; i > 0 && result.size() < k; i--)
            if(lists[i] != null)
                result.addAll(lists[i]);
        return result;
    }
}