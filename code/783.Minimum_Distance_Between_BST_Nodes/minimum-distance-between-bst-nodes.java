// Source : https://leetcode.com/problems/minimum-distance-between-bst-nodes/
// Author : Kyon Huang
// Date   : 2018-05-14

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
    
    int minDiff = Integer.MAX_VALUE;
    Integer preVal = null;
    
    public int minDiffInBST(TreeNode root) {
        DFS(root);
        return minDiff;
    }
    
    public void DFS(TreeNode root) {
        if(root != null) {
            DFS(root.left);
            if(preVal != null)
                minDiff = Math.min(minDiff, root.val - preVal);
            preVal = root.val;
            DFS(root.right);
        }
    }
}