// Source : https://leetcode.com/problems/binary-tree-inorder-traversal/
// Author : Kyon Huang
// Date   : 2017-10-27

// 递归方法

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> newList = new ArrayList<Integer>();
        if(root == null)
            return newList;
        
        if(root.left != null)
            newList.addAll(inorderTraversal(root.left));
        newList.add(root.val);
        if(root.right != null)    
            newList.addAll(inorderTraversal(root.right));
        
        return newList;
    }
}
