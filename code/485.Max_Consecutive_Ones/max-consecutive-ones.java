// Source : https://leetcode.com/problems/max-consecutive-ones/
// Author : Kyon Huang
// Date   : 2017-12-05

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0;
        int consecutiveTime = 0;
        for(int num : nums) {
            if(num == 1) 
                consecutiveTime++;
            else {
                n = Math.max(n, consecutiveTime);
                consecutiveTime = 0;
            }
        }
        n = Math.max(n, consecutiveTime);
        return n;
    }
}