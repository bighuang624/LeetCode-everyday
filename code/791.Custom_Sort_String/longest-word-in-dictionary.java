// Source : https://leetcode.com/problems/custom-sort-string/
// Author : Kyon Huang
// Date   : 2018-05-11

class Solution {
    public String customSortString(String S, String T) {
        StringBuilder sb = new StringBuilder();
        int[] map = new int[26];
        for(char ch : T.toCharArray())
            map[ch-'a']++;
        for(char ch : S.toCharArray()) {
            int times = map[ch-'a'];
            for(int i = 0; i < times; i++)
                sb.append(ch);
            map[ch-'a'] = 0;
        }
        for(int i = 0; i < 26; i++)
            for(int j = 0; j < map[i]; j++)
                sb.append((char)('a'+i));
        return sb.toString();
    }
}