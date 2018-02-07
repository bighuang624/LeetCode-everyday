// Source : https://leetcode.com/problems/add-one-row-to-tree/
// Author : Kyon Huang
// Date   : 2018-02-07

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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        DFS(root, v, d, 1);
        return root;
    }
    
    private void DFS(TreeNode root, int v, int d, int curD) {
        if(root != null) {
            if(d == curD+1) {
                TreeNode left = new TreeNode(v);
                TreeNode right = new TreeNode(v);
                left.left = root.left;
                right.right = root.right;
                root.left = left;
                root.right = right;
            }
            else {
                DFS(root.left, v, d, curD+1);
                DFS(root.right, v, d, curD+1);
            }
        }
    }
}