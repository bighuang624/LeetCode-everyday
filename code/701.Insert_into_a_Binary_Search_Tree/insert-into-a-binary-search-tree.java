// Source : https://leetcode.com/problems/insert-into-a-binary-search-tree/
// Author : Kyon Huang
// Date   : 2018-10-05

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode cur = root;
        while(cur != null) {
            if(val < cur.val) {
                if(cur.left == null) {
                    cur.left = new TreeNode(val);
                    break;
                } else
                    cur = cur.left;
            } else {
                if(cur.right == null) {
                    cur.right = new TreeNode(val);
                    break;
                } else
                    cur = cur.right;
            }                
        }
        return root;
    }
}