// Source : https://leetcode.com/problems/intersection-of-two-arrays-ii//
// Author : Kyon Huang
// Date   : 2018-02-02

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num : nums1) {
            if(!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num)+1);
        }
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
}