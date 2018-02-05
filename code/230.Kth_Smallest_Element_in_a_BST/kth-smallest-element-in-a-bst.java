// Source : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// Author : Kyon Huang
// Date   : 2018-02-05

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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null) {
            stack.push(root);
            root = root.left;
        }
        TreeNode node = null;
        for(int i = 0; i < k; i++) {
            node = stack.pop();
            TreeNode cur = node.right;
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
        }
        return node.val; 
    }
}