// Source : https://leetcode.com/problems/minimum-time-difference/
// Author : Kyon Huang
// Date   : 2017-11-30

class Solution {
    public int findMinDifference(List<String> timePoints) {

        int[] arr = new int[timePoints.size()];
        int j = 0;
        for(String str : timePoints) {
            arr[j] = Integer.valueOf(str.split(":")[0]) * 60 + Integer.valueOf(str.split(":")[1]);
            j++;
        }
        Arrays.sort(arr);
        int minMinutes = Integer.MAX_VALUE;
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if(i == 0) {
                minMinutes = Math.min(minMinutes, arr[i+1] - arr[i]);
            }
            else if(i != len-1) {
                minMinutes = Math.min(minMinutes, arr[i+1] - arr[i]);
            }
            else {
                minMinutes = Math.min(minMinutes, arr[i] - arr[i-1]);
                minMinutes = Math.min(minMinutes, arr[0] + 1440 - arr[i]);
            }
        }
        return minMinutes;
    }
}