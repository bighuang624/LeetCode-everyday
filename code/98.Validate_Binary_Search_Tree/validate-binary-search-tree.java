// Source : https://leetcode.com/problems/validate-binary-search-tree/
// Author : Kyon Huang
// Date   : 2018-08-02

class Solution {
    
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if(root == null)
            return true;
        if(root.val <= minVal || root.val >= maxVal)
            return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }

}