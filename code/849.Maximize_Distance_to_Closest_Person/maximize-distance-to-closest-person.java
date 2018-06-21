// Source : https://leetcode.com/problems/maximize-distance-to-closest-person/
// Author : Kyon Huang
// Date   : 2018-06-21

class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int[] dis = new int[n];
        int prev = -1;
        for(int i = 0; i < n && prev == -1; i++) {
            dis[i] = Integer.MAX_VALUE;
            if(seats[i] == 1) {
                prev = i;
                dis[i] = 0;
            }
        }  
        for(int i = prev; i < n; i++) {
            if(seats[i] == 1) {
                prev = i;
                dis[i] = 0;
            }
            else 
                dis[i] = i - prev;
        }
        int result = Integer.MIN_VALUE;
        for(int i = n-1; i >= prev; i--) 
            result = Math.max(result, dis[i]);
        for(int i = prev-1; i >= 0; i--) {
            if(seats[i] == 1)
                prev = i;
            else
                dis[i] = Math.min(dis[i], prev - i);
            result = Math.max(result, dis[i]);
        }
        return result;
    }
}