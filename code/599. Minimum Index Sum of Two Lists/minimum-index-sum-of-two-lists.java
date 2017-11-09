// Source : https://leetcode.com/problems/minimum-index-sum-of-two-lists/
// Author : Kyon Huang
// Date   : 2017-11-08

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new LinkedList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) 
            map.put(list1[i], i);
        for (int i = 0; i < list2.length; i++) {
            Integer j = map.get(list2[i]);
            if (j != null && i + j <= minSum) {
                if (i + j < minSum) { 
                    result.clear(); 
                    minSum = i+j; 
                }
                result.add(list2[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}