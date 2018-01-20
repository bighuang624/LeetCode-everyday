// Source : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Author : Kyon Huang
// Date   : 2018-01-20

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0, j = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i-j+1);
        }
        return maxLength;
    }
}