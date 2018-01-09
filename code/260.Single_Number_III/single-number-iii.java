// Source : https://leetcode.com/problems/single-number-iii/
// Author : Kyon Huang
// Date   : 2018-01-09

class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for(int num : nums)
            diff ^= num;
        diff &= -diff;
        
        int i = 0;
        int j = 0;
        for(int num : nums)
            if((num & diff) == 0)
                i ^= num;
            else
                j ^= num;
        int[] result = new int[2];
        result[0] = i;
        result[1] = j;
        return result;
    }
}