// Source : https://leetcode.com/problems/trim-a-binary-search-tree/
// Author : Kyon Huang
// Date   : 2018-09-14

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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null)
            return root;
        if(root.val < L)
            return trimBST(root.right, L, R);
        if(root.val > R)
            return trimBST(root.left, L, R);
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}