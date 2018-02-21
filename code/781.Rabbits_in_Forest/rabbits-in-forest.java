// Source : https://leetcode.com/problems/rabbits-in-forest/
// Author : Kyon Huang
// Date   : 2018-02-21

class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for(int num : answers)
            map.put(num, map.getOrDefault(num, 0)+1);
        for(int key : map.keySet()) {
            int i = map.get(key) / (key+1) + (map.get(key) % (key+1) != 0 ? 1 : 0);
            result += (key+1) * i;
        }
        return result;
    }
}