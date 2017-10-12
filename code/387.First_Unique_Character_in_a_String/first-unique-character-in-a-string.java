// Source : https://leetcode.com/problems/first-unique-character-in-a-string/
// Author : Kyon Huang
// Date   : 2017-10-12

class Solution {
    public int firstUniqChar(String s) {
        int[] timesArr = new int[26];
        char[] c = s.toCharArray();
        for(char ch: c){
            timesArr[ch-'a']++;
        }
        for(int i = 0; i < c.length; i++){
            if(timesArr[c[i]-'a'] == 1)
                return i;
        }
        return -1;
    }
}