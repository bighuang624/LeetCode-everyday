// Source : https://leetcode.com/problems/symmetric-tree/
// Author : Kyon Huang
// Date   : 2018-01-05

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymmetricHelp(root.left, root.right);
    }
    
    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        else if(left == null || right == null || left.val != right.val)
            return false;
        else
            return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}