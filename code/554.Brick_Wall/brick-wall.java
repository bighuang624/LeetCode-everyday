// Source : https://leetcode.com/problems/brick-wall/
// Author : Kyon Huang
// Date   : 2018-02-21

class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        if(wall == null || wall.size() == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(List<Integer> list : wall) {
            int i = 0;
            for(int j = 0; j < list.size()-1; j++) {
                i += list.get(j);
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
        int max = 0;
        for(int key : map.keySet())
            max = Math.max(max, map.get(key));
        return wall.size()-max;
    }
}