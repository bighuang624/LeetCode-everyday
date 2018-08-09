// Source : https://leetcode.com/problems/repeated-dna-sequences/
// Author : Kyon Huang
// Date   : 2018-08-09

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> temp = new HashSet<String>();
        HashSet<String> ans = new HashSet<String>();
        for(int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i+10);
            if(temp.contains(sub))
                ans.add(sub);
            else
                temp.add(sub);
        }
        return new ArrayList(ans);
    }
}