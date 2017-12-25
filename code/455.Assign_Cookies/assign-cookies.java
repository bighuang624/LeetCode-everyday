// Source : https://leetcode.com/problems/assign-cookies/
// Author : Kyon Huang
// Date   : 2017-12-25

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int i = 0;
        while(result < g.length && i < s.length) {
             if(g[result] <= s[i]) 
                 result++;
             i++;
        }
            
        return result;
    }
}