// Source : https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Author : Kyon Huang
// Date   : 2018-08-25

class Solution {
    String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits != null && digits.length() != 0) {
            res.add("");
            res = combine(res, digits, 0);
        }   
        return res;
    }
    
    private List<String> combine(List<String> list, String digits, int index) {
        if(index == digits.length())
            return list;
        
        List<String> res = new ArrayList<String>();
        int number = digits.charAt(index) - '0';
        for(int i = 0; i < map[number-2].length(); i++)
            for(String str : list)
                res.add(str + map[number-2].charAt(i));
        
        return combine(res, digits, index+1);
    }
}