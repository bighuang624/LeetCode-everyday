// Source : https://leetcode.com/problems/subtree-of-another-tree/
// Author : Kyon Huang
// Date   : 2018-01-17

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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return false;
        else if(isSame(s, t))
            return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean isSame(TreeNode s, TreeNode t) {
        if(t == null && s == null)
            return true;
        if(s != null && t != null && s.val == t.val)
            return isSame(s.left, t.left) && isSame(s.right, t.right);
        return false;
    }
}