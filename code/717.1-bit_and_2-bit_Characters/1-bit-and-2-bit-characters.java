// Source : https://leetcode.com/problems/1-bit-and-2-bit-characters/
// Author : Kyon Huang
// Date   : 2017-11-01

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i = 0, len = bits.length; i < len-1; i++)
            if(bits[i] == 1) 
                if(++i >= len-1)
                    return false;

        return true;
    }
}