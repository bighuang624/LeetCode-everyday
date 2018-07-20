// Source : https://leetcode.com/problems/to-lower-case/
// Author : Kyon Huang
// Date   : 2018-07-21

class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray())
            if(ch >= 'A' && ch <= 'Z')
                sb.appends((char)('a' + ch - 'A'));
            else
                sb.append(ch);
        return sb.toString();
    }
}