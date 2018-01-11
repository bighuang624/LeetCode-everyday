// Source : https://leetcode.com/problems/next-greater-element-i/
// Author : Kyon Huang
// Date   : 2018-01-11

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[nums1.length];
        for(int num : nums2) {
            while(!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for(int i = 0; i < nums1.length; i++)
            if(map.containsKey(nums1[i]))
                result[i] = map.get(nums1[i]);
            else
                result[i] = -1;
        return result;
    }
}