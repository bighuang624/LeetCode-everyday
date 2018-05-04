// Source : https://leetcode.com/problems/unique-morse-code-words/
// Author : Kyon Huang
// Date   : 2018-05-04

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<String>();
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray())
                sb.append(morse[ch - 'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}