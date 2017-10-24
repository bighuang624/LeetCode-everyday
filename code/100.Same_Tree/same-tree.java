// Source : https://leetcode.com/problems/same-tree/
// Author : Kyon Huang
// Date   : 2017-10-24

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return search(p, q);
    }
    
    private boolean search(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if((p != null && q != null) && p.val == q.val)
            return (search(p.left, q.left) && search(p.right, q.right));
        return false;
    }
}