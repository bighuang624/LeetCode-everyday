// Source : https://leetcode.com/problems/sum-of-square-numbers/
// Author : Kyon Huang
// Date   : 2018-04-16

class Solution {
    public boolean judgeSquareSum(int c) {
        int a = (int)Math.sqrt(c);
        int b = 0;
        while(b <= a) {
            int temp = a*a + b*b;
            if(temp == c)
                return true;
            else if(temp < c)
                b++;
            else
                a--;
        }
        return false;
    }
}