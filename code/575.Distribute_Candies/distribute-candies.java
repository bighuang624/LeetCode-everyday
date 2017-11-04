// Source : https://leetcode.com/problems/distribute-candies/
// Author : Kyon Huang
// Date   : 2017-11-04

// 第一思路，非最佳方案

class Solution {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int kind = 1;
        int cur = candies[0];
        int index = 0;
        int len = candies.length;
        while(index < len && kind < len/2) {
            if(candies[index] == cur)
                index++;
            else {
                kind++;
                cur = candies[index];
                index++;
            }
        }
        return kind;
    }
}