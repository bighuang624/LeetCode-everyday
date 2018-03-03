// Source : https://leetcode.com/problems/path-sum-ii/
// Author : Kyon Huang
// Date   : 2018-03-03

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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        DFS(root, result, sum, list);
        return result;
    }
    
    private void DFS(TreeNode root, List<List<Integer>> result, int sum, List<Integer> list) {
        if(root != null) {
            List<Integer> newList = new ArrayList<Integer>(list);
            newList.add(root.val);
            if(sum == root.val && root.left == null && root.right == null)  // 注意得是叶子节点
                result.add(newList);
            else {
                DFS(root.left, result, sum-root.val, newList);
                DFS(root.right, result, sum-root.val, newList);
            }
        }
    }
}