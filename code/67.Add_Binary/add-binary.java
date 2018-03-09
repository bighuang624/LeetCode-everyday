// Source : https://leetcode.com/problems/add-binary/
// Author : Kyon Huang
// Date   : 2018-03-09

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = a.length()-1, j = b.length()-1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            if(i >= 0)
                sum += a.charAt(i) - '0';
            if(j >= 0)
                sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;  
        }
        if(carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}