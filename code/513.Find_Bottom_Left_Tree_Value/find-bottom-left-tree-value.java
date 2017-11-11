// Source : https://leetcode.com/problems/find-bottom-left-tree-value/
// Author : Kyon Huang
// Date   : 2017-11-11

// 第一思路，非最佳解法

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
    public int findBottomLeftValue(TreeNode root) {
        // 先找树的高度
        int maxHeight = getHeight(root);
        // 然后找最深的左叶子节点
        ArrayList<Integer> result = new ArrayList<Integer>();
        getLeftmost(root, maxHeight, result);
        return result.get(0);
    }
    
    private int getHeight(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
    
    private void getLeftmost(TreeNode root, int height, ArrayList<Integer> result) {
        if(height == 1)
            result.add(root.val);
        if(root.left != null)
            getLeftmost(root.left, height-1, result);
        if(root.right != null)
            getLeftmost(root.right, height-1, result);

    }
}