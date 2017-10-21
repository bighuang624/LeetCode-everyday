// Source : https://leetcode.com/problems/count-and-say/
// Author : Kyon Huang
// Date   : 2017-10-21

class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        else {
            char[] prevSay = countAndSay(n - 1).toCharArray();
            String result = "";
            for(int i = 0; i < prevSay.length;) {
                int currentNum = Integer.valueOf(prevSay[i] - '0');
                int times = 0;
                while(i < prevSay.length && Integer.valueOf(prevSay[i] - '0') == currentNum) {
                    times++;
                    i++;
                } 
                result += String.valueOf(times) + String.valueOf(currentNum);
            }
            return result;
        }
    }
}