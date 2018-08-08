// Source : https://leetcode.com/problems/reverse-words-in-a-string/
// Author : Kyon Huang
// Date   : 2018-08-08

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            sb.append(words[words.length-1-i]);
            if(i != words.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}