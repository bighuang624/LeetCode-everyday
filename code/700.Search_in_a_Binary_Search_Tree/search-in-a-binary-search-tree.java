// Source : https://leetcode.com/problems/search-in-a-binary-search-tree/
// Author : Kyon Huang
// Date   : 2018-09-05

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val)
            root = root.val > val ? root.left : root.right;
        return root;
    }
}