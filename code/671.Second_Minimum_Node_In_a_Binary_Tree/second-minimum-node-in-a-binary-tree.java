// Source : https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
// Author : Kyon Huang
// Date   : 2017-12-08

// 第一思路，非最佳解法

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
    
    int second = Integer.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        if(root.left == null)
            return -1;
        gothrough(root, root.val);
        return (second == Integer.MAX_VALUE || root.val == second) ? -1 : second;
    }
    
    private void gothrough(TreeNode root, int min) {
        if(root != null && root.left != null) {
            int leftValue = root.left.val;
            int rightValue = root.right.val;
            if(leftValue >= rightValue) {
                if(leftValue > min)
                    second = Math.min(leftValue, second);
                gothrough(root.right, min);
            }
            if(rightValue >= leftValue) {
                if(rightValue > min)
                    second = Math.min(rightValue, second);
                gothrough(root.left, min);
            } 
        }
    }
}