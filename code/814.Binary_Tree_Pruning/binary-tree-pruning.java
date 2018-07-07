// Source : https://leetcode.com/problems/binary-tree-pruning/
// Author : Kyon Huang
// Date   : 2018-07-07

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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)
            return null;
        if(root.left != null)
            root.left = pruneTree(root.left);
        if(root.right != null)
            root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0)
            return null;
        return root;
    }
}