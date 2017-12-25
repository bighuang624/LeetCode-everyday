// Source : https://leetcode.com/problems/binary-tree-tilt/
// Author : Kyon Huang
// Date   : 2017-12-25

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
    private int wholeTill = 0;
    
    public int findTilt(TreeNode root) {
        addTilt(root);
        return wholeTill;
    }
    
    private int addTilt(TreeNode root) {
        if(root == null)
            return 0;
        int leftTilt = addTilt(root.left);
        int rightTilt = addTilt(root.right);
        wholeTill += Math.abs(leftTilt - rightTilt);
        return leftTilt + rightTilt + root.val;
    }
}