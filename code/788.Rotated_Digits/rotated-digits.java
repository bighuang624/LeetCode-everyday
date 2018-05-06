// Source : https://leetcode.com/problems/rotated-digits/
// Author : Kyon Huang
// Date   : 2018-05-06

class Solution {
    public int rotatedDigits(int N) {
        int result = 0;
        for(int i = 1; i <= N; i++)
            if(isRotatedDigit(i))
                result++;
        return result;
    }
    
    public boolean isRotatedDigit(int n) {
        boolean has2569 = false;
        while(n != 0) {
            int i = n % 10;
            if(i == 2 || i == 5 || i == 6 || i == 9)
                has2569 = true;
            else if(i == 3 || i == 4 || i == 7)
                return false;
            n = n / 10;
        }
        return has2569;
    }
}