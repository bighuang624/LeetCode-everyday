// Source : https://leetcode.com/problems/convert-bst-to-greater-tree/
// Author : Kyon Huang
// Date   : 2018-05-08

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
    
    int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }
    
    private void helper(TreeNode root) {
        if(root == null)
            return;
        helper(root.right);
        root.val += sum;
        sum = root.val;
        helper(root.left);
    }
}