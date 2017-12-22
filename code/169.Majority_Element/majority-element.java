// Source : https://leetcode.com/problems/majority-element/
// Author : Kyon Huang
// Date   : 2017-12-22

class Solution {
    public int majorityElement(int[] nums) {
        int curItem = 0;
        int times = 0;
        for(int i : nums) {
            if(times == 0) {
                curItem = i;
            } 
            if(curItem == i)
                times++;
            else
                times--;
        }
        return curItem;
    }
}