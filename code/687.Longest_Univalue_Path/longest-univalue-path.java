// Source : https://leetcode.com/problems/longest-univalue-path/
// Author : Kyon Huang
// Date   : 2018-09-02

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
    int len = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null)
            return 0;
        getLen(root, root.val);
        return len;
    }
    
    private int getLen(TreeNode root, int val) {
        if(root == null)
            return 0;
        int leftVal = getLen(root.left, root.val);
        int rightVal = getLen(root.right, root.val);
        len = Math.max(len, leftVal+rightVal);
        if(root.val == val)
            return Math.max(leftVal, rightVal)+1;
        return 0;
    }
}