// Source : https://leetcode.com/problems/can-place-flowers/
// Author : Kyon Huang
// Date   : 2017-10-15

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int capacity = 0;
        int start = 0;
        while(start < flowerbed.length && flowerbed[start] == 0)
            start++;
        if(start == flowerbed.length) {
            capacity += (start + 1)/2;
        } 
        else {
            capacity += start/2;
            int end = flowerbed.length - 1;
            while(end > start && flowerbed[end] == 0)
                end--;
            capacity += (flowerbed.length - 1 - end)/2;
        
            for(int i = start; i < end; i++) {
                if(flowerbed[i] == 0) {
                    int j = 1;
                    while(flowerbed[++i] == 0 && i < end) 
                        j++;
                    capacity += (j - 1) / 2;
                }
            }
        }
        return n <= capacity;
    }
}