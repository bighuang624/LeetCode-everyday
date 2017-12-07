// Source : https://leetcode.com/problems/diameter-of-binary-tree/
// Author : Kyon Huang
// Date   : 2017-12-07

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
    private int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return diameter;
    }
    
    private int getHeight(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight)+1;
    }
}