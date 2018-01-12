// Source : https://leetcode.com/problems/next-greater-element-ii/
// Author : Kyon Huang
// Date   : 2018-01-12

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n*2; i++) {
            if(i < n)
                result[i] = -1;
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%n])
                result[stack.pop()] = nums[i%n];
            if(i < n)
                stack.push(i);
        }
        return result;  
    }
}