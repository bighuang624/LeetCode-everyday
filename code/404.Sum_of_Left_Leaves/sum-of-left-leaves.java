// Source : https://leetcode.com/problems/sum-of-left-leaves/
// Author : Kyon Huang
// Date   : 2017-12-13

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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root != null) {
            sum += sumOfLeftLeaves(root.left);
            sum += sumOfLeftLeaves(root.right);
            if(root.left != null && root.left.left == null && root.left.right == null)
                sum += root.left.val;
        }
        return sum;
    }
    
}