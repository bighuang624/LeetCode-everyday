// Source : https://leetcode.com/problems/teemo-attacking/
// Author : Kyon Huang
// Date   : 2018-01-24

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0 || timeSeries == null)
            return 0;
        int result = 0;
        for(int i = 0; i < timeSeries.length-1; i++)
            result += Math.min(duration, (timeSeries[i+1] - timeSeries[i]));

        return result + duration;
    }
}