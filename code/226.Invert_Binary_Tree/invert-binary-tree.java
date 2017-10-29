// Source : https://leetcode.com/problems/invert-binary-tree/
// Author : Kyon Huang
// Date   : 2017-10-29

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
    public TreeNode invertTree(TreeNode root) {
        if(root != null && (root.left != null || root.right != null)) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left != null)
                invertTree(root.left);
            if(root.right != null)
                invertTree(root.right);
        }
        return root;
    }
}