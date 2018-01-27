// Source : https://leetcode.com/problems/valid-anagram/
// Author : Kyon Huang
// Date   : 2018-01-27

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray())
            arr[ch - 'a']++;
        for(char ch : t.toCharArray())
            arr[ch - 'a']--;
        for(int num : arr)
            if(num != 0)
                return false;
        return true;
    }
}