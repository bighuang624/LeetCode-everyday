// Source : https://leetcode.com/problems/maximum-product-of-three-numbers/
// Author : Kyon Huang
// Date   : 2018-04-11

class Solution {
    public int maximumProduct(int[] nums) {
        int big = Integer.MIN_VALUE;
        int bigger = Integer.MIN_VALUE;
        int biggest = Integer.MIN_VALUE;
        int smaller = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > biggest) {
                big = bigger;
                bigger = biggest;
                biggest = num;
            } else if(num > bigger) {
                big = bigger;
                bigger = num;
            } else if(num > big)
                big = num;
            
            if(num < smallest) {
                smaller = smallest;
                smallest = num;
            } else if(num < smaller)
                smaller = num;
        }
        return Math.max(big * bigger * biggest, smaller * smallest * biggest);
    }
}