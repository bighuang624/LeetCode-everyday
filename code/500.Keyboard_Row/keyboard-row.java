// Source : https://leetcode.com/problems/keyboard-row/
// Author : Kyon Huang
// Date   : 2018-07-25

class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm"
        };
        ArrayList<String> ans = new ArrayList<String>();
        for(String word : words) {
            String tempWord = word.toLowerCase();
            for(String row : rows) {
                int index = 0;
                while(index < word.length() && row.indexOf(tempWord.charAt(index)) != -1)
                    index++;
                if(index == word.length())
                    ans.add(word);
            }
        }
        String[] result = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            result[i] = ans.get(i);
        return result;
    }
}