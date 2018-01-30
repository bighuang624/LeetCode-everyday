// Source : https://leetcode.com/problems/jewels-and-stones/
// Author : Kyon Huang
// Date   : 2018-01-30

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<Character>();
        for(char ch : J.toCharArray())
            set.add(ch);
        int result = 0;
        for(char ch : S.toCharArray())
            if(set.contains(ch))
                result++;
        return result;
    }
}