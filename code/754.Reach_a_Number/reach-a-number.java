// Source : https://leetcode.com/problems/reach-a-number/
// Author : Kyon Huang
// Date   : 2018-06-30

class Solution {
    public int reachNumber(int target) {
        if(target == 0)
            return 0;
        if(target < 0)
            target = -target;
        int n = (int)Math.sqrt(target) - 1;
        while(n * (n + 1) < target * 2 || (n * (n + 1) / 2 - target) % 2 == 1)
            n++;
        return n;
    }
}