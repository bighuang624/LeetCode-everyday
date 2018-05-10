// Source : https://leetcode.com/problems/longest-word-in-dictionary/
// Author : Kyon Huang
// Date   : 2018-05-10

class Solution {
    public String longestWord(String[] words) {

        int maxLen = 0;
        String result = "";
        
        Set<String> dict = new HashSet<String>();
        for(String word : words)
            dict.add(word);
        
        for(String word : words) {
            if(maxLen > word.length() || (maxLen == word.length() && result.compareTo(word) <= 0))
                continue;
            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray()) {
                sb.append(ch);
                if(!dict.contains(sb.toString()))
                    break;
            }
            String w = sb.toString();
            if(w.length() == word.length()) {
                result = w;
                maxLen = result.length();
            }
        }
        
        return result;
    }
}