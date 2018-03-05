// Source : https://leetcode.com/problems/sum-root-to-leaf-numbers/
// Author : Kyon Huang
// Date   : 2018-03-05

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
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    
    private int helper(TreeNode root, int sum) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return sum * 10 + root.val;
        return helper(root.left, sum * 10 + root.val) + helper(root.right, sum * 10 + root.val);
    }
}