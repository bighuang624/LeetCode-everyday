// Source : https://leetcode.com/problems/add-strings/
// Author : Kyon Huang
// Date   : 2018-04-13

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int goUp = 0;
        for(int i = num1.length()-1, j = num2.length()-1; i >= 0 || j >= 0 || goUp != 0; i--, j--) {
            int a = i < 0 ? 0 : Integer.valueOf(num1.charAt(i) - '0');
            int b = j < 0 ? 0 : Integer.valueOf(num2.charAt(j) - '0');
            goUp += a + b;
            sb.append(goUp % 10);
            goUp /= 10;
        }
        return sb.reverse().toString();
    }
    
}
