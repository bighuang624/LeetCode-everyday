// Source : https://leetcode.com/problems/balanced-binary-tree/
// Author : Kyon Huang
// Date   : 2017-11-12

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
    public boolean isBalanced(TreeNode root) {
        return getBalancedHeight(root) >= 0;
    }
    
    private int getBalancedHeight(TreeNode root) {
        if(root == null)
            return 0;
        int leftBalancedHeight = getBalancedHeight(root.left);
        int rightBalancedHeight = getBalancedHeight(root.right);
        if(leftBalancedHeight < 0 || rightBalancedHeight < 0 || Math.abs(leftBalancedHeight-rightBalancedHeight) > 1)
            return -1;
        else
            return Math.max(leftBalancedHeight, rightBalancedHeight)+1;
    }
}