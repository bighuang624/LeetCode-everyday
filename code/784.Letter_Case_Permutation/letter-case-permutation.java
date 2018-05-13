// Source : https://leetcode.com/problems/letter-case-permutation/
// Author : Kyon Huang
// Date   : 2018-05-13

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new LinkedList<>();
        letterCasePermutation(S, new StringBuilder(), 0, list);
        return list;
    }
    private void letterCasePermutation(String S, StringBuilder sb, int i, List<String> list){
        if(i == S.length()){
            list.add(new String(sb));
            return;
        }
        char ch = S.charAt(i);
        if(Character.isDigit(ch)) {
            sb.append(ch);
            letterCasePermutation(S, sb, i+1, list);
        } else {
            sb.append(Character.toLowerCase(ch));
            letterCasePermutation(S, sb, i+1, list);
            sb.setLength(sb.length()-1);
            sb.append(Character.toUpperCase(ch));
            letterCasePermutation(S, sb, i+1, list);
        }
        sb.setLength(sb.length()-1);
    }
}