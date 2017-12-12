// Source : https://leetcode.com/problems/find-mode-in-binary-search-tree/
// Author : Kyon Huang
// Date   : 2017-12-12

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxTimes = 0;
    int times = -1;
    int prev = Integer.MIN_VALUE;
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    public int[] findMode(TreeNode root) {
        
        reverse(root);
        if(times > maxTimes) {
            result.clear();
            maxTimes = times;
        }
        if(times >= maxTimes) {
            result.add(prev);
        }
        int resultLen = result.size();
        int[] resultArr = new int[resultLen];
        for(int i = 0; i < resultLen; i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }
    
    private void reverse(TreeNode root) {
        if(root != null) {
            reverse(root.left);
            int cur = root.val;
            if(cur == prev) {
                times++;
            }
            else {
                if(times > maxTimes) {
                    result.clear();
                    maxTimes = times;
                }
                if(times >= maxTimes) {
                    result.add(prev);
                }
                prev = cur;
                times = 1;
            }
            reverse(root.right);
        }
    }
}