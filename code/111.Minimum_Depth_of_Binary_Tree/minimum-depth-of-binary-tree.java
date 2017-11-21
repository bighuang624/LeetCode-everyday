// Source : https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Author : Kyon Huang
// Date   : 2017-11-21

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
    int minD = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        findMinDepth(root, 0);
        return minD;
    }
    
    private void findMinDepth(TreeNode root, int depth) {
        int newDepth = depth+1;
        if(root.left == null && root.right == null) {
            if(minD > newDepth)
                minD = newDepth;
        }
        else {
            if(root.left != null)
                findMinDepth(root.left, newDepth);
            if(root.right != null)
                findMinDepth(root.right, newDepth);
        }
    }
}