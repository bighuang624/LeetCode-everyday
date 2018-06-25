// Source : https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Author : Kyon Huang
// Date   : 2018-06-25

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(s.length() == 0 || p.length() == 0 || s.length() < p.length())
            return new ArrayList<Integer>();
        int[] chars = new int[26];
        for(Character c : p.toCharArray())
            chars[c - 'a']++;
        int start = 0, end = 0, len = p.length(), diff = len;
        char temp;
        for(end = 0; end < len; end++) {
            temp = s.charAt(end);
            chars[temp - 'a']--;
            if(chars[temp-'a'] >= 0)
                diff--;
        }
        if(diff == 0)
            result.add(0);
        
        while(end < s.length()) {
            temp = s.charAt(start);
            if(chars[temp - 'a'] >= 0)
                diff++;
            chars[temp - 'a']++;
            start++;
            temp = s.charAt(end);
            chars[temp - 'a']--;
            if(chars[temp - 'a'] >= 0)
                diff--;
            if(diff == 0)
                result.add(start);
            end++;    
        }
        return result;
    }
}