// Source : https://leetcode.com/problems/daily-temperatures/
// Author : Kyon Huang
// Date   : 2017-12-15

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] stack = new int[len];
        int[] result = new int[len];
        int top = -1;
        for(int i = 0; i < len; i++) {
            while(top != -1 && temperatures[i] > temperatures[stack[top]]) {   
                int j = stack[top--];
                result[j] = i - j;
            }
            stack[++top] = i;
        }
        
        return result;
    }
}