// Source : https://leetcode.com/problems/degree-of-an-array/
// Author : Kyon Huang
// Date   : 2018-02-08

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], new ArrayList<Integer>());
            map.get(nums[i]).add(i);
        }
        int degree = 0;
        int len = 0;
        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> list = entry.getValue();
            if(list.size() > degree) {
                degree = list.size();
                len = list.get(list.size()-1) - list.get(0)+1;
            } 
            else if(list.size() == degree)
                len = Math.min(len, list.get(list.size()-1) - list.get(0)+1);
        }
        return len;
    }
}